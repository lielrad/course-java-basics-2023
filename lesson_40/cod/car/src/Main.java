public class Main {
    public static void main(String[] args) {

        System.out.println("\nКласс Car с полями возраст и применение. Дочерние классы Bus, Track, Auto.\n");

        Auto auto1 = new Auto(3, "личный автомобиль", 60, "Suzuki", 5);
        System.out.println(auto1);
        auto1.go();
        auto1.speed_up();
        auto1.speed_down(); auto1.speed_down(); auto1.speed_down(); auto1.speed_down();
        auto1.stop();

        Bus bus1 = new Bus(8, "bus", 50, "Man", 59);
        System.out.println(bus1);
        bus1.go();
        bus1.stop();
        bus1.speed_up();
        bus1.speed_down();

        Track track1 = new Track(5, "track", 80, "Volvo", 18);
        System.out.println(track1);
        track1.go();
        track1.stop();
        track1.speed_up();
        track1.speed_down();

    }
}

//    Класс Car с полями возраст и применение.
//        Дочерние классы Bus, Track, Auto.
//        В классах создаем поля brand и поле, отображающее "загрузку": Bus -> seats, Track -> load_weight,
//        Auto -> capacity.
//        Создаем методы во всех классах:
//        - стоять stop
//        - ехать go
//        - ехать быстрее + 10 км/ч speed_up
//        - ехать медленнее - 10 км/ч speed_down
//        Цель: убедится, что один и тот же по названию метод работает с разными классами.