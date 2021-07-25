public class Main {
    public static void main(String[] args) {
        int balance = 550;
        int add = 1001;
        int bonusCost = 100;
        int cashback = 1;
        int bonusBalance;
        if (add > 1000) {
            bonusBalance = add * cashback / bonusCost;
        } else {
            bonusBalance = 0;
        }
        int total = bonusBalance + balance + add;
        System.out.println(bonusBalance);
        System.out.println(total);
    }
}
