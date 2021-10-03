package pl.jaczewski;

import org.junit.Before;
import org.junit.Test;
import pl.jaczewski.string_modify.RegeneratingString;

import static org.junit.Assert.*;

public class RegeneratingStringTests {

    private RegeneratingString rString;

    @Before
    public void init() {
        rString = new RegeneratingString();
    }

    @Test
    public void remove_x00111_produces_000111() {
        rString.removeSingleAt(0);
        assertEquals("000111", rString.toString());
    }

    @Test
    public void remove_0x0111_produces_000111() {
        rString.removeSingleAt(1);
        assertEquals("000111", rString.toString());
    }

    @Test
    public void remove_00x111_produces_000111() {
        rString.removeSingleAt(2);
        assertEquals("000111", rString.toString());
    }

    @Test
    public void remove_000x11_produces_0001111() {
        rString.removeSingleAt(3);
        assertEquals("0001111", rString.toString());
    }

    @Test
    public void remove_0001x1_produces_0001111() {
        rString.removeSingleAt(4);
        assertEquals("0001111", rString.toString());
    }

    @Test
    public void remove_00011x_produces_0001111() {
        rString.removeSingleAt(5);
        assertEquals("0001111", rString.toString());
    }

    @Test
    public void remove_000xx1_produces_00001() {
        rString.removeDoubleAt(3);
        assertEquals("00001", rString.toString());
    }

    @Test
    public void remove_0001xx_produces_00010() {
        rString.removeDoubleAt(4);
        assertEquals("00010", rString.toString());
    }

    @Test
    public void remove_xx0111_produces_0111() {
        rString.removeDoubleAt(0);
        assertEquals("0111", rString.toString());
    }

    @Test
    public void remove_0xx111_produces_0111() {
        rString.removeDoubleAt(1);
        assertEquals("0111", rString.toString());
    }

    @Test
    public void remove_00xx11_produces_000111() {
        rString.removeDoubleAt(2);
        assertEquals("000111", rString.toString());
    }

    @Test
    public void removal_ofDouble_atEnd_doesntBlowUp() {
        rString.removeDoubleAt(5);
        assertEquals("000111", rString.toString());
    }


}


