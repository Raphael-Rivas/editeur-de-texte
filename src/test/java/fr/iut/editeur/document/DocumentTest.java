package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testMethodeAjouter() {
        Document doc = new Document();
        doc.ajouter("Hello");
        assertEquals("Hello", doc.getTexte());
    }

    @Test
    public void testMethodeRemplacer() {
        Document doc = new Document();
        doc.setTexte("Hello");
        doc.remplacer(0, 4, "Bonjour");
        assertEquals("Bonjour", doc.getTexte());
    }

    @Test
    public void testMethodeMajuscules() {
        Document doc = new Document();
        doc.setTexte("Hello");
        doc.majuscules(0, 4);
        assertEquals("HELLO", doc.getTexte());
    }

}