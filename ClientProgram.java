public class ClientProgram {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", "S001", 5000);
        Student student2 = new Student("Bob", "S002", 4500);
        Student student3 = new Student("Charlie", "S003", 4800);

        // Create teachers
        Teacher teacher1 = new Teacher("Dr. Smith", "Mathematics", 70000);
        Teacher teacher2 = new Teacher("Dr. Johnson", "Physics", 75000);

        // Create a department and add teachers and students
        Department csDepartment = new Department("Computer Science");
        csDepartment.addComponent(teacher1);
        csDepartment.addComponent(student1);
        csDepartment.addComponent(student2);

        // Create another department
        Department itDepartment = new Department("Information Technology");
        itDepartment.addComponent(teacher2);
        itDepartment.addComponent(student3);

        // Create a college and add departments
        College engineeringCollege = new College("College of Engineering");
        engineeringCollege.addComponent(csDepartment);
        engineeringCollege.addComponent(itDepartment);

        // Display details of the college
        System.out.println("Details of the College:");
        engineeringCollege.displayDetails();

        // Calculate and display the total number of students
        System.out.println("\nTotal number of students in the College: " + engineeringCollege.getNumberOfStudents());

        // Calculate and display the total budget of the college
        System.out.println("Total budget of the College: " + engineeringCollege.getBudget());
    }
}