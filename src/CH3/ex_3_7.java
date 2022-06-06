package CH3;

public class ex_3_7 {
    public static void main(String[] args) {
        double a = 1, b = 3000.001, c = 3, d = Math.sqrt(b*b-4*a*c), x1 = ((-b+d)/(2*a)), x2 = ((-b-d)/(2*a)), xlr = (-2*c/(b+d));
        double aa = 1, bb = 3000.001, cc = 3, dd = Math.sqrt(bb*bb-4*aa*cc), x11 = ((-bb+dd)/(2*aa)), x22 = ((-bb-dd)/(2*aa));

        System.out.println("Tek katlı hassaslıkta sonuçlar: ");
        System.out.println("x1: "+x1 + "\n" +
                            "x2: "+x2+"\n");
        System.out.println("Cift katlı hassaslıkta sonuçlar: ");

        System.out.println("x1: "+x11 + "\n" +
                "x2: "+x22+"\n");

        System.out.println("ilk kök için değiştirilmiş formül: ");
        System.out.println("x1: "+ xlr);
    }
}
