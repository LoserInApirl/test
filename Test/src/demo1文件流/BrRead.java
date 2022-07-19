package demo1文件流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrRead {  //从控制台读取多字符
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按‘q’键退出");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c !='q');

    }
}
