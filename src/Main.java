import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("text: ");
        String text = scanner.nextLine();

        System.out.print("bool: ");
        boolean flag = Boolean.parseBoolean(scanner.nextLine().trim());

        System.out.print("int: ");
        int number = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("double: ");
        double d = Double.parseDouble(scanner.nextLine().trim());

        System.out.printf("%n %x | %.2f%n", number, d);
        System.out.printf(" %s | %b | %d | %f%n", text, flag, number, d);
        System.out.printf(" %+d | %.5s%n", number, text);
        System.out.printf(" %-20s | %B%n", text, flag);
        System.out.printf(" %08d | %,.2f%n", number, d);
        System.out.printf(" %o | %20s%n", number, text);

        System.out.println(MessageFormat.format(" {1,number,percent} | {2}", number, d, text));
        System.out.println(MessageFormat.format(" {0,number,integer} | {1,number,currency}", number, d));
        System.out.println(MessageFormat.format(" {3} | {2} | {0} | {1}", number, d, text, flag));

        System.out.println(" " + text + " | " + flag + " | " + number + " | " + d);

        scanner.close();
    }
}


