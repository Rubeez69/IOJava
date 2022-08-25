package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Nhập thông tin sinh viên
		System.out.print("Nhap ten sinh vien: ");
		String tenSV = sc.nextLine();
		System.out.print("Nhap ma sinh vien: ");
		String maSV = sc.nextLine();
		System.out.print("Nhap chung minh nhanh dan: ");
		String cMND = sc.nextLine();
		System.out.print("Nhap ten lop: ");
		String tenLop = sc.nextLine();
		System.out.print("Nhap ten truong: ");
		String tenTrg = sc.nextLine();
		System.out.print("Nhap diem trung binh: ");
		float dTB = Float.parseFloat(sc.nextLine());
		
		// Nhập thông tin công nhân: 
		System.out.print("Nhap ten cong nhan: ");
		String tenCN = sc.nextLine();
		System.out.print("Nhap dia chi cong nhan: ");
		String diaChi = sc.nextLine();
		System.out.print("Nhap so dien thoai: ");
		String soDT = sc.nextLine();
		System.out.print("Nhap he so luong: ");
		float heSoLg = Float.parseFloat(sc.nextLine());
		
		// Nhập thông tin xe hơi:
		System.out.print("Nhap ten xe: ");
		String tenXe = sc.nextLine();
		System.out.print("Nhap ten hang: ");
		String hangXe = sc.nextLine();
		System.out.print("Nhap gia: ");
		String giaXe = sc.nextLine();
		System.out.print("Nhap mau son: ");
		String mauSon = sc.nextLine();
		
		// Xuất ra thông tin của từng đối tượng: 
		
		/* Học sinh */
		
		System.out.println("\n----Thong tin sinh vien----");
		System.out.print("\nTen sinh vien: "+tenSV);
		System.out.print("\nMa sinh vien: "+maSV);
		System.out.print("\nChung minh nhan dan: "+cMND);
		System.out.print("\nTen lop: "+tenLop);
		System.out.print("\nTen truong: "+tenTrg);
		System.out.print("\nDiem trung binh: "+dTB);
		
		/* Công nhân */
		System.out.println("\n====Thong tin cong nhan====");
		System.out.print("\nTen cong nhan: "+tenCN);
		System.out.print("\nDia chi cong nhan: "+diaChi);
		System.out.print("\nSo dien thoai: "+soDT);
		System.out.print("\nHe so luong: "+heSoLg);
		
		/* Xe hơi */
		System.out.println("\n++++Thong tin xe hoi++++");
		System.out.print("\nTen xe hoi: "+tenXe);
		System.out.print("\nTen hang xe: "+hangXe);
		System.out.print("\nGia xe: "+giaXe);
		System.out.print("\nMau son :"+mauSon);
		
		}
}
