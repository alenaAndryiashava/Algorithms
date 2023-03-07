import java.util.ArrayList;
import java.util.List;

public class TrianglePaskal {
    private static List<List<Integer>> paskal(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) {
            return triangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRaw = triangle.get(i - 1);
            List<Integer> raw = new ArrayList<>();

            raw.add(1);

            for (int j = 1; j < i; j++) {
                raw.add(prevRaw.get(j - 1) + prevRaw.get(j));

            }
            raw.add(1);
            triangle.add(raw);

        }
        return triangle;
    }



    public static void main(String[] args) {
        System.out.println(paskal(5));
    }
}
