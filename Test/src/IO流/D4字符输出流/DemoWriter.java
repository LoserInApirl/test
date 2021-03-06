package IO流.D4字符输出流;

import java.io.FileWriter;
import java.io.IOException;

/*
java.io.Writer :字符输出流，是所有字符输出流的最顶层的父类，是一个抽象类
共性的成员方法：
    void write(int c)：写入单个字符
    void write(char[] cbuf) ：写入字符数组
    abstract void write(char[] cbuf,int off, int len):写入字符数组的某一部分，off：数组的开始索引，len:写的字符个数
    void write(String str) ：写入字符串
    void write(String str,int off,int len)  写入字符串的某一部分
    void flush()刷新该流的缓冲
    void close()关闭此流，但要先刷新他
 构造方法：
    FileWriter(File file)  根据给定的File对象构造一个FileWriter对象
    FileWriter(String fileName)  根据给定的文件名构造一个FileWriter对象
 参数：
        String fileName:文件的路径
        File file :是一个文件
      构造方法的作用：
        1.会创建一个FileWriter对象
        2.会根据构造方法中传递的文件/文件的路径，创建文件
        3.会把FileWriter对象指向创建好的文件
  字符输出流的使用步骤：
        1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
        2.使用FileWriter中的方法write,把数据写入到内存缓冲区中（字符转为字节的过程）
        3.使用FileWriter中的方法flush,把内存缓冲区中的数据，刷新到文件中
        4.释放资源（会把内存缓冲区中的数据刷新到文件中）
 */
public class DemoWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\WorkSpace\\Test\\src\\文件\\a.txt");

        //每次写一个字符
//        fw.write(97);
//        fw.flush();
//        fw.close();
        //======================================================================================
        //每次写多个字符
//        char[] chars ={'s','d','f','q'};
//        fw.write(chars);
//        fw.close();
        //======================================================================================
        //每次写字符数组的一部分
//        char[] chars ={'s','d','f','q'};
//        fw.write(chars,1,2);
//        fw.close();
        //======================================================================================
        //每次写一个字符串
//        String sr = "xiaofang";
//        fw.write(sr);
//        fw.close();
        //每次写一个字符串的一部分
//        String sr2 ="liuming";
//        fw.write(sr2,0,3);
//        fw.close();
        //-------------------------------------第二遍---------------------------------------------------
        char[] chars = {'a','s','q','w','6','7'};
        fw.write(chars);
        fw.close();
    }
}
