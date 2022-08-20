import java.util.Scanner; 

public class Assignment {
	
	
	public static void checkPalindrome() 
	{
		Scanner palindrome = new Scanner(System.in);
		int r,sum=0,temp;
	  	  System.out.println("Enter number to check palindrome");
	  	  int n = palindrome.nextInt() ;
	  	  temp=n;    
	  	  while(n>0){ 
	  	   r=n%10;   
	  	   sum=(sum*10)+r;
	  	   n=n/10;    
	  	  } 
	  	
	  	  if(temp==sum)    
	  	   System.out.println("palindrome number ");    
	  	  else    
	  	   System.out.println("not palindrome");  
	}

	public static void printStarPattern() {
		Scanner star = new Scanner(System.in);
		System.out.println("Enter the length of star pattern");
    	int rows = star.nextInt();
        for (int x = rows - 1; x >= 0; x--) {
 
            for (int y = 0; y <= x; y++){
 
                 System.out.print("*"+ " ");
            }
 
            System.out.println();
        }
		
	}
	public static void checkPrimeNumber() {
		Scanner prime = new Scanner(System.in);
		System.out.println("Enter the number to find out if it is Prime");
    	int num = prime.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
          if (num % i == 0) {
            flag = true;
            break;
          }
        }

        if (!flag)
          System.out.println(num + " is a prime number.");
        else
          System.out.println(num + " is not a prime number.");
	}
	
	public static void printFibonacciSeries() {
		Scanner fibonacci = new Scanner(System.in);
		int a = 0, b = 1;
        System.out.println("Enter the length of series");
        System.out.println();
        int  f_length = fibonacci.nextInt();
        System.out.print(a + " " + b);
       
        for (int i = 3; i <= f_length; i++) {
            int term = a + b;
            System.out.print(" " + term);
            a = b;
            b = term;
        }
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("1. Check for Palindrome Number");
        System.out.println("2. Star Pattern");
        System.out.println("3. Check if it is a Prime Number");
        System.out.println("4. Fibonacci Series");
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        while(choice!=0)
        {
        switch (choice) {
            case 1:
            	checkPalindrome()  ;
            break;
            
            case 2:
            	printStarPattern();
            break;
            
            case 3:
            	checkPrimeNumber();
            break;
              
            case 4:
                printFibonacciSeries();
            break;  

            default:
            System.out.println("Incorrect choice");
            break;
            
        }
        
         System.out.println("\n Enter your next choice or 0 to exit \n");
         choice = scanner.nextInt();
        }
	}

}
