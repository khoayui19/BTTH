/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth1;


/**
 *
 * @author Admin
 */
public class Vehicle {
    private int dungTich;
    private double triGia;
    private String tenChuXe,loaiXe;
 
    public Vehicle( int dungTich, double triGia, String tenChuXe, String loaiXe) {
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
    }
    public Vehicle(){
 
    }
 
    public int getDungTich() {
        return dungTich;
    }
 
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
 
    public double getTriGia() {
        return triGia;
    }
 
    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
 
    public String getTenChuXe() {
        return tenChuXe;
    }
 
    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }
 
    public String getLoaiXe() {
        return loaiXe;
    }
 
    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }
 
    public double tinhThuePhaiNop(){
        double thue;
        if(dungTich<100) thue=triGia*0.01;
        else if (dungTich >= 100 && dungTich<=200) thue = triGia * 0.03;
        else thue = triGia * 0.05;
        return thue;
    }
 
    @Override
    public String toString() {
        return "-"+tenChuXe + "-"+dungTich + "-"+triGia + "-"+loaiXe;
}
 
    void inThuePhaiNop(){
        System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f  \n ",tenChuXe,dungTich,triGia,loaiXe,tinhThuePhaiNop());
    }
}

