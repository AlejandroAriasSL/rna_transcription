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
    }

    public String getSequence() {
        return rnaSequence;
    }
}
