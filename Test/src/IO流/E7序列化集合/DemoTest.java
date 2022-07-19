package IO流.E7序列化集合;

import IO流.E6序列化和反序列化.Person;

import java.io.*;
import java.util.ArrayList;

/*
练习：
    序列化集合
        当我们想在文件中保存多个对象的时候
        可以把多个对象存储在一个集合中
        对集合进行序列化和反序列化
 分析：
    1.定义一个存储Person对象的ArrayList集合
    2.往ArrayListt集合中存储Person对象
    3.创建一个序列化流ObjectOutputStream对象
    4.使用ObjectOutputStream对象中的方法WriteObject,对集合进行序列化
    5.创建一个反序列化ObjectInputStream对象
    6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
    7.把Object类型的集合转换为ArrayList类型
    8.遍历ArrayList集合
    9.释放资源
 */
public class DemoTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list =new ArrayList<>();
        Person p1 = new Person("小明",16);
        Person p2 = new Person("小房",14);
        Person p3 = new Person("临近",84);
        Person p4 = new Person("刘瑞",45);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\WorkSpace\\Test\\src\\文件\\c.txt"));
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\WorkSpace\\Test\\src\\文件\\c.txt"));
        Object o =ois.readObject();
        ArrayList<Person> list2 = (ArrayList<Person>) o;
        for (Person p:list2){
            System.out.println(p);
        }
        ois.close();
        oos.close();
    }
}
