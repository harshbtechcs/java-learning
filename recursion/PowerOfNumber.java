// package recursion;

// import java.util.Scanner;

// public class PowerOfNumber {
//     static int pow(int p,int q){
//         if(q==0){
//             return 1;
//         }
//         return pow(p,q-1)*p;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int p= sc .nextInt();
//         int q= sc.nextInt();
//         int x =pow(p, q);
//         System.out.println(x);
//     }
    
// }

// // time complexity for this is O(q);
// // space complexity for this is O(q);

// // alternate approach to slve this for better time complexity


package recursion;

import java.util.Scanner;

    public class PowerOfNumber {
        static int pow(int p,int q){
            if(q==0){
                return 1;
            }
            if(q%2==0){
                return pow(p,q/2)*pow(p,q/2);
            }

            return p*pow(p,q/2)*pow(p, q/2);

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int p= sc.nextInt();
            int q = sc .nextInt();

            int x = pow(p, q);
            System.out.println(x);



        }





    }
// tc for now reduce to O(log q)
// sc for now reduce to O(log q)

