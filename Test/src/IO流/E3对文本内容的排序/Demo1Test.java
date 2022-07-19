package IO流.E3对文本内容的排序;

import java.io.*;
import java.util.HashMap;

/*
练习：对文本内容按照（1.2.3.）排序
分析：
    1.创建一个HashMap集合对象，可以：存储每行文本的序号；value：存储每行的文本
    2.创建字符缓冲输入流对象，
    3.创建字符缓冲输出流对象
    4.使用字符缓冲输入流中的方法readLine，逐行读取文本
    5.对读取到的文本进行切割，获取行中的序号和文本的内容
    6.把切割好的序号和文本的内容存储到HashMap集合中（key序号是有序的，会自动排序）
    7.遍历HashMap集合，获取每个键值对
    8.把每个键值对，拼接为一个文本行
    9.把拼接好的文本，使用字符缓冲输出流中的方法write,写入到文件中
    10.释放资源
 */
public class Demo1Test {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();
        BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\knight\\Desktop\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\knight\\Desktop\\b.txt"));
        String line;
        while((line = br.readLine())!=null){
            String[] ar = line.split("\\.");
            map.put(ar[0],ar[1]);

        }
        for(String key:map.keySet()){
            String value = map.get(key);
            line =key+"."+value;
            bw.write(line);
            bw.newLine();//换行
        }
        bw.close();
        br.close();
    }
}
