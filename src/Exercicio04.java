/**
 * Created by Ju on 14/08/2015.
 */
public class Exercicio04 {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat;

        mat = transposta(a);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] transposta(int a[][]){
        int mat[][] = new int[a[0].length][a.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = a[j][i];
            }
        }
        return mat;
    }
}

