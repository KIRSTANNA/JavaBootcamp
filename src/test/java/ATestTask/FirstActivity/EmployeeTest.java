package ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeCreateProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an erroe message", "Test1", employee.getFirstName());
    }

    @Test
    public void checkEmployeeCreatedDefault() {
        Employee employee = new Employee();
        double salary = 0.00;
        assertEquals("Error in the FirstName field","Unknown", employee.getFirstName());
        assertEquals("Error in the SecondName field","Unknown", employee.getSecondName());
        assertEquals("Error in the Age field",0, employee.getAge());
        assertEquals("Error in the JobTitle field","Unknown", employee.getJobTitle());
        assertEquals("Error in the CompanyName field","Unknown", employee.getCompanyName());
        assertEquals("Error in the Salary field",salary, employee.getSalary(),2);
    }

    @Test
    public void checkEmployeeCreatedParameterized(){
        Employee employee = new Employee("Vasja","Pupkin",16,1,"worker","factory",80.00);
        assertEquals("Vasja", employee.getFirstName());
        assertEquals("Pupkin", employee.getSecondName());
        assertEquals(16, employee.getAge());
        assertEquals(1,employee.getEmpId());
        assertEquals("worker",employee.getJobTitle());
        assertEquals("factory",employee.getCompanyName());
    }
    @Test
    public void checkEmployeeCreatedParameterized1(){
        Employee employee = new Employee(1,"worker","factory",80.00);
        assertEquals("Unknown", employee.getFirstName());
        assertEquals("Unknown", employee.getSecondName());
        assertEquals(0, employee.getAge());
        assertEquals(1,employee.getEmpId());
        assertEquals("worker",employee.getJobTitle());
        assertEquals("factory",employee.getCompanyName());
    }
    @Test
    public void checkEmployeeCreatedParameterized2(){
        Employee employee = new Employee(new Person("Vasja","Pupkin",16),1,"worker","factory",80.00);
        assertEquals("Vasja", employee.getFirstName());
        assertEquals("Pupkin", employee.getSecondName());
        assertEquals(16, employee.getAge());
        assertEquals(1,employee.getEmpId());
        assertEquals("worker",employee.getJobTitle());
        assertEquals("factory",employee.getCompanyName());
    }
    @Test
    public void checkEmployeeGetEmpId(){
        Employee employee = new Employee(new Person("Vasja","Pupkin",16),1,"worker","factory",80.00);

        assertEquals(1,  employee.getEmpId());
    }
    @Test
    public void checkEmployeeEmpId() {
        Employee employee = new Employee(new Person("Vasja", "Pupkin", 16), 1, "worker", "factory", 80.00);
        employee.setEmpId(2);

        assertEquals(2,  employee.getEmpId());
    }

    @Test
    public void checkEmployeeGetSalary(){
        Employee employee = new Employee(new Person("Vasja","Pupkin",16),1,"worker","factory",80.00);

        assertEquals(80.00,  employee.getSalary(),2);
    }
    @Test
    public void checkEmployeeSalary() {
        Employee employee = new Employee(new Person("Vasja", "Pupkin", 16), 1, "worker", "factory", 80.00);
        employee.setSalary(82.9);

        assertEquals(82.9,  employee.getSalary(),2);
    }
    @Test
    public void checkEmployeeGetJobTitle(){
        Employee employee = new Employee(new Person("Vasja","Pupkin",16),1,"worker","factory",80.00);

        assertEquals("worker",  employee.getJobTitle());
    }
    @Test
    public void checkEmployeeJobTitle() {
        Employee employee = new Employee(new Person("Vasja", "Pupkin", 16), 1, "worker", "factory", 80.00);
        employee.setJobTitle("the best worker");

        assertEquals("the best worker",  employee.getJobTitle());
    }
    @Test
    public void checkEmployeeGetCompanyName(){
        Employee employee = new Employee(new Person("Vasja","Pupkin",16),1,"worker","factory",80.00);

        assertEquals("factory",  employee.getCompanyName());
    }
    @Test
    public void checkEmployeeCompanyName() {
        Employee employee = new Employee(new Person("Vasja", "Pupkin", 16), 1, "worker", "factory", 80.00);
        employee.setCompanyName("new factory");

        assertEquals("new factory",  employee.getCompanyName());
    }
    @Test
    public void checkEmployeeIntroduce(){
        Employee employee = new Employee();
       String introduceLine = employee.introduce().trim();

        assertEquals("My name is Unknown Unknown and i am 0 years old. I am work as Unknown in Unknown",introduceLine);
    }

    @Test
    public void checkEmployeeChange(){
        Employee employee = new Employee(new Person("Vasja","Pupkin",16),1,"worker","factory",80.00);
        employee.changeEmployee("doctor","hospital",190.00);

        assertEquals("doctor",employee.getJobTitle());
        assertEquals("hospital",employee.getCompanyName());
        assertEquals(190.00,employee.getSalary(),2);
    }
    }
