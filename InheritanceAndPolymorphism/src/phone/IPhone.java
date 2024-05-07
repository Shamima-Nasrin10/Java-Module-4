/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phone;


public class IPhone extends Mobile{
    private String appStore;

    public IPhone() {
    }

    public IPhone(String appStore) {
        this.appStore = appStore;
    }

    public IPhone(String appStore, boolean makeCall, String makeTextMessage, String camera, String multimedia) {
        super(makeCall, makeTextMessage, camera, multimedia);
        this.appStore = appStore;
    }

    public String getAppStore() {
        return appStore;
    }

    public void setAppStore(String appStore) {
        this.appStore = appStore;
    }

    @Override
    public String toString() {
        return "IPhone{" + "appStore=" + appStore + '}';
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Has "+appStore);
    }

}
