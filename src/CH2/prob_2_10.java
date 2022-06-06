package CH2;

public class prob_2_10 {
    public static void main(String[] args) {

        double T, Tmean, Tpeak, t, tpeak;

        System.out.println("Ortalama günlük sıcakık değerleri:" );
        System.out.println(" ");
        System.out.println("Ocak-Subat aylarında Miami-Florida Bolgeleri için: ");
       hesaplama(22.1,28.3,0,59);

        System.out.println(" ");
        System.out.println("Temmuz-Agustos aylarında Boston-Massachuseltts Bolgeleri için: ");
        hesaplama(10.7,22.9,180,242);

    }
    public static void hesaplama( double Tmean, double Tpeak, double t, double tpeak){

        double a = ((2* 3.14)*(t-tpeak));
double hessaplama = (Tmean + (Tpeak-Tmean)*Math.cos(a));

        System.out.println(hessaplama);
    }
}
