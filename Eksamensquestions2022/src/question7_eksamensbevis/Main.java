package question7_eksamensbevis;

public class Main {
    public static void main(String[] args) {

        Course course1;
        Course course2;
        Course course3;
        //Course course4;

        try {
            course1 = new Course("Math", 7);
            course2 = new Course("Danish", 12);
            course3 = new Course("German", 10);
            //course4 = new Course("French", 14);

            Diploma diploma = new Diploma("Kenneth Rasmussen");
            diploma.addCourse(course1);
            diploma.addCourse(course2);
            diploma.addCourse(course3);
            //diploma.addCourse(course4);

            System.out.println(diploma.getAverage());
            System.out.println(diploma);
        }catch(Exception e){
            System.out.println("not valid grade");
        }



    }
}
