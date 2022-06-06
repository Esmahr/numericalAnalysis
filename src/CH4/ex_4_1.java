package CH4;

public class ex_4_1 {
    public static void main(String[] args) {

        double denk = ((-0.1)*Math.pow(0,4))-((0.15)*Math.pow(0,3))-((0.5)*Math.pow(0,2))-(0.25*0)+1.2;
        double gerçekHata =0.2-denk;
        System.out.println("n = 0 :" +"\n"+ "f(xi+1)= "+ denk+"\n"+ "gercek hata: "+gerçekHata+"\n");

        double denkTurev1 = (4*(-0.1)*Math.pow(0,3))-(3*(0.15)*Math.pow(0,2))-(2*(0.5)*Math.pow(0,1))-(0.25);
        denk += denkTurev1;
        gerçekHata =0.2-denk;
        System.out.println("n = 1 :" +"\n"+ "f(xi+1)= "+ denk+"\n"+ "gercek hata: "+gerçekHata+"\n");

        double denkTurev2 = ((12*(-0.1)*Math.pow(0,2))-(6*(0.15)*Math.pow(0,1))-(2*0.5))/2;
        denk += denkTurev2;
        gerçekHata =0.2-denk;
        System.out.println("n = 2 :" +"\n"+ "f(xi+1)= "+ denk+"\n"+ "gercek hata: "+gerçekHata+"\n");

        double denkTurev3 =((24*(-0.1)*Math.pow(0,1))-(6*(0.15)))/6;
        denk += denkTurev3;
        gerçekHata =0.2-denk;
        System.out.println("n = 3 :" +"\n"+ "f(xi+1)= "+ denk+"\n"+ "gercek hata: "+gerçekHata+"\n");

        double denkTurev4 = ((24*(-0.1)))/24;
        denk += denkTurev4;
        gerçekHata =0.2-denk;
        System.out.println("n = 4 :" +"\n"+ "f(xi+1)= "+ denk+"\n"+ "gercek hata: "+gerçekHata);
    }
}
