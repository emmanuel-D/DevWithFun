// Point d'entrée de notre application java
public class Main {
    public static void main(String[] args) {
        // Voici le code executé
        System.out.println("Démarrage de la calculatrice");

        // Créer la calculatrice (Object) de Yonis
        Calculatrice yonisCalculatrice = new Calculatrice();

        // Utilise la calculatrice de Yonis
        yonisCalculatrice.chiffre1 = 10;
        yonisCalculatrice.chiffre2 = 5;

        // Appeler (executer) la fonction (operation) addition
        yonisCalculatrice.addition();



        Calculatrice fabriceCalculatrice = new Calculatrice();
        fabriceCalculatrice.chiffre1 = 10;
        fabriceCalculatrice.chiffre2 = 2;

        fabriceCalculatrice.multiplication();
    }
}
