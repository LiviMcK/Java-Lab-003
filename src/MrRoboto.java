// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
import java.util.Scanner;

public class
MrRoboto {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);


        String domo = "Domo arigato ";


        System.out.print("My name is Mr. Roboto, are you Kilroy? ");
        String name = scanner.nextLine();
        System.out.print(domo + name);

    }
}
