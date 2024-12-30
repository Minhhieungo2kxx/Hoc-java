create database QLBS2024
use QLBS2024

-- tao cac bang trong database

CREATE TABLE tChiTietHDB (
    SoHDB VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    MaSach VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    SLBan INT NULL,
    KhuyenMai VARCHAR(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    PRIMARY KEY (SoHDB, MaSach)
);

CREATE TABLE tChiTietHDN (
    SoHDN VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    MaSach VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    SLNhap INT NULL,
    KhuyenMai VARCHAR(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    PRIMARY KEY (SoHDN, MaSach)
);

CREATE TABLE tHoaDonBan (
    SoHDB VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    MaNV VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    NgayBan DATETIME NULL,
    MaKH VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    PRIMARY KEY (SoHDB)
);

CREATE TABLE tHoaDonNhap (
    SoHDN VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    MaNV VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    NgayNhap DATETIME NULL,
    MaNCC VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    PRIMARY KEY (SoHDN)
);

CREATE TABLE tKhachHang (
    MaKH VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    TenKH VARCHAR(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    DiaChi VARCHAR(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    DienThoai VARCHAR(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    GioiTinh BIT NULL,
    PRIMARY KEY (MaKH)
);

CREATE TABLE tNhaCungCap (
    MaNCC VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    TenNCC VARCHAR(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    PRIMARY KEY (MaNCC)
);

CREATE TABLE tNhanVien (
    MaNV VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    TenNV VARCHAR(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    GioiTinh VARCHAR(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    NgaySinh DATETIME NULL,
    DiaChi VARCHAR(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    DienThoai VARCHAR(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    PRIMARY KEY (MaNV)
);

CREATE TABLE tNhaXuatBan (
    MaNXB VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    TenNXB VARCHAR(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    PRIMARY KEY (MaNXB)
);

CREATE TABLE tSach (
    MaSach VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    TenSach VARCHAR(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    TacGia VARCHAR(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    MaTheLoai VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    MaNXB VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    DonGiaNhap DECIMAL(19, 4) NULL,
    DonGiaBan DECIMAL(19, 4) NULL,
    SoLuong INT NULL,
    SoTrang INT NULL,
    TrongLuong VARCHAR(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    Anh BLOB NULL,
    PRIMARY KEY (MaSach)
);

CREATE TABLE tTheLoai (
    MaTheLoai VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    TenTheLoai VARCHAR(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    PRIMARY KEY (MaTheLoai)
);



INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB01', 'S01', 7, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB01', 'S02', 10, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB01', 'S04', 10, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB02', 'S04', 9, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB02', 'S05', 3, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB03', 'S02', 3, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB03', 'S06', 7, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB03', 'S08', 11, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB04', 'S03', 2, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB04', 'S04', 2, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB04', 'S10', 9, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB05', 'S05', 3, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB05', 'S07', 3, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB05', 'S08', 14, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB06', 'S02', 13, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB06', 'S05', 1, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB06', 'S10', 4, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB06', 'S11', 4, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB07', 'S01', 10, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB07', 'S06', 4, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB07', 'S08', 2, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB08', 'S01', 2, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB08', 'S06', 3, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB08', 'S07', 2, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB09', 'S03', 5, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB09', 'S06', 1, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB09', 'S09', 6, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB10', 'S07', 3, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB10', 'S11', 6, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB10', 'S13', 6, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB11', 'S04', 2, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB11', 'S08', 5, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB11', 'S11', 5, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB12', 'S05', 3, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB12', 'S09', 4, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB12', 'S12', 5, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB13', 'S02', 3, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB13', 'S03', 5, NULL);
INSERT INTO tChiTietHDB (SoHDB, MaSach, SLBan, KhuyenMai) VALUES ('HDB13', 'S04', 2, NULL);

INSERT INTO tChiTietHDN (SoHDN, MaSach, SLNhap, KhuyenMai) VALUES ('HDN01', 'S01', 20, NULL);
INSERT INTO tChiTietHDN (SoHDN, MaSach, SLNhap, KhuyenMai) VALUES ('HDN02', 'S06', 10, NULL);
INSERT INTO tChiTietHDN (SoHDN, MaSach, SLNhap, KhuyenMai) VALUES ('HDN03', 'S03', 20, NULL);
INSERT INTO tChiTietHDN (SoHDN, MaSach, SLNhap, KhuyenMai) VALUES ('HDN04', 'S09', 10, NULL);
INSERT INTO tChiTietHDN (SoHDN, MaSach, SLNhap, KhuyenMai) VALUES ('HDN05', 'S06', 15, NULL);




INSERT INTO tHoaDonBan (SoHDB, MaNV, NgayBan, MaKH) VALUES ('HDB01', 'NV01', '2014-08-11 00:00:00', 'KH01');
INSERT INTO tHoaDonBan (SoHDB, MaNV, NgayBan, MaKH) VALUES ('HDB02', 'NV02', '2014-05-03 00:00:00', 'KH02');
INSERT INTO tHoaDonBan (SoHDB, MaNV, NgayBan, MaKH) VALUES ('HDB03', 'NV03', '2013-12-01 00:00:00', 'KH03');
INSERT INTO tHoaDonBan (SoHDB, MaNV, NgayBan, MaKH) VALUES ('HDB04', 'NV04', '2013-11-12 00:00:00', 'KH01');
INSERT INTO tHoaDonBan (SoHDB, MaNV, NgayBan, MaKH) VALUES ('HDB05', 'NV04', '2014-05-14 00:00:00', 'KH04');
INSERT INTO tHoaDonBan (SoHDB, MaNV, NgayBan, MaKH) VALUES ('HDB06', 'NV05', '2014-06-30 00:00:00', 'KH02');
INSERT INTO tHoaDonBan (SoHDB, MaNV, NgayBan, MaKH) VALUES ('HDB07', 'NV06', '2014-05-10 00:00:00', 'KH01');
INSERT INTO tHoaDonBan (SoHDB, MaNV, NgayBan, MaKH) VALUES ('HDB08', 'NV01', '2013-01-01 00:00:00', 'KH02');
INSERT INTO tHoaDonBan (SoHDB, MaNV, NgayBan, MaKH) VALUES ('HDB09', 'NV01', '2013-02-10 00:00:00', 'KH02');
INSERT INTO tHoaDonBan (SoHDB, MaNV, NgayBan, MaKH) VALUES ('HDB10', 'NV02', '2014-04-10 00:00:00', 'KH04');
INSERT INTO tHoaDonBan (SoHDB, MaNV, NgayBan, MaKH) VALUES ('HDB11', 'NV03', '2014-03-11 00:00:00', 'KH04');
INSERT INTO tHoaDonBan (SoHDB, MaNV, NgayBan, MaKH) VALUES ('HDB12', 'NV03', '2014-07-10 00:00:00', 'KH03');
INSERT INTO tHoaDonBan (SoHDB, MaNV, NgayBan, MaKH) VALUES ('HDB13', 'NV05', '2014-04-12 00:00:00', 'KH04');

INSERT INTO tHoaDonNhap (SoHDN, MaNV, NgayNhap, MaNCC) VALUES ('HDN01', 'NV02', '2014-04-13 00:00:00', 'NCC01');
INSERT INTO tHoaDonNhap (SoHDN, MaNV, NgayNhap, MaNCC) VALUES ('HDN02', 'NV01', '2014-06-28 00:00:00', 'NCC03');
INSERT INTO tHoaDonNhap (SoHDN, MaNV, NgayNhap, MaNCC) VALUES ('HDN03', 'NV04', '2014-01-01 00:00:00', 'NCC06');
INSERT INTO tHoaDonNhap (SoHDN, MaNV, NgayNhap, MaNCC) VALUES ('HDN04', 'NV05', '2014-03-05 00:00:00', 'NCC04');
INSERT INTO tHoaDonNhap (SoHDN, MaNV, NgayNhap, MaNCC) VALUES ('HDN05', 'NV03', '2014-04-10 00:00:00', 'NCC05');

INSERT INTO tKhachHang (MaKH, TenKH, DiaChi, DienThoai, GioiTinh) VALUES ('KH01', 'Nguyễn Đình Sơn', 'Bắc Ninh', '0968686868', 1);
INSERT INTO tKhachHang (MaKH, TenKH, DiaChi, DienThoai, GioiTinh) VALUES ('KH02', 'Đỗ Văn Bắc', 'Hải Dương', '0905883993', 1);
INSERT INTO tKhachHang (MaKH, TenKH, DiaChi, DienThoai, GioiTinh) VALUES ('KH03', 'Mạnh Thường Quân', 'Hải Phòng', '0918688685', 1);
INSERT INTO tKhachHang (MaKH, TenKH, DiaChi, DienThoai, GioiTinh) VALUES ('KH04', 'Mai Phương Lan', 'Hà Nội', '0978656790', 0);
INSERT INTO tKhachHang (MaKH, TenKH, DiaChi, DienThoai, GioiTinh) VALUES ('KH05', 'Nguyễn Thị Phương', 'Hà Nội', NULL, 0);
INSERT INTO tKhachHang (MaKH, TenKH, DiaChi, DienThoai, GioiTinh) VALUES ('KH06', 'Trần Đăng Hưng', 'Ninh Bình', NULL, 1);
INSERT INTO tKhachHang (MaKH, TenKH, DiaChi, DienThoai, GioiTinh) VALUES ('KH07', 'Hoàng Thị Hồng', 'Thái Nguyên', NULL, 0);
INSERT INTO tKhachHang (MaKH, TenKH, DiaChi, DienThoai, GioiTinh) VALUES ('KH08', 'Cẩm Thị Hương', 'TP HCM', NULL, 0);
INSERT INTO tKhachHang (MaKH, TenKH, DiaChi, DienThoai, GioiTinh) VALUES ('KH09', 'Mai Văn Hùng', 'Phú Thọ', NULL, 1);

INSERT INTO tNhaCungCap (MaNCC, TenNCC) VALUES ('NCC01', 'Bách Việt');
INSERT INTO tNhaCungCap (MaNCC, TenNCC) VALUES ('NCC02', 'NXB Trẻ');
INSERT INTO tNhaCungCap (MaNCC, TenNCC) VALUES ('NCC03', 'Phú Hà book');
INSERT INTO tNhaCungCap (MaNCC, TenNCC) VALUES ('NCC04', 'Alphabooks');
INSERT INTO tNhaCungCap (MaNCC, TenNCC) VALUES ('NCC05', 'TGM Books');
INSERT INTO tNhaCungCap (MaNCC, TenNCC) VALUES ('NCC06', 'Thái Hà');

INSERT INTO tNhanVien (MaNV, TenNV, GioiTinh, NgaySinh, DiaChi, DienThoai) VALUES ('NV01', 'Trần Huy', 'Nam', '1990-09-11 00:00:00', 'Hà Nội', '0986868686');
INSERT INTO tNhanVien (MaNV, TenNV, GioiTinh, NgaySinh, DiaChi, DienThoai) VALUES ('NV02', 'Thanh Tâm', 'Nữ', '1986-01-12 00:00:00', 'Bắc Ninh', '0979657676');
INSERT INTO tNhanVien (MaNV, TenNV, GioiTinh, NgaySinh, DiaChi, DienThoai) VALUES ('NV03', 'Nguyễn Minh', 'Nam', '1989-07-05 00:00:00', 'Hải Dương', '0968145689');
INSERT INTO tNhanVien (MaNV, TenNV, GioiTinh, NgaySinh, DiaChi, DienThoai) VALUES ('NV04', 'Phan Cao', 'Nam', '1991-08-12 00:00:00', 'Ninh Bình', '0985143235');
INSERT INTO tNhanVien (MaNV, TenNV, GioiTinh, NgaySinh, DiaChi, DienThoai) VALUES ('NV05', 'Bùi Ngọc', 'Nữ', '1987-03-01 00:00:00', 'Thái Bình', '0918167892');
INSERT INTO tNhanVien (MaNV, TenNV, GioiTinh, NgaySinh, DiaChi, DienThoai) VALUES ('NV06', 'Nguyễn Hoàng', 'Nam', '1990-04-04 00:00:00', 'Nam Định', '0962091660');
INSERT INTO tNhanVien (MaNV, TenNV, GioiTinh, NgaySinh, DiaChi, DienThoai) VALUES ('NV07', 'Nguyễn Hải', 'Nam', '1994-05-05 00:00:00', 'Hà Nội', '0962091666');
INSERT INTO tNhanVien (MaNV, TenNV, GioiTinh, NgaySinh, DiaChi, DienThoai) VALUES ('NV08', 'Đỗ Thảo', 'Nữ', '1990-06-06 00:00:00', 'Hà Nội', '0962099666');
INSERT INTO tNhanVien (MaNV, TenNV, GioiTinh, NgaySinh, DiaChi, DienThoai) VALUES ('NV09', 'Đỗ Thảo Phương', 'Nữ', '1990-07-07 00:00:00', 'Hà Nội', '0966666666');
INSERT INTO tNhanVien (MaNV, TenNV, GioiTinh, NgaySinh, DiaChi, DienThoai) VALUES ('NV10', 'Đỗ Huy Long', 'Nam', '1995-08-08 00:00:00', 'Nam Định', '0983646585');

INSERT INTO tNhaXuatBan (MaNXB, TenNXB) VALUES ('NXB01', 'NXB Kim Đồng');
INSERT INTO tNhaXuatBan (MaNXB, TenNXB) VALUES ('NXB02', 'NXB Trẻ');
INSERT INTO tNhaXuatBan (MaNXB, TenNXB) VALUES ('NXB03', 'NXB Thăng Long');
INSERT INTO tNhaXuatBan (MaNXB, TenNXB) VALUES ('NXB04', 'NXB Nhã Nam');
INSERT INTO tNhaXuatBan (MaNXB, TenNXB) VALUES ('NXB05', 'NXB Giáo Dục');
INSERT INTO tNhaXuatBan (MaNXB, TenNXB) VALUES ('NXB06', 'NXB Fahasa');
INSERT INTO tNhaXuatBan (MaNXB, TenNXB) VALUES ('NXB07', 'NXB Phương Nam');
INSERT INTO tNhaXuatBan (MaNXB, TenNXB) VALUES ('NXB08', 'NXB ĐH GTVT');
INSERT INTO tNhaXuatBan (MaNXB, TenNXB) VALUES ('NXB09', 'NXB ĐH QGHN');
INSERT INTO tNhaXuatBan (MaNXB, TenNXB) VALUES ('NXB10', 'NXB Thủ Đô');







INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S01', 'Sống và khát vọng', 'Trần Đăng Khoa', 'TL01', 'NXB01', 100000.0000, 108000.0000, 120, 365, '638 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S02', 'Cha Nên Dạy Con Như Thế Nào?', 'Vương Ba, Vương Trí Diễm', 'TL01', 'NXB04', 60000.0000, 69000.0000, 70, 264, '440 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S03', 'Trốn chạy và yêu thương', 'Maya banks', 'TL06', 'NXB02', 105000.0000, 115000.0000, 45, 508, '450 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S04', 'Anh sẽ yêu em mãi chứ', 'Gào', 'TL06', 'NXB05', 65000.0000, 89000.0000, 78, 320, '374 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S05', 'Thế giới phẳng ( Tái bản năm 2014)', 'Thomas L.Friedman', 'TL05', 'NXB03', 245000.0000, 272000.0000, 56, 818, '902 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S06', 'Giáo trình C++ & lập trình hướng đối tượng', 'GS. Phạm Văn Ất', 'TL05', 'NXB06', 64000.0000, 78000.0000, 89, 496, '650 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S07', 'Manchester United - Thiên sử về quỷ đỏ', 'Jim White', 'TL03', 'NXB07', 135000.0000, 149000.0000, 68, 639, '720 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S08', 'Cát bụi thời gian', 'Sidney Sheldon', 'TL04', 'NXB05', 80000.0000, 92000.0000, 45, 482, '500 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S09', 'Tự học bảo mật và quản trị mạng', 'Mai Hương', 'TL02', 'NXB08', 41000.0000, 48000.0000, 79, 344, '480 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S10', 'Triệu phú khởi nghiệp từ hai bàn tay trắng', 'Triệu Phàm Vũ', 'TL05', 'NXB09', 115000.0000, 130000.0000, 43, 452, '506 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S11', 'Cấu trúc dữ liệu và giải thuật', 'Hồ Đắc Phương', 'TL02', 'NXB10', 110000.0000, 150000.0000, 80, 300, '500 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S12', 'Lập Trình C', 'Phạm Văn Ất', 'TL02', 'NXB10', 100000.0000, 130000.0000, 80, 440, '400 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S13', 'Không ai qua sông', 'Lữ Ngọc Tư', 'TL01', 'NXB10', 100000.0000, 140000.0000, 80, 330, '330 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S14', 'Đón đầu xu hướng', 'Rohit Bhargava', 'TL01', 'NXB10', 200000.0000, 250000.0000, 60, 220, '200 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S15', 'Để con được ốm', 'Nguyễn Thị Đoan', 'TL01', 'NXB10', 200000.0000, 300000.0000, 40, 400, '500 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S16', 'Búc xúc làm ta vô cảm', 'Đặng Hoàng Giang', 'TL01', 'NXB10', 200000.0000, 300000.0000, 50, 400, '300 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S17', 'Tony buổi sáng - trên đường băng', 'Tony Buổi Sáng', 'TL01', 'NXB09', 250000.0000, 300000.0000, 30, 300, '400 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S18', 'Đừng bao giờ đi ăn một mình', 'Keith Ferrazzi', 'TL01', 'NXB09', 300000.0000, 400000.0000, 60, 555, '500 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S19', 'Ngày xưa có một con bò', 'Camilo Cruz', 'TL01', 'NXB09', 300000.0000, 450000.0000, 60, 400, '400 gram', NULL);
INSERT INTO tSach (MaSach, TenSach, TacGia, MaTheLoai, MaNXB, DonGiaNhap, DonGiaBan, SoLuong, SoTrang, TrongLuong, Anh) VALUES ('S20', 'Tôi thấy hoa vàng trên cỏ xanh', 'Nguyễn nhật ánh', 'TL01', 'NXB09', 300000.0000, 400000.0000, 80, 550, '300 gram', NULL);

INSERT INTO tTheLoai (MaTheLoai, TenTheLoai) VALUES ('TL01', 'Bí quyết Cuộc sống');
INSERT INTO tTheLoai (MaTheLoai, TenTheLoai) VALUES ('TL02', 'Sách Tin học');
INSERT INTO tTheLoai (MaTheLoai, TenTheLoai) VALUES ('TL03', 'Thể Thao, Du lịch');
INSERT INTO tTheLoai (MaTheLoai, TenTheLoai) VALUES ('TL04', 'Văn hóa, Nghệ thuật');
INSERT INTO tTheLoai (MaTheLoai, TenTheLoai) VALUES ('TL05', 'Sách Kinh doanh');
INSERT INTO tTheLoai (MaTheLoai, TenTheLoai) VALUES ('TL06', 'Sách Khuyến mại, Sách mới phát hành');


-- Thêm ràng buộc khóa ngoại cho bảng tChiTietHDB
ALTER TABLE tChiTietHDB
ADD CONSTRAINT FK_tChiTietHDB_tHoaDonBan
FOREIGN KEY (SoHDB) REFERENCES tHoaDonBan (SoHDB);

ALTER TABLE tChiTietHDB
ADD CONSTRAINT FK_tChiTietHDB_tSach
FOREIGN KEY (MaSach) REFERENCES tSach (MaSach);

-- Thêm ràng buộc khóa ngoại cho bảng tChiTietHDN
ALTER TABLE tChiTietHDN
ADD CONSTRAINT FK_tChiTietHDN_tHoaDonNhap
FOREIGN KEY (SoHDN) REFERENCES tHoaDonNhap (SoHDN);

ALTER TABLE tChiTietHDN
ADD CONSTRAINT FK_tChiTietHDN_tSach
FOREIGN KEY (MaSach) REFERENCES tSach (MaSach);

-- Thêm ràng buộc khóa ngoại cho bảng tHoaDonBan
ALTER TABLE tHoaDonBan
ADD CONSTRAINT FK_tHoaDonBan_tKhachHang
FOREIGN KEY (MaKH) REFERENCES tKhachHang (MaKH);

ALTER TABLE tHoaDonBan
ADD CONSTRAINT FK_tHoaDonBan_tNhanVien
FOREIGN KEY (MaNV) REFERENCES tNhanVien (MaNV);

-- Thêm ràng buộc khóa ngoại cho bảng tHoaDonNhap
ALTER TABLE tHoaDonNhap
ADD CONSTRAINT FK_tHoaDonNhap_tNhaCungCap
FOREIGN KEY (MaNCC) REFERENCES tNhaCungCap (MaNCC);

ALTER TABLE tHoaDonNhap
ADD CONSTRAINT FK_tHoaDonNhap_tNhanVien
FOREIGN KEY (MaNV) REFERENCES tNhanVien (MaNV);

-- Thêm ràng buộc khóa ngoại cho bảng tSach
ALTER TABLE tSach
ADD CONSTRAINT FK_tSach_tNhaXuatBan
FOREIGN KEY (MaNXB) REFERENCES tNhaXuatBan (MaNXB);

ALTER TABLE tSach
ADD CONSTRAINT FK_tSach_tTheLoai
FOREIGN KEY (MaTheLoai) REFERENCES tTheLoai (MaTheLoai);

