import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = null; // сбрасываем\обнуляем буфер
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 1-ую сторону треугольника");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Введите 2-ую сторону треугольника");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Введите 3-ую сторону треугольника");
        int c = Integer.parseInt(br.readLine());

        br.close();


    }
}