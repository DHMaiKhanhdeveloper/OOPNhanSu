package uit.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CongTy {



		private String tenCongTy;
		private String maSoThue;
		private float doanhThuThang;
		private DanhSachNhanSu objListNhanSu;
		
		public String getTenCongTy() {
			return tenCongTy;
		}

		
		public void setTenCongTy(String tenCongTy) {
			this.tenCongTy = tenCongTy;
		}

		public String getMaSoThue() {
			return maSoThue;
		}

		
		public void setMaSoThue(String maSoThue) {
			this.maSoThue = maSoThue;
		}

		
		public float getDoanhThuThang() {
			return doanhThuThang;
		}

		
		public void setDoanhThuThang(float doanhThuThang) {
			this.doanhThuThang = doanhThuThang;
		}

		public DanhSachNhanSu getObjListNhanSu() {
			return objListNhanSu;
		}

		
		public void setObjListNhanSu(DanhSachNhanSu objListNhanSu) {
			this.objListNhanSu = objListNhanSu;
		}

		
		public CongTy() {
			this.objListNhanSu = new DanhSachNhanSu();
		}

		
		public void nhap(Scanner scan) {
			System.out.println("****** Nhập thông tin công ty *********");
			System.out.print("Tên công ty: ");
			this.tenCongTy = scan.nextLine();

			System.out.print("Mã số thuế: ");
			this.maSoThue = scan.nextLine();

			System.out.print("Doanh thu: ");
			this.doanhThuThang = Float.parseFloat(scan.nextLine());

		}

		public void xuat() {
			System.out.println("******* Thông tin công ty ********");
			System.out.println("Tên công ty: " + this.tenCongTy);
			System.out.println("Mã số thuế: " + this.maSoThue);
			System.out.println("Doanh thu tháng: " + this.doanhThuThang);
			System.out.println("**************************************");
			this.objListNhanSu.xuat();
		}

		
		public void tinhLuong() {
			this.objListNhanSu.tinhLuong();
		}

		public void dummyDataCty() {
			this.tenCongTy = "CyberSoft-CyberLearn";
			this.maSoThue = "01292332";
			this.doanhThuThang = 435334f;
		}

		public void dummyDataNhanSu() {
			NhanSu ns = new NhanSu();
			ns = new TruongPhong("13", "TP Bổ sung 1", "098233", 24);
			objListNhanSu.them(ns);
			ns = new TruongPhong("14", "TP Bổ sung 2", "091833", 21);
			objListNhanSu.them(ns);
			ns = new NhanVienThuong("1", "Lan", "09832", 20);
			objListNhanSu.them(ns);
			ns = new NhanVienThuong("2", "Hưng", "098232", 23);
			objListNhanSu.them(ns);
			ns = new NhanVienThuong("3", "Việt", "098132", 31);
			objListNhanSu.them(ns);
			ns = new NhanVienThuong("4", "An", "091832", 25);
			objListNhanSu.them(ns);
			ns = new NhanVienThuong("5", "Tuyết", "098432", 23);
			objListNhanSu.them(ns);
			ns = new NhanVienThuong("6", "Mỹ", "092832", 31);
			objListNhanSu.them(ns);

			ns = new TruongPhong("8", "TP Mai", "098233", 24);
			objListNhanSu.them(ns);
			ns = new TruongPhong("9", "TP Luân", "091833", 21);
			objListNhanSu.them(ns);
			ns = new TruongPhong("10", "TP Kiệt", "091833", 23);
			objListNhanSu.them(ns);

			ns = new GiamDoc("11", "GD Tiên", "0981", 19, 80);
			objListNhanSu.them(ns);
			ns = new GiamDoc("12", "GD Huệ", "09181", 21, 20);
			objListNhanSu.them(ns);
		}
		/**
		 * Phân bổ nhân viên về phòng ban, hay có nghĩa là chỉ định Trưởng phòng cho
		 * nhân viên 
		 * Bước 1: Duyệt danh sách và kiểm tra nếu là NhanVienThuong 
		 * Bước 2:Show danh sách Trưởng phòng (Tên và mã) 
		 * Bước 3: Có muốn phân bổ hay không,chọn '1' để phân bổ, chọn '2" để đi tiếp 
		 * Bước 4: Nếu '2' đi tiếp đến nhân viên tiếp theo 
		 * Bước 5: Nếu '1', Yêu cầu nhập mã trường phòng đã liệt kê ở bước 2 
		 * Bước 6: Kiểm tra mã nhập bước 5 có nằm trong ds Mã trưởng phòng bước 2 hay không 
		 * Bước 7: Nếu có: Lấy trưởng phòng với mã đã chọn bước 5 -> Lấy ra object Trưởng phòng 
		 * Bước 8: Gán trưởng phòng bước 7 cho Trưởng phòng của Nhân viên đang duyệt 
		 * Bước 9: Nếu không: Lặp lại bước 5 
		 * Bước 10: Tăng số lượng nhân
		 * viên dưới quyền cho Trưởng Phòng đó
		 */
		public void phanBoNhanVienThuong() {
			Scanner scan = new Scanner(System.in);
			// Buoc1
			for (NhanSu ns : objListNhanSu.getListNhanSu()) {
				if (ns instanceof NhanVienThuong) {
					// Bước 2:
					// In ra thông báo tên và mã của Nhân viên thường để biết phân bổ
					System.out.println("Đang phân bổ cho nhân viên:");
					ns.xuatMaVaTen();
					phanBoChoMotNhanSu(scan, ns);
				}
			}
		}

		private void phanBoChoMotNhanSu(Scanner scan, NhanSu ns) {
			// ********* start Phân bổ cho một nhân sự
			showMaVaTenTPhong();
			boolean flag = true;
			do {
				// Bước 3
				System.out.println("Chọn 1 để phân bổ hoặc chọn 2 để đi tiếp.");
				int chon = Integer.parseInt(scan.nextLine());
				if (chon == 1 || chon == 2) {
					if (chon == 1) {// Bước 5
						TruongPhong tp = chonTruongPhong(scan);
						// Bước 7 đã có trưởng phòng lưu tại biến tp
						// Bước 8
						((NhanVienThuong) ns).setTruongPhong(tp);
						// Bước 10:
						tp.tangNhanVien();
					}
					flag = false;// Bước 4
				} else {
					System.out.println("Chỉ được nhập 1 hoặc 2");
					flag = true;
				}
			} while (flag);
			////// **** End phân bổ cho một nhân sự ********
		}
		// chọn một trưởng phòng
		private TruongPhong chonTruongPhong(Scanner scan) {
			TruongPhong tp = null;
			do {
				System.out.println("Vui lòng chọn Mã TP đã liệt kê trên");
				String chonMa = scan.nextLine();
				// Bước 6: Kiểm tra mã có nằm trong ds hay không
				tp = timTruongPhongTheoMa(chonMa);
			} while (tp == null);
			return tp;
		}
		
		public void lietKeDSTruongPhong() {
			for (NhanSu ns : objListNhanSu.getListNhanSu()) {
				if (ns instanceof TruongPhong) {
					ns.xuatMaVaTen();
				}
			}
		}
		
		// tìm trưởng phòng theo mã
		public TruongPhong timTruongPhongTheoMa(String ma) {
			TruongPhong tphong = null; // chưa tìm thấy
			for (NhanSu ns : objListNhanSu.getListNhanSu()) {
				if (ns instanceof TruongPhong) {
					if (ns.getMaso().compareTo(ma) == 0) { // getMaso() chuỗi convert int to boolean
						tphong = (TruongPhong) ns;
					}
				}
			}
			return tphong;
		}
		
		public ArrayList<TruongPhong> layDSTruongPhong() {
			ArrayList<TruongPhong> list = new ArrayList<TruongPhong>();
			for (NhanSu ns : objListNhanSu.getListNhanSu()) {
				if (ns instanceof TruongPhong) {
					list.add((TruongPhong) ns);
				}
			}
			return list;
		}
		
		private void showMaVaTenTPhong() {
			System.out.println("******* Danh sách Trưởng Phòng *******");
			ArrayList<TruongPhong> list = layDSTruongPhong();
			for (TruongPhong tp : list) {
				tp.xuatMaVaTen();
			}
			System.out.println("===================================");
		}
		
		public void themNhanSu(Scanner scan) {
			System.out.println("****** Chức năng thêm nhân sự ******");
			ArrayList<NhanVienThuong> list = this.objListNhanSu.nhap(scan);
			for (NhanVienThuong nvt : list) {
				phanBoChoMotNhanSu(scan, nvt);
			}
		}

}
