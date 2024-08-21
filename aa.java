import java.util.Scanner;

    
class aa{ 
    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a num");
        int  num1=a.nextInt();
        System.out.println("enter a 2nd number");
        int num2=a.nextInt();
        float num3=(num1+num2)/2;
        System.out.println("the num3 "+num1+"and"+num2+"is \n"+num3);
      
    }
}