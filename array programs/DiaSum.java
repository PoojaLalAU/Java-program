import java.util.Scanner;
public class DiaSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the rows and columns of matrix");
      int r1=sc.nextInt();
      int c1=sc.nextInt();
     
      int sum=0;
   
int mat[][]=new int[r1][c1];
if(r1!=c1){
System.out.println(" Need a square matrix");
}
else{
 
System.out.println("Enter the elements of Matrix");
  for(int i=0;i<r1;i++){
  for(int j=0;j<c1;j++){
   mat[i][j]=sc.nextInt();
  }}
System.out.println("Matrix");
for(int i=0;i<r1;i++){
  for(int j=0;j<c1;j++){
  System.out.print(+mat[i][j]);
  System.out.print("\t"); 
  }
  System.out.print("\n");
}
  int n=mat.length;

  for (int i = 0; i < n; i++) { 
            sum += mat[i][i]; 
        } 
 
        for (int i = 0; i < n; i++) { 
            sum += mat[i][n - 1 - i]; 
        } 
         
        if (n % 2 != 0) { 
            sum -= mat[n / 2][n / 2]; 
        } 

        System.out.println("The sum of diagonal elements is: " + sum); 
    } }
} 