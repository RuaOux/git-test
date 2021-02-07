package Map;

import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map<k,V> 集合
    Map集合的特点：
           1. Map集合是一个双列集合，一个元素包含两个值（一个key,一个value）;
           2. Map集合中的元素，key和value的数据类型可以相同，也可以不同
           3. Map集合中的元素，key是不允许重复的，value是可以重复的
           4. Map集合中的元素，key和value是一一对应的
    java.util.HashMap<k,v>集合 implements Map<k,v>接口
       HashMap集合的特点：
            1. HashMap集合底层是哈希表：查询速度特别的快
                JDK1.8之前：数组+单向链表
                JDK1.8之后：数组+单向链表/红黑树（链表的长度超过8）：提高查询速度
            2. HashMap集合是一个无序的集合，存储元素和取出的元素顺序有可能不一致
    java.util.linkedHashMap<k,v>集合 extends HashMap<k,v>集合
       linkedHashMap的特点：
            1. linkedHashMap集合底层是哈希表+链表（保证迭代的顺序）
            2. linkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的。
 */
public class Demo01Map {
    public static void main(String[] args) {
      //  show01();
      //  show02();
        show03();
    }
/*
    public V get (Object key) 根据指定的键，在Map集合中获取对应的值
        返回值：
            key存在，返回对应的value值
            key不存在，返回null

    boolean containsKey (Object key) 判断集合中是否包含指定的键。
        包含返回true
        不包含返回false
 */
    private static void show03() {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("RuaOux",165);
        map.put("Brian",178);
        Integer v1 = map.get("RuaOux");
        System.out.println(v1);
        Integer nul1 = map.get("nul1");
        System.out.println(nul1);

        boolean ruaOux = map.containsKey("RuaOux");
        boolean ccc = map.containsKey("ccc");
        System.out.println(ruaOux);
        System.out.println(ccc);
    }

    /*
        public V remove (Object key); 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值
            返回值： v
                key 存在，v返回被删除的值
                key不存在，v返回null;
     */
    private static void show02() {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("RuaOux",165);
        map.put("Brian",178);
        Integer v1 = map.remove("赵丽颖");
        System.out.println(v1);  // 168
        System.out.println(map);  //  {Brian=178, RuaOux=165}
    }

    /*
     public V put (K key, V value)； 将制定的键与指定的值添加到Map集合中。
     返回值：v;
        存储键值对的时候，key不重复,返回值v是null
        存储键值对的时候,key重复，会使用新的value替换map中重复的value，返回被替换的value值
     */
    private static void show01() {
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("RuaOux", "Brian1");
        System.out.println(v1);  // null
        String v2 = map.put("RuaOux", "Brian2");
        System.out.println(v2);  // Brian1

        System.out.println(map);  // {RuaOux=Brian2}

        map.put("Brian","RuaOux");
        System.out.println(map);
    }
}
