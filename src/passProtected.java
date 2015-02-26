import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.SerializationUtils;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class passProtected {
    private List<Item> list = new ArrayList<Item>();
    public static void main(String[] args){

    }
    private void readFromFile() {

        //warning, it is going to overwrite
        HandleKeyboard handleKeyboard = new HandleKeyboard().invokeYesNo();
        String yesNo = handleKeyboard.getYesNo();
        if (yesNo.equalsIgnoreCase("Y")) {
            FileInputStream fis = null;
            ByteArrayOutputStream out = null;
            try {
                File f = new File("userslist.txt");
                fis = new FileInputStream(f);
                out = new ByteArrayOutputStream();
                IOUtils.copy(fis, out);
                byte[] data = out.toByteArray();
                //m = SerializationUtils.deserialize(data);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                IOUtils.closeQuietly(out);
                IOUtils.closeQuietly(fis);
            }
            System.out.println("Read from file done!");
        }

    }


    private void writeToFile() {
        String content="";
        try {
            File file = new File("f.txt");          //assign file
            if(!file.exists()){                     //creating file if needed
                file.createNewFile();
            }
            //content=list.getUser()+","+list.getPassword();
            FileWriter fw = new FileWriter(file.getName(),true);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Write to file done!");


    }

}

class HandleKeyboard {
    private String user;
    private String password;

    private int option;

    private String yesNo;


    public String getUser() {return user; }

    public String getPassword() {return password;}

    public int getOption() {
        return option;
    }

    public String getYesNo() {
        return yesNo;
    }

    public HandleKeyboard invokeItem() {
        Scanner s = new Scanner(System.in);
        System.out.print("user: ");
        user = s.nextLine();
        System.out.print("Password: ");
        password = s.nextLine();
        return this;
    }

    public HandleKeyboard invokeItemUser() {
        Scanner s = new Scanner(System.in);
        System.out.print("user: ");
        user = s.nextLine();
        return this;
    }

    public HandleKeyboard invokeOption() {
        Scanner s = new Scanner(System.in);
        System.out.print("Option: ");
        option = s.nextInt();
        return this;
    }

    public HandleKeyboard invokeYesNo() {
        Scanner s = new Scanner(System.in);
        System.out.print("Are you sure you want to overwrite your current content in memory ? (Y,N): ");
        yesNo = s.nextLine();
        return this;
    }
}

