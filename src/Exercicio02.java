/**
 * Created by Ju on 12/08/2015.
 */
public class Exercicio02 {

    //* Implemente um método que receba duas matrizes e
    //retorna o resultado da multiplicação (lembre-se das
    //restrições para se multiplicar matrizes). Teste-o.

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {5, 2}};
        int[][] b = {{6, 1, 3}, {1, 2, 4}};
        int[][] mat;

        mat = multiplicar(a, b);


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] multiplicar(int[][] a, int[][] b) {
        if (b.length != a[0].length)
            throw new RuntimeException("Numero de linhas de b deve coincidir com o numero de colunas de a.");

        int soma = 0;

        int mat[][] = new int[a.length][b[0].length];
        for (int i = 0 ; i < a.length ; i++ ){
            for (int j = 0 ; j < b[0].length ; j++ ){
                soma = 0;
                for (int k = 0 ; k < b.length ; k++ ){
                    soma = soma + a[i][k]*b[k][j];
                }
                mat[i][j] = soma;
            }
        }
        return mat;
    }
}
