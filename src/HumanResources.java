import java.util.ArrayList;
import java.util.Scanner;

public class HumanResources {
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Staff> quanLyNhanVien = new ArrayList<Staff>();
		ArrayList<Department> cacBoPhanTrongCongTy = new ArrayList<Department>();

		Department seo = new Department(1, "SEO", 0);
		Department kysu = new Department(2, "KYSU", 0);
		Department cskh= new Department(3, "CSKH", 0);
		Department vesinh = new Department(4, "VESINH", 0);
		cacBoPhanTrongCongTy.add(seo);
		cacBoPhanTrongCongTy.add(kysu);
		cacBoPhanTrongCongTy.add(cskh);
		cacBoPhanTrongCongTy.add(vesinh);

		do {

			System.out.println("Ban can gi?");
			System.out.println("1.Hien thi danh sach nhan vien trong cong ty");
			System.out.println("2.Hien thi cac bo phan trong cong ty");
			System.out.println("3.Hien thi nhan vien theo tung bo phan");
			System.out.println("4.Them nhan vien moi vao cong ty");
			System.out.println("5.Tim kiem thong tin nhan vien theo ten hoac ma nhan vien");
			System.out.println("6.Hien thi bang luong cua nhan vien toan cong ty");
			System.out.println("7.Hien thi bang luong cua nhan vien toan cong ty theo thu tu tang dan");

			System.out.println("===================");

			int phim = sc.nextInt();

			switch (phim) {

			case 1: // danh sach nhan vien
				for (int i = 0; i < quanLyNhanVien.size(); i++) {
					System.out.println(quanLyNhanVien.get(i).displayInformation());
					System.out.println("===================");

				}
				break;

			case 2: // danh sach bo phan
				for (int i = 0; i < cacBoPhanTrongCongTy.size(); i++) {
					System.out.println(cacBoPhanTrongCongTy.get(i).toString());
				}
				break;
			case 3: // Hien thi nhan vien theo tung bo phan
				System.out.println("Bo phan kinh doanh, nhap SEO");
				System.out.println("Bo phan ky thuat,nhap KY SU");
				System.out.println("Bo phan cham soc khach hang,nhap CSKH");
				System.out.println("Bo phan ve sinh,nhap VE SINH");

				String nhap = sc.next();
				int soLuongNhanVien = 0;
				for (int i = 0; i < quanLyNhanVien.size(); i++) {

					if (nhap.equals(quanLyNhanVien.get(i).getBoPhanLamViec())) {

						System.out.println(quanLyNhanVien.get(i).displayInformation());
						System.out.println("=============================");
						soLuongNhanVien += 1;
						
					}
				}
				System.out.println("Tong so nhan vien hien tai : " + soLuongNhanVien);

				break;
			case 4: // Them nhan vien vao cong ty.

				System.out.println("1.Ban muon them quan ly");
				System.out.println("2.Ban muon them nhan vien");
				int them = sc.nextInt();
				if (them == 1) {

					Manager quanLy = new Manager();

					System.out.println("Nhap thong tin quan ly: "); // Nhap thong tin quan ly.
					System.out.println("Ma quan ly: ");
					quanLy.setMaNhanVien(sc.nextInt());
					sc.nextLine();
					System.out.println("Ten quan ly: ");
					String tenQL = sc.nextLine();
					quanLy.setName(tenQL);

					System.out.print("Tuoi quan ly: ");
					quanLy.setAge(sc.nextInt());
					System.out.print("Chuc danh: " + "\n" + "1.Business Leader" + "\n" + "2.Project Leader" + "\n"
							+ "3.Technical Leader");
					int chucDanhQuanLy = sc.nextInt();
					if (chucDanhQuanLy == 1) {
						quanLy.setChucDanh("Business Leader");
					} else if (chucDanhQuanLy == 2) {
						quanLy.setChucDanh("Project Leader");
					} else {
						quanLy.setChucDanh("Technical Leader");
					}

					System.out.print("He so luong: ");
					quanLy.setHeSoluong(sc.nextDouble());
					System.out.print("Ngay vao lam: ");
					quanLy.setNgayVaoLam(sc.next());

					System.out.print("Bo phan lam viec: " + "\n" + "1-SEO" + "\n" + "2-KYSU" + "\n" + "3-CSKH" + "\n"
							+ "4-VESINH");
					int boPhan = sc.nextInt();
					if (boPhan == 1) {
						seo.setSoLuongNhanVienHienTai(seo.getSoLuongNhanVienHienTai() +1);
						quanLy.setBoPhanLamViec("SEO");
						
					} else if (boPhan == 2) {
						kysu.setSoLuongNhanVienHienTai(kysu.getSoLuongNhanVienHienTai() + 1);
						quanLy.setBoPhanLamViec("KYSU");
					} else if (boPhan == 3) {
						cskh.setSoLuongNhanVienHienTai(cskh.getSoLuongNhanVienHienTai() + 1);
						quanLy.setBoPhanLamViec("CSKH");
					} else {
						vesinh.setSoLuongNhanVienHienTai(vesinh.getSoLuongNhanVienHienTai() + 1);
						quanLy.setBoPhanLamViec("VESINH");
					}

					System.out.print("So ngay nghi phep: ");
					quanLy.setSoNgayNghiPhep(sc.nextInt());
					double luongQuanLy;
					luongQuanLy = quanLy.calculateSalary();
					quanLy.setTienLuong(luongQuanLy);

					System.out.println("===================");

					quanLyNhanVien.add(quanLy);

				} else {

					Employee nhanVien = new Employee();

					System.out.println("Nhap thong tin nhan vien: "); // Nhap thong tin nhan vien.
					System.out.print("Ma nhan vien: ");
					nhanVien.setMaNhanVien(sc.nextInt());
					sc.nextLine();
					System.out.print("Ten nhan vien: ");
					nhanVien.setName(sc.nextLine());
					System.out.print("Tuoi nhan vien: ");
					nhanVien.setAge(sc.nextInt());
					System.out.print("He so luong: ");
					nhanVien.setHeSoluong(sc.nextDouble());
					System.out.print("Ngay vao lam: ");
					nhanVien.setNgayVaoLam(sc.next());
																	
					
					System.out.print("Bo phan lam viec: " + "\n" + "1-SEO" + "\n" + "2-KYSU" + "\n" + "3-CSKH" + "\n"
							+ "4-VESINH");
					int boPhan = sc.nextInt();
					if (boPhan == 1) {
						seo.setSoLuongNhanVienHienTai(seo.getSoLuongNhanVienHienTai() +1);
						nhanVien.setBoPhanLamViec("SEO");
						
					} else if (boPhan == 2) {
						kysu.setSoLuongNhanVienHienTai(kysu.getSoLuongNhanVienHienTai() + 1);
						nhanVien.setBoPhanLamViec("KYSU");
					} else if (boPhan == 3) {
						cskh.setSoLuongNhanVienHienTai(cskh.getSoLuongNhanVienHienTai() + 1);
						nhanVien.setBoPhanLamViec("CSKH");
					} else {
						vesinh.setSoLuongNhanVienHienTai(vesinh.getSoLuongNhanVienHienTai() + 1);
						nhanVien.setBoPhanLamViec("VESINH");
					}
					
																					
					
					System.out.print("So ngay nghi phep: ");
					nhanVien.setSoNgayNghiPhep(sc.nextInt());
					System.out.print("So gio lam them: ");
					nhanVien.setGiolamthem(sc.nextDouble());
					double luongNhanVien;
					luongNhanVien = nhanVien.calculateSalary();
					nhanVien.setTienLuong(luongNhanVien);

					System.out.println("===================");
					quanLyNhanVien.add(nhanVien);
				}
				break;
			case 5: // Tim kiem thong tin.
				System.out.println("1.Tim kiem theo ten");
				System.out.println("2.Tim kiem theo ma nhan vien");
				int timkiem = sc.nextInt();
				if (timkiem == 1) {
					System.out.println("Nhap ten nhan vien: ");
					String tenNhanVien = sc.next();
					for (int i = 0; i < quanLyNhanVien.size(); i++) {
						if (tenNhanVien.equals(quanLyNhanVien.get(i).getName())) {
							System.out.println(quanLyNhanVien.get(i).displayInformation());
						}
					}
				}

				if (timkiem == 2) {
					System.out.println("Nhap ma nhan vien: ");
					int soMaNhanVien = sc.nextInt();
					for (int i = 0; i < quanLyNhanVien.size(); i++) {
						if (soMaNhanVien == quanLyNhanVien.get(i).getMaNhanVien()) {
							System.out.println(quanLyNhanVien.get(i).displayInformation());
						}
					}
				}
				break;
			case 6: // Hien thi bang luong.
				System.out.println("Luong nhan vien: ");
				for (int i = 0; i < quanLyNhanVien.size(); i++) {
					System.out.println(quanLyNhanVien.get(i).getName());
					System.out.println(quanLyNhanVien.get(i).getTienLuong() + "Trieu dong");
					System.out.println("===================");
				}
				break;
			case 7:
				ArrayList<Staff> quanLyNhanVienCoppy = new ArrayList<Staff>();
				quanLyNhanVienCoppy = (ArrayList<Staff>) quanLyNhanVien.clone();

				System.out.println("Bang luong nhan vien theo thuw tu tang dan: ");
				for (int i = 0; i < quanLyNhanVienCoppy.size() - 1; i++) {
					for (int j = i + 1; j < quanLyNhanVienCoppy.size(); j++) {
						if (quanLyNhanVienCoppy.get(i).getTienLuong() > quanLyNhanVienCoppy.get(j).getTienLuong()) {
							Staff luongTangDan = quanLyNhanVienCoppy.get(i);
							quanLyNhanVienCoppy.set(i, quanLyNhanVienCoppy.get(j));
							quanLyNhanVienCoppy.set(j, luongTangDan);

						}

					}
				}

				for (int i = 0; i < quanLyNhanVienCoppy.size(); i++) {
					System.out.println(quanLyNhanVienCoppy.get(i).getName());
					System.out.println(quanLyNhanVienCoppy.get(i).getTienLuong());
					System.out.println("===================");

				}
				break;

			}
		} while (true);

	}

}
