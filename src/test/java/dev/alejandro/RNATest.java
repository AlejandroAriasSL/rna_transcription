package dev.alejandro;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    @DisplayName("It should throw an exception if the provided RNA sequence is not valid")
    void test_throws_exception_if_RNA_sequence_invalid() {

        String dnaSequence = "GTAR";


        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new RNA(dnaSequence));


        assertThat(exception.getMessage(), is("Invalid RNA sequence"));
    }

    @Test
    @DisplayName("It should throw an exception if the provided RNA sequence is incomplete")
    void test_throws_exception_if_RNA_sequence_incomplete() {

        String rnaSequence = "CGA";

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new RNA(rnaSequence));

        assertThat(exception.getMessage(), is("RNA sequence is incomplete!"));
    }
}
