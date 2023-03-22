import java.util.Comparator;

public class SortbyName implements Comparator<Dog> {

    public int compare (Dog a, Dog b) {
        return a.name.compareTo(b.name);
    }
}
