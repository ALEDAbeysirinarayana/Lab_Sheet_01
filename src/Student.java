public class Student {
    String name;
    public Student(String name){
        this.name = name;
    }
    public static void main(String[] args){
        Student sam = new Student("Sam");
        Student john = new Student("john");
        System.out.println("First child name is: " + sam.name);
        System.out.println("Second student name is: " + john.name);

    }

}
