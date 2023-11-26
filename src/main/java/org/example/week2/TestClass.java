package org.example.week2;

public class TestClass extends Thread{

    class Runner extends Thread{
        public void run(){
            var t =new Thread[5];
            for (int i=0;i<t.length;i++)
                System.out.println(t[i]);
        }
    }

    public static void main(String[] args) {
        var tc=new TestClass();
        new Thread(tc.new Runner()).start();
    }

}
