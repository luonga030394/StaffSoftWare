
public class Manager extends Staff implements ICalculator{
	
	private String chucDanh;
	
		public Manager() {
			super();
	}
	


	



	public Manager(String chucDanh) {
			super();
			this.chucDanh = chucDanh;
		}







	public String getChucDanh() {
		return chucDanh;
	}
	public void setChucDanh(String chucDanh) {
		this.chucDanh = chucDanh;
	}
	
	


	public double calculateSalary() {
		if (chucDanh.equals("BusinessLeader")) {
		    return getHeSoluong()*5 + 8;
		}
		else if (chucDanh.equals("ProjectLeader")) {
			return getHeSoluong()*5 + 5;
		}
		else {
			return getHeSoluong()*5 + 6;
		}
	}

	@Override
	public String displayInformation() {
		// TODO Auto-generated method stub
		 return	"Manhanvien: " + String.valueOf(getMaNhanVien()) + "\n" + "Tennhanvien: " + getName()
		   + "\n" + "Tuoinhanvien: " + String.valueOf(getAge()) + "\n" + "Hesoluong: " + String.valueOf(getHeSoluong())
		    + "\n" + "Ngayvaolam: " + String.valueOf(getNgayVaoLam()) + "\n" + 
		    "Bophanlamviec: " + getBoPhanLamViec() + "\n" + "Songaynghiphep: " + String.valueOf(getSoNgayNghiPhep())
		     + "\n" + "Chucdanh: " + getChucDanh();
		   
		
	}
	
	

}
