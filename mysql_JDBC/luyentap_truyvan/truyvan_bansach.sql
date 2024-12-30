use qlbs2024


-- 1---
SELECT MaSach, TenSach, TenNXB
FROM tSach
JOIN tNhaXuatBan ON tSach.MaNXB = tNhaXuatBan.MaNXB
WHERE TenNXB = 'NXB Giáo Dục';
 

-- 2--
SELECT MaSach, TenSach
FROM tSach
WHERE TenSach LIKE 'Ngày%';

-- 3---
SELECT MaSach, TenSach, DonGiaBan, TenNXB
FROM tSach
JOIN tNhaXuatBan ON tSach.MaNXB = tNhaXuatBan.MaNXB
WHERE TenNXB = 'NXB Giáo Dục' AND DonGiaBan BETWEEN 100000 AND 150000;

-- 4--
SELECT MaSach, TenSach, DonGiaBan, TenNXB
FROM tSach
JOIN tNhaXuatBan ON tSach.MaNXB = tNhaXuatBan.MaNXB
WHERE (TenNXB = 'NXB Giáo Dục' OR TenNXB = 'NXB Trẻ') AND DonGiaBan BETWEEN 90000 AND 140000;


-- 5---
SELECT hdb.SoHDB, hban.NgayBan, SUM(SLBan * s.DonGiaBan) AS TongTien, kh.TenKH
FROM tChiTietHDB hdb
INNER JOIN tHoaDonBan hban ON hdb.SoHDB = hban.SoHDB
INNER JOIN tSach s ON hdb.MaSach = s.MaSach
INNER JOIN tKhachHang kh ON hban.MaKH = kh.MaKH
WHERE hban.NgayBan BETWEEN '2014-01-01' AND '2014-12-31'
GROUP BY hdb.SoHDB, hban.NgayBan, kh.TenKH;

--6--
SELECT hdb.SoHDB, hban.NgayBan, SUM(SLBan * s.DonGiaBan) AS TongTien, kh.TenKH
FROM tChiTietHDB hdb
INNER JOIN tHoaDonBan hban ON hdb.SoHDB = hban.SoHDB
INNER JOIN tKhachHang kh ON hban.MaKH = kh.MaKH
INNER JOIN tSach s ON hdb.MaSach = s.MaSach
WHERE hban.NgayBan BETWEEN '2014-04-01' AND '2014-04-30'
GROUP BY hdb.SoHDB, hban.NgayBan, kh.TenKH
ORDER BY hban.NgayBan ASC, TongTien DESC;


--7--
SELECT kh.MaKH, kh.TenKH, db.SoHDB, db.NgayBan AS Ngaymua
FROM tKhachHang kh
INNER JOIN tHoaDonBan db ON kh.MaKH = db.MaKH
WHERE db.NgayBan = '2014-04-10'
GROUP BY kh.MaKH, kh.TenKH, db.SoHDB, db.NgayBan;

--8--
SELECT hdb.SoHDB, nv.TenNV, hd.NgayBan, s.TenSach, hdb.SLBan AS soluong, s.DonGiaBan, (hdb.SLBan * s.DonGiaBan) AS TongTien
FROM tChiTietHDB hdb
INNER JOIN tSach s ON hdb.MaSach = s.MaSach
INNER JOIN tHoaDonBan hd ON hdb.SoHDB = hd.SoHDB
INNER JOIN tNhanVien nv ON hd.MaNV = nv.MaNV
WHERE nv.TenNV = N'Trần Huy' AND hd.NgayBan = '2014-08-11'
GROUP BY hdb.SoHDB, nv.TenNV, s.TenSach, s.DonGiaBan, hd.NgayBan, hdb.SLBan
ORDER BY TongTien DESC;
-- 9
SELECT s.MaSach, s.TenSach, kh.TenKH, hd.NgayBan
FROM tSach s
INNER JOIN tChiTietHDB hdb ON hdb.MaSach = s.MaSach
INNER JOIN tHoaDonBan hd ON hdb.SoHDB = hd.SoHDB
INNER JOIN tKhachHang kh ON hd.MaKH = kh.MaKH
WHERE (hd.NgayBan BETWEEN '2014-08-01' AND '2014-08-30') AND kh.TenKH = N'Nguyễn Đình Sơn';

