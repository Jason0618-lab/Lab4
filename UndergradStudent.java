public class UndergradStudent extends PSUStudent {
    private int currentYear;

    public UndergradStudent(int age, double gpa) {
        super(age, gpa);
        currentYear = 1;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    @Override
    public double revealGrade() {
        if (currentYear >= 4) {
            return gpa;
        }
        return 0.0d;
    }
}
