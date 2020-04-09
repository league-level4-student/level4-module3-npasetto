package _01_introduction;

public class CustomException extends Exception{
public void terminate() {
	printStackTrace();
	System.exit(0);
}
}
