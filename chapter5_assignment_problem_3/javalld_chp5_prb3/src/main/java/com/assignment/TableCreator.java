package com.assignment; 

/**
 * Hello world!
 */
public final class TableCreator implements Runnable {
   private int num;

   public TableCreator(int num)
   {
    this.num = num;
   }

    private void MultiplicationTable()
    { 
        for(int i = 1 ; i <= 10; i++)
        { 
            System.out.println( num + " times " + i + " is " + (num * i));
        }
    }   
    @Override
    public void run()
    {
        MultiplicationTable();
    }
}
