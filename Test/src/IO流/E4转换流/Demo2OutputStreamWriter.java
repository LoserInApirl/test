package IO流.E4转换流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
java.io.outputStreamWriter extends Writer
OutputStreamWriter:是字符流通向字节流的桥梁，可使用指定的charset将要写入流中的字符编码成字节，

构造方法
    outputStreamWriter(OutputStream out)创建使用默认字符编码，OutputStreamWriter
    OutputStreamWriter(OutputStream out,String charsetName)   创建使用指定字符集的OutputStreamWriter
    参数：
        OutoutStream out:字节输出流，可以用来写转换之后的字节到文件中
        String charsetName:指定的编码表名称，不区分大小写，可以是utf-8,gbk,不指定默认使用utf-8
   使用步骤
        1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        2.使用OutputStreamWriter对象中的方法write,把字符转换为字节存储缓冲区中（编码）
        3.使用OutputStreamWriter对象中的方法flush,把内存缓冲区中的字符刷新到文件中（使用字节流写字节的过程）
        4.释放资源
 */
public class Demo2OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter opw = new OutputStreamWriter(new FileOutputStream("D:\\WorkSpace\\Test\\src\\文件\\a.txt"),"utf-8");
        opw.write("你好");
        opw.flush();
        opw.close();

    }
}
