package demo;


import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.junit.Test;

public class demo1 {
    @Test
    public void test1() throws IllegalAccessException, InvocationTargetException {
        Person p = new Person();
        String name = "张三";
        String password = "sssaaa";
        String age = "22";
        String birthday = "1990-01-01";
        int b = 123;
        //beanutils只支持基础数据的类型转换，如果需要支持别的类型，使用下面的注册转换器
        ConvertUtils.register(new Converter() {

            @Override
            public Object convert(Class arg0, Object arg1) {
                if (arg1 == null) {
                    return null;
                }
                if (!(arg1 instanceof String)) {
                    throw new ConversionException("不是String类型");
                }
                String str = (String) arg1;
                if (str.trim().equals("")) {
                    return null;
                }
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    return df.parse(str);

                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }

            }
        }, Date.class);
        BeanUtils.setProperty(p, "name", name);
        BeanUtils.setProperty(p, "password", password);
        BeanUtils.setProperty(p, "age", age);
        BeanUtils.setProperty(p, "birthday", birthday);

        System.out.println(p.getName());
        System.out.println(p.getPassword());
        System.out.println(p.getAge());
        //System.out.println(p.getBirthday());
        //System.out.println("");
        Date date = p.getBirthday();
        System.out.println(date.toInstant());//java8新特性
    }

    @Test
    public void test2() throws IllegalAccessException, InvocationTargetException {
        Person p = new Person();
        String name = "张三";
        String password = "sssaaa";
        String age = "22";
        String birthday = "1990-02-01";
        int b = 123;
        //beanutils已经实现的转换器
        ConvertUtils.register(new DateLocaleConverter(), Date.class);

        BeanUtils.setProperty(p, "name", name);
        BeanUtils.setProperty(p, "password", password);
        BeanUtils.setProperty(p, "age", age);
        BeanUtils.setProperty(p, "birthday", birthday);

        System.out.println(p.getName());
        System.out.println(p.getPassword());
        System.out.println(p.getAge());
        System.out.println(p.getBirthday());
    }
    @Test
    public void test3() throws InvocationTargetException, IllegalAccessException {
        Map map=new HashMap();
        map.put("name","lisi");
        map.put("password","aassaa");
        map.put("age","22");
        map.put("birthday","1990-01-01");

        ConvertUtils.register(new DateLocaleConverter(), Date.class);
        Person bean = new Person();
        BeanUtils.populate(bean,map);      //用map中的值，填充bean的属性
        System.out.println(bean.getName());
        System.out.println(bean.getPassword());
        System.out.println(bean.getAge());
        System.out.println(bean.getBirthday());
    }
    @Test
    public void test4(){
        testInterface t= new testInterface() {
            @Override
            public void test1() {
                System.out.println("hahah");
            }
        };
        t.test1();
        testInterface ti=new testInterfaceImp();
        ti.test1();
    }
}
