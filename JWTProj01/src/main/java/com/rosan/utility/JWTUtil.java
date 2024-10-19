package com.rosan.utility;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.crypto.SecretKey;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JWTUtil {
	// Generate a secure random key of appropriate length
	public static String generateSecureKey() {
		byte[] keyBytes = new byte[32]; // 256 bits = 32 bytes
		new java.security.SecureRandom().nextBytes(keyBytes);
		return Base64.getEncoder().encodeToString(keyBytes);
	}

	public static String generateToken(String id, String subject, String skey) {
		// Decode the Base64 string to get the byte array
		SecretKey key = Keys.hmacShaKeyFor(Base64.getDecoder().decode(skey));

		return Jwts.builder().setId(id).setSubject(subject).setIssuer("ROSHAN")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(10))).signWith(key)
				.compact();
	}

	public static Claims getClaims(String skey, String token) {
		return Jwts.parser().setSigningKey(Base64.getDecoder().decode(skey)) // Decode the Base64 string
				.build().parseClaimsJws(token).getBody();
	}

	public static boolean isTokenValid(String skey, String token) {
		Date tokenExpiryDate = getClaims(skey, token).getExpiration();
		Date sysDate = new Date();
		return sysDate.before(sysDate);
	}

	public static String getSubject(String skey, String token) {
		return getClaims(skey, token).getSubject();
	}

	public static Date getExpiryDate(String skey, String token) {
		return getClaims(skey, token).getExpiration();
	}
}
