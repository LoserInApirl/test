package demo1文件流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrReadLines {    //从控制台读取字符串
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text");
        System.out.println("Enter 'end' to quit");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (str.equals("end"));


    }
}
