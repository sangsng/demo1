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
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "aa");
        map.put(2, "bb");
        map.put(3, "cc");

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry entry : set
                ) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
        Iterator<Map.Entry<Integer, String>> it = set.iterator();

    }

    @Test
    public void test2() {
        int i = 1;
        int j = i++;
        if ((i == (++j)) && ((i++) == j)) {
            i += j;
        }
        System.out.println("i = " + i);
    }
}
