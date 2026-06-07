import java.util.Scanner;

public class Pattern {
    static int n;

    public static void printA(int i) {
        int mid = n / 2;

        for (int j = 0; j < n; j++) {

            if ((i == 0 && j == mid)
                    || (i > 0 && i < mid && (j == mid - i || j == mid + i))
                    || (i == mid)
                    || (i > mid && (j == 0 || j == n - 1))) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void printB(int i) {
        int b = n / 2;

        for (int j = 0; j < n; j++) {
            if (j == 0 || i == 0 || i == b || i == n - 1
                    || (i > 0 && i < b && j == n - 1)
                    || (i > b && i < n - 1 && j == n - 1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void printC(int i) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || i == n - 1 || j == 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
     public static void printD(int i) {
       
            for (int j = 0; j < n; j++) {
                if (j == 0 ||((i == 0 || i == n - 1) && j < n - 1) ||(j == n - 1 && i > 0 && i < n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
        }
            public static void printE(int i) {
        int e = n / 2;
        
            for (int j = 0; j < n; j++) {
                if (j == 0 ||i == 0 ||i == e ||i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
           
        }
                public static void printF(int i) {
        int f = n / 2;
         
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 ||i == f) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
           
        }
                public static void printG(int i) { 
        int g = n / 2;
        
            for (int j = 0; j < n; j++) {
                if (i == 0 ||i == n - 1 ||j == 0 ||(i >= g && j == n - 1) ||(i == g && j >= g)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
        }
                public static void printH(int i) {
        int h = n / 2;
   
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == h) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
        }    
               public static void printI(int i) {        
        int a = n / 2;
       
            for (int j = 0; j < n; j++) {
                if (i == 0 ||i == n - 1 || j == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
           
        } 
                public static void printJ(int i) {      
        int c= n / 2;
   
            for (int j = 0; j < n; j++) {
                if (i == 0 ||j == c ||(i == n - 1 && j <= c) ||(j == 0 && i >= c)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
           
        }
              public static void printK(int i) {   
        int kl = n / 2;
       
            for (int j = 0; j < n; j++) {
                if (j == 0 ||i + j == kl ||i - j == kl) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
        }
               public static void printL(int i) {
        
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
           
        }

                public static void printM(int i) {
        
            for (int j = 0; j < n; j++) {
                if (j == 0 ||j == n - 1 ||(i == j && i <= n / 2) ||(i + j == n - 1 && i <= n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
           
        }
                public static void printN(int i) {
        
            for (int j = 0; j < n; j++) {
                if (j == 0 ||
                    j == n - 1 ||
                    i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
           
        }
                public static void printO(int i) {
       
            for (int j = 0; j < n; j++) {
                if (((i == 0 || i == n - 1) && j > 0 && j < n - 1) ||((j == 0 || j == n - 1) && i > 0 && i < n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
        }
               public static void printP(int i) {  
        int p= n / 2;
       
            for (int j = 0; j < n; j++) {
                if (j == 0 ||(i == 0 && j < n - 1) ||(i == p && j < n - 1) ||(j == n - 1 && i > 0 && i < p)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
        }
               public static void printQ(int i) {
   
            for (int j = 0; j < n; j++) {
                if (((i == 0 || i == n - 2) && j > 0 && j < n - 1) ||((j == 0 || j == n - 1) && i > 0 && i < n - 2) ||(i == j && i >= n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
        }

               public static void printR(int i) { 
        int r = n / 2;
    
            for (int j = 0; j < n; j++) {
                if (j == 0 ||(i == 0 && j < n - 1) ||(i == r && j < n - 1) ||(j == n - 1 && i > 0 && i < r) ||(i - j == r)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
        }

             public static void printS(int i) {
        int se = n / 2;
        
            for (int j = 0; j < n; j++) {
                if (i == 0 ||i == se ||i == n - 1 ||(j == 0 && i < se) ||(j == n - 1 && i > se)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
        }
                public static void printT(int i) {
        int t = n / 2;
     
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == t) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
          
        }
              public static void printU(int i) {
       
            for (int j = 0; j < n; j++) {
                if ((j == 0 || j == n - 1) && i < n - 1 || (i == n - 1 && j > 0 && j < n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
        }
               public static void printV(int i) {
       
            for (int j = 0; j < n; j++) {
                if ((j == i && i <= n / 2) ||(j == n - 1 - i && i <= n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
          
        }
                public static void printW(int i) {
        
            for (int j = 0; j < n; j++) {
                if (j == 0 ||j == n - 1 ||(i + j == n - 1 && i >= n / 2) ||(i == j && i >= n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
           
        }public static void printX(int i) {
                 
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
           
        }
               public static void printY(int i) {
        int y = n / 2;
        
            for (int j = 0; j < n; j++) {
                if ((i <= y && (j == i || j == n - 1 - i)) ||(i > y && j == y)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
           
        }
               public static void printZ(int i) {
     
            for (int j = 0; j < n; j++) {
                if (i == 0 ||i == n - 1 ||i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
           
        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  the word: ");
        String s = sc.next().toUpperCase();

        System.out.print("Enter the size: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) { 

            for (int k = 0; k < s.length(); k++) { 

                char ch = s.charAt(k);

                switch (ch) {
                    case 'A':
                        printA(i);
                        break;

                    case 'B':
                        printB(i);
                        break;

                    case 'C':
                        printC(i);
                        break;
                    
                    case 'D':
                        printD(i);
                        break;

                        case 'E':
                        printE(i);
                        break;

                         case 'F':
                        printF(i);
                        break;

                          case 'G':
                        printG(i);
                        break;

                          case 'H':
                        printH(i);
                        break;

                          case 'I':
                        printI(i);
                        break;

                          case 'J':
                        printJ(i);
                        break;

                          case 'K':
                        printK(i);
                        break;

                          case 'L':
                        printL(i);
                        break;

                          case 'M':
                        printM(i);
                        break;

                          case 'N':
                        printN(i);
                        break;
                        
                        case '0':
                        printO(i);
                        break;
                         
                          case 'P':
                        printP(i);
                        break;

                          case 'Q':
                        printQ(i);
                        break;

                          case 'R':
                        printR(i);
                        break;

                          case 'S':
                        printS(i);
                        break;

                          case 'T':
                        printT(i);
                        break;

                          case 'U':
                        printU(i);
                        break;

                          case 'V':
                        printV(i);
                        break;

                          case 'W':
                        printW(i);
                        break;

                          case 'X':
                        printX(i);
                        break;

                          case 'Y':
                        printY(i);
                        break;
              
                          case 'Z':
                        printZ(i);
                        break;

                        
                        
                         

                    default:
                        for (int j = 0; j < n; j++)
                            System.out.print(" ");
                }

                System.out.print("   "); 
            }

            System.out.println(); 
        }
       
    }
}