

public class Employee extends Staff implements ICalculator { // Ke thua lop Staff
private double soGioLamThem;

public Employee() {
	super();
}

public Employee(double soGioLamThem) {
	super();
	this.soGioLamThem = soGioLamThem;
}

public double getGioLamThem() {
	return soGioLamThem;
}

public void setGiolamthem(double soGioLamThem) {
	this.soGioLamThem = soGioLamThem;
}

public double calculateSalary() {
	return getHeSoluong()*3 + soGioLamThem*0.2;
}

@Override
public String displayInformation() {
	// TODO Auto-generated method stub
	
   return	"Manhanvien: " + String.valueOf(getMaNhanVien()) + "\n" + "Tennhanvien: " + getName()
   + "\n" + "Tuoinhanvien: " + String.valueOf(getAge()) + "\n" + "Hesoluong: " + String.valueOf(getHeSoluong())
    + "\n" + "Ngayvaolam: " + String.valueOf(getNgayVaoLam()) + "\n" + 
    "Bophanlamviec: " + getBoPhanLamViec() + "\n" + "Songaynghiphep: " + String.valueOf(getSoNgayNghiPhep()
    		 + "\n" + "So gio lam them: " + String.valueOf(soGioLamThem));
   


	
	
	
	
}
}
