public class PSUStudentTest {
    public static void main(String[] args) {
        PSUStudent p1 = new UndergradStudent(19, 1.32);
        System.out.println(p1.getAge());
        System.out.println(p1.revealGrade());
        // This subclass-only method requires a downcast.
        ((UndergradStudent) p1).setCurrentYear(4);
        System.out.println(p1.revealGrade());

        PSUStudent p2 = new GradStudent(25, 2.0);
        System.out.println(p2.getAge());
        System.out.println(p2.revealGrade());
        // p2 refers to a GradStudent, so this cast is safe.
        ((GradStudent) p2).setPassThesis(true);
        System.out.println(p2.revealGrade());
    }
}
