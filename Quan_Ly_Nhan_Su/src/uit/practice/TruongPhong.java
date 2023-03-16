package uit.practice;

public class TruongPhong extends NhanSu{
	
	final int LUONG_NGAY = 200;
	final int PHU_CAP_MOI_NHAN_VIEN_QLY = 100;

	
	
	
	
	private int soNhanVienDuoiQuyen;
	
	
	
	public int getSoNhanVienDuoiQuyen() {
		return soNhanVienDuoiQuyen;
	}

	
	public void setSoNhanVienDuoiQuyen(int soNhanVienDuoiQuyen) {
		this.soNhanVienDuoiQuyen = soNhanVienDuoiQuyen;
	}

	
	public TruongPhong() {
		this.soNhanVienDuoiQuyen  = 0;
	}

	public TruongPhong(String maso, String hoTen, String soDienThoai, float soNgayLamViec) {
		super(maso, hoTen, soDienThoai, soNgayLamViec);
		this.soNhanVienDuoiQuyen  = 0;
	}
	
	@Override 
	public void xuat() {
		super.xuat();
		System.out.println("\t Số Nhân viên:" + this.soNhanVienDuoiQuyen + "\t Lương: " + this.luong);
	}
	//5. Business 
	
	@Override
	public void tinhLuong() {
		this.luong = this.soNgayLamViec * LUONG_NGAY
				+ this.soNhanVienDuoiQuyen * PHU_CAP_MOI_NHAN_VIEN_QLY;
	}
	
	public void tangNhanVien() {
		this.soNhanVienDuoiQuyen++;
	}
	
	public void giamNhanVien() {
		this.soNhanVienDuoiQuyen--;
	}

}
