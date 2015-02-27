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
        File file = new File("userslist.txt");
        Scanner scanner = new Scanner(file);
        String line =scanner.nextLine();
        //System.out.println(line);
        String[] parsed=line.split(",");
        boolean isCorrect=false;
        Runtime run = Runtime.getRuntime();
        do{
            System.out.print("user: ");
            user = read.nextLine();
            System.out.print("pass: ");
            password = read.nextLine();
            if (parsed[0].equals(user) && parsed[1].equals(password)) {
                isCorrect=true;
                run.exec("notepad");
            }
        } while (!isCorrect);
        System.out.println("success.");
    }
}
