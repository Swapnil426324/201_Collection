package com.map;
import java.util.Random;
import java.security.SecureRandom;

public class RandomNumber {
	public static void main(String[] args) {
		/*
		 * Random random = new Random(); int personId = random.nextInt(1000000); //
		 * Generates a random number up to 999999
		 * System.out.println("Generated Person ID: " + personId);
		 */
        
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder personId = new StringBuilder();
        
        // Generate a random 8-character alphanumeric string
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(chars.length());
            personId.append(chars.charAt(index));
        }
        
        System.out.println("Generated Person ID: " + personId.toString());
    }

}
