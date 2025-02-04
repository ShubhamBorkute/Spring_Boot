package com.nt;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmailProcessor {
	public static void main(String[] args) {
		//String oldEmailFilePath = "C:\\Users\\ShubhamBorkute\\OneDrive\\Desktop\\Cold Emails\\Fresher JOBS.txt";
		//String newEmailFilePath = "C:\\Users\\ShubhamBorkute\\OneDrive\\Desktop\\Cold Emails\\Fresher JOBS 27 jan.txt";

		//String oldEmailFilePath = "C:\\Users\\ShubhamBorkute\\OneDrive\\Desktop\\Cold Emails\\Original\\Java Emails.txt";
		//String newEmailFilePath = "C:\\Users\\ShubhamBorkute\\OneDrive\\Desktop\\Cold Emails\\Java Email CommaSep.txt";
		
		/*String oldEmailFilePath = "C:\\Users\\ShubhamBorkute\\OneDrive\\Desktop\\Cold Emails\\Original\\Spring Boot Email.txt";
		String newEmailFilePath = "C:\\Users\\ShubhamBorkute\\OneDrive\\Desktop\\Cold Emails\\27 jan Spring Boot.txt";*/
		
		/*String oldEmailFilePath = "C:\\Users\\ShubhamBorkute\\OneDrive\\Desktop\\Cold Emails\\Original\\Bangaluru Java.txt";
		String newEmailFilePath = "C:\\Users\\ShubhamBorkute\\OneDrive\\Desktop\\Cold Emails\\27 jan Bangaluru java.txt";*/
		
		String oldEmailFilePath = "C:\\Users\\ShubhamBorkute\\OneDrive\\Desktop\\Cold Emails\\Original\\Bangaluru Spring.txt";
		String newEmailFilePath = "C:\\Users\\ShubhamBorkute\\OneDrive\\Desktop\\Cold Emails\\27 jan Bangaluru Spring.txt";
		
	
		Set<String> existingEmails = new LinkedHashSet<>(); // LinkedHashSet to maintain insertion order

		// Load existing emails from the old email file into a set
		try (BufferedReader br = new BufferedReader(new FileReader(oldEmailFilePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				existingEmails.add(line.trim().toLowerCase()); // Add each line as an email
			}
		} catch (IOException e) {
			System.err.println("Error reading old email file: " + e.getMessage());
			return;
		}

		// Process new emails and add only unique ones to the set
		Set<String> newEmailsToAdd = new LinkedHashSet<>();
		try (BufferedReader br = new BufferedReader(new FileReader(newEmailFilePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] emails = line.split(","); // Split by commas
				for (String email : emails) {
					email = email.trim().toLowerCase();
					if (!existingEmails.contains(email)) {
						newEmailsToAdd.add(email); // Add to the new email set
					}
				}
			}
		} catch (IOException e) {
			System.err.println("Error reading new email file: " + e.getMessage());
			return;
		}

		// Write the updated email list back to the old email file
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(oldEmailFilePath))) {
			// Write existing emails first
			for (String email : existingEmails) {
				bw.write(email);
				bw.newLine();
			}

			// If new emails were added, add a separator and the new emails
			if (!newEmailsToAdd.isEmpty()) {
				bw.write("--- New emails added from here ---");
				bw.newLine();
				bw.newLine();
				for (String email : newEmailsToAdd) {
					bw.write(email);
					bw.newLine();
				}
			}

			System.out.println("Old email file updated successfully. Newly added emails:");
			for (String email : newEmailsToAdd) {
				System.out.println(email);
			}
		} catch (IOException e) {
			System.err.println("Error writing to old email file: " + e.getMessage());
		}
	}
}
