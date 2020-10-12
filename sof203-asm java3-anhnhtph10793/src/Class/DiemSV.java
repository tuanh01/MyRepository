/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author TuAnh
 */
public class DiemSV {

    int Ma = 1;
    String MaSinhVien;
    int TiengAnh = 0;
    int TinHoc = 0;
    int GDTC = 0;

    public DiemSV() {
    }

    public DiemSV(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public int getMa() {
        return Ma;
    }

    public void setMa(int Ma) {
        this.Ma = Ma;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public int getTiengAnh() {
        return TiengAnh;
    }

    public void setTiengAnh(int TiengAnh) {
        this.TiengAnh = TiengAnh;
    }

    public int getTinHoc() {
        return TinHoc;
    }

    public void setTinHoc(int TinHoc) {
        this.TinHoc = TinHoc;
    }

    public int getGDTC() {
        return GDTC;
    }

    public void setGDTC(int GDTC) {
        this.GDTC = GDTC;
    }
}
