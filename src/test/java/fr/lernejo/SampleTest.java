package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op() {
        Sample test = new Sample();
        assertEquals(5, test.op(Sample.Operation.ADD, 2,3));
        assertEquals(6, test.op(Sample.Operation.MULT, 2,3));
    }
    @Test
    void fact() {
        Sample test = new Sample();
        assertEquals(120,test.fact(5));
        assertThrows(IllegalArgumentException.class, ()-> test.fact(-1));
    }
}
