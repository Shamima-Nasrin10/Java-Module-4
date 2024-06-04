
package thread;

public class MainClasslThread {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            ThreadYouTube ob=new ThreadYouTube(i);
            ob.start();
            Thread ob2=new Thread(new MyThreadInterface());
            ob2.start();
        }
    }
}
