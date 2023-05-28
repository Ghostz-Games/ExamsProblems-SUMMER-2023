package question7_eksamensbevis;

public class Course {

    private String courseName;
    private int grade;

    public Course(String courseName, int grade) throws Exception {
        this.courseName = courseName;
        if(grade == -3 || grade == 00 || grade == 02 || grade == 4 || grade == 7 || grade == 10 || grade == 12){
            this.grade = grade;
        }else {
            throw new Exception();
        }
    }

    public int getGrade(){
        return grade;
    }

    @Override
    public String toString() {
        return "Coursename: "+courseName+" "+"Grade: "+grade;
    }
}
