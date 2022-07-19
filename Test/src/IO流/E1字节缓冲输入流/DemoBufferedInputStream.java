package IO流.E1字节缓冲输入流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
java,io.bufferedInputStream extends InputStream
BufferedInputStream:字节缓冲输入流
继承自父类的成员方法
     int read()从输入流中读取数据的下一个字节
     int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储到缓冲区数组b中
     void close()
构造方法：
    BufferedInputStream​(InputStream in) 创建一个 BufferedInputStream并保存其参数，输入流 in供以后使用。
    BufferedInputStream​(InputStream in, int size) 创建具有指定缓冲区大小的 BufferedInputStream ，并保存其参数，输入流 in供以后使用。
使用步骤
    1.创建FileInputStream对象，构造方法中绑定要读取的数据源
    2，创建BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream对象的读取效率
    3，使用BufferedInputStream对象中的方法，读取文件
    4.。释放资源
 */
public class DemoBufferedInputStream {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\WorkSpace\\Test\\src\\文件\\a.txt");
        BufferedInputStream buff = new BufferedInputStream(fis);
        try(fis;buff){
            byte[] bytes = new byte[1024];
            int len =0;
            len = buff.read(bytes);
            System.out.println(len);
            System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
