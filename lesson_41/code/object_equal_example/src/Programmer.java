public class Programmer extends Human {
    public int experience; // открытое поле, отражает количество лет опыта программиста

    public Programmer(int age, boolean is_working, int experience) {
        super(age, is_working);
        this.experience = experience;
    }

}

