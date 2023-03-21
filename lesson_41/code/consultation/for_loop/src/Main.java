public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗаполняем массив в цикле\n");
        //Что на входе? - сколько и какие числа будем задумывать (int, 100)
        // Что на выходе? - массив случайных чисел
        // Ключевой алгоритм? - задумываем случайное число в интервале от 1 до 10
        // Нужно запустить цикл

        int[] hits = new int[100]; // hits - это имя массива

        for (int i = 0; i < hits.length; i++) {
            hits[i] = (int)(Math.random()*(10)+1);
        }

        for (int i = 0; i < hits.length; i++) {
            System.out.print(hits[i] + "-");
        }


    }
}