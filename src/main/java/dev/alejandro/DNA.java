package dev.alejandro;

public class DNA {

    private String dnaSequence;

    public DNA(String dnaSequence) {
        validateSequence(dnaSequence);
        this.dnaSequence = dnaSequence;
    }

    private void validateSequence(String dnaSequence) {
        
        if (!dnaSequence.matches("[GCTA]+")) {
            throw new IllegalArgumentException("Invalid DNA sequence");
        }

        if (!dnaSequence.contains("G") || !dnaSequence.contains("C") || !dnaSequence.contains("T") || !dnaSequence.contains("A")) {
            throw new IllegalArgumentException("DNA sequence is incomplete!");
        }
    }

    public String getSequence() {
        return dnaSequence;
    }
}
