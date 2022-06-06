package CH4;

public class ex_4_4 {
    public static void main(String[] args) {

        double gercekYuzdeHata =0;

        for (double i = 0.5; i >=0.25 ; i= i/2) {
            double xeski =i-i;
            double xsimdi =i;
            double xyeni=i+i;

            double denk1 = (-0.1*Math.pow(xeski,4)-(0.15*Math.pow(xeski,3))-(0.5*Math.pow(xeski,2))-(0.25*xeski)+1.2);
            double denk2 = (-0.1*Math.pow(xsimdi,4)-(0.15*Math.pow(xsimdi,3))-(0.5*Math.pow(xsimdi,2))-(0.25*xsimdi)+1.2);
            double denk3 = (-0.1*Math.pow(xyeni,4)-(0.15*Math.pow(xyeni,3))-(0.5*Math.pow(xyeni,2))-(0.25*xyeni)+1.2);

            System.out.println("h = "+i);


            double ileriyeDogru = (denk3-denk2)/(xyeni-xsimdi);
            gercekYuzdeHata = (-0.9125-ileriyeDogru)/-0.9125*100;
            System.out.println("ileriye dogru bolunmus fark: "+ileriyeDogru+"\n"+
                    "gercek yüzde bagıl hata: "+gercekYuzdeHata+"\n");

            double geriyeDogru = (denk2-denk1)/(xsimdi-xeski);
            gercekYuzdeHata = (-0.9125-geriyeDogru)/-0.9125*100;
            System.out.println("geriye dogru bolunmus fark: "+geriyeDogru+"\n"+
                    "gercek yüzde bagıl hata: "+gercekYuzdeHata+"\n");

            double merkeziBolunmus = (denk3-denk1)/(xyeni-xeski);
            gercekYuzdeHata = (-0.9125-merkeziBolunmus)/-0.9125*100;
            System.out.println("merkezi bolunmus fark: "+merkeziBolunmus+"\n"+
                    "gercek yüzde bagıl hata: "+gercekYuzdeHata+"\n");

        }

    }
}
