import java.util.Arrays;
import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        System.out.println("Informe um valor: ");
        Scanner n=new Scanner(System.in);
        float n1=n.nextFloat();
        float d=n1*2;
        float t=n1*3;
        System.out.printf("Você informou o valor %.2f,seu dobro e %.2f,triplo %.2f",n1,d,t);
        System.out.println("E sua raiz quadrada e igual a");
        System.out.println(Math.sqrt(n1));
    }
}
