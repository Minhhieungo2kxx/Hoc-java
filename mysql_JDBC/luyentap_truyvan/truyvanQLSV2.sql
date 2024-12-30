use qlsv2


-- 1. Cho biết những sinh viên thi lại trên 2 lần.
SELECT sv.MaSV, CONCAT(HoSV, ' ', TenSV) AS HoTen
FROM KetQua kq
right JOIN DSSinhVien sv ON kq.MaSV = sv.MaSV
GROUP BY sv.MaSV, CONCAT(HoSV, ' ', TenSV)
HAVING COUNT(LanThi) > 2
ORDER BY sv.MaSV;

-- 2. Cho biết những sinh viên nam có điểm trung bình lần 1 trên 7.0
SELECT sv.MaSV, CONCAT(sv.HoSV, ' ', sv.TenSV) AS HoTen, AVG(kq.Diem) AS DiemTrungBinhLan1
FROM DSSinhVien sv
left JOIN KetQua kq ON sv.MaSV = kq.MaSV
WHERE sv.Phai = 'Nam' -- Chỉ lấy sinh viên nam
AND kq.LanThi = 1 -- Chỉ lấy điểm từ lần thi đầu tiên
GROUP BY sv.MaSV, CONCAT(sv.HoSV, ' ', sv.TenSV)
HAVING AVG(kq.Diem) > 7.0; -- Chỉ lấy sinh viên có điểm trung bình lớn hơn 7.0

-- 3. Cho biết danh sách các sinh viên rớt trên 2 môn ở lần thi 1
SELECT sv.MaSV, CONCAT(sv.HoSV, ' ', sv.TenSV) AS HoTen, COUNT(*) AS SoMonRot
FROM DSSinhVien sv
left JOIN KetQua kq ON sv.MaSV = kq.MaSV
WHERE kq.LanThi = 1 -- Chỉ lấy kết quả từ lần thi đầu tiên
AND kq.Diem < 4.0 -- Điểm dưới 4 được coi là rớt
GROUP BY sv.MaSV, CONCAT(sv.HoSV, ' ', sv.TenSV)
HAVING COUNT(*) > 2; -- Chỉ lấy những sinh viên rớt trên 2 môn

-- 4. Cho biết danh sách những khoa có nhiều hơn 2 sinh viên nam
SELECT sv.MaKhoa, COUNT(*) AS SoLuongSinhVienNam
FROM DSSinhVien sv
WHERE sv.Phai = 'Nam'
GROUP BY sv.MaKhoa
HAVING COUNT(*) > 2;

-- 5. Cho biết những khoa có 2 sinh đạt học bổng từ 200.000 đến 300.000
SELECT sv.MaKhoa, COUNT(*) AS SoLuongSinhVien
FROM DSSinhVien sv
WHERE sv.HocBong BETWEEN 200000 AND 300000
GROUP BY sv.MaKhoa
HAVING COUNT(*) = 2;

-- 6. Cho biết số lượng sinh viên đậu và số lượng sinh viên rớt của từng môn trong lần thi 1.
SELECT 
    MaMH,
    SUM(CASE WHEN Diem >= 4 THEN 1 ELSE 0 END) AS SoLuongDau,
    SUM(CASE WHEN Diem < 4 THEN 1 ELSE 0 END) AS SoLuongRot
FROM KetQua
WHERE LanThi = 1
GROUP BY MaMH;

-- 7. Cho biết sinh viên nào có học bổng cao nhất.
SELECT MaSV, CONCAT(HoSV, ' ', TenSV) AS HoTen, HocBong
FROM DSSinhVien
ORDER BY HocBong DESC
LIMIT 1;

-- 8. Cho biết sinh viên nào có điểm thi lần 1 môn Cơ Sở Dữ Liệu cao nhất.
SELECT MaSV, kq.MaMH, Diem, LanThi
FROM KetQua kq
right join DMMonHoc mh ON kq.MaMH = mh.MaMH
WHERE LanThi = 1 AND TenMH = 'Cơ Sở Dữ Liệu'
ORDER BY Diem DESC
LIMIT 1;

-- 9. Cho biết sinh viên khoa Anh Văn có tuổi lớn nhất.
SELECT MaSV, CONCAT(HoSV, ' ', TenSV) AS HoTen, timestampdiff(YEAR, NgaySinh, CURDATE()) AS Tuoi
FROM DSSinhVien sv
INNER JOIN DMKhoa k ON sv.MaKhoa = k.MaKhoa
WHERE TenKhoa = 'Anh Văn'
ORDER BY Tuoi DESC
LIMIT 1;

