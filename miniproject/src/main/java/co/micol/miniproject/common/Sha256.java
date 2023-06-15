package co.micol.miniproject.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha256 {  //일방향 암호화

    public String sha256(String msg) {  //입력받은 문자열을 일방향 암호화 해줌
        MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
        md.update(msg.getBytes());       //넘어온 문자열을 Byte변경 
        return bytesToHex(md.digest());
    }
   
    private String bytesToHex(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b: bytes) {
          builder.append(String.format("%02x", b));
        }
        return builder.toString();  //암호문으로 돌려준다
    }
}
