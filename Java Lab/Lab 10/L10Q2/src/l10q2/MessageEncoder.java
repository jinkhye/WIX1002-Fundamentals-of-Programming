package l10q2;

public interface MessageEncoder {

    public String encode(String plainText);
    public String decode(String ciphertext);
    
}