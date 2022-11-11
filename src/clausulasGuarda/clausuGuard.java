package clausulasGuarda;

public class clausuGuard {

    public static void main(String[] args) {
        double dividendo = 12;
        double divisor = 5;

        System.out.println(dividir(dividendo,divisor));
        System.out.println(dividir2(dividendo,divisor));

    }
    static double dividir(double dividiendo, double divisor){
        if (dividiendo > 0){
            if (divisor>0){
                if (divisor!=1){
                    return dividiendo/divisor;
                }else {
                    return dividiendo;
                }
            }else {
                System.out.println("division indefinida ");
                return -1;
            }
        }else {
            return 0;
        }
    }
    static double dividir2(double dividendo, double divisor){
        if (dividendo == 0)
            return 0;
        if (divisor ==1)
            return dividendo;
        if (divisor==0){
            System.out.println("divisor no exizte");
            return -1;
        }
        return dividendo/divisor;
    }
}
