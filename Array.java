
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array{
    public static Scanner sc = new Scanner(System.in);
    private List<HoaTuoi> hoaList;
    private HoaTuoiDoc hoadoc;
    
    public Array(){
        hoadoc = new HoaTuoiDoc();
        hoaList = hoadoc.read();
    }
    
    public void add(){
        int id = (hoaList.size() > 0) ? (hoaList.size() + 1) : 1;
        System.out.println("Hoa tuoi thu = " + id);
        String tenhoa = inputtenhoa();
        String mau = inputmau();
        String xuatxu = inputxuatxu();
        float gianhap = inputGianhap();
        float giaban = inputGiaban();
        HoaTuoi hoatuoi = new HoaTuoi(id,tenhoa,mau,xuatxu,gianhap,giaban);
        hoaList.add(hoatuoi);
        hoadoc.write(hoaList);
    }
    public void edit(int id) {
        boolean isExisted = false;
        int size = hoaList.size();
        for (int i = 0; i < size; i++) {
            if (hoaList.get(i).getId()== id) {
                isExisted = true;
                hoaList.get(i).setTenhoa(inputtenhoa());
                hoaList.get(i).setMau(inputmau());
                hoaList.get(i).setXuatxu(inputxuatxu());
                hoaList.get(i).setGiaban(inputGiaban());
                hoaList.get(i).setGianhap(inputGianhap());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            hoadoc.write(hoaList);
        }
    }
    
     public void delete(int id) {
        HoaTuoi hoatuoi = null;
        int size = hoaList.size();
        for (int i = 0; i < size; i++) {
            if (hoaList.get(i).getId()== id) {
                hoatuoi = hoaList.get(i);
                break;
            }
        }
        if (hoatuoi != null) {
            hoaList.remove(hoatuoi);
            hoadoc.write(hoaList);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }

    public void XepTen() {
        Collections.sort(hoaList, new XepTen());
    }
 
   
    public void HoaTBByGPA() {
        Collections.sort(hoaList, new HoaTBByGPA());
    }
 
    public void show() {
        for (HoaTuoi hoatuoi : hoaList) {
            System.out.format("%5d|  ", hoatuoi.getId());
            System.out.format("%20s| ", hoatuoi.getTenhoa());
            System.out.format("%20s| ", hoatuoi.getMau());
            System.out.format("%20s| ", hoatuoi.getXuatxu());
            System.out.format("%20f|", hoatuoi.getGianhap());
            System.out.format("%20f|", hoatuoi.getGiaban());
        }
    }
 
  
    public int inputId() {
        System.out.print("Số id Hoa : ");
        while (true) {
            try {
                int id = Integer.parseInt((sc.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }
     
 
    private String inputtenhoa() {
        System.out.print("Input name: ");
        return sc.nextLine();
    }
 
     private String inputmau() {
        System.out.print("Input name: ");
        return sc.nextLine();
    }
      private String inputxuatxu() {
        System.out.print("Input name: ");
        return sc.nextLine();
    }
   
     private float inputGianhap() {
        System.out.print("Input gia nhap: ");
        while (true) {
            try {
                float gianhap = Float.parseFloat((sc.nextLine()));
                if (gianhap < 0.0 && gianhap > 10.0) {
                    throw new NumberFormatException();
                }
                return gianhap;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input gia nhap age again: ");
            }
        }
    }
     private float inputGiaban() {
        System.out.print("Input gia nhap: ");
        while (true) {
            try {
                float giaban = Float.parseFloat((sc.nextLine()));
                if (giaban < 0.0 && giaban > 10.0) {
                    throw new NumberFormatException();
                }
                return giaban;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input gia nhap age again: ");
            }
        }
    }
 
    public List<HoaTuoi> getHoaTuoiList() {
        return hoaList;
    }
 
    public void sethoaList(List<HoaTuoi> hoaList) {
        this.hoaList = hoaList;
    }
}
