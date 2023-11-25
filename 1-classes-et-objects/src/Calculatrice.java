public class Calculatrice {

    // Entrées (variable)
    public Integer chiffre1 = 0; // Integer (int) c'est un chiffre sans virgule

    public Integer chiffre2 = 0;

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

    public void comparerChiffre1EtChiffre2() {
        int resultat = chiffre1.compareTo(chiffre2);
        System.out.println("Resultat de la comparaison: " + resultat);

        if (resultat == 0) {
            System.out.println("Chiffre1 et Chiffre2 sont ÉGAUX");
        } else {
            System.out.println("Chiffre1 et Chiffre2 sont INÉGAUX");
        }


        // Conditions
        int argent = 99;
        // si mon argent superieur à 100 eur => alors je suis riche

        if (argent > 100) { // si mon argent superieur à 100
            System.out.println("je suis riche");
        } else { // Par contre
            System.out.println("je suis pauvre");
        }
    }

}
