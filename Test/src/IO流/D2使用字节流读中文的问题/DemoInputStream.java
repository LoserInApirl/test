package IO流.D2使用字节流读中文的问题;

import java.io.FileInputStream;
import java.io.IOException;

/*
使用字节流读取中文文件
1个中文占：
    GBK:两个字节
    UTF-8:三个字节
 */
public class DemoInputStream {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\WorkSpace\\Test\\src\\文件\\a.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println("============================");
            System.out.println((char)len);
        }
        fis.close();
    }
}