--10--
SELECT hdb.SoHDB, hdb.SLBan, s.TenSach AS MuaSach
FROM tChiTietHDB hdb
INNER JOIN tHoaDonBan hd ON hdb.SoHDB = hd.SoHDB
INNER JOIN tSach s ON hdb.MaSach = s.MaSach
WHERE s.TenSach = N'Cấu trúc dữ liệu và giải thuật';

--11--
SELECT hdb.SoHDB, hdb.SLBan AS SLMua, s.TenSach, s.MaSach
FROM tChiTietHDB hdb
INNER JOIN tSach s ON hdb.MaSach = s.MaSach
WHERE (s.MaSach = 'S01' OR s.MaSach = 'S02') AND (hdb.SLBan BETWEEN 10 AND 20)
ORDER BY hdb.SLBan ASC;

--12--
SELECT hdb.SoHDB
FROM tChiTietHDB hdb
INNER JOIN tSach s ON hdb.MaSach = s.MaSach
WHERE s.MaSach IN ('S10', 'S11')
GROUP BY hdb.SoHDB
HAVING COUNT(DISTINCT s.MaSach) = 2
AND SUM(hdb.SLBan) BETWEEN 5 AND 10;


--13--
SELECT * 
FROM tSach
WHERE MaSach NOT IN (
    SELECT DISTINCT MaSach
    FROM tChiTietHDB
);

--14--
SELECT MaSach, TenSach
FROM tSach
WHERE MaSach NOT IN (
    SELECT DISTINCT MaSach
    FROM tChiTietHDB hdb
    INNER JOIN tHoaDonBan hban ON hdb.SoHDB = hban.SoHDB
    WHERE YEAR(hban.NgayBan) = 2014
);

--15--
SELECT MaSach, TenSach
FROM tSach
WHERE MaNXB = (
    SELECT MaNXB
    FROM tNhaXuatBan
    WHERE TenNXB = N'NXB Giáo Dục'
)
AND MaSach NOT IN (
    SELECT DISTINCT MaSach
    FROM tChiTietHDB hdb
    INNER JOIN tHoaDonBan hban ON hdb.SoHDB = hban.SoHDB
    WHERE YEAR(hban.NgayBan) = 2014
);



--16--
SELECT SoHDB
FROM tChiTietHDB
WHERE MaSach IN (
    SELECT MaSach
    FROM tSach
    WHERE MaNXB = (
        SELECT MaNXB
        FROM tNhaXuatBan
        WHERE TenNXB = N'NXB Giáo Dục'
    )
)
GROUP BY SoHDB
HAVING COUNT(DISTINCT MaSach) = (
    SELECT COUNT(*)
    FROM tSach
    WHERE MaNXB = (
        SELECT MaNXB
        FROM tNhaXuatBan
        WHERE TenNXB = N'NXB Giáo Dục'
    )
);
-- 17
SELECT COUNT(DISTINCT MaSach) AS SoDauSach
FROM tChiTietHDB hdb
INNER JOIN tHoaDonBan hban ON hdb.SoHDB = hban.SoHDB
WHERE YEAR(hban.NgayBan) = 2014;

--18--
SELECT 
    MAX(hdb.SLBan * s.DonGiaBan) AS TriGiaCaoNhat,
    MIN(hdb.SLBan * s.DonGiaBan) AS TriGiaThapNhat
FROM tChiTietHDB hdb
INNER JOIN tSach s ON hdb.MaSach = s.MaSach;

--19--
SELECT AVG(TriGia) AS TrungBinhTriGia
FROM (
    SELECT SUM(hdb.SLBan * s.DonGiaBan) AS TriGia
    FROM tChiTietHDB hdb
    INNER JOIN tHoaDonBan hdban ON hdb.SoHDB = hdban.SoHDB
    INNER JOIN tSach s ON hdb.MaSach = s.MaSach
    WHERE YEAR(hdban.NgayBan) = 2014
    GROUP BY hdb.SoHDB
) AS GiaHoaDon;

