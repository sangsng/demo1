package demo;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;


public class demo1 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person p=new Person();
        //BeanUtils.setCacheFast();
        String pu=BeanUtils.getProperty(p,"name");
        System.out.println(pu);
    }
}
