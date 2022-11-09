import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        System.out.println("Qual é o salario do funcionário R$:");
        Scanner s=new Scanner(System.in);
        float sa=s.nextFloat();
        float a=sa+(sa*15/100);
        System.out.printf("Com o reajuste salaria o funcionário que ganha %.2f passa a ganhar %.2f R$",sa,a);
    }
}
