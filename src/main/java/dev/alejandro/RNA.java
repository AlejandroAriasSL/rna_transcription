package dev.alejandro;

public class RNA {
    
    private String rnaSequence;

    public RNA(String rnaSequence) {
        validateSequence(rnaSequence);
        this.rnaSequence = rnaSequence;
    }

    private void validateSequence (String rnaSequence) {
        if (!rnaSequence.matches("[CGAU]+")) {
            throw new IllegalArgumentException("Invalid RNA sequence");
        }

        if (!rnaSequence.contains("C") || !rnaSequence.contains("G") || !rnaSequence.contains("A") || !rnaSequence.contains("U")) {
            throw new IllegalArgumentException("RNA sequence is incomplete!");
        }
    }

    public String getSequence() {
        return rnaSequence;
    }
}
