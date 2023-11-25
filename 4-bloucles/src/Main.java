public class Main {
    public static void main(String[] args) {
        // Boucle For :
        // idéale lorsque le nombre d'itérations est connu à l'avance.

        // for (1 ; 2; 3)
        // 1- Initialisation de l'itterateur "i":  int i = 0;
        // 2- Condition pour sortir de la boucle "i < 1000";
        // 3- Incrementer la valeur de "i": i++;

        /** BOUCLES "FOR" **/
        System.out.println("Debut de la punition 🎉");

        for (int i = 0; i < 1000; i++) {
            // L'operation qui va se repeter de maniere infinie
            // tant que la condition n'est pas remplie
            // ⚠️ ecrire la phrase de punition
            System.out.println(i + " : Je ne mangerai plus en classe 🥲");
        }
        System.out.println("Fin de la punition ❌");


        /** BOUCLES "WHILE" **/
        System.out.println("----- BOUCLE WHILE : Debut de la punition 🎉 ----");
        int itterateur = 0;
        while (itterateur < 1000) { // ⚠️ La condition est d'abord verifiée avant d'executer l'action
            // L'operation qui va se repeter de maniere infinie
            // tant que la condition n'est pas remplie
            // ⚠️ ecrire la phrase de punition
            System.out.println(itterateur + " : Je ne danserai plus en classe 🥲");
            itterateur = itterateur + 1;
            // itterateur++;
        }
        System.out.println("----- BOUCLE WHILE : Fin de la punition ❌ ------");



        /** BOUCLES "DO - WHILE" **/
        System.out.println("----- BOUCLE DO-WHILE : Debut de la punition 🎉 ----");
        int compteur = 0;
        do { // ⚠️ L'action est executée au moins 1 fois avant que la conditionne soit verifiée
            // L'operation qui va se repeter de maniere infinie
            // tant que la condition n'est pas remplie
            // ⚠️ ecrire la phrase de punition
            System.out.println(compteur + " : Je ne chanterai plus en classe 🥲");
            compteur = compteur + 1;
        } while (compteur < 1000);
        System.out.println("----- BOUCLE DO-WHILE : Fin de la punition ❌ ------");
    }
}
