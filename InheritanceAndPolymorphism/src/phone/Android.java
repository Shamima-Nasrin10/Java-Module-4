/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phone;


public class Android extends Mobile{
    private String playStore;
    private boolean touchable;

    public Android() {
    }

    public Android(String playStore, boolean touchable) {
        this.playStore = playStore;
        this.touchable = touchable;
    }

    public Android(String playStore, boolean touchable, boolean makeCall, String makeTextMessage, String camera, String multimedia) {
        super(makeCall, makeTextMessage, camera, multimedia);
        this.playStore = playStore;
        this.touchable = touchable;
    }

    public String getPlayStore() {
        return playStore;
    }

    public void setPlayStore(String playStore) {
        this.playStore = playStore;
    }

    public boolean isTouchable() {
        return touchable;
    }

    public void setTouchable(boolean touchable) {
        this.touchable = touchable;
    }

    @Override
    public String toString() {
        return "Android{" + "playStore=" + playStore + ", touchable=" + touchable + '}';
    }

    @Override
    public void printDetails() {
        super.printDetails(); 
        System.out.println("Has "+playStore+" "+touchable);
    }
    
}
