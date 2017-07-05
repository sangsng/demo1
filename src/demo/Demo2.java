package demo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

        Iterator<String> it= list.iterator();
        while(it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }
        for (String a:list
             ) {
            System.out.println(a);
            
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
