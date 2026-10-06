import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TriangleManager {
    private List<Triangle> triangles;

    public TriangleManager(boolean useArrayList) {
        if (useArrayList) {
            triangles = new ArrayList<Triangle>();
        } else {
            triangles = new LinkedList<Triangle>();
        }
    }

    public void addTriangle(Triangle t) {
        if (t == null) {
            throw new IllegalArgumentException("Triangle cannot be null");
        }
        triangles.add(t);
    }

    public Triangle findTriangleWithLargestPerimeter() {
        // The handout does not specify the empty-list case; return null.
        if (triangles.isEmpty()) {
            return null;
        }

        Triangle largest = triangles.get(0);
        for (Triangle triangle : triangles) {
            if (triangle.getPerimeter() > largest.getPerimeter()) {
                largest = triangle;
            }
        }
        return largest;
    }
}
