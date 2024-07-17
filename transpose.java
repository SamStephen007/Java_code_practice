import java.util.*;
public class transpose {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = obj.nextInt();
        System.out.println("Enter the number of coloumn:");
        int c = obj.nextInt();
        int[][] mat = new int[r][c];
        int[][]tran = new int[c][r];
        System.out.println("Enter the matric:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = obj.nextInt();
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                tran[j][i]  = mat[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(tran[i][j] + "  ");
            }
            System.out.println();
        }
        }
    }
