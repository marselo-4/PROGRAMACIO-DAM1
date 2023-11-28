public class test1 {

    public static void main(String[] args) {
        patata();
        int sum = suma(20, 52);
        System.out.println("El resultado es " + sum);
        int [][] a = {{3,4,4},{5,6,7},{8,9,0}};
        
        /* D'aquesta forma actualitzem l'array que hem declarat més amunt. */
        imprimirArray(a);
        a[0][0] = 5;

        imprimirArray(a);
        a[1][1] = 9;
    }

    public static void patata() {
        System.out.println("Hola!");
    }

    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void imprimirArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}