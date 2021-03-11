import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String choose;
		Scanner input = new Scanner(System.in);
		KhachSan khachsan = new KhachSan();
	

		while(true) {
			showMenu();
			choose = input.nextLine();
			
			switch(choose) {
			case "1":
				khachsan.addNguoi();
				break;
			case "2":
				khachsan.display();
				break;
			case "3":
				khachsan.delete();
				break;
			case "4":
				khachsan.prefecturalMoney();
				break;
			case "5":
				System.exit(1);
				break;
			default:
				System.out.println("Lua chon sai!!!");
				break;
			
			}
		}
		
	}

	public static void showMenu() {
		System.out.println("\n--------------MENU----------------");
		System.out.println("1. Nhap thong tin khach tro");
		System.out.println("2. Hien thi");
		System.out.println("3. Xoa");
		System.out.println("4. Tinh tien");
		System.out.println("5. Thoat");
	}
}
