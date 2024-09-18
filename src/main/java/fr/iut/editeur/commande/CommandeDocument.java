package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * La classe abstraite CommandeDocument représente une commande de document.
 * Elle implémente l'interface Commande et fournit des méthodes de base pour manipuler un document.
 */
public abstract class CommandeDocument implements Commande {

    /**
     * Le document sur lequel la commande doit opérer.
     */
    protected Document document;

    /**
     * Les paramètres nécessaires pour exécuter la commande.
     */
    protected String[] parameters;

    /**
     * Constructeur pour initialiser une commande de document avec le document et les paramètres spécifiés.
     *
     * @param document le document sur lequel la commande doit opérer
     * @param parameters les paramètres nécessaires pour exécuter la commande
     */
    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    /**
     * Exécute la commande et affiche le document.
     */
    @Override
    public void executer() {
        System.out.println(this.document);
    }

    /**
     * Retourne la description de la commande.
     *
     * @return la description de la commande
     */
    @Override
    public String getDescriptionCommande() {
        return "Commande de base";
    }
}