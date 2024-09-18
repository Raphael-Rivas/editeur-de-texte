package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * La classe CommandeAjouter représente une commande pour ajouter du texte à un document.
 * Elle hérite de la classe abstraite CommandeDocument.
 */
public class CommandeAjouter extends CommandeDocument {

    /**
     * Constructeur pour initialiser une commande d'ajout avec le document et les paramètres spécifiés.
     *
     * @param document le document sur lequel la commande doit opérer
     * @param parameters les paramètres nécessaires pour exécuter la commande
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande d'ajout de texte.
     * Si le nombre de paramètres est insuffisant, affiche un message d'erreur.
     * Sinon, ajoute le texte spécifié au document et affiche le document.
     */
    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

    /**
     * Retourne la description de la commande.
     *
     * @return la description de la commande
     */
    @Override
    public String getDescriptionCommande() {
        return "Ajoute du texte au document";
    }
}