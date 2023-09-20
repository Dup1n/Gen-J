package dup1n.bioinformatics;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLog");

        Genome zika = new Genome("""
                AGTTGTTGATCTGTGTGAATCAGACTGCGACAGTTCGAGTTTGAAGCGAAAGCTAGCAACAGTATCAACA
                GGTTTTATTTTGGATTTGGAAACGAGAGTTTCTGGTCATGAAAAACCCAAAGAAGAAATCCGGAGGATTC
                CGGATTGTCAATATGCTAAAACGCGGAGTAGCCCGTGTGAGCCCCTTTGGGGGCTTGAAGAGGCTGCCAG
                CCGGACTTCTGCTGGGTCATGGGCCCATCAGGATGGTCTTGGCGATTCTAGCCTTTTTGAGATTCACGGC
                AATCAAGCCATCACTGGGTCTCATCAATAGATGGGGTTCAGTGGGGAAAAAAGAGGCTATGGAAATAATA
                AAGAAGTTCAAGAAAGATCTGGCTGCCATGCTGAGAATAATCAATGCTAGGAAGGAGAAGAAGAGACGAG
                GCACAGATACTAGTGTCGGAATTGTTGGCCTCCTGCTGACCACAGCCATGGCAGTGGAGGTCACTAGACG
                TGGGAGTGCATACTATATGTACTTGGACAGAAGTGATGCTGGGGAGGCCATATCTTTTCCAACCACACTG
                GGGATGAATAAGTGTTATATACAGATCATGGATCTTGGACACATGTGTGATGCCACCATGAGCTATGAAT
                GCCCTATGCTGGATGAGGGGGTAGAACCAGATGACGTCGATTGTTGGTGCAACACGACGTCAACTTGGGT
                TGTGTACGGAACCTGCCACCACAAAAAAGGTGAAGCACGGAGATCTAGAAGAGCTGTGACGCTCCCCTCC
                CATTCCACTAGGAAGCTGCAAACGCGGTCGCAGACCTGGTTGGAATCAAGAGAATACACAAAGCACTTGA
                TTAGAGTCGAAAATTGGATATTCAGGAACCCTGGCTTCGCGTTAGCAGCAGCTGCCATCGCTTGGCTTTT
                GGGAAGCTCAACGAGCCAAAAAGTCATATACTTGGTCATGATACTGCTGATTGCCCCGGCATACAGCATC
                AGGTGCATAGGAGTCAGCAATAGGGACTTTGTGGAAGGTATGTCAGGTGGGACTTGGGTTGATGTTGTCT
                TGGAACATGGAGGTTGTGTTACCGTAATGGCACAGGACAAACCGACTGTCGACATAGAGCTGGTTACAAC
                AACAGTCAGCAACATGGCGGAGGTAAGATCCTACTGCTATGAGGCATCAATATCGGACATGGCTTCGGAC
                AGCCGCTGCCCAACACAAGGTGAAGCCTACCTTGACAAGCAATCAGACACTCAATATGTCTGCAAAAGAA
                CGTTAGTGGACAGAGGCTGGGGAAATGGATGTGGACTTTTTGGCAAAGGGAGCCTGGTGACATGCGCTAA
                GTTTGCATGCTCTAAGAAAATGACCGGGAAGAGCATCCAGCCAGAGAATCTGGAGTACCGGATAATGCTG
                TCAGTTCATGGCTCCCAGCACAGTGGGATGATCGTTAATGACACAGGACATGAAACTGATGAGAATAGAG
                CGAAGGTTGAGATAACGCCCAATTCACCAAGAGCCGAAGCCACCCTGGGGGGTTTTGGAAGCCTAGGACT
                TGATTGTGAACCGAGGACAGGCCTTGACTTTTCAGACTTGTATTACTTGACTATGAATAACAAGCACTGG
                TTGGTTCACAAGGAGTGGTTCCACGACATTCCATTACCTTGGCATGCTGGGGCAGACACCGGAACTCCAC
                ACTGGAACAACAAAGAAGCACTGGTAGAGTTCAAGGACGCACATGCCAAAAGGCAAACTGCCGTGGTTCT
                AGGGAGTCAAGAAGGAGCAGTTCACACGGCCCTTGCTGGAGCTCTGGAGGCTGAGATGGATGGTGCAAAG
                GGAAGGCTGTCCTCTGGCCACTTGAAATGTCGCCTGAAAATGGATAAACTTAGATTGAAGGGCGTGTCAT
                ACTCCTTGTGTACCGCATCGTTCACATTCACTAAGATCCCGGCTGAAACACTGCACGGGACAGTCACAGT
                GGAGGTACAGTACGCAGGGACAGATGGACCTTGCAAGGTTCCAGCTCAGATGGCGGTGGACATGCAAACT
                CTGACCCCAGTTGGGAGGTTGATAACCGCTAACCCTGTAATCACTGAAAGCACTGAGAACTCTAAGATGA
                TGCTGGAACTTGATCCACCATTTGGGGACTCTTACATTGTCATAGGAGTCGGGGAGAAGAAGATCACCCA
                CCACTGGCACAGGAGTGGCAGCACCATTGGAAAAGCATTTGAAGCCACTGTGAGAGGTGCCAAGAGAATG
                GCAGTCTTGGGAGACACAGCCTGGGACTTTGGATCAGTTGGAGGTGCTCTCAACTCACTGGGCAAGGGCA
                TCCATCAAATTTTTGGAGCAGCTTTCAAATCATTGTTTGGAGGAATGTCCTGGTTCTCACAAATTCTCAT
                TGGAACGTTGCTGGTGTGGTTGGGTCTGAATACAAAGAATGGATCTATTTCCCTTATGTGCTTGGCCTTA
                GGGGGAGTGTTGATCTTCTTATCCACAGCCGTCTCTGCTGATGTGGGGTGCTCGGTGGACTTCTCAAAGA
                AGGAAACGAGATGCGGTACAGGGGTGTTCGTCTATAACGACGTTGAAGCCTGGAGGGACAGGTACAAGTA
                CCATCCTGACTCCCCTCGTAGATTGGCAGCAGCAGTCAAGCAAGCCTGGGAAGATGGGATCTGTGGGATC
                TCCTCTGTTTCAAGAATGGAAAACATCATGTGGAGATCAGTAGAAGGGGAGCTCAACGCAATCCTGGAAG
                AGAATGGAGTTCAACTGACGGTCGTTGTGGGATCTGTAAAAAACCCCATGTGGAGAGGTCCACAGAGATT
                GCCCGTGCCTGTGAACGAGCTGCCCCACGGCTGGAAGGCTTGGGGGAAATCGTACTTCGTCAGAGCAGCA
                AAGACAAATAACAGCTTTGTCGTGGATGGTGACACACTGAAGGAATGCCCACTCAAACATAGAGCATGGA
                ACAGCTTTCTTGTGGAGGATCATGGGTTCGGGGTATTTCACACTAGTGTCTGGCTCAAGGTTAGAGAAGA
                TTATTCATTAGAGTGTGATCCAGCCGTCATTGGAACAGCCGCTAAGGGAAAGGAGGCTGTGCACAGTGAT
                CTAGGCTACTGGATTGAGAGTGAGAAGAACGACACATGGAGGCTGAAGAGGGCCCACCTGATCGAGATAA
                AAACATGTGAATGGCCGAAGTCCCACACATTGTGGACAGATGGAATAGAAGAAAGTGATCTGATCATACC
                CAAGTCTTTAGCTGGGCCACTCAGCCATCACAACACCAGAGAGGGCTACAGGACCCAAATGAAAGGGCCA
                TGGCACAGTGAAGAGCTTGAAATTCGGTTTGAGGAATGCCCAGGCACTAAGGTCCACGTGGAGGAAACAT
                GTGGAACAAGAGGACCATCTCTGAGATCAACCACTGCAAGCGGAAGGGTGATCGAGGAATGGTGCTGCAG
                GGAGTGCACAATGCCCCCACTGTCGTTCCGGGCTAAAGATGGTTGTTGGTATGGAATGGAGATAAGGCCC
                AGGAAAGAACCAGAAAGTAACTTAGTAAGGTCAATGGTGACTGCAGGATCAACTGATCACATGGATCACT
                TCTCCCTTGGAGTGCTTGTGATTCTGCTCATGGTGCAGGAAGGGCTGAAGAAGAGAATGACCACAAAGAT
                CATCATAAGCACATCAATGGCAGTGCTGGTAGCTATGATCCTGGGAGGATTTTCAATGAGTGACCTGGCT
                AAGCTTGCAATTTTGATGGGTGCCACCTTCGCGGAAATGAACACTGGAGGAGATGTAGCTCATCTGGCGC
                TGATAGCGGCATTCAAAGTCAGACCTGCGTTGCTGGTATCTTTCATCTTCAGAGCTAATTGGACACCCCG
                TGAGAGCATGCTGCTGGCCTTGGCCTCGTGTCTTCTGCAAACTGCGATCTCCGCCTTGGAAGGCGACCTG
                ATGGTTCTCATCAATGGTTTTGCTTTGGCCTGGTTGGCAATACGAGCGATGGTTGTTCCACGCACTGACA
                ACATCACCTTGGCAATCCTGGCTGCTCTGACACCACTGGCCCGGGGCACACTGCTTGTGGCGTGGAGAGC
                AGGCCTTGCTACTTGCGGGGGGTTCATGCTCCTCTCTCTGAAGGGGAGAGGCAGTGTGAAGAAGAACTTA
                CCATTTGTCATGGCCCTGGGACTAACCGCTGTGAGGCTGGTCGACCCCATCAACGTGGTGGGACTGCTGT
                TGCTCACAAGGAGTGGGAAGCGGAGCTGGCCCCCTAGTGAAGTACTCACAGCTGTTGGCCTGATATGCGC
                ATTGGCTGGAGGGTTCGCCAAGGCGGATATAGAGATGGCTGGGCCCATAGCCGCGGTCGGTCTGCTAATT
                GTCAGTTACGTGGTCTCAGGAAAGAGTGTGGACATGTACATTGAAAGAGCAGGTGACATCACATGGGAAA
                AAGATGCGGAAGTCACTGGAAACAGTCCCCGGCTCGATGTGGCACTAGATGAGAGTGGTGATTTCTCCCT
                AGTGGAGGATGATGGTCCCCCCATGAGAGAGATCATACTCAAAGTGGTCCTGATGGCCATCTGTGGCATG
                AACCCAATAGCCATACCCTTTGCAGCTGGAGCGTGGTACGTGTATGTGAAGACTGGAAAAAGGAGTGGTG
                CTCTATGGGATGTGCCTGCTCCCAAGGAAGTAAAAAAGGGGGAGACCACAGATGGAGTGTACAGAGTAAT
                GACTCGCAGACTGCTAGGTTCAACACAAGTTGGAGTGGGAGTCATGCAAGAGGGGGTCTTCCACACTATG
                TGGCACGTCACAAAAGGATCCGCGCTGAGAAGCGGTGAAGGGAGACTTGATCCATACTGGGGAGATGTCA
                AGCAGGATCTGGTGTCATACTGTGGTCCATGGAAGCTAGATGCCGCCTGGGACGGGCACAGCGAGGTGCA
                GCTCTTGGCCGTGCCCCCCGGAGAGAGAGCGAGGAACATCCAGACTCTGCCCGGAATATTTAAGACAAAG
                GATGGGGACATTGGAGCAGTTGCGCTGGACTACCCAGCAGGAACTTCAGGATCTCCAATCCTAGATAAGT
                GTGGGAGAGTGATAGGACTCTATGGTAATGGGGTCGTGATCAAAAATGGGAGTTATGTTAGTGCCATCAC
                CCAAGGGAGGAGGGAGGAAGAGACTCCTGTTGAGTGCTTCGAGCCTTCGATGCTGAAGAAGAAGCAGCTA
                ACTGTCTTAGACTTGCATCCTGGAGCTGGGAAAACCAGGAGAGTTCTTCCCGAAATAGTCCGTGAAGCCA
                TAAAAACAAGACTCCGTACTGTGATCTTAGCTCCAACCAGGGTTGTCGCTGCTGAAATGGAGGAAGCCCT
                TAGAGGGCTTCCAGTGCGTTATATGACAACAGCAGTCAATGTCACCCATTCTGGGACAGAAATCGTTGAC
                TTAATGTGCCATGCCACCTTCACTTCACGTCTACTACAGCCAATCAGAGTCCCCAACTATAATCTGTATA
                TTATGGATGAGGCCCACTTCACAGATCCCTCAAGTATAGCAGCAAGAGGATACATTTCAACAAGGGTTGA
                GATGGGCGAGGCGGCTGCCATCTTCATGACTGCCACGCCACCAGGAACCCGTGACGCATTCCCGGACTCC
                AACTCACCAATTATGGACACCGAAGTGGAAGTCCCAGAGAGAGCCTGGAGCTCAGGCTTTGATTGGGTGA
                CGGATCATTCTGGAAAAACAGTTTGGTTTGTTCCAAGCGTGAGGAACGGCAATGAGATCGCAGCTTGTCT
                GACAAAGGCTGGAAAACGGGTCATACAGCTCAGCAGAAAGACTTTTGAGACAGAGTTCCAGAAAACAAAA
                CATCAAGAGTGGGACTTCGTCGTGACAACTGACATTTCAGAGATGGGCGCCAACTTTAAAGCTGACCGTG
                TCATAGATTCCAGGAGATGCCTAAAGCCGGTCATACTTGATGGCGAGAGAGTCATTCTGGCTGGACCCAT
                GCCTGTCACACATGCCAGCGCTGCCCAGAGGAGGGGGCGCATAGGCAGGAATCCCAACAAACCTGGAGAT
                GAGTATCTGTATGGAGGTGGGTGCGCAGAGACTGATGAAGACCATGCACACTGGCTTGAAGCAAGAATGC
                TTCTTGACAACATTTACCTCCAAGATGGCCTCATAGCCTCGCTCTATCGACCTGAGGCCGACAAAGTAGC
                AGCTATTGAGGGAGAGTTCAAGCTTAGGACGGAGCAAAGGAAGACCTTTGTGGAACTCATGAAAAGAGGA
                GATCTTCCTGTTTGGCTGGCCTATCAGGTTGCATCTGCCGGAATAACCTACACAGATAGAAGATGGTGCT
                TTGATGGCACGACCAACAACACCATAATGGAAGACAGTGTGCCGGCAGAGGTGTGGACCAGATACGGAGA
                GAAAAGAGTGCTCAAACCGAGGTGGATGGACGCCAGAGTTTGTTCAGATCATGCGGCCCTGAAGTCATTC
                AAAGAGTTTGCCGCTGGGAAAAGAGGAGCGGCCTTTGGAGTGATGGAAGCCCTGGGAACACTGCCAGGAC
                ACATGACAGAGAGATTCCAGGAGGCCATTGACAACCTCGCTGTGCTCATGCGGGCAGAGACTGGAAGCAG
                GCCCTACAAAGCCGCGGCGGCCCAATTGCCGGAGACCCTAGAGACCATCATGCTTTTGGGGTTGCTGGGA
                ACAGTCTCGCTGGGAATCTTTTTCGTCTTGATGCGGAACAAGGGCATAGGGAAGATGGGCTTTGGAATGG
                TGACTCTTGGGGCCAGCGCATGGCTTATGTGGCTCTCGGAAATTGAGCCAGCCAGAATTGCATGTGTCCT
                CATTGTTGTGTTCCTATTGCTGGTGGTGCTCATACCTGAGCCAGAAAAGCAAAGATCTCCCCAGGACAAC
                CAAATGGCAATCATCATCATGGTAGCAGTGGGTCTTCTGGGCTTGATTACCGCCAATGAACTCGGATGGT
                TGGAGAGAACAAAGAGTGACCTAAGCCATCTAATGGGAAGGAGAGAGGAGGGGGCAACCATAGGATTCTC
                AATGGACATTGACCTGCGGCCAGCCTCAGCTTGGGCTATCTATGCTGCTCTGACAACTTTCATTACCCCA
                GCCGTCCAACATGCAGTGACCACTTCATACAACAACTACTCCTTAATGGCGATGGCCACGCAAGCTGGAG
                TGTTGTTTGGTATGGGTAAAGGGATGCCATTCTACGCATGGGACTTTGGAGTCCCGCTGCTAATGATAGG
                TTGCTACTCACAATTAACACCCCTGACCCTAATAGTGGCCATCATTTTGCTCGTGGCGCACTACATGTAC
                TTGATCCCAGGGCTGCAGGCAGCAGCTGCGCGTGCTGCTCAGAAGAGAACGGCAGCTGGCATCATGAAGA
                ACCCTGTTGTGGATGGAATAGTGGTGACTGACATTGACACAATGACAATTGACCCCCAAGTGGAGAAAAA
                GATGGGACAGGTGCTACTCATAGCAGTAGCCGTCTCCAGCGCCATACTGTCGCGGACCGCCTGGGGGTGG
                GGGGAGGCTGGGGCCCTGATCACAGCTGCAACTTCCACTTTGTGGGAAGGCTCTCCGAACAAGTACTGGA
                ACTCCTCCACAGCCACTTCACTGTGTAACATTTTTAGGGGAAGTTACTTGGCTGGAGCTTCTCTAATCTA
                CACAGTAACAAGAAACGCTGGCTTGGTCAAGAGACGTGGGGGTGGAACGGGAGAGACCCTGGGAGAGAAG
                TGGAAGGCCCGCCTGAACCAGATGTCGGCCCTGGAGTTCTACTCCTACAAAAAGTCAGGCATCACCGAGG
                TGTGCAGAGAAGAGGCCCGCCGCGCCCTCAAGGACGGTGTGGCAACGGGAGGCCATGCTGTGTCCCGAGG
                AAGTGCAAAGCTGAGATGGTTGGTGGAGAGGGGATACCTGCAGCCCTATGGAAAGGTCATTGATCTTGGA
                TGTGGCAGAGGGGGCTGGAGTTACTACGCCGCCACCATCCGCAAAGTTCAAGAAGTGAAAGGATACACAA
                AAGGAGGCCCTGGTCATGAGGAACCCATGTTGGTGCAAAGCTATGGGTGGAACATAGTCCGTCTTAAGAG
                TGGGGTGGACGTCTTTCATATGGCGGCTGAGCCGTGTGACACGTTGCTGTGTGATATAGGTGAGTCATCA
                TCTAGTCCTGAAGTGGAAGAAGCACGGACGCTCAGAGTCCTCTCCATGGTGGGGGATTGGCTTGAAAAAA
                GACCAGGAGCCTTTTGTATAAAAGTGTTGTGCCCATACACCAGCACTATGATGGAAACCCTGGAGCGACT
                GCAGCGTAGGTATGGGGGAGGACTGGTCAGAGTGCCACTCTCCCGCAACTCTACACATGAGATGTACTGG
                GTCTCTGGAGCGAAAAGCAACACCATAAAAAGTGTGTCCACCACGAGCCAGCTCCTCTTGGGGCGCATGG
                ACGGGCCCAGGAGGCCAGTGAAATATGAGGAGGATGTGAATCTCGGCTCTGGCACGCGGGCTGTGGTAAG
                CTGCGCTGAAGCTCCCAACATGAAGATCATTGGTAACCGCATTGAGAGGATCCGCAGTGAGCACGCGGAA
                ACGTGGTTCTTTGACGAGAACCACCCATATAGGACATGGGCTTACCATGGAAGCTACGAGGCCCCCACAC
                AAGGGTCAGCGTCCTCTCTAATAAACGGGGTTGTCAGGCTCCTGTCAAAACCCTGGGATGTGGTGACTGG
                AGTCACAGGAATAGCCATGACCGACACCACACCGTATGGTCAGCAAAGAGTTTTCAAGGAAAAAGTGGAC
                ACTAGGGTGCCAGACCCCCAAGAAGGCACTCGTCAGGTTATGAGCATGGTCTCTTCCTGGTTGTGGAAAG
                AGCTAGGCAAACACAAACGGCCACGAGTCTGTACCAAAGAAGAGTTCATCAACAAGGTTCGTAGCAATGC
                AGCATTAGGGGCAATATTTGAAGAGGAAAAAGAGTGGAAGACTGCAGTGGAAGCTGTGAACGATCCAAGG
                TTCTGGGCTCTAGTGGACAAGGAAAGAGAGCACCACCTGAGAGGAGAGTGCCAGAGCTGTGTGTACAACA
                TGATGGGAAAAAGAGAAAAGAAACAAGGGGAATTTGGAAAGGCCAAGGGCAGCCGCGCCATCTGGTACAT
                GTGGCTAGGGGCTAGATTTCTAGAGTTCGAAGCCCTTGGATTCTTGAACGAGGATCACTGGATGGGGAGA
                GAGAATTCACGAGGTGGTGTTGAAGGGCTGGGATTACAAAGACTCGGATATGTCTTAGAAGAGATGAGTC
                GCATACCAGGAGGAAGGATGTATGCAGATGACACTGCTGGCTGGGACACCCGCATCAGCAGGTTTGATCT
                GGAGAATGAAGCTCTAATCACCAACCAAATGGAGAAAGGGCACAGGGCCTTGGCATTGGCCATAATCAAG
                TACACATACCAAAACAAAGTGGTAAAGGTCCTTAGACCAGCTGAAAAAGGGAAGACAGTTATGGACATTA
                TTTCAAGACAAGACCAAAGGGGGAGCGGACAAGTTGTCACTTACGCTCTTAATACATTTACCAACCTAGT
                GGTGCAGCTCATTCGGAATATGGAGGCTGAGGAAGTTCTAGAGATGCAAGACTTGTGGCTGCTGCGGAGG
                TCAGAGAAAGTGACCAACTGGTTGCAGAGCAATGGATGGGATAGGCTCAAACGAATGGCAGTCAGTGGAG
                ATGATTGCGTTGTGAAACCAATTGATGATAGGTTTGCACATGCTCTCAGGTTCTTGAATGATATGGGAAA
                AGTTAGGAAGGACACACAAGAGTGGAAACCCTCAACTGGATGGGACAACTGGGAAGAAGTTCCGTTTTGC
                TCCCACCACTTCAATAAGCTCCATCTCAAGGACGGGAGGTCCATTGTGGTTCCCTGCCGCCACCAAGATG
                AACTGATTGGCCGAGCCCGCGTCTCACCAGGGGCGGGATGGAGCATCCGGGAGACTGCTTGCCTAGCAAA
                ATCATATGCGCAAATGTGGCAGCTCCTTTATTTCCACAGAAGGGACCTCCGACTGATGGCCAATGCCATT
                TGTTCATCTGTGCCAGTTGACTGGGTTCCAACTGGGAGAACTACCTGGTCAATCCATGGAAAGGGAGAAT
                GGATGACCACTGAAGACATGCTTGTGGTGTGGAACAGAGTGTGGATTGAGGAGAACGACCACATGGAAGA
                CAAGACCCCAGTTACGAAATGGACAGACATTCCCTATTTGGGAAAAAGGGAAGACTTGTGGTGTGGGTCT
                CTCATAGGGCACAGACCGCGCACCACCTGGGCTGAGAACATTAAAAACACAGTCAACATGATGCGCAGGA
                TCATAGGTGATGAAGAAAAGTACATGGACTACCTATCCACCCAAGTTCGCTACTTGGGTGAAGAAGGGTC
                CACACCTGGAGTGCTATAAGCACCAGTCTTAGTGTTGTCAGGCCTGCTAGTCAGCCACAGCTTGGGGAAA
                GCTGTGCAGCCTGTGACCCCCCCAGGAGAAGCTGGGAAACCAAGCCCATAGTCAGGCCGAGAACGCCATG
                GCACGGAAGAAGCCATGCTGCCTGTGAGCCCCTCAGAGGACACTGAGTCAAAAAACCCCACGCGCTTGGA
                GGCGCAGGATGGGAAAAGAAGGTGGCGACCTTCCCCACCCTTCAATCTGGGGCCTGAACTGGAGATCAGC
                TGTGGATCTCCAGAAGAGGGACTAGTGGTTAGAGGAGACCCCCCGGAAAACGCAAAACAGCATATTGACG
                CTGGGAAAGACCAGAGACTCCATGAGTTTCCACCACGCTGGCCGCCAGGCACAGATCGCCGAATAGCGGC
                GGCCGGTGTGGGGAAATCCATGGGTCT
                """);

        logger.log(Level.INFO, String.format("Datos geneticos: %s ", zika));
        logger.log(Level.INFO, "Longitud de la secuencia: {0}", String.valueOf(zika.getSequence().length()));

        Map<String, List<Integer>> enzymes = Cutter.searchEnzymes(zika);

        logger.log(Level.INFO, String.format("Enzimas encontradas: %s", enzymes));
    }
}