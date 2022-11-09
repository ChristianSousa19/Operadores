import java.util.Scanner;

public class SucessorAntecessor {
    public static void main(String[] args) {
        System.out.println("Informe um valor:");
        Scanner n=new Scanner(System.in);
        float n1=n.nextFloat();
        float a=n1-1;
        float s=n1+1;
        System.out.format("Você informou o numero %.2f,seu antecessor e %f e seu sucessor e %.2f",n1,a,s);
    }
}
