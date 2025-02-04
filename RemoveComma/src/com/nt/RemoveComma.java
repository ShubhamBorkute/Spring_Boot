package com.nt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveComma {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\ShubhamBorkute\\OneDrive\\Desktop\\Cold Emails\\java 27.txt";  // Path to the input file
        String outputFilePath = "C:\\Users\\ShubhamBorkute\\OneDrive\\Desktop\\Cold Emails\\java 27.txt"; // Path to save the cleaned emails
        
        Set<String> emails = new HashSet<>();
        
        // Regular expression to extract emails
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(emailRegex);

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Find emails in the line
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    String email = matcher.group().replace(",", "").trim(); // Remove commas
                    emails.add(email);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // Save the emails to the output file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (String email : emails) {
                bw.write(email);
                bw.newLine();
            }
            System.out.println("Emails saved successfully to: " + outputFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
