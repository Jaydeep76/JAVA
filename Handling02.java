import java.util.Scanner; 
class Handling02{
    public static void main(String[] args){
        System.out.print("program is started");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the divisor");
    int b=sc.nextInt();
    for(int a=1; a<=4 ;a++) 
    {
        try{
            int result =a/b;
            System.out.println(result);
        }
        catch(Exception e)
        {
            System.out.println("arithmetic exception");
            System.out.println("division by zero is not allowed");
        }
    }
    System.out.println("program is ended");
} 

}


