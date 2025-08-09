import java.util.Scanner; 
class Largeandsmall { 
 
    public static void main(String[] arg) 
    { 
         
        Scanner sc=new Scanner(System.in); 
         
 
        System.out.println("enter no:of elements"); 
        int n=sc.nextInt(); 
        int []arr=new int[n]; 
     
    System.out.print("Enter the array is\n"); 
    for(int i=0;i<n;i++) 
    { 
        arr[i]=sc.nextInt(); 
   }  
   int min=arr[0]; 
   int max=arr[0]; 
 
 for(int i=0;i<n;i++){ 
    if(arr[i]< min){ 
         min=arr[i]; 
    } 
    if(arr[i]>max){ 
        max=arr[i]; 
    } 
 } 
   System.out.print("\nsmallest is : " +min); 
   System.out.print("\nlargest is : " +max); 
   sc.close(); 
  
} 
}