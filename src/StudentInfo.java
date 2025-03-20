import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentInfo {

  private List<Student> students = new ArrayList<>();

  public void addStudent(Student student){
        students.add(student);
    System.out.println("Student add successfully");
  }
  public void viewStudent(){
      if(students.isEmpty()){
          System.out.println("No Student Found");
          return;
      }
      else {
          for (Student stu : students) {
              System.out.println(stu);
          }
      }
  }
  public void searchStudent(int id){
      for(Student student : students){
          if (student.getId()==id){
              System.out.println("Student found " + student);
              return;
          }
      }
      System.out.println("Not Found!");
  }
  public void updateStudent(int id,String name,int age,String grade,String email){
      for (Student student : students){
          if(student.getId()==id){
              student.setName(name);
              student.setAge(age);
              student.setGrade(grade);
              student.setEmail(email);
              System.out.println("Updated Successfully");
              System.out.println(student);
          }
      }
      System.out.println("ID is not Found");
  }
  public void deleteStudent(int id){
      Iterator<Student> iterator = students.iterator();
      while (iterator.hasNext()){
          if (iterator.next().getId()==id){
              iterator.remove();
              System.out.println("Removed Successfully");
          }
      }
      System.out.println("Not Found");

  }
}
