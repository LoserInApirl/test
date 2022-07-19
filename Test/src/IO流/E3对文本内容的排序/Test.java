package IO流.E3对文本内容的排序;

public class Test {
    public static void main(String args[]) {
        String str2 = new String("www,runoob,com");
        System.out.println("转义字符返回值 :" );
        for (String retval: str2.split("\\.")){
            System.out.println(retval);
        }

    }
}
