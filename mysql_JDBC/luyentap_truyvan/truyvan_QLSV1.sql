use qlsv1

-- 1--
SELECT MaSV, HoSV, TenSV, HocBong, NoiSinh, MaKhoa
FROM DSSinhVien
ORDER BY MaSV ASC;

-- 2--
SELECT 
    MaSV, CONCAT(HoSV, ' ', TenSV) AS Hoten, Phai, NgaySinh
FROM
    DSSinhVien
ORDER BY CASE
    WHEN Phai = 'Nam' THEN 1
    ELSE 2
END , Hoten;

-- 3--
SELECT CONCAT(HoSV, ' ', TenSV) AS HoTen, NgaySinh, HocBong
FROM DSSinhVien
ORDER BY NgaySinh ASC, HocBong DESC;

-- 4--
SELECT CONCAT(HoSV, ' ', TenSV) AS Hoten, MaKhoa, NoiSinh, HocBong
FROM DSSinhVien
WHERE HocBong >= 150000 AND NoiSinh = 'Hà Nội';

-- 5--
SELECT MaSV, NgaySinh, Phai, sv.MaKhoa, sv.HocBong
FROM DSSinhVien sv
WHERE HocBong BETWEEN 80000 AND 150000;

-- 6--
SELECT * FROM DMMonHoc
WHERE SoTiet BETWEEN 30 AND 45;

-- 7--
SELECT CONCAT(HoSV, ' ', TenSV) AS HoTen, TIMESTAMPDIFF(YEAR, NgaySinh, CURDATE()) AS Tuoi, TenKhoa
FROM DSSinhVien sv
INNER JOIN DMKhoa mk ON sv.MaKhoa = mk.MaKhoa
WHERE TIMESTAMPDIFF(YEAR, NgaySinh, CURDATE()) BETWEEN 20 AND 25;

-- 8--
SELECT MaSV, Phai, MaKhoa, HocBong,
   CASE WHEN HocBong > 500000 THEN 'Học bổng cao'
   ELSE 'Mức trung bình' END AS MucHocBong
FROM DSSinhVien;

-- 9--
SELECT COUNT(*) AS TongSV
FROM DSSinhVien;

-- 10--
SELECT COUNT(*) AS TongSV,
SUM(CASE WHEN Phai = 'Nữ' THEN 1 ELSE 0 END) AS TONGSVNU
FROM DSSinhVien;

-- 11--
SELECT MaKhoa, COUNT(*) AS TongSinhVien
FROM DSSinhVien
GROUP BY MaKhoa;

-- 12-
SELECT MaMH, COUNT(*) AS SoLuongSinhVien
FROM KetQua
GROUP BY MaMH;
-- 13--
SELECT COUNT(DISTINCT MaMH) AS SoLuongMonHoc
FROM KetQua;

-- 14
SELECT sv.MaKhoa, COUNT(DISTINCT sv.HocBong) AS TongHocBong
FROM DSSinhVien sv
GROUP BY sv.MaKhoa;

-- 15
SELECT MaKhoa, MAX(HocBong) AS HocBongCaoNhat
FROM DSSinhVien
GROUP BY MaKhoa;

-- 16
SELECT 
    MaKhoa,
    SUM(CASE WHEN Phai = 'Nam' THEN 1 ELSE 0 END) AS TongSinhVienNam,
    SUM(CASE WHEN Phai = 'Nữ' THEN 1 ELSE 0 END) AS TongSinhVienNu
FROM DSSinhVien
GROUP BY MaKhoa;

-- 17
SELECT YEAR(NgaySinh) AS NamSinh
FROM DSSinhVien
GROUP BY YEAR(NgaySinh)
HAVING COUNT(*) = 2;

-- 18
SELECT kq.MaSV, sv.TenSV, COUNT(*) AS SoLanThiLai
FROM KetQua kq
INNER JOIN DSSinhVien sv ON kq.MaSV = sv.MaSV
GROUP BY kq.MaSV, sv.TenSV
HAVING COUNT(*) > 2;

-- 19
SELECT MaSV, AVG(Diem) AS DiemTrungBinh
FROM KetQua
WHERE MaSV = 'A06'
GROUP BY MaSV;

-- 20
SELECT MaMH, COUNT(*) AS SoHocsinh
FROM KetQua
GROUP BY MaMH;

-- 21
SELECT sv.MaSV, CONCAT(sv.HoSV, ' ', sv.TenSV) AS HoTen, sv.NgaySinh, mk.TenKhoa AS TenKhoa,
       AVG(kq.Diem) AS DiemTrungBinh
