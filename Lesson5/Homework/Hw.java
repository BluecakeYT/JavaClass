public class Hw {
   public static void main(String[] args) {
     Student s = new Student("David", "2123 Fountain Street");
     System.out.println (s.getName());
     System.out.println (s.getAddress());
     s.setAddress("4323 Minecraft Hill");
     System.out.println (s.getAddress());
     System.out.println (s.toString());
     s.addCourseGrade("Math", 97);
     s.addCourseGrade("English", 94);
     s.addCourseGrade("Science", 95);
     s.addCourseGrade("Social Studies", 89);
     System.out.println(s.getAverageGrade());
     s.printGrades();
   }
}

class Student {
  String name;
  String address;
  int numCourses;
  String[] courses = new String[30];
  int[] grades = new int[30];
  int nextIndex = 0;
  public Student(String n, String a) {
    name = n;
    address = a;
  }
  public String getName() {
    return name;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String a) {
    address = a;
 }
  public String toString() {
    return name + " (" + address + ")";
  }
  public void addCourseGrade(String course, int grade) {
    courses[nextIndex] = course;
    grades[nextIndex] = grade;
    nextIndex++;
  }
  public void printGrades() {
    String gradeList = "";
    for (int i = 0; i < grades.length; i++) {
      if (courses[i] != null) {
      gradeList += " Course " + (i + 1) + ":" + grades[i];
      }
    }
    System.out.println(gradeList);
  }
  public double getAverageGrade() {
      int sum = 0;
      double finale = 0;
       for (int i = 0; i < grades.length; i++){
           sum += grades[i];
          finale = (double)sum/(double)nextIndex;
     }
     return finale;

  }
}
