package question7_eksamensbevis;

import java.util.ArrayList;

public class Diploma {

    private String studentName;
    private ArrayList<Course> courses = new ArrayList<>();

    public Diploma(String studentName){
        this.studentName = studentName;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    @Override
    public String toString() {
        String output = "Name: "+studentName+"\n";
        for(Course c: courses){
            output+= c.toString()+"\n";
        }
        return output;
    }

    public int getAverage(){
        int sum = 0;
        for(Course c: courses){
            sum += c.getGrade();
        }
        int output = sum/courses.size();
        return output;
    }
}
