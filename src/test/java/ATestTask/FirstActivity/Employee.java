package ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
        super(1, "worker", "factory", 80.00);
        this.empId = 0;
        this.jobTitle = "Unknown";
        this.companyName = "Unknown";
        this.salary = 0.00;
    }

    //Behavior - parameterized constructor
    public Employee(int empId, String jobTitle, String companyName, double salary){
        super(1, "worker", "factory", 80.00);
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    //Behavior - parameterized constructors
    public Employee(String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary){

        super(firstName,secondName,age);

        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public Employee(Person person, int empId, String jobTitle, String companyName, double salary){

        super(person.getFirstName(),person.getSecondName(),person.getAge());

        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }
    //TODO 2 add getters and setters

    // getter for String empId
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // getter for String jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    // setter for String jobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // getter for String jobTitle
    public String getCompanyName() {
        return companyName;
    }

    // setter for String jobTitle
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //TODO 3 Add method for introduce of person ->
    //TODO 3     "My name is <name> and i am <age> years old
    //TODO 3      I am work as <jobTitle> in <company>"

    public String introduce()
    {
        String outLine = super.introduce() + ". I am work as "; // "My name is <name> and i am <age> years old I am work as

        outLine = outLine + this.jobTitle + " in " + this.companyName ; //<jobTitle> in <company>

        System.out.println(outLine);
        return outLine;
    }

    public void printEmployee() {
       //String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary
        System.out.println(" ****** Employee info: \n");
        System.out.println(" First name: " + this.getFirstName());
        System.out.println(" Second name: " + this.getSecondName());
        System.out.println(" Age: " + this.getAge());
        System.out.println();
        System.out.println(" Identifier: " + this.empId);
        System.out.println(" Job title: " + this.jobTitle);
        System.out.println(" Company name: " + this.companyName);
        System.out.println(" Salary: "+ this.salary);
        System.out.println();
    }

    public void changeEmployee(String jobTitle, String companyName, double salary) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }
}