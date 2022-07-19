package IO流.D6字符输出流的续写和换行;

import java.io.FileWriter;
import java.io.IOException;

/*
续写和换行
FileWriter(String fileName,boolean append)
FileWriter(File file,boolean append)
参数：
    boolean append:续写开关， true：不会创建新的文件来覆盖原文件
                              false:默认为false
换行：换行符
    windows：\r\n
    linux:/n
    mac:/r
 */
public class DemoWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\WorkSpace\\Test\\src\\文件\\a.txt", true);
        String sr ="xiaozhu";
        fw.write("\r\n");
        fw.write(sr);
        fw.close();
    }
}
