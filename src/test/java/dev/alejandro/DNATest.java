package dev.alejandro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DNATest {

    @Test
    @DisplayName("It shold return the provided DNA sequence")
    void test_returns_provided_DNA_sequence() {

        String dnaSequence = "GCTA";

        DNA dna = new DNA(dnaSequence);

        assertThat(dna.getSequence(), is(dnaSequence));
    }
    
}
