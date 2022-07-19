package demo1文件流;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class WriterDemo1 {
    public static void main(String[] args) throws Exception{
        //第一步，使用File类找到一个文件
        //File.separator相当于'\'
        File f = new File("C:"+ File.separator+ "Users"+File.separator+"knight"+File.separator+"Desktop"+File.separator+"test.txt");
        //第二步，通过子类实例化父类对象
        Writer out = null;
        out = new FileWriter(f);
        //第三步，进行写操作
        String str ="Hello ,你好，你好呀";
        out.write(str);
        //第四步，关闭输出流
        out.close();

    }
}
