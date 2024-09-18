package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.commande.CommandeMajuscules;
import fr.iut.editeur.document.Document;

/**
 * La classe CommandeFactory est une fabrique pour créer des instances de commandes.
 * Elle utilise le patron de conception Singleton pour s'assurer qu'il n'y a qu'une seule instance de la fabrique.
 */
public class CommandeFactory {

    private static CommandeFactory instance;

    /**
     * Retourne l'instance unique de la fabrique de commandes.
     * Si l'instance n'existe pas encore, elle est créée.
     *
     * @return l'instance unique de CommandeFactory
     */
    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    /**
     * Constructeur privé pour empêcher la création d'instances en dehors de la classe.
     */
    private CommandeFactory() {}

    /**
     * Crée une commande en fonction du nom spécifié.
     *
     * @param name le nom de la commande à créer
     * @param document le document sur lequel la commande doit opérer
     * @param parameters les paramètres nécessaires pour créer la commande
     * @return une instance de la commande correspondante, ou null si le nom de la commande n'est pas reconnu
     */
    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter" : return new CommandeAjouter(document, parameters);
            case "remplacer" : return new CommandeRemplacer(document, parameters);
            case "majuscules" : return new CommandeMajuscules(document, parameters);
            case "effacer" : return new CommandeEffacer(document, parameters);
            case "clear" : return new CommandeClear(document, parameters);
            case "inserer" : return new CommandeInserer(document, parameters);
            case "minuscules" : return new CommandeMinuscules(document, parameters);
            default: return null;
        }
    }

}