CREATE DATABASE QLSV2;
USE QLSV2;



CREATE TABLE DMKhoa (
    MaKhoa CHAR(2) NOT NULL,
    TenKhoa VARCHAR(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    PRIMARY KEY (MaKhoa)
);

CREATE TABLE DMMonHoc (
    MaMH CHAR(2) NOT NULL,
    TenMH VARCHAR(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    SoTiet TINYINT NULL,
    GhiChu CHAR(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    PRIMARY KEY (MaMH)
);

CREATE TABLE DSSinhVien (
    MaSV CHAR(3) NOT NULL,
    HoSV VARCHAR(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    TenSV VARCHAR(7) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    Phai CHAR(7) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    NgaySinh DATETIME NOT NULL,
    NoiSinh VARCHAR(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    MaKhoa CHAR(2) NULL,
    HocBong FLOAT NULL,
    PRIMARY KEY (MaSV)
);

CREATE TABLE DSSV_Nu (
    MaSV CHAR(3) NOT NULL,
    Hoten VARCHAR(23) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    PHAI CHAR(7) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
    NgaySinh DATETIME NOT NULL,
    MaKhoa CHAR(2) NULL
);

CREATE TABLE KetQua (
    MaSV CHAR(3) NOT NULL,
    MaMH CHAR(2) NOT NULL,
    LanThi TINYINT NOT NULL,
    Diem DECIMAL(4, 2) NULL,
    PRIMARY KEY (MaSV, MaMH, LanThi)
);



INSERT INTO DMKhoa (MaKhoa, TenKhoa) VALUES ('AV', 'Anh Văn');
INSERT INTO DMKhoa (MaKhoa, TenKhoa) VALUES ('TH', 'Tin Học');
INSERT INTO DMKhoa (MaKhoa, TenKhoa) VALUES ('TR', 'Triết');
INSERT INTO DMKhoa (MaKhoa, TenKhoa) VALUES ('VL', 'Vật Lý');

INSERT INTO DMMonHoc (MaMH, TenMH, SoTiet, GhiChu) VALUES ('01', 'Cơ Sở Dữ Liệu', 45, NULL);
INSERT INTO DMMonHoc (MaMH, TenMH, SoTiet, GhiChu) VALUES ('02', 'Trí Tuệ Nhân Tạo', 45, NULL);
INSERT INTO DMMonHoc (MaMH, TenMH, SoTiet, GhiChu) VALUES ('03', 'Truyền Tin', 45, NULL);
INSERT INTO DMMonHoc (MaMH, TenMH, SoTiet, GhiChu) VALUES ('04', 'Đồ Họa', 60, NULL);
INSERT INTO DMMonHoc (MaMH, TenMH, SoTiet, GhiChu) VALUES ('05', 'Văn Phạm', 60, NULL);

INSERT INTO DSSinhVien (MaSV, HoSV, TenSV, Phai, NgaySinh, NoiSinh, MaKhoa, HocBong) VALUES ('A01', 'Nguyễn Thị', 'Hải', 'Nữ', '1990-02-23', 'Hà Nội', 'TH', 130000);
INSERT INTO DSSinhVien (MaSV, HoSV, TenSV, Phai, NgaySinh, NoiSinh, MaKhoa, HocBong) VALUES ('A02', 'Trần Văn', 'Chính', 'Nam', '1992-12-24', 'Bình Định', 'VL', 150000);
INSERT INTO DSSinhVien (MaSV, HoSV, TenSV, Phai, NgaySinh, NoiSinh, MaKhoa, HocBong) VALUES ('A03', 'Lê Thu Bạch', 'Yến', 'Nữ', '1990-02-21', 'TP Hồ Chí Minh', 'TH', 170000);
INSERT INTO DSSinhVien (MaSV, HoSV, TenSV, Phai, NgaySinh, NoiSinh, MaKhoa, HocBong) VALUES ('A04', 'Trần Anh', 'Tuấn', 'Nam', '1990-12-20', 'Hà Nội', 'AV', 80000);
INSERT INTO DSSinhVien (MaSV, HoSV, TenSV, Phai, NgaySinh, NoiSinh, MaKhoa, HocBong) VALUES ('A05', 'Hoàng Khánh', 'Ngọc', 'Nữ', '2000-11-10', 'Hà Nội', 'TH', 300000);
INSERT INTO DSSinhVien (MaSV, HoSV, TenSV, Phai, NgaySinh, NoiSinh, MaKhoa, HocBong) VALUES ('B01', 'Trần Thanh', 'Mai', 'Nữ', '1991-08-12', 'Hải Phòng', 'TR', 0);
INSERT INTO DSSinhVien (MaSV, HoSV, TenSV, Phai, NgaySinh, NoiSinh, MaKhoa, HocBong) VALUES ('B02', 'Trần Thị Thu', 'Thủy', 'Nữ', '1991-01-02', 'TP Hồ Chí Minh', 'AV', 0);
INSERT INTO DSSinhVien (MaSV, HoSV, TenSV, Phai, NgaySinh, NoiSinh, MaKhoa, HocBong) VALUES ('B03', 'Trần Thị', 'Hiền', 'Nữ', '2000-01-01', 'Hà Nội', 'AV', NULL);
INSERT INTO DSSinhVien (MaSV, HoSV, TenSV, Phai, NgaySinh, NoiSinh, MaKhoa, HocBong) VALUES ('B04', 'Lê Văn', 'Hùng', 'Nam', '2000-02-01', 'Hà Nội', 'AV', NULL);
INSERT INTO DSSinhVien (MaSV, HoSV, TenSV, Phai, NgaySinh, NoiSinh, MaKhoa, HocBong) VALUES ('B05', 'Lê Quang', 'Hưng', 'Nam', '2000-01-01', 'TP Hồ Chí Minh', 'VL', NULL);
INSERT INTO DSSinhVien (MaSV, HoSV, TenSV, Phai, NgaySinh, NoiSinh, MaKhoa, HocBong) VALUES ('B06', 'Nguyễn Mai', 'Hương', 'Nữ', '2000-01-01', 'Hưng Yên', 'TH', NULL);
INSERT INTO DSSinhVien (MaSV, HoSV, TenSV, Phai, NgaySinh, NoiSinh, MaKhoa, HocBong) VALUES ('B07', 'Hoàng Thanh', 'Hằng', 'Nữ', '2000-02-02', 'Thái Nguyên', 'TH', NULL);

INSERT INTO DSSV_Nu (MaSV,Hoten, PHAI, NgaySinh, MaKhoa) VALUES ('A01', 'Nguyễn Thị Hải', 'Nữ', '1990-02-23', 'TH');
INSERT INTO DSSV_Nu (MaSV, Hoten, PHAI, NgaySinh, MaKhoa) VALUES ('A03', 'Lê Thu Bạch Yến', 'Nữ', '1990-02-21', 'TH');
INSERT INTO DSSV_Nu (MaSV,Hoten, PHAI, NgaySinh, MaKhoa) VALUES ('A05', 'Hoàng Khánh Ngọc', 'Nữ', '2000-11-10', 'TH');
INSERT INTO DSSV_Nu (MaSV, Hoten, PHAI, NgaySinh, MaKhoa) VALUES ('B01', 'Trần Thanh Mai', 'Nữ', '1991-08-12', 'TR');
INSERT INTO DSSV_Nu (MaSV,Hoten, PHAI, NgaySinh, MaKhoa) VALUES ('B02', 'Trần Thị Thu Thủy', 'Nữ', '1991-01-02', 'AV');
INSERT INTO DSSV_Nu (MaSV, Hoten, PHAI, NgaySinh, MaKhoa) VALUES ('B03', 'Trần Thị Hiền', 'Nữ', '2000-01-01', 'AV');
INSERT INTO DSSV_Nu (MaSV, Hoten, PHAI, NgaySinh, MaKhoa) VALUES ('B06', 'Nguyễn Mai Hương', 'Nữ', '2000-01-01', 'TH');
INSERT INTO DSSV_Nu (MaSV, Hoten, PHAI, NgaySinh, MaKhoa) VALUES ('B07', 'Hoàng Thanh Hằng', 'Nữ', '2000-02-02', 'TH');

INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('A01', '01', 1, 3.00);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('A01', '01', 2, 6.00);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('A01', '02', 2, 6.00);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('A01', '03', 1, 5.00);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('A02', '01', 1, 4.50);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('A02', '01', 2, 7.00);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('A02', '03', 1, 10.00);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('A02', '05', 1, 9.00);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('A03', '01', 1, 2.00);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('A03', '01', 2, 5.00);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('A03', '03', 1, 2.50);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('A03', '03', 2, 4.00);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('A04', '05', 2, 10.00);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('B01', '01', 1, 7.00);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('B01', '03', 1, 2.50);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('B01', '03', 2, 5.00);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('B02', '02', 1, 6.00);
INSERT INTO KetQua (MaSV, MaMH, LanThi, Diem) VALUES ('B02', '04', 1, 10.00);


ALTER TABLE DSSinhVien ADD CONSTRAINT DMKhoa_MaKhoa_fk FOREIGN KEY (MaKhoa)
REFERENCES DMKhoa (MaKhoa);

-- MySQL tự động kiểm tra các ràng buộc khi chúng được thêm vào, vì vậy không cần lệnh CHECK CONSTRAINT riêng biệt

ALTER TABLE KetQua ADD CONSTRAINT DMMH_MaMH_fk FOREIGN KEY (MaMH)
REFERENCES DMMonHoc (MaMH);

-- MySQL tự động kiểm tra các ràng buộc khi chúng được thêm vào, vì vậy không cần lệnh CHECK CONSTRAINT riêng biệt

ALTER TABLE KetQua ADD CONSTRAINT KetQua_MaSV_fk FOREIGN KEY (MaSV)
REFERENCES DSSinhVien (MaSV);

-- MySQL tự động kiểm tra các ràng buộc khi chúng được thêm vào, vì vậy không cần lệnh CHECK CONSTRAINT riêng biệt
