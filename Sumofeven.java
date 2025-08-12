import mypackage.Message;
import java.util.Scanner; 
public class Sumofeven { 
 
    public static void main(String[] arg) 
    { 
        int[] arr=new int[10]; 
        int sum=0; 
        Scanner sc=new Scanner(System.in);
         Message obj=new Message();
         obj.display();

 
        for(int i=0;i<3;i++){ 
 
        System.out.println("enter no:"); 
        arr[i]=sc.nextInt(); 
    } 
    System.out.print("the array is"); 
    for(int i=0;i<3;i++) 
    {System.out.print(arr[i]+","); 
   }  
 for(int i=0;i<3;i++){ 
    if(arr[i]%2==0){ 
         sum=sum+arr[i]; 
    } 
 } 
   System.out.print("\nsum of even no: is : " +sum); 
   sc.close(); 
  
} 
}