-- 10. Cho biết khoa nào có đông sinh viên nhất.
SELECT sv.MaKhoa, TenKhoa, COUNT(MaSV) AS SoSinhVien
FROM DSSinhVien sv
INNER JOIN DMKhoa k ON sv.MaKhoa = k.MaKhoa
GROUP BY sv.MaKhoa, TenKhoa
ORDER BY SoSinhVien DESC
LIMIT 1;

-- 11. Cho biết khoa nào có đông nữ nhất.
SELECT sv.MaKhoa, TenKhoa, COUNT(DISTINCT MaSV) AS Sonu
FROM DSSinhVien sv
INNER JOIN DMKhoa k ON sv.MaKhoa = k.MaKhoa
WHERE Phai = 'Nữ'
GROUP BY sv.MaKhoa, TenKhoa
ORDER BY Sonu DESC
LIMIT 1;


-- 11. Cho biết khoa nào có đông nữ nhất.
SELECT sv.MaKhoa, TenKhoa, COUNT(DISTINCT MaSV) AS Sonu
FROM DSSinhVien sv
INNER JOIN DMKhoa k ON sv.MaKhoa = k.MaKhoa
WHERE Phai = 'Nữ'
GROUP BY sv.MaKhoa, TenKhoa
ORDER BY Sonu DESC
LIMIT 1;

-- 12. Cho biết môn nào có nhiều sinh viên rớt lần 1 nhiều nhất.
SELECT kq.MaMH, TenMH, LanThi, COUNT(*) AS solanrot
FROM KetQua kq
JOIN DMMonHoc mh ON kq.MaMH = mh.MaMH
WHERE Diem < 4 AND LanThi = 1
GROUP BY kq.MaMH, TenMH, LanThi
ORDER BY solanrot DESC
LIMIT 1;


-- 13. Cho biết sinh viên không học khoa Anh Văn có điểm thi môn Văn Phạm lớn hơn điểm thi Văn Phạm của sinh viên học khoa Anh Văn.
SELECT sv.MaSV, TenSV,mk.TenKhoa,mh.TenMH, kq.Diem AS DiemVanPham
FROM DSSinhVien sv
INNER JOIN KetQua kq ON sv.MaSV = kq.MaSV
INNER JOIN DMKhoa mk ON sv.MaKhoa = mk.MaKhoa
inner join DMMonHoc mh on kq.MaMH=mh.MaMH
where mh.TenMH='Văn Phạm'
AND not   (
    mk.TenKhoa = 'Anh Văn' 
    
) 
 AND kq.Diem > (
   select Diem
   from DSSinhVien sv
   inner join DMKhoa k on sv.MaKhoa=k.MaKhoa
   inner join KetQua kq on sv.MaSV=kq.MaSV
   inner join DMMonHoc mh on kq.MaMH=mh.MaMH
   where k.TenKhoa='Anh Văn' and mh.TenMH='Văn Phạm'
)

-- 14. Cho biết sinh viên có nơi sinh cùng với Hải.
SELECT MaSV, CONCAT(HoSV, ' ', TenSV) AS HoTen, NoiSinh
FROM DSSinhVien
WHERE NoiSinh = (SELECT NoiSinh FROM DSSinhVien WHERE TenSV = 'Hải');

-- 15. Cho biết những sinh viên nào có học bổng lớn hơn tất cả học bổng của sinh viên thuộc khoa Anh Văn.
SELECT *
FROM DSSinhVien
WHERE HocBong >  (SELECT MAX(HocBong) FROM DSSinhVien WHERE MaKhoa = (SELECT MaKhoa FROM DMKhoa WHERE TenKhoa = 'Anh Văn'));

-- 16. Cho biết những sinh viên có học bổng lớn hơn bất kỳ học bổng của sinh viên học khoa Anh Văn.
SELECT *
FROM DSSinhVien
WHERE HocBong > any(
    SELECT HocBong FROM DSSinhVien WHERE MaKhoa = (SELECT MaKhoa FROM DMKhoa WHERE TenKhoa = 'Anh Văn')
);

