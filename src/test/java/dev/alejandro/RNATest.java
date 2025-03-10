package dev.alejandro;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RNATest {
    
     @Test
    @DisplayName("It shold return the provided RNA sequence")
    void test_returns_provided_RNA_sequence() {

        String rnaSequence = "CGAU";

        RNA rna = new RNA(rnaSequence);

        assertThat(rna.getSequence(), is(rnaSequence));
    }
}
