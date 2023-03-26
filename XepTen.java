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
 

public class XepTen implements Comparator<HoaTuoi> {
    @Override
    public int compare(HoaTuoi hoa1, HoaTuoi hoa2) {
        return hoa1.getTenhoa().compareTo(hoa2.getTenhoa());
    }
}
