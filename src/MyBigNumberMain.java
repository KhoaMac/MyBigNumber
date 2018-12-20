import java.util.Scanner;

public class MyBigNumberMain implements RememberStep{

    public static void main(String[] args) {

        MyBigNumberMain main = new MyBigNumberMain();
        MyBigNumber s = new MyBigNumber(main);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        String num1 = sc.nextLine();
        System.out.print("Nhap so thu hai: ");
        String num2= sc.nextLine();

        String result = s.sumNumber(num1, num2);
        System.out.print("sum" + " " + num1 + " " + num2 + "\n");
        System.out.print("Ket Qua Cuoi Cung: " + result);
    }

    public void sendMessage(String str) {
        System.out.println(str);
    }

}