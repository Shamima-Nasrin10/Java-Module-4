
package thread;


public class MultiThread {
    public static void main(String[] args) {
        MultiThreadThing thread1=new MultiThreadThing();
        MultiThreadThing thread2=new MultiThreadThing();
        thread1.start();
        thread2.start();
    }

}

