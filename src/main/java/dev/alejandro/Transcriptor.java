package dev.alejandro;

public class Transcriptor {
    

    private Transcriptor() {}


    public static RNA transcribe(DNA dna) {
        return transcribeRna(dna);
    }

    private static RNA transcribeRna(DNA dna) {
        StringBuilder rnaSequence = new StringBuilder();

        for(char nucleotide : dna.getSequence().toCharArray()) {
            rnaSequence.append(getTranscription(nucleotide));
        }

        return new RNA(rnaSequence.toString());
    } 

    private static char getTranscription(char nucleotide) {
        switch(nucleotide) {
            case 'G': return 'C';
            case 'C': return 'G';
            case 'T': return 'A';
            case 'A': return 'U';
            default: throw new IllegalArgumentException("Non valid nucleotide");
        }
    }
    
}
