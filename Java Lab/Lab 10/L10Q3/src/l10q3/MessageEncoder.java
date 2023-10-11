package l10q3;

public interface MessageEncoder {

    public String encode(String plainText);
    public String decode(String ciphertext);
    
}