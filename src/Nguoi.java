
public class Nguoi {
	private String name;
	private String birthDay;
	private int cmnd;
	private int soNgayTro;
	private String loaiPhongTro;
	private int giaPhong;
	
	public Nguoi() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public int getCmnd() {
		return cmnd;
	}

	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}

	public int getSoNgayTro() {
		return soNgayTro;
	}

	public void setSoNgayTro(int soNgayTro) {
		this.soNgayTro = soNgayTro;
	}

	public String getLoaiPhongTro() {
		return loaiPhongTro;
	}

	public Nguoi(String name, String birthDay, int cmnd, int soNgayTro, String loaiPhongTro, int giaPhong) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.cmnd = cmnd;
		this.soNgayTro = soNgayTro;
		this.loaiPhongTro = loaiPhongTro;
		this.giaPhong = giaPhong;
	}

	public void setLoaiPhongTro(String loaiPhongTro) {
		this.loaiPhongTro = loaiPhongTro;
	}

	public int getGiaPhong() {
		return giaPhong;
	}

	public void setGiaPhong(int giaPhong) {
		this.giaPhong = giaPhong;
	}

	@Override
	public String toString() {
		return "Nguoi [name=" + name + ", birthDay=" + birthDay + ", cmnd=" + cmnd + ", soNgayTro=" + soNgayTro
				+ ", loaiPhongTro=" + loaiPhongTro + ", giaPhong=" + giaPhong + "]";
	}
	
} 
