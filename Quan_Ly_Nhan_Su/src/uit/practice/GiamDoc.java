package uit.practice;

import java.util.Scanner;

public class GiamDoc extends NhanSu{

		final int LUONG_NGAY = 300;
		
		private float coPhan; 
		
		public float getCoPhan() {
			return coPhan;
		}

		
		public void setCoPhan(float coPhan) {
			this.coPhan = coPhan;
		}
		
		public GiamDoc() {
			
		}

		public GiamDoc(String maso, String hoTen, String soDienThoai, float soNgayLamViec, float coPhan) {
			super(maso, hoTen, soDienThoai, soNgayLamViec);
			this.coPhan = coPhan;
			
		}
		
	
		@Override
		public void nhap(Scanner scan) {
			super.nhap(scan);
			System.out.print("Nhập số cổ phần: ");
			this.coPhan = Float.parseFloat(scan.nextLine());
			
		}
		@Override
		public void xuat() {
			super.xuat();
			System.out.println("\t Lương: " + this.luong);
		}
		
		
		public void tinhLuong() {
			this.luong = this.soNgayLamViec * LUONG_NGAY;
		}
	

}
