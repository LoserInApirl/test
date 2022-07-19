package IO流.D7处理流中的异常;

import java.io.FileWriter;
import java.io.IOException;

/*
JDK7的新特性
在try的后面可以增加一个（），在括号中可以定义流对象
那么这个流对象的作用域就在try中有效
try中的代码执行完毕，会自动把流对象释放，不用写finally
格式：try(定义流对象;定义流对象;.....){
        可能会产生出异常的代码
     }catch(异常类变量  变量名){
        异常的处理逻辑
     }finally{
        一定会执行的代码
        资源释放
     }
 */
public class DemoTryCatch2 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("D:\\WorkSpace\\Test\\src\\文件\\a.txt", true)) {
            fw.write("hello world\r\n");
            fw.write("buyaorangwoshiwang");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


