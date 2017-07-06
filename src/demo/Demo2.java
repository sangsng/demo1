package demo;

import org.junit.Test;

import javax.swing.*;
import java.util.*;

/**
 * Created by HR on 2017/7/5.
 * 泛型
 */
public class Demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        for (String a : list
                ) {
            System.out.println(a);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void test1() {
        // HashMap是没有顺序的，而且读取的时候也不一定按照你存的顺序输出，它按照哈希值存储的
        //LinkedHashMap有序，输出时保持数据存入时的顺序
        Map<Integer, String> map = new LinkedHashMap<Integer,String>();
        map.put(2, "bb");
        map.put(1, "aa");

        map.put(3, "cc");
        map.put(4, "dd");
        map.put(5, "ee");

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry entry : set
                ) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> st=it.next();
            System.out.println(st.getKey() + " = " + st.getValue());
        }

    }

    @Test
    public void test2() {
        int i = 1;
        int j = i++;
        //i++是在语句运行后进行+=计算，++i是先允许+=计算其他语句。
        if ((i == (++j)) && ((i++) == j)) {
            i += j;
        }
        System.out.println("i = " + i);
    }
}
