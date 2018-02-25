package ATestTask.ThirdActivity;
// Needs to be completed
//Extending from Exception class makes CustomException a Checked Exception
public class CustomException extends Exception{

	//1 - Override the toString method of Exception.
	//This message gets printed as soon as CustomException is thrown.
	public String toString(String s)
	{
		return "User " + s + " is not included to list of valid users !\n\n";
	}

	//You can also write more information about this exception in getMessage()
	//2 - Override getMessage()
	public String getMessage(String s) {
		//3 - Enter a message in it and return the same
			return "Input : Entrance data: '" + s +"' have caused the Custom Exception. ";
	}

	public CustomException StringWithNumbers() {
		CustomException exc = new CustomException();
		exc.getMessage( "This String include nuber(s). It is not allowed." );
		return exc;
	}
}

