import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class pswdCheck {
    public static void main(String[] args) throws IOException {
        String user;
        String password;
        Scanner read = new Scanner(System.in);
        File file = new File("users.txt");
        Scanner scanner = new Scanner(file);
        String line =scanner.nextLine();
        System.out.println(line);
        String[] parsed=line.split(",");
        do{
            System.out.println("user: ");
            user = read.nextLine();
            System.out.printf("pass: ");
            password = read.nextLine();
        } while (!parsed[0].equals(user) & !parsed[1].equals(password));
        System.out.println("success.");
    }
}
