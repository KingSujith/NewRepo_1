/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_one;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author 5031263
 */
public class Test {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        
        List<String> list = new ArrayList<String>();
        list.add("sujit");
        list.add("Suresh");
        Sujith s = new Sujith("sujith", list);
        
        System.out.println("list 1 : " +list.toString());
        
        list.add("Kumar");
        
        System.out.println("list 2 : " +list.toString());
        

        SureshInterface addinterface = (x, y) -> (x + y);

        System.out.println("Sum : " + addinterface.sum(a, b));
        addinterface.demo();
        addinterface.demo1();
        
        SureshInterface.s_demo1();
        SureshInterface.s_demo2();
        
        
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("1","Sujith");
        map.put("2","Sures");
        map.put("1","123");
        
        System.out.println("Sum : "+map);
    }

}


final class Sujith {
    
    final String str;
    final List<String> list;

    public List<String> getList() {
        return list;
    }

    public String getStr() {
        return str;
    }

    public Sujith(String str, List<String> list) {
        this.str = str;
        List<String> li = getList();
        this.list = li;
        
    }
 
}

//@FunctionalInterface
//abstract interface addInterface {
//
//    abstract int sum(int a, int b);
//    
//    default void demo() {
//        System.out.println("Default Method");
//    }
//
//    default void demo1() {
//        System.out.println("Default Method One");
//    }
//    
//    public static void s_demo1() {
//      System.out.println("s_demo -> 1");
//   }
//    
//    public static void s_demo2() {
//      System.out.println("s_demo -> 2");
//   }
//}
