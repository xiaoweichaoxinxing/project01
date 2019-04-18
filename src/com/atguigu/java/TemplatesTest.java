package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author xiaowei
 * @create 2019/4/9 - 17:56
 * 1. IDEA中代码模板所处的位置：settings - Editor - Live Templates / Postfix Completion
 * 2. 常用的模板
 */
public class TemplatesTest {


    //模板六：prsf  可生成private static final
    private static final Customer CUS = new Customer();
    //变形：psf
    public static final int NUM = 1;
    //变形：psfs
    public static final String NAT = "beijing";
    //变形：psfi
    public static final int NN = 2;



    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello");
        System.out.println();
        //变形：soutp  / soutm  / soutv  / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);


        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr = " + arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println("s = " + s);

        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);
        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");

        for (Object o : list) {
            System.out.println("o = " + o);
        }
        //变形：list.fori  或 list.forr
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list = " + list.get(i));
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("list = " + list.get(i));
        }


    }

    public void method(){

        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形：xxx.nn  / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
