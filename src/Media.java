import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        System.out.println("Informe o nome do aluno: ");
        Scanner nome=new Scanner(System.in);
        String n= nome.next();
        System.out.println("Informe a primeira nota do aluno ");
        Scanner nota=new Scanner(System.in);
        float n1=nota.nextFloat();
        System.out.println("Informe a segunda nota do aluno ");
        Scanner nota2=new Scanner(System.in);
        float n2=nota2.nextFloat();
        float m=(n1+n2)/2;
        System.out.printf("A media do aluno %s e igual a %.2f",n,m);
    }
}
