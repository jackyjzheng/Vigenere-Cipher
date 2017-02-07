/**
 * Created by jzheng on 1/24/17.
 */
public class Vigenere {
    public static void main(String[] args) {
        String code = "KEBXZSTFUHWCWHQYYKMCSBBCYAIPQVGBNUGLLXMSJJTPACAXTLGJFSHTBJJOUFCIJXVRHFPTXIXFPTHLKGQIAKJRHUSMRNIVYZJNPROFQIEMLIOBLLODFHQCWRTKHNVSEHLQKMBNFJKPEZYVTISCUWSNFKEDAHFOUAPUBBZJMBWKFLXGZRNSAFMXWYAEYYAHBMKHTTGAKNMFKGNXKWBVRPUBBZJAHNWADTGZKHXYRMWSVEKKGHAQUCOCPCAUTHGCZLTWHCFACKYPSQZZKCJXHBVVOESCIDTHTVYCPMZGETXJAWSXNRCJRDYHNVAEWYTSHBVCEKDNBZRICZGVKJPRPKCTGGOOTNAFMTWCGKJFVHJKINBLLBARJBUVBPLSXZEHVDVWBNNZVQLAWRVRTQCKLNHTVYCPFSXZCPUYZYZGRPKRWTHGEYCLUBSCYFJRBIHPKRPEYMDWIVLVYCEXCVCEHLCALFGCCTRITLXVSXZRIFHYRUGCRBORCYIOCJGXNBPKCPIOXKYALBBGUOAKKGKXZGNSIOCQFYIYGIYQESGTTHIWXSWFVCDCCMRKJIVUCLLTYAFJCAYUUMEGUKMFYCAORQHTQNLSTARASRYEKTYCIOZIIDAQIVMYEGURDTDUCIIPAIDNXRQCMVRQGCLTKPMHZVYKTYCBGSKHPACUHMUFKQCSVWBZCSBRGNNLGWVYCWCVGOHPRQGSNBEFPGNDZZOCMYVUDFHZLPXXGGEDPYGALTWECTW";
        keyLengths(code);

    }

    public static void keyLengths(String CipherText) {
        int minimumLength = 1;
        int maximumLength = 18;

        IC Incidence = new IC();
        String[] keyArray = new String[maximumLength];
        //ask for prior information about key length
        //will take user input values

        for (; minimumLength <= maximumLength; ++minimumLength) {
            int index = 0;
            StringBuffer Test = new StringBuffer(CipherText.length()/minimumLength);
            while (index < CipherText.length()) {
                Test.append(CipherText.charAt(index));
                index += minimumLength;
            }
            keyArray[minimumLength-1] = Test.toString();
        }

        for (int j = 0; j < maximumLength; ++j) {
            System.out.println(Incidence.calculate(keyArray[j]));
            System.out.println(j);
        }
    }












}