--20--
SELECT SUM(TriGia) AS DoanhThu
FROM (
    SELECT SUM(SLBan * s.DonGiaBan) AS TriGia
    FROM tChiTietHDB hdb
    INNER JOIN tHoaDonBan hdban ON hdb.SoHDB = hdban.SoHDB
    INNER JOIN tSach s ON hdb.MaSach = s.MaSach
    WHERE YEAR(hdban.NgayBan) = 2014
    GROUP BY hdb.SoHDB
) AS sumdoanhthu2014;

-- 21 --
SELECT kh.TenKH, SUM(hdb.SLBan * s.DonGiaBan) AS TriGia
FROM tChiTietHDB hdb
INNER JOIN tHoaDonBan hdban ON hdb.SoHDB = hdban.SoHDB
INNER JOIN tSach s ON hdb.MaSach = s.MaSach
INNER JOIN tKhachHang kh ON hdban.MaKH = kh.MaKH
WHERE YEAR(hdban.NgayBan) = 2014
GROUP BY kh.TenKH
ORDER BY TriGia DESC
LIMIT 1;

-- 23 --
SELECT kh.MaKH, kh.TenKH, SUM(hdb.SLBan * s.DonGiaBan) AS TongTriGiaHoaDon
FROM tChiTietHDB hdb
INNER JOIN tHoaDonBan hd ON hdb.SoHDB = hd.SoHDB
INNER JOIN tSach s ON hdb.MaSach = s.MaSach
INNER JOIN tKhachHang kh ON hd.MaKH = kh.MaKH
GROUP BY kh.MaKH, kh.TenKH
ORDER BY TongTriGiaHoaDon DESC
LIMIT 3;


-- 24 --
-- Bước 1: Xác định ba mức giá bán cao nhất
SELECT DISTINCT DonGiaBan
FROM tSach
ORDER BY DonGiaBan DESC
LIMIT 3;

-- Bước 2: Sử dụng danh sách các mức giá này để lọc ra các sách có giá bán thuộc ba mức giá đó
SELECT MaSach, TenSach, DonGiaBan
FROM tSach
WHERE DonGiaBan IN (
    SELECT DISTINCT DonGiaBan
    FROM tSach
    ORDER BY DonGiaBan DESC
    LIMIT 3
);

-- 25
-- Bước 1: Tạo bảng tạm thời chứa ba mức giá cao nhất
CREATE TEMPORARY TABLE TopPrices AS
SELECT DISTINCT DonGiaBan
FROM tSach
ORDER BY DonGiaBan DESC
LIMIT 3;

-- Bước 2: Truy vấn các sách của NXB Giáo Dục có giá bán thuộc ba mức giá cao nhất
SELECT s.MaSach, s.TenSach, s.DonGiaBan
FROM tSach s
INNER JOIN tNhaXuatBan nxb ON s.MaNXB = nxb.MaNXB
INNER JOIN TopPrices tp ON s.DonGiaBan = tp.DonGiaBan
WHERE nxb.TenNXB = 'NXB Giáo Dục';

-- Xóa bảng tạm thời (nếu cần)
DROP TEMPORARY TABLE TopPrices;


-- 26 --
SELECT COUNT(*) AS TongSoDauSach
FROM tSach
INNER JOIN tNhaXuatBan ON tSach.MaNXB = tNhaXuatBan.MaNXB
WHERE tNhaXuatBan.TenNXB = 'NXB Giáo Dục';


-- 27
SELECT NXB.TenNXB, COUNT(Sach.MaSach) AS TongSoSach
FROM tNhaXuatBan NXB
LEFT JOIN tSach Sach ON NXB.MaNXB = Sach.MaNXB
GROUP BY NXB.TenNXB;


-- 28 --
SELECT 
    nxb.MaNXB,
    nxb.TenNXB,
    MAX(s.DonGiaBan) AS GiaBanCaoNhat,
    MIN(s.DonGiaBan) AS GiaBanThapNhat,
    AVG(s.DonGiaBan) AS GiaBanTrungBinh
FROM 
    tSach s
