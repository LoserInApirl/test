package Demo2序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Test_User2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的编号：");
        int id = sc.nextInt();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/5user.bat"));
        while (true) {
            try {
                System.out.println(ois.readObject());
            } catch (Exception e) {
                break;
            }
        }
    }
}
