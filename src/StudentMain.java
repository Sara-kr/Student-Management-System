import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        int id=1;
        boolean check = true;
        while (check){
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("User Choice: ");
            int userChoice = sc.nextInt();
            sc.nextLine();
            switch (userChoice){
                case 1 :
                    System.out.println("Enter the name : ");
                    String name = sc.nextLine();

                    System.out.println("Enter the Age");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Grade");
                    String grade = sc.nextLine();

                    System.out.println("Enter the E-Mail");
                    String email = sc.nextLine();
                   studentInfo.addStudent(new Student(id++,name,age,grade,email));
                   break;
                case 2:
                    studentInfo.viewStudent();
                    break;
                case 3:
                    System.out.println("Enter the ID to Search");
                    int Id = sc.nextInt();
                    studentInfo.searchStudent(Id);
                    break;
                case 4:
                    System.out.println("Enter the ID to update");
                    int newId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the New Name");
                    String newName = sc.nextLine();
                    System.out.println("Enter the New Age");
                    int newAge = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the New Grade ");
                    String newGrade = sc.nextLine();
                    System.out.println("Enter the E-Mail");
                    String newMail = sc.nextLine();

                    studentInfo.updateStudent(newId,newName,newAge,newGrade,newMail);
                    break;
                case 5:
                    System.out.println("Enter the ID to Delete");
                    int delId=sc.nextInt();
                    studentInfo.deleteStudent(delId);
                    break;
                case 6:
                    System.out.println("Exiting.....");
                    check=false;
                    break;

                default:
                    System.out.println("Invalid ! Try Again");
            }
        }
    }
}