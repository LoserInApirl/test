package IO流.D7处理流中的异常;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
在jdk1.7之前使用try catch finally处理流中的异常
格式：
    try{
        可能会产生出异常的代码
     }catch(异常类变量  变量名){
        异常的处理逻辑
     }finally{
        一定会执行的代码
        资源释放
     }
 */
public class DemoTryCatch {
    /*
    变量在定义的时候可以没有值，但使用的时候必须有值
    fw = new FileWriter("D:\WorkSpace\Test\src\文件\a.txt",true);   如果执行失败，则fw没有值，fw.close()会报错
     */
    public static void main(String[] args) throws IOException {
//        FileWriter fw = null;
//        try {
//            fw = new FileWriter("D:\\WorkSpace\\Test\\src\\文件\\a.txt", true);
//            fw.write("hello world\r\n");
//            fw.write("buyaorangwoshiwang");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            //若创建对象失败了，fw的默认值就是null,null是不能调用方法的，会抛出NullPointerException,需要增加一个判断，不是null才把资源释放掉
//            if (fw != null) {
//                try {
//                    fw.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\WorkSpace\\Test\\src\\文件\\a.txt",true);
            byte[] bytes = {98,121,45,49,78};
            fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            fos.close();
        }

    }
}
