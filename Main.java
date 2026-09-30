import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        // Объявляем объект класса Scanner для ввода данных
        Scanner in = new Scanner(System.in);
        // Считывание 4 натуральных чисел a, b, c и х
        System.out.print("3 человека: ");
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        System.out.print("грузоподъёмность лифта: ");
        long x = in.nextLong();
        // Сравнение х c a, b и с
        if(x>=a || x>=b || x>=c)
            // Сравнение х с попарными суммами a, b и с
            if(x>=a+b || x>=b+c || x>=a+c)
                // Сравнение х с суммой а, b и с
                if(x>=a+b+c)
                    out.println(3);
                else
                    out.println(2);
            else
                out.println(1);
        else
            out.print(0);
    }
}
//break



