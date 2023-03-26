/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOANG PHUC
 */

 
import java.util.Comparator;
 
/**
 * SortStudentByGPA class
 * 
 * @author viettuts.vn
 */
public class HoaTBByGPA implements Comparator<HoaTuoi> {
    @Override
    public int compare(HoaTuoi hoatuoi1, HoaTuoi hoatuoi2) {
        if (hoatuoi1.getGiaban() > hoatuoi2.getGiaban()) {
            return 1;
        }
        return -1;
    }
}