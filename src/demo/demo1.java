package demo;


import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.junit.Test;

public class demo1{
    @Test
    public void test1() throws IllegalAccessException, InvocationTargetException {
        Person p= new Person();
        String name="张三";
        String password="sssaaa";
        String age ="22";
        String birthday="1990-01-01";
        int b=123;
        ConvertUtils.register(new Converter() {

            @Override
            public Object convert(Class arg0, Object arg1) {
                if(arg1==null) {
                    return null;
                }
                if(!(arg1 instanceof String)) {
                    throw new ConversionException("不是String类型");
                }
                String str= (String) arg1;
                if(str.trim().equals("")) {
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
        System.out.println(p.getBirthday());
    }


}
