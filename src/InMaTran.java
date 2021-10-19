import java.util.Scanner;

public class InMaTran {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            int n = cin.nextInt();
            int[][] arr =new int[n+1][n+1];
            for(int i =1;i<=n;i++){
                for(int j =1;j<=n;j++){
                    arr[i][j] = cin.nextInt();
                }
            }
            for(int i =1;i<=n;i++){
                if(i%2==1){
                    for(int j =1;j<=n;j++){
                        System.out.print(arr[i][j]+" ");
                    }
                }else{
                    for(int j =n;j>=1;j--){
                        System.out.print(arr[i][j]+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
