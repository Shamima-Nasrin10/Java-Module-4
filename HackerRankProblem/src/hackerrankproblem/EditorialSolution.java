package hackerrankproblem;

import java.util.*;

public class EditorialSolution {

    public static void main(String[] argh) {
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a=in.nextInt();
//            int b=in.nextInt();
//            int n=in.nextInt();
//            for(int j=0;j<n;j++){
//                a+=b;
//                if(j>0)
//                System.out.print(" ");
//                System.out.print(a);
//
//                b=b*2;
//            }
//            System.out.println("");
//        }
//        in.close();

//        Scanner scanner = new Scanner(System.in);
//        int line_num = 0;
//        while (line_num<3) {
//            System.out.println(++line_num + " " + scanner.nextLine());
//        }
//        scanner.close();
//        int B = scanner.nextInt();
//        int H = scanner.nextInt();
//        boolean flag = false;
//       
//            if (B > 0 && H > 0) {
//                flag = true;
//                if (flag) {
//                    int area = B * H;
//                    System.out.println("Area: "+area);
//                }
//            }else{
//                System.out.println("java.lang.Exception: Breadth and height must be positive");
//            }

try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below
    String s;
    s=String.valueOf(n);
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (Exception e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}
