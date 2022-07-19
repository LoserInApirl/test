package IO流.E6序列化和反序列化;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
java.io.ObjectOutputStream extends OutputStream
ObjectOutputStream:对象的序列化流
作用：把对象以流的方式写入到文件中保存
构造方法：
    ObjectOutputStream(OutputStream out) 创建写入指定 OutoutStream的  ObjectOutStream
    参数：
        OutoutStream out:字节输出流
    特有的成员方法
        void weiteObject(object obj) 将指定的对象写入ObjectOutputStream
   使用步骤：
        1.创建ObjectOutputStream对象，构造方法中传递字节输出流
        2.使用ObjectOutStream对象中的方法writeObject,把对象写入到文件中
        3.释放资源

序列化和反序列化的时候，会抛出NotSerializableException没有序列化异常
类通过实现 java.io.Serializable 接口以启用其序列化功能，未实现此接口的类将无法使其任何状态序列化或反序列化
serializable接口也叫标记型接口
    要进行序列化和反序列化的类必须实现Serianlizable接口，就会给类添加一个标记
    当我们进行序列化和反序列化的时候，就会检测类上是否有这个标记
        有：就可以序列化和反序列化
        没有：就会抛出NotSerializableExecption异常

 */
public class Demo1ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\WorkSpace\\Test\\src\\文件\\person.txt"));
        oos.writeObject(new Person("狗子",11));
        oos.close();
    }
}
