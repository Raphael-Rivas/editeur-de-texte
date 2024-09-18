package fr.iut.editeur.commande;

/**
 * L'interface Commande représente une commande qui peut être exécutée.
 * Chaque commande doit fournir une implémentation de la méthode executer
 * et une description de la commande.
 */
public interface Commande {

    /**
     * Exécute la commande.
     */
    void executer();

    /**
     * Retourne la description de la commande.
     *
     * @return la description de la commande
     */
    String getDescriptionCommande();
}