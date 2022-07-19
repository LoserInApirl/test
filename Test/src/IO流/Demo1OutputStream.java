package IO流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo1OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\WorkSpace\\Test\\src\\文件\\a.txt");
//        byte[] bytes = {56,57,58,59};
//        fos.write(bytes);
//        fos.close();
        byte[] bytes = "你好".getBytes();
        System.out.println(Arrays.toString(bytes));
        fos.write(bytes);
        fos.close();
    }

}
