public abstract class PSUStudent {
    private int age;
    protected double gpa;

    public PSUStudent(int age, double gpa) {
        // Q2: validate the common attributes in the parent constructor.
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (Double.isNaN(gpa) || gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        this.age = age;
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double revealGrade();
}
