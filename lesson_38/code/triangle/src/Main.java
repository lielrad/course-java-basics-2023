import java.util.Scanner;
import java.io.BufferedReader; // читает построчно в String
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null; //  обнуляем буфер
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 1-ую сторону треугольника");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Введите 2-ую сторону треугольника");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Введите 3-ую сторону треугольника");
        int c = Integer.parseInt(br.readLine());

        br.close();

        Triangle t1 = new Triangle( a, b, c);
    }
}