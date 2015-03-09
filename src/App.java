/**
 * Created by jc299358 on 9/03/15.
 * Text viewer App - prints the contents of a string to the console
 */
public class App {
    public static void main(String[] args){
        String text = "This is a simple test\nOne Two Three\n Hello world!";
        for (int i = 0; i < text.length(); ++i) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}
