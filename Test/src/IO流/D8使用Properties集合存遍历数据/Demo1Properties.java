package IO流.D8使用Properties集合存遍历数据;

import java.util.Properties;
import java.util.Set;

/*
java.util.Properties集合  extends Hashtable<k,v> implements Map<k,v>
Properties类：表示了一个持久的属性集，Properties可保存在流中或从流中加载。属性列表中每一个键
    及其对应值都是一个字符串
Properties集合是一个唯一和IO流相结合的集合
    可以使用Properties集合中的方法store,把集合中的临时数据，持久化写入到硬盘中存储
    可以使用Properties集合中的方法load,把集合中保存的文件（键值对），读取到集合中使用
属性列表中每个键和值都是一个字符串
    Properties集合是一个双列表，key和value默认都是字符串
 */
public class Demo1Properties {
    public static void main(String[] args) {
        show01();
    }

    /*
    使用Properties集合存储数据，遍历取出Properties集合中的数据
    Properties集合是一个双列集合，key和value默认都是字符串
    Properties集合有一些操作字符串的特有方法
        String getProperty​(String key) 使用此属性列表中指定的键搜索属性。（通过key找到value值）
        Object setProperty​(String key, String value) 调用 Hashtable方法 put 。
        Set<String> stringPropertyNames​()  返回集合中的所有的键的集合
     */
    private static void show01(){
        Properties prop = new Properties();
        prop.setProperty("key1","v1");
        prop.setProperty("key2","v2");
        prop.setProperty("key3","v3");
        Set<String> set = prop.stringPropertyNames();
        for (String key:set){
            //使用getProperty方法通过key获取value
            String value = prop.getProperty(key);
            System.out.println("key:"+key+",value:"+value);
        }
    }


}
