//Program 3
//Your code here:
public class Program3
{
    public static void main(String[] args){
        //declare variables
        int length = 0;
        int width = 0;
        int area = 0;
        int perimeter = 0;
        
        //create my scanner
        Scanner numScanner = new Scanner(System.in);
        //Calc
        
        //Print results
        System.out.println(" Enter the length: ");
        length = numScanner.nextInt();
        
        System.out.println(" Enter the width: ");
        width = numScanner.nextInt();
        
        
        
        //Calc
        area = length * width;
        perimeter = length + length + width + width ;
        
        //Print results
        System.out.println("The length is: " + length);
        System.out.println(" The width is: " + width);
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
        
        
        
     }
}



//Paste console output below:
/*
 * Enter the length:
 * 143
 * Enter the Width:
 * 82
 * The length is: 143
 The width is: 82
The area is: 11726
The perimeter is: 450

 * 
