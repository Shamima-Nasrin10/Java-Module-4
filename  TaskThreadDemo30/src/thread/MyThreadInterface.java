package thread;

public class MyThreadInterface implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread Interface object " + Thread.currentThread().getId());
        } catch (Exception e) {
        }
    }

}
