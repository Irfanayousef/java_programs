import java.util.Scanner;
public class Student {

    String name;
    int rollNo;
    double mark1, mark2, mark3;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setData(int rollNo, double m1, double m2, double m3) {
        this.rollNo = rollNo;
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
    }

    public void display() {
        double total = mark1 + mark2 + mark3;
        double average = total / 3;

        System.out.println("Student Details");
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        s.setName(name);

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Mark 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter Mark 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter Mark 3: ");
        double m3 = sc.nextDouble();

        s.setData(rollNo, m1, m2, m3);

        s.display();

        sc.close();
    }
}