-- 17. Cho biết sinh viên có điểm thi lần 2 môn Cơ Sở Dữ Liệu cao hơn tất cả điểm thi lần 1.
SELECT kq2.MaSV, sv.TenSV, kq2.LanThi, kq2.Diem
FROM KetQua kq2
JOIN DSSinhVien sv ON kq2.MaSV = sv.MaSV
INNER JOIN DMMonHoc mh ON kq2.MaMH = mh.MaMH
WHERE kq2.LanThi = 2
AND mh.TenMH = 'Cơ Sở Dữ Liệu'
AND kq2.Diem > ALL (
    SELECT kq1.Diem
    FROM KetQua kq1
    INNER JOIN DMMonHoc mh1 ON kq1.MaMH = mh1.MaMH
    WHERE kq1.LanThi = 1
    AND mh1.TenMH = 'Cơ Sở Dữ Liệu'
);


-- 18. Cho biết những sinh viên đạt điểm cao nhất trong từng môn.
SELECT kq.MaSV, sv.TenSV, kq.MaMH, kq.Diem
FROM KetQua kq
INNER JOIN DSSinhVien sv ON kq.MaSV = sv.MaSV
INNER JOIN (
    SELECT MaMH, MAX(Diem) AS MaxDiem
    FROM KetQua
    GROUP BY MaMH
) AS Bangdiem ON kq.MaMH = Bangdiem.MaMH AND kq.Diem = Bangdiem.MaxDiem
ORDER BY kq.MaMH ASC;

-- 19. Cho biết những khoa không có sinh viên học.
SELECT mk.MaKhoa, mk.TenKhoa
FROM DMKhoa mk
LEFT JOIN DSSinhVien sv ON mk.MaKhoa = sv.MaKhoa
WHERE sv.MaSV IS NULL;

-- 20. Cho biết sinh viên chưa thi môn Cơ Sở Dữ Liệu.
SELECT sv.MaSV, sv.HoSV, sv.TenSV, LanThi
FROM DSSinhVien sv
LEFT JOIN KetQua kq ON sv.MaSV = kq.MaSV AND kq.MaMH = '01'
WHERE kq.MaSV IS NULL;

-- 21. Cho biết sinh viên nào không thi lần 1 mà có dự thi lần 2.
SELECT sv.MaSV, sv.HoSV, sv.TenSV
FROM DSSinhVien sv
INNER JOIN KetQua kq ON sv.MaSV = kq.MaSV
WHERE kq.LanThi = 2
  AND NOT EXISTS (
-- SELECT 1 một cách viết tắt để kiểm tra sự tồn tại của các bản ghi mà không cần phải truy xuất toàn bộ dữ liệu từ 
-- các bản ghi đó. Nó chỉ trả về một giá trị đơn giản (1) nếu tồn tại một bản ghi khớp với điều kiện,
-- điều này giúp cải thiện hiệu suất của truy vấn.
    SELECT 1
    FROM KetQua kq
    WHERE sv.MaSV=kq.MaSV and kq.LanThi = 1
);

-- 22. Cho biết môn học không có sinh viên khoa Anh Văn thi.
SELECT mh.MaMH, mh.TenMH
FROM DMMonHoc mh
WHERE NOT EXISTS (
    SELECT 1
    FROM KetQua kq
    JOIN DSSinhVien sv ON kq.MaSV = sv.MaSV
    WHERE sv.MaKhoa = 'AV' -- Mã khoa của khoa Anh văn
    AND kq.MaMH = mh.MaMH
);

-- 23. Cho biết sinh viên khoa Anh Văn không thi môn Văn phạm.
SELECT sv.MaSV, sv.HoSV, sv.TenSV
FROM DSSinhVien sv
WHERE sv.MaKhoa = 'AV' -- Mã khoa của khoa Anh văn
AND NOT EXISTS (
    SELECT 5
    FROM KetQua kq
   
    WHERE -- Kết nối với bảng KetQua dựa trên MaSV
   kq.MaSV = sv.MaSV  and kq.MaMH = '05' -- Mã môn học của môn Văn phạm
);

-- 24. Cho biết sinh viên không có điểm dưới 4.0.
SELECT sv.MaSV, sv.HoSV, sv.TenSV
FROM DSSinhVien sv
WHERE NOT EXISTS (
    SELECT 1
    FROM KetQua kq
    WHERE kq.MaSV = sv.MaSV -- Điều này đảm bảo rằng truy vấn con chỉ kiểm tra các bản ghi liên quan đến bản ghi hiện tại trong bảng chính.
    AND kq.Diem < 4.0 -- Điểm dưới 4.0 được coi là rớt
);

