import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km,tutar;
        System.out.print("Kat edilen mesafeyi giriniz: ");
        Scanner input=new Scanner(System.in);
        km=input.nextDouble();
        tutar=(km*2.2)+10;
        boolean a =(tutar<=20);
        String b=a ? "Tutar: 20 TL":("Tutar: " +tutar);
        System.out.print(b);
    }
}