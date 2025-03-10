package dev.alejandro;

import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    @DisplayName("It should throw an error if the provided DNA sequence is not valid")
    void test_throws_exception_if_DNA_sequence_invalid() {

        String dnaSequence = "GTAR";


        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new DNA(dnaSequence));


        assertThat(exception.getMessage(), is("Invalid DNA sequence"));
    }
    
}
