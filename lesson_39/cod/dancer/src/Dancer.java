public abstract class Dancer {
    String name; // имя танцора
    int age; // его возраст
    String sex; // пол танцора

    public void dance() {
        System.out.println(toString() + "двигается под музыку");
    }

    public Dancer(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Танцор{" +
                "имя ='" + name + '\'' +
                ", возраст =" + age +
                ", пол ='" + sex + '\'' +
                '}';
    }
}
