import java.util.Random;
import java.util.Scanner;

public class JeuDeChiffresAuHasard {

    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    /**
     * Cette methode permettra de demarrer le jeu
     */
    public void demarrer() {
        System.out.println("Bienvenue dans mon jeu de Chiffres au Hasard 👋");
        System.out.println("Ce jeu  consiste à deviner un nombre entre 0 et 9");

        char continuerLeJeu;

        // Boucle
        do {
            System.out.println("... Commençons!! J'ai généré un chiffre entre 0 et 9.");

            // Generer un chiffre aléatoire entre 0 et 9
            int chiffreGenere = random.nextInt(10);

            System.out.println("... Devinez ce chiffre : 👀");

            // Recuperer la valeur entrée par l'utilisateur
            int reponseUtilisateur = scanner.nextInt();

            // Verification de la reponse de l'utilisateur par conditions
            if (chiffreGenere == reponseUtilisateur) {
                System.out.println("Trouvé !! Correct ! Vous avez deviné le chiffre. 🎉");
            } else {
                System.out.println("❌ 😭 Faux !! Le chiffre généré était " + chiffreGenere);
            }

            // Demander à l'utilisateur s'il souhaite continuer le jeu ou pas
            System.out.println("Voulez-vous continuer ? (O/N) :");

            // Recuperer la decision entrée par l'utilisateur
            continuerLeJeu = scanner.next().charAt(0);
        } while (continuerLeJeu == 'O' || continuerLeJeu == 'o');

        // Pour toute decision de l'utilisateur differente de 'O' ou 'o' , on termine le programme
        System.out.println("Merci d'avoir joué et à la prochaine. 👋");
    }

}
