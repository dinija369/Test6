public class encrypt {
    public void cipherDes() {
        Cipher des=Cipher.getInstance("DES...");
        des.initEncrypt(key2);
    }
}