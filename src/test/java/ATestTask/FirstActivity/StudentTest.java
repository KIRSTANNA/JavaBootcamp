package ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void checkStudentCreatedDefault(){
        //String firstName, String secondName, int age,int studId, String schoolName

        Student student = new Student();
        assertEquals("Unknown",student.getFirstName());
        assertEquals("Unknown",student.getSecondName());
        assertEquals(0,student.getStudId());
        assertEquals("Unknown",student.getSchoolName());
    }
    @Test
    public void checkStudentCreatedParameterized(){
        Student student = new Student("Vasja","Pupkin",16, 1, "RTU");
        assertEquals("Vasja", student.getFirstName());
        assertEquals("Pupkin", student.getSecondName());
        assertEquals(16, student.getAge());
        assertEquals(1,student.getStudId());
        assertEquals("RTU",student.getSchoolName());
    }
    @Test
    public void checkStudentCreatedParameterized1(){
        Student student = new Student(new Person("Vasja","Pupkin",16), 1, "RTU");
        assertEquals("Vasja", student.getFirstName());
        assertEquals("Pupkin", student.getSecondName());
        assertEquals(16, student.getAge());
        assertEquals(1,student.getStudId());
        assertEquals("RTU",student.getSchoolName());
    }
    @Test
    public void checkStudentGetSchoolName(){
        Student student = new Student(new Person("Vasja","Pupkin",16), 1, "RTU");
        String name = student.getSchoolName();

        assertEquals("RTU", name);
    }
    @Test
    public void checkStudentSchoolName(){
        Student student = new Student(new Person("Vasja","Pupkin",16), 1, "RTU");
        student.setSchoolName("University");

        assertEquals("University", student.getSchoolName());
    }
    @Test
    public void checkStudentGetStudId(){
        Student student = new Student(new Person("Vasja","Pupkin",16), 1, "RTU");
        int id = student.getStudId();

        assertEquals(1, id);
    }
    @Test
    public void checkStudentSetStudId(){
        Student student = new Student(new Person("Vasja","Pupkin",16), 1, "RTU");
        student.setStudId(2);

        assertEquals(2, student.getStudId());
    }
    @Test
    public void checkStudentIntroduce(){
        Student student = new Student();
        String introduceLine = student.introduce().trim();

        assertEquals("My name is Unknown Unknown and i am 0 years old. I am study in university Unknown",introduceLine);
    }



}