package IO流.E5转换文件编码;

import java.io.*;

/*
目的：将GBK编码的文本文件，转换为utf-8编码的文本文件

分析：
    1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称GBK
    2.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称utf-8
    3.使用InputStreamReader对象中的方法read读取文件
    4.使用OutputStreamWriter对象中的方法write,把读取的数据写入到文件中

 */
public class Demo1Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\knight\\Desktop\\a.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\knight\\Desktop\\b.txt"),"UTF-8");
        int len =0;
        while ((len=isr.read())!=-1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }

}