INNER JOIN 
    tNhaXuatBan nxb ON s.MaNXB = nxb.MaNXB
GROUP BY 
    nxb.MaNXB, nxb.TenNXB;
    
-- 29 --
SELECT 
    NgayBan,
    SUM(SLBan * DonGiaBan) AS DoanhThu
FROM 
    tChiTietHDB hdb
INNER JOIN 
    tHoaDonBan hdban ON hdb.SoHDB = hdban.SoHDB
INNER JOIN  tSach s ON hdb.MaSach = s.MaSach
GROUP BY NgayBan 
ORDER BY NgayBan ASC;


-- 30 --
SELECT 
    hdb.MaSach,
    SUM(hdb.SLBan) AS TongSoLuongBan
FROM 
    tChiTietHDB hdb
INNER JOIN 
    tHoaDonBan hdban ON hdb.SoHDB = hdban.SoHDB
WHERE 
    MONTH(hdban.NgayBan) = 10 AND YEAR(hdban.NgayBan) = 2014
GROUP BY 
    hdb.MaSach;
    
-- 31 --
WITH AllMonths AS (
    SELECT 1 AS Thang
    UNION ALL SELECT 2
    UNION ALL SELECT 3
    UNION ALL SELECT 4
    UNION ALL SELECT 5
    UNION ALL SELECT 6
    UNION ALL SELECT 7
    UNION ALL SELECT 8
    UNION ALL SELECT 9
    UNION ALL SELECT 10
    UNION ALL SELECT 11
    UNION ALL SELECT 12
)
SELECT 
    am.Thang,
    COALESCE(SUM(hdb.SLBan * s.DonGiaBan), 0) AS DoanhThu
FROM 
    AllMonths am
LEFT JOIN 
    tHoaDonBan hdban ON MONTH(hdban.NgayBan) = am.Thang AND YEAR(hdban.NgayBan) = 2014
LEFT JOIN 
    tChiTietHDB hdb ON hdban.SoHDB = hdb.SoHDB
LEFT JOIN 
    tSach s ON hdb.MaSach = s.MaSach
GROUP BY 
    am.Thang
ORDER BY 
    am.Thang ASC;

-- 32
SELECT SoHDB
FROM tChiTietHDB
GROUP BY SoHDB
HAVING COUNT(DISTINCT MaSach) >= 4;

-- 33
SELECT hdb.SoHDB
FROM tChiTietHDB hdb
INNER JOIN tSach s ON hdb.MaSach = s.MaSach
INNER JOIN tNhaXuatBan nxb ON s.MaNXB = nxb.MaNXB
WHERE nxb.TenNXB = 'NXB Giáo Dục'
GROUP BY hdb.SoHDB
HAVING COUNT(DISTINCT hdb.MaSach) = 3;
-- 34
SELECT hdb.MaKH, kh.TenKH, COUNT(*) AS SoLanMua
FROM tHoaDonBan hdb
INNER JOIN tKhachHang kh ON hdb.MaKH = kh.MaKH
GROUP BY hdb.MaKH, kh.TenKH
ORDER BY SoLanMua DESC
LIMIT 1;

-- 36
SELECT MONTH(hdb.NgayBan) AS Thang, SUM(cthdb.SLBan * s.DonGiaBan) AS DoanhSo
FROM tHoaDonBan hdb
INNER JOIN tChiTietHDB cthdb ON hdb.SoHDB = cthdb.SoHDB
INNER JOIN tSach s ON cthdb.MaSach = s.MaSach
WHERE YEAR(hdb.NgayBan) = 2014
GROUP BY MONTH(hdb.NgayBan)
ORDER BY DoanhSo DESC
LIMIT 1;

-- 37
SELECT nxb.MaNXB, nxb.TenNXB, s.TenSach, s.DonGiaBan
FROM (
    SELECT MaNXB, MAX(DonGiaBan) AS MaxDonGia
    FROM tSach
    GROUP BY MaNXB
) AS MaxPrices
INNER JOIN tSach s ON MaxPrices.MaNXB = s.MaNXB AND MaxPrices.MaxDonGia = s.DonGiaBan
INNER JOIN tNhaXuatBan nxb ON s.MaNXB = nxb.MaNXB;

