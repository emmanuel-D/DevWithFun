public class Calculatrice {

    Integer dividende = 10;
    Integer diviseur = 2;
    Integer quotient = 0;

    public void division() {
        // Appliquer notre condition → Verifier si diviseur == 0
        boolean estCeQueLeDiviseurEstEgalZero = diviseur == 0;

        if (estCeQueLeDiviseurEstEgalZero) { // ⚠️ impossible
            System.out.println("La division par ZERO (0) est impossible");
        } else {
            quotient = dividende / diviseur;

            // Concatenation de String et Chiffres
            String message = dividende + " / " + diviseur + " = " + quotient;
            System.out.println(message);
        }
    }

}
