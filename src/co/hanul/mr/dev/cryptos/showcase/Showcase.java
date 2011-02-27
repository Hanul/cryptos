package co.hanul.mr.dev.cryptos.showcase;

import java.security.InvalidKeyException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

import co.hanul.mr.dev.cryptos.Cryptos;

public class Showcase {
	public static void main(String[] args) throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
		Cryptos cryptos = Cryptos.getInstance();
		
		// 문자열
		String s = "This is Showcase.";
		System.out.println(s);
		
		// 문자열 암호화
		String es = cryptos.encrypt(s);
		System.out.println(es);
		
		// 암호화된 문자열 복호화
		String ds = cryptos.decrypt(es);
		System.out.println(ds);
	}
}
