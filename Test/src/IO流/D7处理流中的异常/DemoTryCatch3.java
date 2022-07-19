package IO流.D7处理流中的异常;

import java.io.*;

/*
JDK9新特性
try的前边可以定义流对象
在try后边的（）中可以直接引入流对象的名称（变量名）
在try代码执行完毕后，流对象也可以释放掉，不用写finally
格式：
    A a = new A();
    B b= new B();
    try(a;b){
        可能会产生异常的代码
    }catch(异常类 变量名){
        异常的处理逻辑
    }
 */
public class DemoTryCatch3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\WorkSpace\\Test\\src\\文件\\a.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\knight\\Desktop\\a.txt");
        try(fis;fos){
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                //写入到目的地文件中
                fos.write(bytes,0,len);
            }
        }catch (IOException e){
            System.out.println(e);
        }
        //fos.write('1');  try/catch代码执行完毕后，会自动把流释放掉
    }
}
