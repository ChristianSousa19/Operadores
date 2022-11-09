import java.util.Scanner;

public class Moedas {
    public static void main(String[] args) {
        System.out.println("Quanto dinhero você tem na carteira? ");
        Scanner m=new Scanner(System.in);
        float c=m.nextFloat();
        float d=(c/5);
        System.out.printf("Com %.2f R$ você pode comprar %.2f U$",c,d);
    }
}
