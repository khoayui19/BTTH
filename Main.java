/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth1;


/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
      static void nhapXe(Vehicle xe){
            System.out.print("Nhap ten chu xe: ");
            xe.setTenChuXe(sc.nextLine());
            System.out.print("Nhap dung tich xe: ");
            xe.setDungTich(sc.nextInt());
            System.out.print("Nhap tri gia xe: ");
            xe.setTriGia(sc.nextDouble());
            System.out.print("Nhap loai xe: ");
            xe.setLoaiXe(sc.nextLine());
        }
    public static void main(String[] args) {
        Vehicle v[]= null;
        int a,n=0;
        boolean flag = true;
        do{
            System.out.println("Chon !!!");
            System.out.println("""
                               1.Tao cac doi tuong xe va nhap thong tin 
                               2.Xuat bang ke khai tien thue cua cac xe
                               Nhap so khac de thoat""");
            a =sc.nextInt();
            switch (a){
                case 1 -> {
                    System.out.print("Nhap so luong xe ban muon khai bao thue: ");
                    n=sc.nextInt();
                    v= new Vehicle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thu " + (i+1));
                        v[i] = new Vehicle();
                        nhapXe(v[i]);
                    }
                }
                case 2 -> {
                    System.out.printf("%5s %5s %5s %10s %10s %8s\n","Ten chu xe","Dung tich","Tri gia","Loai Xe","Thue Phai Nop");
                    for (int i = 0; i < n; i++) {
                        v[i].inThuePhaiNop();
                    }
                }
                default -> {
                    System.out.println("bye");
                    flag=false;
                }
            }
        }while (flag);
    }
}