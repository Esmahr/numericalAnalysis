package CH2;
import java.time.*;
import java.util.*;
public class prob_2_20 {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.of(2022, 04, 22);



        System.out.print("Iki tarih arasındaki gün farkı: ");
        LocalDate t1 = LocalDate.of(1999, 01, 01);
        gunSayısı(t1, bugun);

        System.out.print("Iki tarih arasındaki gün farkı: ");
        LocalDate t2 = LocalDate.of(2000, 02, 29);
        gunSayısı(t2, bugun);

        System.out.print("Iki tarih arasındaki gün farkı: ");
        LocalDate t3 = LocalDate.of(2001, 03, 01);
        gunSayısı(t3, bugun);

        System.out.print("Iki tarih arasındaki gün farkı: ");
        LocalDate t4 = LocalDate.of(2002, 06, 21);
        gunSayısı(t4, bugun);

        System.out.print("Iki tarih arasındaki gün farkı: ");
        LocalDate t5 = LocalDate.of(2004, 12, 31);
        gunSayısı(t5, bugun);





    }

    public static void gunSayısı(LocalDate t1, LocalDate t2) {

    Period diff = Period.between(t1, t2);
    /*if (diff.getMonths()==1 && diff.getMonths()==3 && diff.getMonths()==5 && diff.getMonths()==7
            && diff.getMonths()==8 && diff.getMonths()==10 && diff.getMonths()==12){
        System.out.println((diff.getYears()*365)+(diff.getMonths()*31)+diff.getDays());
    }

    if (diff.getMonths()==4 && diff.getMonths()==6 && diff.getMonths()==9 && diff.getMonths()==11){
        System.out.println((diff.getYears()*365)+(diff.getMonths()*30)+diff.getDays());
    }

    if (diff.getMonths()==2){
        System.out.println((diff.getYears()*365)+(diff.getMonths()*28)+diff.getDays());
    }
*/
        System.out.println((diff.getYears()*365)+(diff.getMonths()*30)+diff.getDays());


}}
