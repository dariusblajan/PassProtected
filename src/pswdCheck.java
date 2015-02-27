import java.io.*;
import java.util.Scanner;


public class pswdCheck {
    public static boolean isOnTheList(File f, String s) throws FileNotFoundException {
        Scanner scanner = new Scanner(f);       // procedura care cauta linia s in fisierul f
        String line =scanner.nextLine();  //read first line
        boolean found =false;
        while (!line.isEmpty()){        //while line is not empty
            if (line.equals(s)) {       //if line s is a match with the line previously read
                found=true;
                break;                  //stop searching
            }
            line =scanner.nextLine();   //reading next line in file f
        }
        return found;
    }
    public static void main(String[] args) throws IOException {
        String user;
        String password;
        Scanner read = new Scanner(System.in);
        File file = new File("userslist.txt");
        Scanner scanner = new Scanner(file);
        Runtime run = Runtime.getRuntime();
        boolean isCorrect = false;

        /*while (!line.isEmpty()) {
            String[] parsed = line.split(",");

        }
            line =scanner.nextLine();
        }*/
        do{
            System.out.print("user: ");
            user = read.nextLine();
            System.out.print("pass: ");
            password = read.nextLine();
            String aux=user+","+password; //creating a specific line format, spit by ",": user,password to be
            if (isOnTheList(file,aux)) {  //verified in file
                isCorrect=true;
                run.exec("notepad");
            }
        System.out.println("success.");
    }while (!isCorrect);
}
}
