import java.util.Scanner;

public class MyBigNumberMain implements IReceiver {

    /*
     * Main file
     * */
    public static void main(String[] args) {

        IReceiver iReceiver = new IReceiver() {
            @Override
            public void sendMessage(String stepMsg) {
                System.out.println(stepMsg);
            }
        };
        MyBigNumber s = new MyBigNumber(iReceiver);

        try {

            String s1 = args[0];

            String s2 = args[1];

            String result = s.sumNumber(s1, s2);
            System.out.println("Ket Qua La: " + result + "\n");


        } catch (ExNumberFormatException e) {
            System.out.println("\n" + e.getMessage() + "\n");
        } catch (NumberFormatException e) {
            System.out.println("\n" + e.getMessage() + "\n");
        }
    }

    public void sendMessage(String str) {
        System.out.println(str);
    }

}