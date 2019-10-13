import java.util.List;

public class Garden {

    // size of the garden
    private List<Integer> size;

    // array representing the flowers, walls, and grass
    private char[][] contents;

    public Garden(List<Integer> a) {
        this.contents = new char[a.get(0)][a.get(1)];
    }

}
