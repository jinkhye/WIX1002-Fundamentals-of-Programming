package l10q3;

public class Tester {
    
    public static void main(String[] args) {
        ShuffleCipher plainToCipher = new ShuffleCipher("plainText.txt", "shuffleCipherText.txt", 2);
        plainToCipher.plainToCipher();

        ShuffleCipher cipherToPlain = new ShuffleCipher("shuffleCipherText.txt", "shuffleDecodedText.txt", 2);
        cipherToPlain.cipherToPlain();
    }
    
}
