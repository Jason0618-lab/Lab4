public class TriangleTest {
    public static void main(String[] args) {
        Triangle equilateral = new EquilateralTriangle(5.0);
        Triangle right = new RightTriangle(3.0, 4.0, 5.0);

        printTriangle("EquilateralTriangle", equilateral);
        System.out.println();
        printTriangle("RightTriangle", right);
    }

    private static void printTriangle(String name, Triangle triangle) {
        System.out.println(name);
        System.out.println("Longest side = " + triangle.getLongestSideLength());
        System.out.println("Perimeter = " + triangle.getPerimeter());
        System.out.println("Largest angle = " + triangle.getLargestAngle());
    }
}
