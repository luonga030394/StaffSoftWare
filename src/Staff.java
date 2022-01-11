
public abstract class Staff {
private int maNhanVien;
private String name;
private int age;
private double heSoluong;
private String ngayVaoLam;
private String boPhanLamViec;
private int soNgayNghiPhep;
private double tienLuong;

// Vi day la ham abstract nen khong co ham contractor.Vi ham abstract khong the tao doi tuong.





public int getMaNhanVien() {
	return maNhanVien;
}


public void setMaNhanVien(int maNhanVien) {
	this.maNhanVien = maNhanVien;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public double getHeSoluong() {
	return heSoluong;
}


public void setHeSoluong(double heSoluong) {
	this.heSoluong = heSoluong;
}


public String getNgayVaoLam() {
	return ngayVaoLam;
}


public void setNgayVaoLam(String ngayVaoLam) {
	this.ngayVaoLam = ngayVaoLam;
}


public String getBoPhanLamViec() {
	return boPhanLamViec;
}


public void setBoPhanLamViec(String boPhanLamViec) {
	this.boPhanLamViec = boPhanLamViec;
}


public int getSoNgayNghiPhep() {
	return soNgayNghiPhep;
}


public void setSoNgayNghiPhep(int soNgayNghiPhep) {
	this.soNgayNghiPhep = soNgayNghiPhep;
}



public double getTienLuong() {
	return tienLuong;
}


public void setTienLuong(double tienLuong) {
	this.tienLuong = tienLuong;
}


public abstract String displayInformation();  // ham abstract





	

}
