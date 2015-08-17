/**
 * Created by Ju on 12/08/2015.
 */
public class Exercicio03 {

    //Implemente um método que receba duas matrizes e
    //retorna o resultado da sua soma (lembre-se das
    //restrições para se somar matrizes). Teste-o.

    public static void main(String[] args) {
        int [][] a = {{1,2},{2,4}};
        int [][] b = {{3,2}, {4,5}};
        int [][] mat;

        mat = soma(a,b);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] soma(int [][] a, int[][] b) {
        if (a.length != b.length && a[0].length != b[0].length)
            throw new RuntimeException("Numero de linhas e colunas de 'a' deve coincidir com o numero de linhas e colunas de 'b'.");

        int c [][] = {{},{}};
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}
