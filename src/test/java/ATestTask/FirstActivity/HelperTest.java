package ATestTask.FirstActivity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static ATestTask.FirstActivity.Helper.*;
import static org.junit.Assert.*;

public class HelperTest {

    @Test
    public void checkBubleSorting(){

        Helper h = new Helper();
        Random r = new Random();
        ArrayList<Employee> emplArr = new ArrayList<Employee>();

        //TODO 1 Create collection of employee (more than 5)

        Employee curEmployee;
        double rand;
        for (int i = 1; i < 10; i++) {
        // filling the Employees array
            curEmployee = new Employee();
            curEmployee.setEmpId(i);

            curEmployee.setFirstName("Name" + i);

            rand = 1000.00 * r.nextDouble();
            curEmployee.setSalary(rand);

            emplArr.add(curEmployee);
        }

        h.bubbleSort(emplArr); // the sorting
        System.out.println("------------------------- checkBubleSorting() :");
        printing(emplArr);
        //h.stringWriteSample(emplArr); //Recording personal info to the "my-file.txt" in the project's directory
        assertTrue(emplArr.get(7).getSalary() > emplArr.get(8).getSalary());
        assertTrue(emplArr.get(4).getSalary() > emplArr.get(6).getSalary());
    }

    @Test
    public void checkComparatorSorting(){

        Helper h = new Helper();
        Random r = new Random();
        ArrayList<Employee> emplArr = new ArrayList<Employee>();

        //TODO 1 Create collection of employee (more than 5)

        Employee curEmployee;
        double rand;
        for (int i = 1; i < 10; i++) {
            // filling the Employees array
            curEmployee = new Employee();
            curEmployee.setEmpId(i);

            curEmployee.setFirstName("Name" + i);
            curEmployee.setSecondName("SecondName" + i);

            rand = 1000.00 * r.nextDouble();
            curEmployee.setSalary(rand);

            emplArr.add(curEmployee);
        }

        emplArr.sort(h.EmpSalary); // the sorting by Salary
        System.out.println("------------------------- checkComparatorSalarySorting() :");
        printing(emplArr);
        assertTrue(emplArr.get(7).getSalary() > emplArr.get(8).getSalary());
        assertTrue(emplArr.get(4).getSalary() > emplArr.get(6).getSalary());


        sortingFirstName(emplArr);
        System.out.println("------------------------- checkComparatorFirstNameSorting() :");
        printing(emplArr);
        assertEquals( "Name8" , emplArr.get(7).getFirstName());
        assertEquals( "Name7" , emplArr.get(6).getFirstName());


        sortingSecondName(emplArr);
        System.out.println("------------------------- checkComparatorSecondNameSorting() :");
        printing(emplArr);
        assertEquals( "SecondName8" , emplArr.get(7).getSecondName());
        assertEquals( "SecondName7" , emplArr.get(6).getSecondName());

    }

    @Test
    public void checkStringWithoutNumbers() {
        Helper h = new Helper();
        assertFalse(h.StringWithoutNumbers("Ivan3"));
        assertFalse(h.StringWithoutNumbers("hjk4hhuill6;"));
        assertTrue(h.StringWithoutNumbers("hjkhhuill;"));
    }


}