-- 38
UPDATE tSach
SET DonGiaBan = DonGiaBan * 0.9
WHERE MaNXB IN (SELECT MaNXB FROM tNhaXuatBan WHERE TenNXB = 'NXB Giáo Dục');

-- 39
ALTER TABLE tHoaDonBan ADD COLUMN TongTien DECIMAL(18, 2);

CREATE TEMPORARY TABLE TempTongTien AS
SELECT cthdb.SoHDB, SUM(cthdb.SLBan * s.DonGiaBan) AS TongTien
FROM tChiTietHDB cthdb
INNER JOIN tSach s ON cthdb.MaSach = s.MaSach
GROUP BY cthdb.SoHDB;

UPDATE tHoaDonBan hdban
JOIN TempTongTien ttt ON hdban.SoHDB = ttt.SoHDB
SET hdban.TongTien = ttt.TongTien;

DROP TEMPORARY TABLE TempTongTien;

-- 40
ALTER TABLE tHoaDonBan
ADD TongTien DECIMAL(18, 2);


UPDATE tHoaDonBan
SET TongTien = (
    SELECT SUM(SLBan * DonGiaBan)
    FROM tChiTietHDB
    INNER JOIN tSach ON tChiTietHDB.MaSach = tSach.MaSach
    WHERE tChiTietHDB.SoHDB = tHoaDonBan.SoHDB
)
WHERE YEAR(NgayBan) = 2014 AND MONTH(NgayBan) = 9;

UPDATE tHoaDonBan
SET TongTien = TongTien * 0.9 -- Giảm 10%
WHERE YEAR(NgayBan) = 2014 AND MONTH(NgayBan) = 9
AND TongTien > 500000;

-- 41
SELECT SUM(SLNhap) AS TongSoLuongNhap
FROM tChiTietHDN hdn
INNER JOIN tHoaDonNhap hd  ON hdn.SoHDN = hd.SoHDN
WHERE YEAR(hd.NgayNhap) = 2014;

-- 42:
SELECT SUM(hdb.SLBan) AS TongSoLuongBan
FROM tChiTietHDB hdb
INNER JOIN tHoaDonBan hb ON hdb.SoHDB = hb.SoHDB
WHERE YEAR(hb.NgayBan) = 2014;

-- 43--
SELECT  SUM(hdn.SLNhap * s.DonGiaNhap) AS TongTienNhap
FROM tChiTietHDN hdn
INNER JOIN tHoaDonNhap hd ON hdn.SoHDN = hd.SoHDN
inner join tSach s on hdn.MaSach=s.MaSach
WHERE YEAR(hd.NgayNhap) = 2014

-- 44-
-- Xóa các chi tiết hóa đơn liên quan đến các hóa đơn được lập bởi nhân viên "Trần Huy"
DELETE FROM tChiTietHDB
WHERE SoHDB IN (
    SELECT SoHDB
    FROM tHoaDonBan
    WHERE MaNV = (
        SELECT MaNV
        FROM tNhanVien
        WHERE TenNV = 'Trần Huy'
    )
);

-- Xóa các hóa đơn được lập bởi nhân viên "Trần Huy"
DELETE FROM tHoaDonBan
WHERE MaNV = (
    SELECT MaNV
    FROM tNhanVien
    WHERE TenNV = 'Trần Huy'
);

-- 45
UPDATE tNhaXuatBan
SET TenNXB = 'NXB Văn học'
WHERE TenNXB = 'NXB Thăng Long';

-- 46
SELECT 
    s.MaSach,
    s.TenSach,
    s.MaNXB,
    s.DonGiaNhap,
    s.DonGiaBan,
    IFNULL(b.SLBan, 0) AS SoLuongBan
FROM tSach s
LEFT JOIN (
    SELECT MaSach, SUM(SLBan) AS SLBan
    FROM tChiTietHDB
    WHERE SoHDB IN (
        SELECT SoHDB
        FROM tHoaDonBan
        WHERE YEAR(NgayBan) = 2014
    )
    GROUP BY MaSach
) AS b ON s.MaSach = b.MaSach;















