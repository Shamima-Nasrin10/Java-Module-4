
package taskthreaddemo30;


public class TaskThreadDemo30 {

    public static void main(String[] args) {
       
       Runnable printA=new PrintChar('a', 100);
        Runnable printnum= new PrintNum(10);
       
       Runnable printB=new PrintChar('b', 100);
       
      
       
       Thread thread1=new Thread(printA);
       Thread thread2=new Thread(printB);
       Thread thread3=new Thread(printnum);
       
       thread1.start();
       thread2.start();
       thread3.start();
    }
    
}
