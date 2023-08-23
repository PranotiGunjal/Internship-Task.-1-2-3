import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String inputText = scanner.nextLine();
        scanner.close();
        
        System.out.println("You entered: " + inputText);
    }
}
