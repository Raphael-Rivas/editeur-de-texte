package fr.iut.editeur.commande.invoker;

import fr.iut.editeur.commande.Commande;

import java.util.Stack;

/**
 * La classe CommandeInvoker est responsable de l'exécution des commandes.
 * Elle utilise le patron de conception Singleton pour s'assurer qu'il n'y a qu'une seule instance de l'invocateur.
 */
public class CommandeInvoker {

    private static CommandeInvoker instance;

    /**
     * Retourne l'instance unique de l'invocateur de commandes.
     * Si l'instance n'existe pas encore, elle est créée.
     *
     * @return l'instance unique de CommandeInvoker
     */
    public static synchronized CommandeInvoker getInstance() {
        if(instance == null) {
            instance = new CommandeInvoker();
        }
        return instance;
    }

    /**
     * Constructeur privé pour empêcher la création d'instances en dehors de la classe.
     */
    private CommandeInvoker() {}

    /**
     * Exécute la commande spécifiée.
     *
     * @param commande la commande à exécuter
     */
    public void executer(Commande commande) {
        commande.executer();
    }
}