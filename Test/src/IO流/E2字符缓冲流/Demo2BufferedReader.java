package IO流.E2字符缓冲流;

import java.io.*;

/*
java.io.BufferedReader extends Reader
特有的成员方法
    String readLine()  读取一个文本行，读取一行数据
    行的终止符：通过下列字符之一即可认为某行为已终止：换行符（'\n'）,回车（'\r'）,或回车后直接换行（'\n\r'）
    返回值：包括该行内容的字符串，不包括任何行终止符，如果已达到流末尾，则返回null
    使用步骤：
    1.创建字符缓冲输入流
 */
public class Demo2BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader buffR = new BufferedReader(new FileReader("D:\\WorkSpace\\Test\\src\\文件\\a.txt"));
        String line;
        while ((line = buffR.readLine()) !=null) {
            System.out.println(line);
        }
        buffR.close();
    }
}
