package ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        try {
            ta.validateUser( "Ivan" );
        }
        catch (CustomException custExc) {
            System.out.println("");
            System.out.println("--- main(String[] args) ----------------------------");
            System.out.println(custExc.getMessage("Ivan" ));
            System.out.println(custExc.toString( "Ivan" ));
        }
        catch (Exception custExc) {
            System.out.println("");
            System.out.println("--- main(String[] args) ----------------------------");
            System.out.println("Unchecked exception: " + custExc.getMessage());
        }
        finally {
            ta.catchExeption();
        }

    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Boolean ecxCacth = false;
        for (int i = 0; i <= 10; i++) {

                try {
                    System.out.println(arr[i]);
                }
                catch (ArrayIndexOutOfBoundsException ex)
                {
                    System.out.println("");
                    System.out.println("--- catchExeption() --------------------------------");
                    System.out.println("Your cod fails with exception: " + ex.getMessage());
                    ecxCacth = true;
                }
                finally {
                    //If next row is uncommented, then "This should get printed even if there is an exception" will appear only once
                    //if ((i == 10) || (ecxCacth))

                    System.out.println("This should get printed even if there is an exception");
                }
            }
        }


    void validateUser(String name) throws CustomException {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        int flag = 0;
        //TODO if name in a list -> set flag=1

        for ( String user : validUsers ) {
            if ( user == name) {
                flag = 1;
                break;
            }
        }
        // if at the end flag=0 -> throw the exeption
        if ( flag == 0) {
            CustomException customException = new CustomException();
            throw(customException);
        }
    }

    void catchMe(int num1, int num2)
    {
        //TODO Catch exeption
        try {
            int result = num1 / num2;
            System.out.println( "The result is :" + result );
        }
        catch (Exception ex){

        }
        finally {
            //TODO prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");
        }

    }
}