-- 25. Cho biết sinh viên khoa Anh Văn có học bổng và không rớt môn nào.
SELECT sv.MaSV, sv.HoSV, sv.TenSV
FROM DSSinhVien sv
LEFT JOIN KetQua kq ON sv.MaSV = kq.MaSV
WHERE sv.MaKhoa = 'AV' -- Mã khoa của khoa Anh văn
AND sv.HocBong IS NOT NULL -- Sinh viên có học bổng
AND NOT EXISTS (
    SELECT 1
    FROM KetQua
    WHERE MaSV = sv.MaSV AND Diem < 4.0 -- Kiểm tra xem sinh viên có rớt môn nào không
)
GROUP BY sv.MaSV, sv.HoSV, sv.TenSV;


-- 26. Cho biết khoa có nhiều sinh viên nhận học bổng nhất và ít nhất.
WITH HocBongByKhoa AS (
    SELECT sv.MaKhoa, k.TenKhoa, COUNT(sv.MaSV) AS SoLuongSV
    FROM DSSinhVien sv
    INNER JOIN DMKhoa k ON sv.MaKhoa = k.MaKhoa
    WHERE sv.HocBong IS NOT NULL
    GROUP BY sv.MaKhoa, k.TenKhoa
)
SELECT 
    MAX(SoLuongSV) AS KhoaNhieuHocBong,
    MIN(SoLuongSV) AS KhoaItHocBong,
    (SELECT TenKhoa FROM HocBongByKhoa WHERE SoLuongSV = (SELECT MAX(SoLuongSV) FROM HocBongByKhoa) LIMIT 1) AS TenKhoaNhieuHocBong,
    (SELECT TenKhoa FROM HocBongByKhoa WHERE SoLuongSV = (SELECT MIN(SoLuongSV) FROM HocBongByKhoa) LIMIT 1) AS TenKhoaItHocBong
FROM HocBongByKhoa;

-- 27. Cho biết 3 sinh viên học nhiều môn nhất.
SELECT sv.MaSV, CONCAT(sv.HoSV, ' ', sv.TenSV) AS HoTen, COUNT(kq.MaMH) AS SoMonHoc
FROM DSSinhVien sv
left JOIN KetQua kq ON sv.MaSV = kq.MaSV
GROUP BY sv.MaSV, sv.HoSV, sv.TenSV
ORDER BY SoMonHoc DESC
LIMIT 3;

-- 28. Cho biết môn học chưa có sinh viên nào thi.
SELECT MaMH, TenMH
FROM DMMonHoc
WHERE MaMH NOT IN (
    SELECT DISTINCT MaMH
    FROM KetQua
);
-- 29
SELECT DISTINCT sv.MaSV, sv.TenSV,kq.MaMH
FROM DSSinhVien sv
left JOIN KetQua kq ON sv.MaSV = kq.MaSV
WHERE kq.MaMH IN (
    SELECT DISTINCT MaMH
    FROM KetQua
    WHERE MaSV = 'A02'
)
group by sv.MaSV, sv.TenSV,kq.MaMH

-- 30
SELECT DISTINCT sv.MaSV, sv.TenSV
FROM DSSinhVien sv
JOIN KetQua kq ON sv.MaSV = kq.MaSV
WHERE NOT EXISTS (
    SELECT DISTINCT MaMH
    FROM KetQua
    WHERE MaSV = 'A02'
    EXCEPT
    SELECT DISTINCT MaMH
    FROM KetQua kq1
    WHERE kq1.MaSV = sv.MaSV
);


-- 31:
-- Tạo bảng mới sinhvien_ketqua
CREATE TABLE sinhvien_ketqua (
    MASV VARCHAR(50) NOT NULL,
    HoSV NVARCHAR(50) NOT NULL,
    TenSV NVARCHAR(50) NOT NULL,
    SoMonHoc INT
);

-- Thêm dữ liệu từ các bảng DSSinhVien và KetQua
INSERT INTO sinhvien_ketqua (MASV, HoSV, TenSV, SoMonHoc)
SELECT sv.MaSV, sv.HoSV, sv.TenSV, COUNT(kq.MaMH) AS SoMonHoc
FROM DSSinhVien sv
LEFT JOIN KetQua kq ON sv.MaSV = kq.MaSV
GROUP BY sv.MaSV, sv.HoSV, sv.TenSV;

