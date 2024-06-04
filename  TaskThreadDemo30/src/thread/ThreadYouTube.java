package thread;

public class ThreadYouTube extends Thread {

    public int id;

    public ThreadYouTube(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread class object "+id);
        } catch (Exception e) {
        }
    }
}
