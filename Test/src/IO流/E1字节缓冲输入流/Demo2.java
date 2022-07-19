package IO流.E1字节缓冲输入流;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) throws FileNotFoundException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\knight\\Pictures\\Saved Pictures\\a.webp");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\knight\\Pictures\\Camera Roll\\a.webp");
        BufferedOutputStream buffOut = new BufferedOutputStream(fos);
        BufferedInputStream buffIn = new BufferedInputStream(fis);
        try(fis;fos;buffOut;buffIn){
            int len = 0;
            while ((len = buffIn.read())!=-1) {
                buffOut.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }
}
