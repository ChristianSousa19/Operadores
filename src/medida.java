import java.util.Scanner;

public class medida {
    public static void main(String[] args) {
        System.out.println("Informe uma distância em metros:");
        Scanner m=new  Scanner(System.in);
        float me=m.nextFloat();
        float cm=me *100;
        float mm=me*1000;
        System.out.printf("Você informou a distância %.2f\n centimetros: %.2fcm\n  milimetros: %.2fmm\n",me,cm,mm);

    }
}
