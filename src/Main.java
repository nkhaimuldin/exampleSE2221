import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];
        for(int i=0; i<3; i++){
            students[i] = new Student(scanner.next(), scanner.next(), scanner.nextDouble());
        }
        for(int i=0; i<3; i++){
            System.out.println(students[i]);
        }

    }
}