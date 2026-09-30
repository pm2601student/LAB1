import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("3 человека: ");
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        System.out.print("грузоподъёмность лифта: ");
        long x = in.nextLong();
        if(x>=a || x>=b || x>=c)
            if(x>=a+b || x>=b+c || x>=a+c)
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



