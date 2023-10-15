public class Calculatrice {

    // Entrées (variable)
    public int chiffre1 = 0; // Integer (int) c'est un chiffre sans virgule

    public int chiffre2 = 0;

    // Fonctions (methode)
    public void addition() {
        // Logique de la fonction est définie ici
        int resultatAddition = chiffre1 + chiffre2;

        // Afficher à l'écran
        System.out.println("Addition: " + resultatAddition);
    }

    public void multiplication() {
        int resultatMultiplication = chiffre1 * chiffre2;
        System.out.println("Multiplication: " + resultatMultiplication);
    }
}
