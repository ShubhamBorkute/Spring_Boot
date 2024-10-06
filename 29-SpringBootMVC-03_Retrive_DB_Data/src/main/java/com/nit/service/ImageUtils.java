package com.nit.service;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

public class ImageUtils {

	public static byte[] compressImage(byte[] imageData, float quality) throws IOException {
	    // Convert byte[] to BufferedImage
	    InputStream is = new ByteArrayInputStream(imageData);
	    BufferedImage originalImage = ImageIO.read(is);

	    // Create a ByteArrayOutputStream to hold the compressed image
	    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

	    // Get the writer for the JPEG format (you can use other formats if needed)
	    ImageWriter jpgWriter = ImageIO.getImageWritersByFormatName("jpg").next();

	    // Create ImageOutputStream and set the writer output
	    try (ImageOutputStream ios = ImageIO.createImageOutputStream(byteArrayOutputStream)) {
	        jpgWriter.setOutput(ios);

	        // Create the ImageWriteParam to adjust the compression quality
	        ImageWriteParam jpgWriteParam = jpgWriter.getDefaultWriteParam();
	        jpgWriteParam.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
	        jpgWriteParam.setCompressionQuality(quality); // 0.0 (lowest quality) to 1.0 (highest quality)

	        // Write the image with the specified quality
	        jpgWriter.write(null, new IIOImage(originalImage, null, null), jpgWriteParam);

	        // Dispose of the writer to release resources
	        jpgWriter.dispose();
	    }

	    // Return the compressed image as a byte array
	    return byteArrayOutputStream.toByteArray();
	}

}
