/**
 * Created by jzheng on 1/25/17.
 */
import java.lang.*;
public class Incidence {
    public static void main(String[] args) {
        System.out.println(calculate("Hello"));
        IC Incidence = new IC();
        System.out.println(Incidence.calculate("Hello"));
        String code = "KEBXZSTFUHWCWHQYYKMCSBBCYAIPQVGBNUGLLXMSJJTPACAXTLGJFSHTBJJOUFCIJXVRHFPTXIXFPTHLKGQIAKJRHUSMRNIVYZJNPROFQIEMLIOBLLODFHQCWRTKHNVSEHLQKMBNFJKPEZYVTISCUWSNFKEDAHFOUAPUBBZJMBWKFLXGZRNSAFMXWYAEYYAHBMKHTTGAKNMFKGNXKWBVRPUBBZJAHNWADTGZKHXYRMWSVEKKGHAQUCOCPCAUTHGCZLTWHCFACKYPSQZZKCJXHBVVOESCIDTHTVYCPMZGETXJAWSXNRCJRDYHNVAEWYTSHBVCEKDNBZRICZGVKJPRPKCTGGOOTNAFMTWCGKJFVHJKINBLLBARJBUVBPLSXZEHVDVWBNNZVQLAWRVRTQCKLNHTVYCPFSXZCPUYZYZGRPKRWTHGEYCLUBSCYFJRBIHPKRPEYMDWIVLVYCEXCVCEHLCALFGCCTRITLXVSXZRIFHYRUGCRBORCYIOCJGXNBPKCPIOXKYALBBGUOAKKGKXZGNSIOCQFYIYGIYQESGTTHIWXSWFVCDCCMRKJIVUCLLTYAFJCAYUUMEGUKMFYCAORQHTQNLSTARASRYEKTYCIOZIIDAQIVMYEGURDTDUCIIPAIDNXRQCMVRQGCLTKPMHZVYKTYCBGSKHPACUHMUFKQCSVWBZCSBRGNNLGWVYCWCVGOHPRQGSNBEFPGNDZZOCMYVUDFHZLPXXGGEDPYGALTWECTW";
        System.out.println(calculate(code));
        System.out.println(Incidence.calculate(code));
    }


    public static double calculate(String text) {
            int[] Placeholder = new int[26];

            for (int iterator = 0; iterator < text.length();++iterator) {
                Placeholder[(Character.toLowerCase(text.charAt(iterator)) - 'a')] += 1;
            }

            double CoincidenceIndex = 0;
            double N = text.length();
            for (int i = 0; i < 26; ++i) {
                //System.out.println(Placeholder[i]);
                //System.out.println(CoincidenceIndex);
                CoincidenceIndex += (Placeholder[i] * (Placeholder[i] - 1)) / (N * (N-1));
            }


            return CoincidenceIndex;
    }
}
