
package hackerrankproblem;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter payment value: ");
        double payment=scanner.nextDouble();
        scanner.close();
        
        NumberFormat u=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat i=NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat c=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: "+u.format(payment));
        System.out.println("US: "+i.format(payment));
        System.out.println("US: "+c.format(payment));
        System.out.println("US: "+f.format(payment));
        
    }
}
