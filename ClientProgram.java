public class ClientProgram {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "S001", 5000);
        Student student2 = new Student("Bob", "S002", 4500);

        Teacher teacher1 = new Teacher("Dr. Smith", "Mathematics", 70000);
        Teacher teacher2 = new Teacher("Dr. Johnson", "Physics", 75000);

        Department csDepartment = new Department("Computer Science");
        csDepartment.addComponent(teacher1);
        csDepartment.addComponent(student1);
        csDepartment.addComponent(student2);

        Department itDepartment = new Department("Information Technology");
        itDepartment.addComponent(teacher2);

        College engineeringCollege = new College("College of Engineering");
        engineeringCollege.addComponent(csDepartment);
        engineeringCollege.addComponent(itDepartment);

        System.out.println("Details of the College:");
        engineeringCollege.displayDetails();

        System.out.println("\nTotal number of students in the College: " + engineeringCollege.getNumberOfStudents());

        System.out.println("Total budget of the College: " + engineeringCollege.getBudget());
    }
}