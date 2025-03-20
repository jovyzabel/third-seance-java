package except.example;

public class TestSaisieErroneeException {
    public static void controle(String chaine) throws SaisieErroneeException {
        if (chaine.equals("") == true)
            throw new SaisieErroneeException("Saisie erronee : chaine vide");
    }

    public static void main(java.lang.String[] args) {
        String chaine1 = "bonjour";
        String chaine2 = "";

        try {
            controle(chaine1);
            System.out.println("Chaine1 saisie correcte");
        } catch (SaisieErroneeException e) {
            System.out.println("Chaine1 saisie erronee");

        }

        try {
            controle(chaine2);
        } catch (SaisieErroneeException e) {
            System.out.println("Chaine2 saisie erronée");
        }
    }
}
