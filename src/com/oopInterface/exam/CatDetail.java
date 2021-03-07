package com.oopInterface.exam;

public class CatDetail implements Cat{
    private String loai;
    private String mau;
    private String noisong;

    public CatDetail() {

    }

    public CatDetail(String loai, String mau, String noisong) {
        this.loai = loai;
        this.mau = mau;
        this.noisong = noisong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
            this.mau = mau;
    }

    public String getNoisong() {
        return noisong;
    }

    public void setNoisong(String noisong) {
        this.noisong = noisong;
    }

    @Override
    public void nhap() {

    }

    @Override
    public void hienthi() {
        System.out.println("Ten: "+TEN+",Loai: "+loai+", Mau: "+mau+", Noi song: "+noisong);
    }
}
