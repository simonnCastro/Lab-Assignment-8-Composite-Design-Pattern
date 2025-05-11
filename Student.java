public class Student implements OrganizationalComponent {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public int getNumberOfStudents() {
        return 1;
    }

    @Override
    public void displayDetails() {
        System.out.println("    Student: " + name + ", ID: " + studentId + ", Tuition Fee: " + tuitionFee);
    }

    @Override
    public double getBudget() {
        return tuitionFee;
    }
}