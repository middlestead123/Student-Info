import java.util.Scanner;

/**
 * 
 */

/**
 * @author a.middlestead
 *
 */
public class StudentInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		String firstName;
		String lastNmae;
		int grade;
		int id;
		String login;
		double average;
		
		System.out.println("what is your first name?");
		firstName = userInput.next();
		System.out.println("what is your last name?");
		lastNmae = userInput.next();
		System.out.println("what is your grade?");
		grade =userInput.nextInt();
		System.out.println("what is your id?");
		id = userInput.nextInt();
		System.out.println("what is your login?");
		login = userInput.next();
		System.out.println("school average?");
		average = userInput.nextDouble();
		
		System.out.println( String.format("%-15s" + login, "Login:") );
		System.out.println( String.format("%-15s" + id, "id:") );
		System.out.println( String.format("%-15s" + lastNmae+", "+firstName, "name:") );
		System.out.println( String.format("%-15s" + average, "average:") );
		System.out.println( String.format("%-15s" + grade, "grade:") );
		
		userInput.close();
	}

}
