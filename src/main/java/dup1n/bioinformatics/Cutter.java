package dup1n.bioinformatics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Cutter {

    private Cutter() {
        throw new IllegalStateException("Utility Class");
    }

    private static final Object[][] REase = new Object[][]
    {
        {"EcoRI",   "GAATTC",   1},
        {"BamHI",   "GGATCC",   1},
        {"BgII",    "AGATCT",   1},
        {"HindIII", "AAGCTT",   1},
        {"PvuII",   "CAGCTG",   3},
        {"SmaI",    "CCCGGG",   3},
        {"EcoRV",   "GATATC",   3},
        {"KpnI",    "GGTACC",   5},
        {"PstI",    "CTGCAG",   5},
        {"SacI",    "GAGCTC",   5},
        {"SaII",    "GTCGAC",   1},
        {"ScaI",    "AGTACT",   3},
        {"SpeI",    "ACTAGT",   1},
        {"SphI",    "GCATGC",   5},
        {"StuI",    "AGGCCT",   3},
        {"XbaI",    "TCTAGA",   1}
    };

    public static Map<String, List<Integer>> searchEnzymes(Genome genome) {
        HashMap<String, List<Integer>> enzymesInGenome = new HashMap<>();

        for (Object[] rease : REase) {
            String name = (String) rease[0];
            String siteRec = (String) rease[1];
            int posRec = (int) rease[2];
            List<Integer> positions = new ArrayList<>();

            IntStream.rangeClosed(0, genome.getSequence().length() - siteRec.length())
                    .filter(inicio -> genome.getSequence().substring(inicio, inicio + 6).equals(siteRec))
                    .forEach(position -> positions.add(position + posRec));

            enzymesInGenome.put(name, positions);
        }

        return enzymesInGenome;
    }
}
