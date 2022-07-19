package IO流.D5flush和close的区别;
/*
flush方法和close方法的区别
    flush:刷新缓冲区，对象可以继续使用
    close:先刷新缓冲区，然后通知系统释放资源，流对象不可以再被使用

 */

import java.io.FileWriter;
import java.io.IOException;

public class DemoCloseAndFlush {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\WorkSpace\\Test\\src\\文件\\a.txt");
        fw.write(97);
        fw.flush();
        //刷新之后，流可以继续使用
        fw.write(95);
        //close方法之后，流已经关闭了，
        fw.close();
    }
}
