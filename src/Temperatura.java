import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        System.out.println("Informe a temperatura em grausºC:");
        Scanner g=new Scanner(System.in);
        float ga=g.nextFloat();
        float f=((9*ga)/5)+32;
        System.out.printf("A temperatura em ª%.2f corresponde a ª%.2f",ga,f);
    }
}
