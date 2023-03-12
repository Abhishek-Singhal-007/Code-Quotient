static void fib_sequence(int n) {
      // Write your code here
      double a = 0;
      double b = 1;
      int i = 1;
      while(i <= n){
        if(i == 1)
          System.out.printf("%.0f",a);
        else if(i == 2)
          System.out.printf("%.0f",b);
        else{
          double c = a+b;
          System.out.printf("%.0f",c);
          a = b;
          b = c;
        }
        i++;
        System.out.println();
      }
    }
