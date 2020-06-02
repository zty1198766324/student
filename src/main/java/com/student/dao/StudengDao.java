package com.student.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class StudengDao {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("123");
    list.add("456");
    list.add("789");

//    for (int i = list.size()-1; i >= 0; i--) {
//      System.out.println(list.get(i));
//      list.remove(i);
//      System.out.println(list.size());
//      System.out.println("*********************");
//    }
    Iterator iterator =list.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
      iterator.remove();
      System.out.println(list.size());
    }
    System.out.println("size="+list.size());


    HashMap map = new HashMap();

  }
}
