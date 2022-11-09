import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        System.out.println("Qual e o preço do produto?");
        Scanner p=new Scanner(System.in);
        float pe= p.nextFloat();
        float d = pe-(pe*5/100) ;
        System.out.printf("O produto de valor %.2fR$\n passa a custar %.2fR$ com desconto de 5 por cento",pe,d);

    }
}
