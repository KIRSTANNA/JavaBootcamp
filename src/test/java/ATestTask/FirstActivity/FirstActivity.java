package ATestTask.FirstActivity;


import ATestTask.ThirdActivity.CustomException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import static ATestTask.FirstActivity.Helper.printing;


public class FirstActivity {

    public static void main(String[] arg) throws Exception {

        Random r = new Random();

        HashMap employeeMap;
        // I uses HashMap here to show that I can use it only.
        // ArrayList<Employee> is enough really.

        employeeMap = new HashMap();
        ArrayList<Employee> emplArr1, emplArr;
        emplArr = new ArrayList<Employee>();
        emplArr1 = new ArrayList<Employee>();

        //TODO 1 Create collection of employee (more than 5)

        Employee curEmployee;
        double rand;
        for (int i = 1; i < 10; i++) {

            curEmployee = new Employee(i, "jobTitle" + i, "companyName" + i, r.nextDouble());
            curEmployee.setEmpId(i);

            curEmployee.setFirstName("Name" + i);

            curEmployee.setSecondName("SecondName" + i);
            curEmployee.setAge(20);

            rand = 1000.00 * r.nextDouble();
            curEmployee.setSalary(rand);

            employeeMap.put(i, curEmployee);
            emplArr.add(curEmployee);
            emplArr1.add(curEmployee);

        }
        //		System.out.println() result
        System.out.println("--------------- the original order ----------------------------------------");
        printing(employeeMap);

        //TODO 2 sort and this employees by salary (top salary to less)
        // TIP - google bubble sort
        Helper h = new Helper();
        try {
            h.stringWriteSample( emplArr ); //Recording personal info to the "my-file.txt" in the project's directory
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        emplArr.sort(h.EmpSalary);

        h.bubbleSort(emplArr1);

        System.out.println("--------------- ordered by salary with comparator( top salary to less ) ----");
        printing(emplArr);

        System.out.println("--------------- ordered by salary bubble sorting ( top salary to less ) ----");
        printing(emplArr1);

        System.out.println("--------------- person is changing his type ---------------------------------");
        //TODO 3 create instance of the Person ->
        Person person = new Person("Vasilij", "Terkin", 30);

        // Next 2 constructors were checked in the corresponding classes
        // than make them Student
        Student student = new Student(person, 1, "RTU");

        // than make them Employee
        Employee employee = new Employee(person, 1, "programmer", "Accenture", 200.00);

        //If the task means changeing from Student to Employee, then:
        Employee employee1 = new Employee((Person) student, 1, "programmer", "Accenture", 200.00);

        //		System.out.println() result
        person.introduce();
        student.introduce();
        employee.introduce();

        // Second variant:
        //student.printStudent();
        //employee.printEmployee();

        //TODO 4 Create method for total change employee information
        // for example some employee change his work
        employee.changeEmployee("Writer", "Redaction", 250.12);

        //TODO 8) Task for 1.5 point - when set firstName and secondName, check no numbers there. ->
        //setName("Ivan3") should throw the exception
        // I show the idea only, becouse have already named all people automatically  and I hope that  it's enough

        if (!h.StringWithoutNumbers("Ivan3")) throw (new CustomException().StringWithNumbers());

    }

}


	

