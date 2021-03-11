import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	Scanner input = new Scanner(System.in);
	ArrayList<Nguoi> listNguoi = new ArrayList<>();
	
	public KhachSan() {
		
	}
	
	public void addNguoi() {
		System.out.print("Nhap so khach muon them: ");
		int n = Integer.parseInt(input.nextLine());
		
		for(int i=0; i<n; i++) {
			
			System.out.print("Nhap ten: ");
			String name = input.nextLine();
			
			System.out.print("Nhap ngay sinh: ");
			String birthDay = input.nextLine();
			
			System.out.print("Nhap cmnd: ");
			int cmnd = Integer.parseInt(input.nextLine());
			
			System.out.print("Nhap so ngay tro: ");
			int soNgayTro = Integer.parseInt(input.nextLine());
			
			System.out.print("Nhap loai phong tro: ");
			String loaiPhongTro = input.nextLine();
			
			System.out.print("Nhap gia phong: ");
			int giaPhong = Integer.parseInt(input.nextLine());
			
			Nguoi nguoi = new Nguoi(name, birthDay, cmnd, soNgayTro, loaiPhongTro, giaPhong);
			System.out.println("Da them ok");
			listNguoi.add(nguoi);
		}
	}
	
	public void display() {
		for(Nguoi nguoi: listNguoi) {
			System.out.println(nguoi);
		}
	}
	
	public void delete() {
		System.out.print("Nhap cmnd nguoi muon xoa: ");
		int cmnd = Integer.parseInt(input.nextLine());
		boolean check = true;
		
		for(Nguoi nguoi: listNguoi) {
			if(nguoi.getCmnd()==cmnd) {
				listNguoi.remove(nguoi);
				System.out.println("Da xoa");
				check = false;
				break;
			}
		}
		if(check) {
			System.out.println("Khong tim thay");
		}
	}
	
	public void prefecturalMoney() {
		System.out.print("Nhap cmnd khach hang muon tinh tien: ");
		int cmnd = Integer.parseInt(input.nextLine());
		boolean check = true;
		
		for(Nguoi nguoi: listNguoi) {
			if(nguoi.getCmnd()==cmnd) {
				System.out.println("So tien phai tra: "+(nguoi.getSoNgayTro()*nguoi.getGiaPhong())+" VND");
				check = false;
				break;
			}
		}
		if(check) {
			System.out.println("Khong tim thay");
		}
	}
}
