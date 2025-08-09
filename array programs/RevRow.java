import java.util.Scanner;
public class RevRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the rows and columns of matrix");
      int r1=sc.nextInt();
      int c1=sc.nextInt();
      
   
int mat[][]=new int[r1][c1];
 
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
  System.out.println("\nMatrix with rows reversed:"); 
        for (int i = 0; i < r1; i++) { 
            for (int j = c1 - 1; j >= 0; j--) { 
                System.out.print(mat[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 
} 