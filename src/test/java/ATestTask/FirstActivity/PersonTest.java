package ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void checkPersonCreatedDefault(){
        Person person = new Person(1, "worker", "factory", 80.00);
        assertEquals("Unknown",person.getFirstName());
        assertEquals("Unknown",person.getSecondName());
        assertEquals(0,person.getAge());
    }

    @Test
    public void checkPersonCreatedParameterized(){
        Person person = new Person("Vasja","Pupkin",16);
        assertEquals("Vasja", person.getFirstName());
        assertEquals("Pupkin", person.getSecondName());
        assertEquals(16, person.getAge());
    }

    @Test
    public void checkPersonGetFirstName(){
        Person person = new Person("Vasja","Pupkin",16);
        String name = person.getFirstName();

        assertEquals("Vasja", name);
    }

    @Test
    public void checkPersonSetFirstName(){
        Person person = new Person("Vasja","Pupkin",16);
        person.setFirstName("Ivan");

        assertEquals("Ivan", person.getFirstName());
    }

    @Test
    public void checkPersonGetSecondName(){
        Person person = new Person("Vasja","Pupkin",16);
        String name = person.getSecondName();

        assertEquals("Pupkin", name);
    }

    @Test
    public void checkPersonSetSecondName(){
        Person person = new Person("Vasja","Pupkin",16);
        person.setSecondName("Ivanov");

        assertEquals("Ivanov", person.getSecondName());
    }


    @Test
    public void checkPersonGetAge(){
        Person person = new Person("Vasja","Pupkin",16);
        int age = person.getAge();

        assertEquals(16, age);
    }

    @Test
    public void checkPersonSetAge(){
        Person person = new Person("Vasja","Pupkin",16);
        person.setAge(17);

        assertEquals(17, person.getAge());
    }

    @Test
    public void checkPersonIntroduce(){
        Person person = new Person(1, "worker", "factory", 80.00);
        String introduceLine = person.introduce().trim();
        assertEquals("My name is Unknown Unknown and i am 0 years old",introduceLine);
    }


}