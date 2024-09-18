package fr.iut.editeur.document;

/**
 * La classe Document représente un document texte qui peut être manipulé.
 * Elle fournit des méthodes pour modifier le texte, telles que l'ajout, le remplacement,
 * la conversion en majuscules ou minuscules, et l'effacement du texte.
 */
public class Document {

    private String texteDocument;

    /**
     * Construit un nouveau Document avec un texte vide.
     */
    public Document() {
        this.texteDocument = "";
    }

    /**
     * Retourne le texte actuel du document.
     *
     * @return le texte actuel du document
     */
    public String getTexte() {
        return texteDocument;
    }

    /**
     * Définit le texte du document.
     *
     * @param texte le nouveau texte à définir
     */
    public void setTexte(String texte) {
        this.texteDocument = texte;
    }

    /**
     * Ajoute le texte spécifié à la fin du document.
     *
     * @param texte le texte à ajouter
     */
    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du document.
     *
     * @return le texte du document
     */
    @Override
    public String toString() {
        return this.texteDocument;
    }

    /**
     * Remplace une partie du texte du document par le texte de remplacement spécifié.
     *
     * @param debut l'index de début de la partie à remplacer
     * @param fin l'index de fin de la partie à remplacer
     * @param remplacement le texte pour remplacer la partie spécifiée
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        texteDocument = partieGauche + remplacement + partieDroite;
    }

    /**
     * Convertit une partie du texte du document en majuscules.
     *
     * @param debut l'index de début de la partie à convertir
     * @param fin l'index de fin de la partie à convertir
     */
    public void majuscules(int debut, int fin) {
        remplacer(debut, fin, texteDocument.substring(debut, fin+1).toUpperCase());
    }

    /**
     * Efface une partie du texte du document.
     *
     * @param debut l'index de début de la partie à effacer
     * @param fin l'index de fin de la partie à effacer
     */
    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    /**
     * Insère le texte spécifié à la position spécifiée dans le document.
     *
     * @param debut la position à laquelle insérer le texte
     * @param ajout le texte à insérer
     */
    public void inserer(int debut, String ajout) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(debut);
        texteDocument = partieGauche + ajout + partieDroite;
    }

    /**
     * Convertit une partie du texte du document en minuscules.
     *
     * @param debut l'index de début de la partie à convertir
     * @param fin l'index de fin de la partie à convertir
     */
    public void minuscules(int debut, int fin) {
        remplacer(debut, fin, texteDocument.substring(debut, fin+1).toLowerCase());
    }

    /**
     * Efface le texte du document.
     */
    public void clear() {
        texteDocument = "";
    }
}