package com.nacht.chapter02_lambda_expressions;

import cn.hutool.core.collection.CollUtil;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Nacht
 * Created on 2019/12/16
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = CollUtil.newArrayList("Google", "Baidu", "Tencent", "Yahoo", "Facebook");
        List<String> list2 = CollUtil.newArrayList("Google", "Baidu", "Tencent", "Yahoo", "Facebook");
        sortAndPrintListInJava7(list);
        sortAndPrintListInJava8(list2);
    }

    /**
     * do not use lambda expression
     * @param list
     */
    public static void sortAndPrintListInJava7(List<String> list){
        System.out.println("before sort:" + list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("after sort:" + list);
    }

    /**
     * use lambda expression
     * @param list
     */
    public static void sortAndPrintListInJava8(List<String> list){
        System.out.println("before sort:" + list);
        Collections.sort(list, (o1, o2)->o1.compareTo(o2));
        System.out.println("after sort:" + list);
    }
}
