package l10q2;

public class Tester {

    public static void main(String[] args) {
        SubstitutionCipher plainToCipher = new SubstitutionCipher("plainText.txt", "cipherText.txt", 2);
        plainToCipher.plainToCipher();

        SubstitutionCipher cipherToPlain = new SubstitutionCipher("cipherText.txt", "decodedPlainText.txt", 2);
        cipherToPlain.cipherToPlain();

    }
}