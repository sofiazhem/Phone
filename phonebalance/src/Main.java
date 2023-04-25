import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму, которая на вашем счете: ");
        int a = in.nextInt();
        System.out.println("Введите сумму пополнения: ");
        int b = in.nextInt();
        int c = a + b;
        int d = b / 100;

        if (b > 1000) {
            System.out.println("На Вашем счете "+ (c + d)+" рублей.");
            System.out.println("На Ваш счет начислено "+ d +" бонус-(ов).");

        }
        else {
            System.out.println("На Вашем счете " + c + " рублей.");
        }




    }
}
