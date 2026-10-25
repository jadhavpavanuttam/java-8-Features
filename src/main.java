package com.pavan.lambda;

import java.lang.reflect.Array;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args)throws Exception,Error {
        Runnable myJavaClass=()->{
          for (int i=0;i<10;i++)
          {
              try {
                  Thread.sleep(2000);
                  System.out.print(" "+i);
              }
              catch (Exception e)
              {
                  e.printStackTrace();
              }
          }
        };
        myJavaClass.run();
//        Thread thread=new Thread(myJavaClass);
//        thread.start();
//        Runnable r1=()->{
//          for (int i=0;i<10;i++)
//              System.out.println(" pavan "+""+i);
//        };
//        r1.run();
//        Thread t=new Thread(r1);
//        t.start();
//        List<Integer> List=new ArrayList<>();
//        List.add(6);
//        List.add(5);
//        List.add(2);
//        List.add(12);
//        List.add(90);
//        Collections.sort(List,(a,b)->(b-a));   //we can use lambda expression here for custom sorting
//        System.out.print(List);

    }
}
