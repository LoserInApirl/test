package IO流.E2字符缓冲流;

import java.io.*;

//java.io.BufferedWriter extends Writer
/*
特有的成员方法
    void newLine()  写入一个行分隔符，会根据不同的操作系统，获取不同的行分隔符

    换行：换行符号
    windows:\r\n
    linux:/n
    mac:/r


 */
public class Demo1BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter buffw = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Test\\src\\文件\\a.txt", true));
        for (int i = 0; i < 10; i++) {
            buffw.write("asdfadasda");
            buffw.newLine();
        }
        buffw.close();
    }

}
