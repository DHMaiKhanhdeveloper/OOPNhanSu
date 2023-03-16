package uit.practice;

public class NhanVienThuong extends NhanSu{
	
	
		final int LUONG_NGAY = 100;
		
		private TruongPhong truongPhong;
	
		public TruongPhong getTruongPhong() {
			return truongPhong;
		}

		
		public void setTruongPhong(TruongPhong truongPhong) {
			this.truongPhong = truongPhong;
		}

	
		public NhanVienThuong() {
			this.truongPhong = null; // Chưa được phân bổ
		}

		public NhanVienThuong(String maso, String hoTen, String soDienThoai, float soNgayLamViec) {
			super(maso, hoTen, soDienThoai, soNgayLamViec);

		}

	
		@Override
		public void xuat() {
			super.xuat();
			if (this.truongPhong != null) {
				System.out.println("\t Lương: " + this.luong + "\t Mã TP: " + this.truongPhong.getMaso() + "\t Tên TP:"
						+ this.truongPhong.getHoTen());
			} else {
				System.out.println("\t Lương: " + this.luong + "\t Chưa phân bổ");
			}
		}

		
		@Override
		public void tinhLuong() {
			this.luong = this.soNgayLamViec * LUONG_NGAY;
		}


}
