class Student{
    String name;
    int age;
    int id;

    void studying(){
        System.out.println("Student is studying");
    }

    void reading(){
        System.out.println("Student is reading");
    }
}


public class Launch1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studying();
        s1.reading();
    }
}
