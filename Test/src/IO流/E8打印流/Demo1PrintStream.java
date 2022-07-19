package IO流.E8打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
java.io.PrintStream:打印流
    PrintStream  为其他输出流添加了功能，使他们能够方便打印各种数据表示形式
PrintStream特点：
    1.只负责数据的输出，不负责数据的读取
    2.与其他输出流不同，PrintStream永远不会抛出IOException
    3.有特有的方法，print,println
        void print(任意类型的值)
        void println(任意类型的值并换行)
  构造方法：
    PrintStream(File file) 输出的目的地是一个文件
    PrintStream(OutputStream out) :输出目的地是一个字节输出流
    printStream(String fileName) 输出的目的地是一个文件路径
 PrintStream extends OutputStream
 继承自父类的成员方法
    close,flush,write
 注意：
    如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表   97->a
    如果使用自己特有的方法print/println方法写数据，写的数据原样输出   97->97
 */
public class Demo1PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\WorkSpace\\Test\\src\\文件\\b.txt");
        ps.write(97);
        ps.print(97);
        ps.println(8.3);
        ps.println(4.23654);
        ps.close();
    }
}
