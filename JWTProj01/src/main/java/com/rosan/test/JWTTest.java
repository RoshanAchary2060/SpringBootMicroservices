package com.rosan.test;

import com.rosan.utility.JWTUtil;
import io.jsonwebtoken.Claims;

public class JWTTest {
	public static void main(String[] args) {
		// Generate a secure key
		String secureKey = JWTUtil.generateSecureKey();
		System.out.println("Secure Key: " + secureKey);

		// Generate a token using the secure key
		String token = JWTUtil.generateToken("5435AA", "RAJA", secureKey);
		System.out.println("Generated Token: " + token);

		// Retrieve claims from the token
		Claims claims = JWTUtil.getClaims(secureKey, token);
		System.out.println("Subject/Username: " + claims.getSubject());
		System.out.println("Client ID: " + claims.getId());
		System.out.println("Expiry Date/Time: " + claims.getExpiration());
		System.out.println("Issued Date/Time: " + claims.getIssuedAt());

		System.out.println("==============================");
		System.out.println("Is this token valid? " + JWTUtil.isTokenValid(secureKey, token));

		// Assuming you have implemented getExpiryDate and getSubject methods
		System.out.println("Expiry date and time: " + JWTUtil.getExpiryDate(secureKey, token));
		System.out.println("User/Subject name: " + JWTUtil.getSubject(secureKey, token));
	}
}
