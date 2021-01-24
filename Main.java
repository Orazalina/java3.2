public class Main {
    public static void main(String[] args) {
        int InitialBalance = 100;
        int receipt = 100;
        int bonus = receipt / 100;

        if (receipt > 1000){
            bonus = receipt / 100;
        }
        else {
            bonus = 0;
        }

        int balance = InitialBalance + receipt + bonus;

        System.out.println(balance);
    }
}