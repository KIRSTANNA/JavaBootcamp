package ATestTask.FirstActivity;

//TODO Implement class Student

public class Student  extends Person {
    private int studId;
    private String schoolName;

    //TODO 1 create different constructors
    public Student(){
        super(1, "worker", "factory", 80.00);
        this.studId = 0;
        this.schoolName = "Unknown";
    }

    //Behavior - parameterized constructor
    public Student(String firstName, String secondName, int age,int studId, String schoolName){

        super(firstName,secondName,age);

        this.studId = studId;
        this.schoolName = schoolName;
    }

    public Student(Person person,int studId, String schoolName){

        super(person.getFirstName(),person.getSecondName(),person.getAge());

        this.studId = studId;
        this.schoolName = schoolName;
    }
    //TODO 2 add getters and setters

    // getter for String studId
    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    // getter for String jobTitle
    public String getSchoolName() {
        return schoolName;
    }

    // setter for String jobTitle
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    //TODO 3 Add method for introduce of person ->
    //TODO 3     "My name is <name> and i am <age> years old
    //TODO 3      I am study in university <schoolName>"

    public String introduce()
    {
        String outLine = super.introduce() + ". I am study in university "; // "My name is <name> and i am <age> years old am study in university
        outLine = outLine + this.schoolName ; //<jobTitle> in <company>

        System.out.println(outLine);
        return outLine;
    }

    public void printStudent() {
        //String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary
        System.out.println(" ****** Student info: \n");
        System.out.println(" First name: " + this.getFirstName());
        System.out.println(" Second name: " + this.getSecondName());
        System.out.println(" Age: " + this.getAge());
        System.out.println(" Identifier: " + this.studId);
        System.out.println(" School name: " + this.schoolName);
        System.out.println();
    }
}

