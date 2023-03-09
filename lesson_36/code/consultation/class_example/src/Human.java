public class Human {
//  пол - sex
//  раса - race
//  возраст - age
//  рост - height
//  вес - weight
//

    String sex; // это поле отвечает за пол
    int age;
    double weight;
    double height;
    String race;

    public Human(String sex, int age, double weight, double height, String race) {
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.race = race;
    }
}
