public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int pay = 1001;
        int bonus = 0;

        if (pay > 1000) {
            bonus = pay / 100;
        }

        balance = balance + pay + bonus;
        System.out.print("Бонус " + bonus + "\nОстаток на счету " + balance);


    }
}
