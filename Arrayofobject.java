class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Arrayofobject {
    public static void main(String[] args) {
        // Creating an array of 3 Student objects
        Student[] students = new Student[3];

        // Assigning objects to array
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 21);
        students[2] = new Student("Charlie", 22);

        // Display each student's details
        for (int i = 0; i < students.length; i++) {
            students[i].display();  // Accessing object using array index
        }
    }
}
