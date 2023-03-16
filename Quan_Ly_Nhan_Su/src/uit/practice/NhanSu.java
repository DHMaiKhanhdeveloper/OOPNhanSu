package uit.practice;

import java.util.Scanner;

public class NhanSu {
	
	protected String maso;
	protected String hoTen;
	protected String soDienThoai;
	protected float soNgayLamViec;
	protected float luong;

	
	public NhanSu() {
		// TODO Auto-generated constructor stub
	}


	public String getMaso() {
		return maso;
	}


	public void setMaso(String maso) {
		this.maso = maso;
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getSoDienThoai() {
		return soDienThoai;
	}


	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}


	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}


	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}


	public float getLuong() {
		return luong;
	}


	public void setLuong(float luong) {
		this.luong = luong;
	}
	public NhanSu(String maso, String hoTen, String soDienThoai, float soNgayLamViec) {
		this.maso = maso;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
	}
	
	// 4. Input, output
	public void nhap(Scanner scan) {
		System.out.println("========== Thêm Nhân Sự ========== ");
		System.out.print("Nhập mã số");
		this.maso = scan.nextLine();
		
		System.out.print("Nhập họ tên");
		this.hoTen = scan.nextLine();
		
		System.out.print("Nhập số điện thoại");
		this.soDienThoai = scan.nextLine();
		
		System.out.print("Nhập số ngày làm việc");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		
		System.out.println("========== Kết thúc ========== ");
	}
	
	public void xuat() {
		System.out.print(" Mã số: " + this.maso);
		System.out.print("\t Họ tên: " + this.hoTen);
		System.out.print("\t SĐT: " + this.soDienThoai);
		System.out.print("\t Số ngày làm: " + this.soNgayLamViec);
	}
	
	public void xuatMaVaTen() {
		System.out.println("Mã: " + this.maso + "\t Tên:" + this.hoTen);
	}
	
	
	public void tinhLuong() {
		this.luong = 0;
	}
	

}
