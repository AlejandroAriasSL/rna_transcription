package dev.alejandro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TranscriptorTest {
    
    @Test
    @DisplayName("It should transform the provided DNA into valid RNA")
    void test_returns_RNA_from_DNA() {

        DNA dna = new DNA("GCTA");

        RNA transcribedDNA = Transcriptor.transcribe(dna);

        assertThat(transcribedDNA.getSequence(), is("CGAU"));

    }
}
