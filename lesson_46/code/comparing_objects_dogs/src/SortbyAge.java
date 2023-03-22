import java.util.Comparator;

public class SortbyAge implements Comparator <Dog> {

    public int compare (Dog a, Dog b) {
        return a.age - b.age;
    }
}
