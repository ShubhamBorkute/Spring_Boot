package com.nt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


public class ReadPDF {

	    public static void main(String[] args) {
	        // Path to the input PDF file
	        String pdfFilePath = "C:\\Users\\ShubhamBorkute\\Downloads\\1-3 page only.pdf";
	        // Path to the output TXT file
	        String outputFilePath = "C:\\Users\\ShubhamBorkute\\Downloads\\output_unique_emails.txt";

	        try {
	            // Load the PDF document
	            PDDocument document = PDDocument.load(new File(pdfFilePath));

	            // Extract text from the PDF
	            PDFTextStripper pdfStripper = new PDFTextStripper();
	            String pdfText = pdfStripper.getText(document);

	            // Close the PDF document
	            document.close();

	            // Extract unique emails using regex
	            Set<String> uniqueEmails = extractUniqueEmails(pdfText);

	            // Write unique emails to the output file without commas
	            writeEmailsToFile(uniqueEmails, outputFilePath);

	            System.out.println("Unique emails extracted and saved to " + outputFilePath);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    // Method to extract unique emails using regex
	    private static Set<String> extractUniqueEmails(String text) {
	        Set<String> uniqueEmails = new HashSet<>();
	        // Regex for matching email addresses
	        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,7}";
	        Pattern pattern = Pattern.compile(emailRegex);
	        Matcher matcher = pattern.matcher(text);

	        while (matcher.find()) {
	            uniqueEmails.add(matcher.group());
	        }
	        return uniqueEmails;
	    }

	    // Method to write emails to a file without commas
	    private static void writeEmailsToFile(Set<String> emails, String filePath) throws IOException {
	        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

	        for (String email : emails) {
	            // Write each email to a new line
	            writer.write(email);
	            writer.newLine();
	        }

	        writer.close();
	    }
	}



