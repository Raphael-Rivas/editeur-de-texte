package fr.iut.editeur.document;

public class Document {

    private String contentDocument;

    public Document() {
        this.contentDocument = "";
    }
	
    public String getTexte() {
        return contentDocument;
    }

    public void setTexte(String texte) {
        this.contentDocument = texte;
    }

    public void ajouter(String texte) {
        this.contentDocument += texte;
    }

    @Override
    public String toString() {
        return this.contentDocument;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = contentDocument.substring(0, debut);
        String partieDroite = contentDocument.substring(fin + 1);
        contentDocument = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        remplacer(debut, fin, contentDocument.substring(debut, fin+1).toUpperCase());
    }

    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    public void inserer(int debut, String ajout) {
        String partieGauche = contentDocument.substring(0, debut);
        String partieDroite = contentDocument.substring(debut);
        contentDocument = partieGauche + ajout + partieDroite;
    }

    public void minuscules(int debut, int fin) {
        remplacer(debut, fin, contentDocument.substring(debut, fin+1).toLowerCase());
    }

    public void clear() {
        contentDocument = "";
    }
}
