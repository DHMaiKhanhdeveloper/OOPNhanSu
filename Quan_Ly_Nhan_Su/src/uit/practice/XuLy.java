package uit.practice;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CongTy cty = new CongTy();
		cty.dummyDataCty(); // tạo dữ liệu cho công ty
		cty.dummyDataNhanSu(); // tạo dữ liệu cho nhân sự
		cty.phanBoNhanVienThuong();
		cty.themNhanSu(scan);
		cty.xuat();
	}

}
