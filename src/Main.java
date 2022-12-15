import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("У нас для вас приятный бонус! За любое пополнение счета от 1000 руб. мы начислим по 1 руб. за каждые 100 руб. в чеке! ");
        System.out.println("Введите, пожалуйста, сумму для пополнения счета: ");
        Scanner scan = new Scanner(System.in);
        int refill = scan.nextInt();
        int bonus;
        int balance = 150;

        if (refill > 1000) {
            bonus = refill / 100;
            balance = balance + refill + bonus;
            System.out.println("Вам начисленно " + bonus + " бонусов. Ваш текущий баланс: " + balance + " рублей.");
        } else {
            balance = balance + refill;
            System.out.println("Ваш текущий баланс: " + balance + " рублей.");
        }


    }
}
