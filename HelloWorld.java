

/**
 * @author kjarosiute
 *
 */

public class HelloWorld {
	public static void main(String[] args) {

SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String data = dateFormat.format(date);
		System.out.println("HELLO UGLY WORLD!");
		System.out.println("The World is not ugly!");
		Input in = new Input();
		System.out.println("Iveskite savo varda:");
		System.out.println("Hello " + in.input() + " !");

 System.out.println("Siandienos data: " + data);	}
}
