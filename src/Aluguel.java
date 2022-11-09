import java.util.Scanner;

public class Aluguel {
    public static void main(String[] args) {
        System.out.println("Quantos dias alugados?");
        Scanner d=new Scanner(System.in);
        int dia=d.nextInt();
        System.out.println("Quantos km rodados?");
        Scanner q=new Scanner(System.in);
        float km=q.nextFloat();
        double tot=(60*dia)+0.15*km;
        System.out.printf("O total a pagar e de R$%.2f",tot);

    }
}
