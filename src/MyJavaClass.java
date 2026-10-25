package com.pavan.lambda;

    public class MyJavaClass implements Runnable{
        @Override
        public void run()
        {
            for (int i=0;i<10;i++)
            {
                System.out.print(" "+i);
            }
        }
    }


