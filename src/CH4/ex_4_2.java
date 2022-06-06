package CH4;

public class ex_4_2 {
    public static void main(String[] args) {

        double denk = Math.cos(3.14159 / 4);
        double gerçekHata = (0.5 - denk) / 0.5 * 100;
        System.out.println("n = 0 :" + "\n" + "f(xi+1)= " + denk + "\n" + "gercek yüzde hata: " + gerçekHata + "\n");

        double denkTurev1 = -Math.sin(3.14159 / 4)*(3.14159/12);
        denk += denkTurev1;
        gerçekHata = (0.5 - denk) / 0.5 * 100;
        System.out.println("n = 1 :" + "\n" + "f(xi+1)= " + denk + "\n" + "gercek yüzde hata: " + gerçekHata + "\n");

        double denkTurev2 = -Math.cos(3.14159 / 4) *Math.pow((3.14159/12),2) /2;
        denk += denkTurev2;
        gerçekHata = (0.5 - denk) / 0.5 * 100;
        System.out.println("n = 2 :" + "\n" + "f(xi+1)= " + denk + "\n" + "gercek yüzde hata: " + gerçekHata + "\n");

        double denkTurev3 = Math.sin(3.14159 / 4)*Math.pow((3.14159/12),3) / 6;
        denk += denkTurev3;
        gerçekHata = (0.5 - denk) / 0.5 * 100;
        System.out.println("n = 3 :" + "\n" + "f(xi+1)= " + denk + "\n" + "gercek yüzde hata: " + gerçekHata + "\n");

        double denkTurev4 = Math.cos(3.14159 / 4)*Math.pow((3.14159/12),4) / 24;
        denk += denkTurev4;
        gerçekHata = (0.5 - denk) / 0.5 * 100;
        System.out.println("n = 4 :" + "\n" + "f(xi+1)= " + denk + "\n" + "gercek yüzde hata: " + gerçekHata+ "\n");

        double denkTurev5 = -Math.sin(3.14159/ 4)*Math.pow((3.14159/12),5) / 120;
        denk += denkTurev5;
        gerçekHata = (0.5 - denk) / 0.5 * 100;
        System.out.println("n = 5 :" + "\n" + "f(xi+1)= " + denk + "\n" + "gercek yüzde hata: " + gerçekHata + "\n");

        double denkTurev6 = -Math.cos(3.14159 / 4)*Math.pow((3.14159/12),6) / 720;
        denk += denkTurev6;
        gerçekHata = (0.5 - denk) / 0.5 * 100;
        System.out.println("n = 6 :" + "\n" + "f(xi+1)= " + denk + "\n" + "gercek yüzde hata: " + gerçekHata);
    }

}
