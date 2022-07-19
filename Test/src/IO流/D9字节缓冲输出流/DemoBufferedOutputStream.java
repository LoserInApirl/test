package IO流.D9字节缓冲输出流;

import java.io.*;

/*
java.io.BufferedOutputStream extends OutputStream
BufferedOutputStream:字节缓冲输出流
    继承自父类的成员方法：
        public void close()
        public void flush()
        public void write(byte[] b)
        public void write(byte[] b, int off,int len)
        public abstract void write(int b)
   构造方法：
        BufferedOutputStream​(OutputStream out) 创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
        BufferedOutputStream​(OutputStream out, int size) 创建一个新的缓冲输出流，以便以指定的缓冲区大小将数据写入指定的底层输出流。
        参数：
            OutputStream out:字节输出流
                我们可以传递FileOutputStream,缓冲流会给FileOutputStream增加一个缓冲区，提高FileOutputStream的写入效率
            int size :指定缓冲流内部缓冲区的大小，默认不指定
        使用步骤
            1.创建FileOutputStream对象，构造方法中绑定要输出的目的地
            2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream对象效率
            3.使用BufferedOutputStream对象中的方法write,把数据写入到内部的缓冲区
            4.使用BufferedOutputStream对象中的方法flush,把内部缓冲区中的数据，刷新到文件中
            5.释放资源（会先调用flush方法刷新数据，第4步可省略）

 */
public class DemoBufferedOutputStream {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("D:\\WorkSpace\\Test\\src\\文件\\a.txt");
        BufferedOutputStream buff = new BufferedOutputStream(fos);
        try (fos; buff) {
            byte[] bytes = {95, 45, 89};
            buff.write(bytes);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        FileOutputStream fos = new FileOutputStream("D:\\WorkSpace\\Test\\src\\文件\\a.txt");
//        BufferedOutputStream buff = new BufferedOutputStream(fos);
//        try (fos;buff){
//            byte[] bytes = {89,78,45,59,81};
//            buff.write(bytes);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