FROM DSSinhVien sv
INNER JOIN DMKhoa mk ON sv.MaKhoa = mk.MaKhoa
LEFT JOIN KetQua kq ON sv.MaSV = kq.MaSV
GROUP BY sv.MaSV, sv.HoSV, sv.TenSV, sv.NgaySinh, mk.TenKhoa;

-- 22
SELECT sv.MaSV, CONCAT(sv.HoSV, ' ', sv.TenSV) AS Hoten, sv.NgaySinh, k.TenKhoa, AVG(kq.Diem) AS DiemTB
FROM DSSinhVien sv
INNER JOIN DMKhoa k ON k.MaKhoa = sv.MaKhoa
LEFT JOIN KetQua kq ON kq.MaSV = sv.MaSV
GROUP BY sv.MaSV, CONCAT(sv.HoSV, ' ', sv.TenSV), sv.NgaySinh, k.TenKhoa
HAVING AVG(kq.Diem) >= 9.0;

-- 23
SELECT sv.MaSV, CONCAT(sv.HoSV, ' ', sv.TenSV) AS HoTen, sv.Phai, sv.MaKhoa,
       kq.Diem AS DiemLan1_Ma01
FROM DSSinhVien sv
LEFT JOIN KetQua kq ON sv.MaSV = kq.MaSV AND kq.MaMH = '01' AND kq.LanThi = 1;

-- 24
-- Thêm cột TinhTrang vào bảng KetQua nếu chưa có
ALTER TABLE KetQua
ADD TinhTrang INT;

CREATE TEMPORARY TABLE DiemTB AS
SELECT sv.MaSV, AVG(kq.Diem) AS DiemTB
FROM DSSinhVien sv
LEFT JOIN KetQua kq ON sv.MaSV = kq.MaSV
GROUP BY sv.MaSV;


UPDATE KetQua kq
JOIN DiemTB dtb ON kq.MaSV = dtb.MaSV
SET kq.TinhTrang = 
    CASE
        WHEN dtb.DiemTB < 4 THEN 0
        WHEN dtb.DiemTB >= 4 AND dtb.DiemTB < 5.5 THEN 1
        ELSE NULL
    END;

DROP TEMPORARY TABLE DiemTB;
 
 -- 25
 DELETE FROM DSSinhVien
WHERE MaSV NOT IN (SELECT DISTINCT MaSV FROM KetQua);

 -- 26
 ALTER TABLE DMKhoa
ADD Siso INT;

UPDATE DMKhoa
SET Siso = (SELECT COUNT(*) FROM DSSinhVien WHERE DSSinhVien.MaKhoa = DMKhoa.MaKhoa);

-- 27

UPDATE KetQua
SET Diem = CASE 
                WHEN LanThi = 2 AND (Diem + 1) <= 5 THEN Diem + 1
                WHEN LanThi = 2 AND (Diem + 1) > 5 THEN 5
                ELSE Diem
           END
WHERE LanThi = 2;

-- 28
UPDATE KetQua
SET Diem = CASE 
                WHEN LanThi = 2 AND (Diem + 1) <= 5 THEN Diem + 1
                WHEN LanThi = 2 AND (Diem + 1) > 5 THEN 5
                ELSE Diem
           END
WHERE LanThi = 2;
-- 29
UPDATE DSSinhVien
SET HocBong = HocBong + 100000
WHERE MaSV IN (
    SELECT MaSV
    FROM KetQua
    GROUP BY MaSV
    HAVING AVG(Diem) >= 6.5
);

-- 30
UPDATE DSSinhVien
SET HocBong = 0
WHERE MaSV IN (
    SELECT kq.MaSV
    FROM KetQua kq
    WHERE kq.LanThi = 1 AND kq.Diem < 4.0
    GROUP BY kq.MaSV
    HAVING COUNT(*) = 2
);















 


UPDATE KetQua kq JOIN (     SELECT sv.MaSV, AVG(kq.Diem) AS DiemTB     FROM DSSinhVien sv     LEFT JOIN KetQua kq ON sv.MaSV = kq.MaSV     GROUP BY sv.MaSV ) dtb ON kq.MaSV = dtb.MaSV SET kq.TinhTrang =      CASE         WHEN dtb.DiemTB < 4 THEN 0         WHEN dtb.DiemTB >= 4 AND dtb.DiemTB < 5.5 THEN 1         ELSE NULL     END
