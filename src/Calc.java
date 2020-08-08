import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Число yyy1");
        System.out.println("Число 1");
        int numb1 = Integer.parseInt(k.next());//числа в строку//
        System.out.println("Ведите символ");
        char seign = k.next().charAt(0);
        System.out.println("Число2");
        int num2 = Integer.parseInt(k.next());
        System.out.println(numb1 + "" + seign + "" + num2);
    }
}