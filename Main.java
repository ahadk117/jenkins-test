public class Main {

    public static void main(String[] args) {
        System.out.println("This is a third Java program");
        System.out.println("This is a fourth Java program");
        System.out.println("This is a fifth Java program");
        System.out.println("This is a sixth Java program");
        Student student = new Student();
        student.studentName();  
    }
}

class Student {
    public void studentName() {
        System.out.println("This is a function print");
    }
}
