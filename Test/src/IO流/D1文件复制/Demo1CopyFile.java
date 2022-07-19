package IO流.D1文件复制;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
D1文件复制：一读一写
    明确：
        数据源：a.txt
        将D盘的a.txt复制到C盘
    步骤：
        1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
        2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
        3，使用字节输入流对象中的方法read读取文件
        4.使用字节输出流中的方法write,把读取到的字节写入到目的地文件中
        5，释放资源
 */
public class Demo1CopyFile {
    public static void main(String[] args) throws IOException {
//        long s = System.currentTimeMillis();
//        FileInputStream fis = new FileInputStream("D:\\WorkSpace\\Test\\src\\文件\\a.txt");
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\knight\\Desktop\\a.txt");
//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len = fis.read(bytes)) != -1) {
//            //写入到目的地文件中
//            fos.write(bytes,0,len);
//        }
//        fos.close();
//        fis.close();
//        long e = System.currentTimeMillis();
//        System.out.println(e-s);

        //===================================================================================================
//        long s = System.currentTimeMillis();
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\knight\\Desktop\\a.txt");
//        FileInputStream fis = new FileInputStream("D:\\WorkSpace\\Test\\src\\文件\\a.txt");
//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len = fis.read(bytes))!=-1){
//            fos.write(bytes);
//        }
//        fos.close();
//        fis.close();
//        long e = System.currentTimeMillis();
//        System.out.println(e-s);

        //================================================================================================

        FileInputStream fis = new FileInputStream("D:\\WorkSpace\\Test\\src\\文件\\a.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\knight\\Desktop\\a.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            System.out.println(len);
            fos.write(bytes);
        }
        fos.close();
        fis.close();

    }


}
