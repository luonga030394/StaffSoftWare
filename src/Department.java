
public class Department {
	private int maBoPhan;
	private String tenBoPhan;
	private int soLuongNhanVienHienTai;
	public Department() {
		
	}
	public Department(int maBoPhan, String tenBoPhan, int soLuongNhanVienHienTai) {
		
		this.maBoPhan = maBoPhan;
		this.tenBoPhan = tenBoPhan;
		this.soLuongNhanVienHienTai = soLuongNhanVienHienTai;
	}
	public int getMaBoPhan() {
		return maBoPhan;
	}
	public void setMaBoPhan(int maBoPhan) {
		this.maBoPhan = maBoPhan;
	}
	public String getTenBoPhan() {
		return tenBoPhan;
	}
	public void setTenBoPhan(String tenBoPhan) {
		this.tenBoPhan = tenBoPhan;
	}
	public int getSoLuongNhanVienHienTai() {
		return soLuongNhanVienHienTai;
	}
	public void setSoLuongNhanVienHienTai(int soLuongNhanVienHienTai) {
		this.soLuongNhanVienHienTai = soLuongNhanVienHienTai;
	}
	
	public  String toString() {
		return "Mabophan: " + String.valueOf(maBoPhan) + "\n" + "Tenbophan: " + tenBoPhan +
				"\n" + "Soluongnhanvien: " + String.valueOf(soLuongNhanVienHienTai) + "\n" + "====================";
	}
	
	
	
	

}
