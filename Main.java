
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOANG PHUC
 */
public class Main{
   public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      
         String choose = null;
        boolean exit = false;
        Array ar = new Array();
        int hoatuoiId;
 
        // show menu
        showMenu();
        while (true) {
            choose = sc.nextLine();
            switch (choose) {
            case "1":
                ar.add();
                break;
            case "2":
                hoatuoiId = ar.inputId();
                ar.edit(hoatuoiId);
                break;
            case "3":
                hoatuoiId = ar.inputId();
                ar.inputId();
                ar.delete(hoatuoiId);
                break;
            case "4":
                ar.HoaTBByGPA();
                break;
            case "5":
                ar.XepTen();
                break;
            case "6":
               ar.show();
                break;
            case "0":
                System.out.println("Thoát  !");
                exit = true;
                break;
            default:
                System.out.println("Khongo hợp lệ! Vui lòng nhập lại lựa chọn từ menu:");
                break;
            }
            if (exit) {
                break;
            }
           
            showMenu();
        }
    }
    
    public static void showMenu() {
       
        System.out.println("===========menu===========");
        System.out.println("1.Them Hoa.");
        System.out.println("2.sua Hoa theo id: ");
        System.out.println("3.Xoa Hoa theo id.");
        System.out.println("4.Xep theo gia Ban.");
        System.out.println("5.Xep theo ten.");
        System.out.println("6.In danh sach hoa.");
        System.out.println("0. exit.");
        System.out.println("=========================");
        
    }
}
      