import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random =new Random();
        String bankNamesString = "ПРИВАТБАНК, Сенс Банк" +
                "Сітібанк, ІНГ Банк Україна, Ощадбанк," +
                "Укрексімбанк, УКРГАЗБАНК, Райффайзен Банк," +
                "УКРСИББАНК, ПУМБ, КРЕДІ АГРІКОЛЬ БАНК, " +
                "Південний, КРЕДОБАНК," +
                "Банк Кредит Дніпро";
        String[]bankNames= bankNamesString.split(",");
        double[] prices  = new double[bankNames.length];
        Bank[] banks = new Bank[bankNames.length];
        for (int i = 0; i <bankNames.length ; i++) {
            prices[i] = random.nextDouble()*5+35;
            Bank bank = new Bank(bankNames[i],prices[i]);
            banks[i] = bank;
        }
        Arrays.sort(prices);
        for (int i = 0; i <banks.length; i++) {
            System.out.println(banks[i]);
        }
        for (int i = 0; i <banks.length; i++) {
            if(banks[i].price == prices[banks.length-1]) {
                System.out.println("best price in bank = " + banks[i]);
            }
        }
    }
}
