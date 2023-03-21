public class TwistDancer extends Dancer {
    public TwistDancer(String name, int age, String sex) {
        super(name, age, sex);
    }

//    переопределяем метод Dance из родительского класса

    public void dance() {
        System.out.println(toString() + "двигается под музыку, при этом он активно скручивает свое тело, приседает и как бы тушит носком ноги окурок на");
    }


}
