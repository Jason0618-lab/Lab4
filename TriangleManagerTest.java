public class TriangleManagerTest {
    public static void main(String[] args) {
        testManager(true, "ArrayList");
        System.out.println();
        testManager(false, "LinkedList");
    }

    private static void testManager(boolean useArrayList, String listName) {
        TriangleManager manager = new TriangleManager(useArrayList);
        System.out.println("Using " + listName);
        System.out.println("Empty list result = "
                + manager.findTriangleWithLargestPerimeter());

        Triangle t1 = new EquilateralTriangle(4.0);  // Perimeter: 12
        Triangle t2 = new RightTriangle(5.0, 12.0, 13.0); // Perimeter: 30
        Triangle t3 = new EquilateralTriangle(6.0);  // Perimeter: 18
        manager.addTriangle(t1);
        manager.addTriangle(t2);
        manager.addTriangle(t3);

        Triangle largest = manager.findTriangleWithLargestPerimeter();
        System.out.println("Largest triangle type = " + largest.getClass().getSimpleName());
        System.out.println("Largest perimeter = " + largest.getPerimeter());
        System.out.println("Longest side = " + largest.getLongestSideLength());
        System.out.println("Largest angle = " + largest.getLargestAngle());
        System.out.println("Returned the original t2 object = " + (largest == t2));

        // Both triangles have perimeter 30; returning either is allowed.
        Triangle tied = new EquilateralTriangle(10.0);
        manager.addTriangle(tied);
        Triangle tieResult = manager.findTriangleWithLargestPerimeter();
        System.out.println("Perimeter after adding a tie = " + tieResult.getPerimeter());
        System.out.println("Returned one of the tied objects = "
                + (tieResult == t2 || tieResult == tied));

        try {
            manager.addTriangle(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
