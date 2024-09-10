package fr.iut.editeur.document;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }
	
    public String getTexte() {
        return texteDocument;
    }

    public void setTexte(String texte) {
        this.texteDocument = texte;
    }

    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        texteDocument = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        remplacer(debut, fin, texteDocument.substring(debut, fin+1).toUpperCase());
    }

    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    public void inserer(int debut, String ajout) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(debut);
        texteDocument = partieGauche + ajout + partieDroite;
    }

    public void minuscules(int debut, int fin) {
        remplacer(debut, fin, texteDocument.substring(debut, fin+1).toLowerCase());
    }

    public void clear() {
        texteDocument = "";
    }
}
