import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Boyunuz(m):");
        double boy = input.nextDouble();
        System.out.println("Kilonuz:");
        double kilo = input.nextDouble();

        double bmi = kilo/(boy*boy);
        System.out.println("BMİ:"+bmi);
    }
}
