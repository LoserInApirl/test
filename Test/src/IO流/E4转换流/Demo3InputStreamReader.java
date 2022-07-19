package IO流.E4转换流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
InputStreamReader:读取字节并将其解码为字符
构造方法：
    InputStreamReader(InputStream in) 创建一个使用默认字符集的InputStreamReader
    InputStreamReader(InputStream in,String charsetName)  创建使用指定字符集的InputStreamReaader
    参数：
        InputStream in:字节输入流，用来读取文件中保存的字节
        String charsetName:指定的编码表名称，不区分大小写，可以是utf-8,gbk,不指定默认使用utf-8
    使用步骤：
        1。创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        2.使用InputStreamReader对象中的方法read读取文件
        3.释放资源
        注意：
            构造方法中指定的编码表名称要和文件的编码相同，否则会发生乱码

 */

public class Demo3InputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\WorkSpace\\Test\\src\\文件\\a.txt"),"utf-8");
        int len =0;
        while((len = isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();

    }
}
