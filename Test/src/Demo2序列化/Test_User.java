package Demo2序列化;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test_User {
    public static void main(String[] args) throws IOException {
        User user = new User("小明",18);
        User user1 = new User("小芳",49);
        User user2 = new User("小红",16);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/user.bat"));
        oos.writeObject(user);
        oos.writeObject(user1);
        oos.writeObject(user2);
        oos.flush();
        oos.close();
        System.out.println("游戏关闭，数据已保存");
    }
}
