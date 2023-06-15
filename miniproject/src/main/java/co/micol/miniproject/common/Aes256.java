package co.micol.miniproject.common;


import java.util.Base64;

import javax.crypto.Cipher;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Aes256 {  //양방향 암호화
	public static String alg = "AES/CBC/PKCS5Padding";
    private final String key = "01234567890123456789012345678901";
    private final String iv = key.substring(0, 16); // 16byte

    public String encrypt(String text) {  //암호화
        Cipher cipher;
        byte[] encrypted = null;
		try {
			cipher = Cipher.getInstance(alg);
			SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
	        IvParameterSpec ivParamSpec = new IvParameterSpec(iv.getBytes());
	        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivParamSpec);
	        encrypted = cipher.doFinal(text.getBytes("UTF-8"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        return Base64.getEncoder().encodeToString(encrypted);
    }

    public String decrypt(String cipherText){ //복호화
        Cipher cipher;
        byte[] decrypted = null;
        String result = null;
		try {
			cipher = Cipher.getInstance(alg);
			SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
	        IvParameterSpec ivParamSpec = new IvParameterSpec(iv.getBytes());
	        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivParamSpec);
	        byte[] decodedBytes = Base64.getDecoder().decode(cipherText);
	        decrypted = cipher.doFinal(decodedBytes);
	        result = new String(decrypted, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}         
       return result;
    }
}
