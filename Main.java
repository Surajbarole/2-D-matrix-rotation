import java.util.Scanner;

class Main {
  //Given a matrix of N*N dimensions (Mat). Print the matrix rotated by 90 degrees and 180 degrees.


  
  public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr= new int[n][n];
        for(int k=0;k<n;k++){
            for(int l=0;l<n;l++){
                arr[k][l]=sc.nextInt(); 
            }
        }
           int[][] mat90 = new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++){
                mat90[i][j]=arr[n-1-j][i];
            }
        }
         int[][] mat180 =new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                mat180[i][j]=arr[n-1-i][n-1-j];
            }
        }


        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(mat90[i][j]+ " ");
            }
            System.out.println();
        }
         System.out.println();
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(mat180[i][j]+ " ");
            }
            System.out.println();
        }
        


    
  }
}