-- 32:
ALTER TABLE DMKhoa
ADD Siso INT;

UPDATE DMKhoa
SET Siso = (
    SELECT COUNT(*)
    FROM DSSinhVien
    WHERE DSSinhVien.MaKhoa = DMKhoa.MaKhoa
);

-- 33:
UPDATE KetQua
SET Diem = CASE 
    WHEN LanThi = 2 AND (Diem + 1) <= 5 THEN Diem + 1
    WHEN LanThi = 2 AND (Diem + 1) > 5 THEN 5
    ELSE Diem 
END
WHERE LanThi = 2;

-- 34:
UPDATE DSSinhVien
SET HocBong = 100000
WHERE (SELECT AVG(Diem) FROM KetQua WHERE KetQua.MaSV = DSSinhVien.MaSV) >= 6.5;

-- 35:
UPDATE DSSinhVien
SET HocBong = 0
WHERE MaSV IN (
    SELECT kq.MaSV
    FROM KetQua kq
    WHERE LanThi = 1
    AND Diem < 4
    GROUP BY kq.MaSV
    HAVING COUNT(*) = 2
);

-- 36:
DELETE FROM DSSinhVien
WHERE MaSV NOT IN (
    SELECT MaSV
    FROM KetQua
    GROUP BY MaSV
);

-- 37:
DELETE FROM DMMonHoc
WHERE MaMH NOT IN (
    SELECT MaMH
    FROM KetQua
);

-- 38:
SELECT sv.MaSV, sv.HoSV, sv.TenSV
FROM DSSinhVien sv
WHERE sv.MaSV NOT IN (
    SELECT kq.MaSV
    FROM KetQua kq
    WHERE kq.Diem < 5.0 -- Điểm dưới mức đạt được coi là rớt
);

-- 39:
SELECT sv.MaSV, sv.HoSV, sv.TenSV
FROM DSSinhVien sv
INNER JOIN KetQua kq ON sv.MaSV = kq.MaSV
INNER JOIN DMMonHoc mh ON kq.MaMH = mh.MaMH
WHERE mh.TenMH IN ('Văn phạm', 'Cơ sở dữ liệu');

-- 40:
SELECT sv.MaSV, sv.HoSV, sv.TenSV, mh.TenMH, MAX(kq.Diem) AS Diem
FROM DSSinhVien sv
INNER JOIN KetQua kq ON sv.MaSV = kq.MaSV
INNER JOIN DMMonHoc mh ON kq.MaMH = mh.MaMH
GROUP BY sv.MaSV, sv.HoSV, sv.TenSV, mh.TenMH;

-- 41:
SELECT *
FROM DSSinhVien
WHERE MaSV NOT IN (
    SELECT MaSV
    FROM KetQua
    WHERE LanThi = 1 AND Diem < 4
)
OR MaSV NOT IN (
    SELECT MaSV
    FROM KetQua kq
    INNER JOIN DMMonHoc mh ON kq.MaMH = mh.MaMH
    WHERE mh.TenMH = 'Văn phạm'
);

-- 42:
SELECT sv.*
FROM DSSinhVien sv
INNER JOIN DMKhoa k ON sv.MaKhoa = k.MaKhoa
WHERE k.TenKhoa IN (
    SELECT k2.TenKhoa
    FROM DSSinhVien sv2
    INNER JOIN DMKhoa k2 ON sv2.MaKhoa = k2.MaKhoa
    WHERE sv2.Phai = 'Nữ'
    GROUP BY k2.TenKhoa
    HAVING COUNT(DISTINCT sv2.MaSV) >= 2
);

-- 43:
SELECT k.TenKhoa, COUNT(sv.MaSV) AS SoLuongSinhVien
FROM DSSinhVien sv
JOIN DMKhoa k ON sv.MaKhoa = k.MaKhoa
GROUP BY k.MaKhoa, k.TenKhoa
HAVING COUNT(sv.MaSV) > 2;

-- 44:
SELECT kq.MaMH, mh.TenMH, COUNT(DISTINCT kq.MaSV) AS SoLuongSinhVien
FROM KetQua kq
JOIN DMMonHoc mh ON kq.MaMH = mh.MaMH
GROUP BY kq.MaMH, mh.TenMH
HAVING COUNT(DISTINCT kq.MaSV) > 3;