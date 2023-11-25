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
        fabriceCalculatrice.chiffre2 = 10;

        fabriceCalculatrice.multiplication();

        fabriceCalculatrice.comparerChiffre1EtChiffre2();



        // Type de variables primitifs
        int age; // declaration (non initialisée)
        age = 5;

        Integer ageObject = 10;


        int nombreDeDoigts = 10;



        float temperature = 7.5F;
        Float temperatureExterne = 10.2F;


        double distance = 100000000;



        char lettre = 'a';

        Character lettreObject = 'q';

        String text = "Bonjour toto";



        boolean réponse = true;
        Boolean réponse2 = true;
    }
}
