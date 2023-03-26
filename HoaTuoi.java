/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
/**
 *
 * @author HOANG PHUC
 */
public class HoaTuoi implements Serializable {
      private int id;
    private String tenhoa,mau,xuatxu;
    private float gianhap,giaban;
    
    public HoaTuoi(){   
    }

    public HoaTuoi(int id ,String tenhoa, String mau, String xuatxu, float gianhap, float giaban) {
        super();
        this.id = id;
        this.tenhoa = tenhoa;
        this.mau = mau;
        this.xuatxu = xuatxu;
        this.gianhap = gianhap;
        this.giaban = giaban;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenhoa() {
        return tenhoa;
    }

    public void setTenhoa(String tenhoa) {
        this.tenhoa = tenhoa;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public float getGianhap() {
        return gianhap;
    }

    public void setGianhap(float gianhap) {
        this.gianhap = gianhap;
    }

    public float getGiaban() {
        return giaban;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }

}