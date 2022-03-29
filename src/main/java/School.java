public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Jane", "B", "1");
        student1.getName();
        System.out.println("Current grade is " + student1.getGrade());
        student1.upgrade();
        System.out.println("New grade is "+ student1.getGrade());
        student1.downgrade();
        System.out.println("New grade is "+ student1.getGrade());

        //throws exception when invalid grade and group are initialized
        //Student student2 = new Student("Bob", "Z", "1");
        //Student student3 = new Student("Paul", "A", "10");

    }
}
