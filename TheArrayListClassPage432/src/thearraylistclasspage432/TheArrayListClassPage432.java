
package thearraylistclasspage432;

import java.util.ArrayList;


public class TheArrayListClassPage432 {

    public static void main(String[] args) {
        ArrayList<String> cityList=new ArrayList<>();
        cityList.add("Dhaka");
        cityList.add("Chittagong");
        cityList.add("Khulna");
        cityList.add("Sylhet");
        cityList.add("Sandwip");
        cityList.add("London");
        
        System.out.println(cityList);
        System.out.println("List size?  "+cityList.size());
        System.out.println("Is list contains Miami? "+cityList.contains("Miami"));
        System.out.println("Location of Sandwip in the list: "+cityList.indexOf("Sandwip"));
        System.out.println("Is the list empty? "+cityList.isEmpty());
    }
    
}
