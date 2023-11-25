public class Main {
    public static void main(String[] args) {
        Integer chiffre1 = 20;
        Integer chiffre2 = 5;

        // Est-ce le chiffre 1 est egal au chiffre 2 ?
        if (chiffre1 == chiffre2) {
            // si la condition est remplie (vrai → true)
            System.out.println("Le chiffre 1 est egal au chiffre 2");
        } else if (chiffre1 > chiffre2) {
            System.out.println("Le chiffre 1 est superieur au chiffre 2");
        } else if (chiffre1 < chiffre2) {
            System.out.println("Le chiffre 1 est inferieur au chiffre 2");
        } else {
            // si la condition n'est pas remplie (faux → false)
            System.out.println("Le chiffre 1 n'est pas egal au chiffre 2");
        }
    }
}
