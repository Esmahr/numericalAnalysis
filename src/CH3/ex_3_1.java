package CH3;

import java.util.Scanner;

public class ex_3_1 {

    /* Bir köprü ve perçinin uzunluklarını ölçmekle görevlendirildiniz. Sırasıyla;
     a) gerçek hata,
     b) gerçek bağıl yüzde yatayı hesaplayın */
    public static void main(String[] args) {
        double kopruGercek = 10000;
        double percinGercek= 10;

        double kopruOlculen = 9999;
        double percinOlculen = 9;

        Hata(kopruGercek,percinGercek,kopruOlculen,percinOlculen);
    }
    public static void Hata(double kopruGercek,double percinGercek,double kopruOlculen,double percinOlculen){
        double gercekHataKopru = kopruGercek-kopruOlculen;
        double bagılYuzdeKopru= (gercekHataKopru/kopruGercek*100);

        double gercekHataPercin = percinGercek-percinOlculen;
        double bagılYuzdePercin = (gercekHataPercin/percinGercek*100);

        System.out.println("Köprü: "+"\n"+
                "Gerçek hata: "+gercekHataKopru+"\n"+
                "Gerçek bağıl yüzde hata: "+bagılYuzdeKopru+"\n"+"\n"+
                "Percin: "+"\n"+
                "Gerçek hata: "+gercekHataPercin+"\n"+
                 "Gerçek bağıl yüzde hata: "+bagılYuzdePercin
                );

    }

}
