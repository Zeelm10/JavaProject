package controlStatement;

public class StudentGrade {

    public static void checkStudentGrade(int marks){
        if(marks>=0 && marks<=100){
            if(marks >=35 && marks<=50){
                System.out.println("Student achieved Grade D");
            }else if (marks>=51 && marks<=65){
                System.out.println("Student achieved Grade C");
            } else if (marks>=66 && marks<=75){
                System.out.println("Student achieved Grade B");
            } else if (marks>=76 && marks<=85) {
                System.out.println("Student achieved Grade A");
            }else {
                System.out.println("Student Fail");
            }

        }else {
            System.out.println("Marks is invalid");
        }
    }
    public static void main(String[] args) {
        checkStudentGrade(-110);
        checkStudentGrade(45);
        checkStudentGrade(75);
        checkStudentGrade(80);
    }
}
