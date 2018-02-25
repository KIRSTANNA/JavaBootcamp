package ATestTask.FirstActivity;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Helper {

    //		System.out.println() result
    public static void printing( HashMap employeeMap ) {
        Employee temp;
        for (int i = 1; i < 10; i++) {
            temp = (Employee) employeeMap.get(i);
            String begin = "Person " + i;
            System.out.println(temp.getFirstName() + " " + temp.getSecondName() + " " +  String.format("%.2f", temp.getSalary()));
        }
    }
    public static void printing( ArrayList<Employee> employeeArr ) {
        Employee temp;
        for (int i = 0; i < 9; i++) {
            temp = employeeArr.get(i);
            String begin = "Person " + i;
            System.out.println(temp.getFirstName() + " " + temp.getSecondName() + " " +  String.format("%.2f", temp.getSalary()));
        }
    }
    //sort and this employees by salary (from min to max)
    // TIP - google bubble sort
    public void bubbleSort(ArrayList<Employee> arr) {

        boolean isSwapped = true;
        Employee temp;
        for (int i = arr.size() - 1; isSwapped; i--) {

            isSwapped = false;

            for (int j = 0; j < i; j++) {

                if (arr.get(j).getSalary() < arr.get(j + 1).getSalary()) {
                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set((j + 1), temp);
                    isSwapped = true;
                }
            }
        }
    }

    //Comparator for sorting the list by Salary
    public static Comparator EmpSalary = new Comparator<Employee>() {

        public int compare(Employee e1, Employee e2) {
            double salary1 = e1.getSalary();
            double salary2 = e2.getSalary();
            double diff = salary2 - salary1;
            if ((diff > 0) & (diff < 1)) return 1;
            if ((diff < 0) & (diff > -1))return -1;
            return (int)diff;
        }
    };

    // sorting by FirstName
    public static void sortingFirstName( ArrayList<Employee> employeeArr ) {
    employeeArr.sort(Comparator.comparing(Employee::getFirstName));
    }

    // sorting by SecondFirstName
    public static void sortingSecondName( ArrayList<Employee> employeeArr ) {
        employeeArr.sort(Comparator.comparing(Employee::getSecondName));
    }

    // Program checks if the string row includes numbers
    public Boolean StringWithoutNumbers(String s) {
        Boolean without = true;

        for (int i = 0; i < 10; i++) {
            without = !s.contains( String.valueOf(i) );
            if (!without) break;
        }
        return without;
    }

    //Recording personal info to the "my-file.txt" in the project's directory
    public void stringWriteSample(ArrayList<Employee> arr) throws IOException {
        //String text = "This is text to be saved in file";
        FileWriter writer = new FileWriter("my-file.txt");
        for(Employee e: arr) {
            writer.write(e.getFirstName() + " " + e.getSecondName() + " " +  String.format("%.2f", e.getSalary()) +" ;\n");
        }
        writer.close();
    }
}

