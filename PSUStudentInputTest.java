import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class PSUStudentInputTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        try {
            System.out.print("Enter age: ");
            int age = input.nextInt();

            System.out.print("Enter GPA: ");
            double gpa = input.nextDouble();

            UndergradStudent undergrad = new UndergradStudent(age, gpa);
            GradStudent grad = new GradStudent(age, gpa);
            System.out.println("Both students were created successfully.");

            // Make both students eligible to reveal the entered GPA.
            undergrad.setCurrentYear(4);
            grad.setPassThesis(true);
            System.out.println("UndergradStudent: age = " + undergrad.getAge()
                    + ", GPA = " + undergrad.revealGrade());
            System.out.println("GradStudent: age = " + grad.getAge()
                    + ", GPA = " + grad.revealGrade());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: enter a whole number for age and a number for GPA.");
        } finally {
            input.close();
        }
    }
}
