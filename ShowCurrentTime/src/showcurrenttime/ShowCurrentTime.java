/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package showcurrenttime;

/**
 *
 * @author Admin
 */
public class ShowCurrentTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Show current Time

//long currentTime=System.currentTimeMillis();
//        System.out.println(currentTime);
//        long seconds= currentTime/1000;
//        System.out.println(seconds);
//        long minutes=seconds/60;
//        System.out.println(minutes);
//        long hours=minutes/60;
//        System.out.println(hours);
//        long days=hours/24;
//        System.out.println(days);
//        long months=days/30;
//        System.out.println(months);
//        long year=days/365;
//        System.out.println(year);


//Practice from Book
long currentTime=System.currentTimeMillis();
        System.out.println(currentTime);
        long totalSeconds=currentTime/1000;
        long currentSeconds=totalSeconds%60;
        long totalMinutes=totalSeconds/60;
        long currentMinutes=totalMinutes%60;
        long totalHours=(totalMinutes/60)+6;
        long currentHours=totalHours%24;
        
        System.out.println("Current time is "+currentHours+":"+currentMinutes+":"+currentSeconds+"GMT");
 
    }

}
