package ro.ase.cts.teste;

import org.junit.Test;
import ro.ase.cts.clase.Persoana;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersoanaTest {

    @org.junit.Test
    public void getVarsta() {
        Persoana persoana = new Persoana("Marcel","5050121360064");
        assertEquals(21,persoana.getVarsta());
    }

    @org.junit.Test
    public void testBoundaryVarsta() {
        Persoana persoana = new Persoana("Aricel", "1991231090064");
        assertEquals(26,persoana.getVarsta());
    }

    @org.junit.Test
    public void testBoundaryZiuaCurenta() {
        Persoana persoana = new Persoana("Aricel", "1760521000000");
        assertEquals(50,persoana.getVarsta());
    }

    @org.junit.Test
    public void testCrossCheckSex() {
        String CNP = "1760522000000";
        Persoana persoana = new Persoana("Aricel", CNP);
        assertEquals(Integer.parseInt(String.valueOf(CNP.charAt(0))) % 2 == 0 ? "F" : "M",persoana.getSex());
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void testCNPInvalid() {
        Persoana persoana = new Persoana("nu", "123456789012345");
        persoana.checkCNP();
    }
    @org.junit.Test(expected =  IllegalArgumentException.class)
    public void testCNPCaractereSpeciale() {
        Persoana persoana = new Persoana("nu","!@#$123456789");
        persoana.checkCNP();
    }

    @org.junit.Test(timeout = 1000)
    public void testPerformanta() {
        Persoana pers = new Persoana("nu","5050121360064");
        pers.getVarsta();
    }

    @Test
    public void testOrdineVarsta() {
        Persoana eu = new Persoana("eu","5050121360099");
        Persoana tu = new Persoana("tu","5010305460099");
        assertTrue(eu.getVarsta() < tu.getVarsta());

    }

    @Test(expected = IllegalArgumentException.class)
    public void testPersoanaNascutaInViitor() {
        Persoana pers = new Persoana("eu","5271231360000");
        pers.getVarsta();
    }
}
