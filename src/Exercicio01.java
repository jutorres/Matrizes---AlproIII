/**
 * Created by Ju on 12/08/2015.
 */
public class Exercicio01 {
    // Implemente um m�todo ou �main� que:
    // * Crie uma matriz 5X6 (5 "linhas" e 6 "colunas")
    // * Inicialize cada posi��o com o valor da soma da
    // coordenada de sua linha com a coordenada de sua
    // coluna;
    // * Exiba todos os elementos, linha ap�s linha;
    // * Exiba todos os elementos, coluna ap�s coluna;

    public static void main(String[] args) {
        int[][] m = new int[5][6];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = i + j;
            }
        }

        printLinha(m);
        System.out.println();
        printColuna(m);

    }

    private static void printLinha(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%3d ", m[i][j]);
            }
            System.out.println();
        }
    }

    private static void printColuna(int[][] m) {
        for (int j = 0; j < m[0].length; j++) {
            for (int i = 0; i < m.length; i++) {
                System.out.printf("%3d ", m[i][j]);
            }
            System.out.println();
        }
    }

}
