package IO流.D8使用Properties集合存遍历数据;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
可以使用Properties集合中的方法store，把集合中的临时数据持久化写入到硬盘中存储
void store​(OutputStream out, String comments)
void store​(Writer writer, String comments)
参数：
    OutputStream out:字节输出流，不能写入中文
    Writer writer:   字符输出流，可以写入中文
    String comments:注解，用来解释说明保存的文件是做什么用的,不能使用中文，会产生乱码，默认是unicode编码,一般用"",空字符串
使用步骤：
    1.创建Properties集合对象，添加数据
    2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
    3.使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
    4.释放资源
 */
public class Demo2Properties {

    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("key1","v1");
        prop.setProperty("key2","v2");
        prop.setProperty("key3","v3");
        try(FileOutputStream fos = new FileOutputStream("D:\\WorkSpace\\Test\\src\\文件\\a.txt")) {
            prop.store(fos, "key");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
