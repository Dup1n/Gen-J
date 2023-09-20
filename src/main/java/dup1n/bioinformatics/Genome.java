package dup1n.bioinformatics;

public class Genome {
    private final String sequence;
    private final int nbA;
    private final int nbT;
    private final int nbC;
    private final int nbG;

    public String getSequence() {
        return sequence;
    }

    public int getNbA() {
        return nbA;
    }

    public int getNbT() {
        return nbT;
    }

    public int getNbC() {
        return nbC;
    }

    public int getNbG() {
        return nbG;
    }

    public Genome(String sequence) {
        this.sequence = sequence.replace("\n", "");
        this.nbA = countNucleoBase('A');
        this.nbT = countNucleoBase('T');
        this.nbC = countNucleoBase('C');
        this.nbG = countNucleoBase('G');
    }

    public int countNucleoBase(char nucleoBase) {
        return sequence.chars().filter(ch -> ch == nucleoBase).map(e -> 1).sum();
    }

    @Override
    public String toString() {
        return "Genome{" +
                "A=" + nbA +
                ", T=" + nbT +
                ", C=" + nbC +
                ", G=" + nbG +
                '}';
    }
}
