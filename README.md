## Отчет по лабораторной работе N1
#### Подготовил Супруненко Евгений
#### Группа ПМ-2601
#### Вариант - 23
### Содержание
```java
import java.util.Scanner;
public class guide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("3 человека: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.print("грузоподъёмность лифта: ");
        int x = in.nextInt();
        if(x>=a || x>=b || x>=c)
            if(x>=a+b || x>=b+c || x>=a+c)
                if(x>=a+b+c)
                    System.out.print("3");
                else
                    System.out.print("2");
            else
                System.out.print("1");
        else
            System.out.print("0");
    }
}
//break
```
