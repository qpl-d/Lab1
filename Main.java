import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        int x = in.nextInt(), a = in.nextInt(), b = in.nextInt(), c = in.nextInt(); // ввод переменных

        boolean load = false; // флаг для отслеживания загруженных в лифт грузов

        int count = 0; //счетчик для количества грузов в лифте

        // проверка комбинации из трех грузов
        if (a + b + c <= x) {
                out.println("грузы A, B, C: " + (a + b + c));
            load = true;
            count = 3;
        }

        // проверка комбинаций из двух грузов
        else if (a + b <= x || a + c <= x || b + c <= x) {

            if (a + b <= x) {
                out.println("грузы A, B: " + (a + b));
            }
            if (a + c <= x) {
                out.println("грузы A, C: " + (a + c));
            }
            if (b + c <= x) {
                out.println("грузы B, C: " + (b + c));
            }
            load = true;
            count = 2;
        }

        // проверка на случай, если в лифт можно поместить только один груз
        else  {

            if (a <= x) {
                out.println("груз A: " + a);
                load = true;
                count = 1;
            }
            if (b <= x) {
                out.println("груз B: " + b);
                load = true;
                count = 1;
            }
            if (c <= x) {
                out.println("груз C: " + c);
                load = true;
                count = 1;
            }
        }

        // если ни одна комбинация не подходит
        if (!load) {
            out.println("В лифт нельзя поместить ни один груз");
        }

        out.println("Количетсво грузов в лифте: " + count);
    }
}
