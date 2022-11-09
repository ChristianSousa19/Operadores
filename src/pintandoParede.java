import java.util.Scanner;

public class pintandoParede {
    public static void main(String[] args) {
        System.out.println("Largura da parede?");
        Scanner l=new Scanner(System.in);
        float la=l.nextFloat();
        System.out.println("Altura da parede?");
        Scanner a=new Scanner(System.in);
        float al=a.nextFloat();
        float ar=la*al;
        float t=ar/2;
        System.out.printf("Sua parede tem %.2f de largura e %.2f de altura\n",la,al);
        System.out.printf("Sua área e de %.2f\n",ar);
        System.out.printf("Será necessario %.2f litros de tinta para pintar a parede\n",t);
    }
}
