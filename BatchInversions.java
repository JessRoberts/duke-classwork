/**
 * Convert any number of images to an inverted version and saving them with a filename prefix of "inverted-"..
 * 
 * @author Jess Roberts
 */
import edu.duke.*;
import java.io.*;

public class BatchInversions {
	//I started with the image I wanted (inImage)
	public ImageResource makeInversion(ImageResource inImage) {
		//I made a blank image of the same size
		ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
		//for each pixel in outImage
		for (Pixel pixel: outImage.pixels()) {
			//look at the corresponding pixel in inImage
			Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
			//compute inPixel's red + inPixel's blue + inPixel's green
			//divide that sum by 3 (call it average)
			int r = (255 - inPixel.getRed());
			int b = (255 - inPixel.getBlue());
			int g = (255 - inPixel.getGreen());
			//set pixel's red to average
			pixel.setRed(r);
			//set pixel's green to average
			pixel.setGreen(g);
			//set pixel's blue to average
			pixel.setBlue(b);
		}
		//outImage is your answer
		return outImage;
	}

	public void selectAndConvert () {
		DirectoryResource dr = new DirectoryResource();
		for (File f : dr.selectedFiles()) {
			ImageResource inImage = new ImageResource(f);
			ImageResource invert = makeInversion(inImage);
			
			String fname = inImage.getFileName();
            String newName = "inverted-" + fname;
            invert.setFileName(newName);
			
			invert.draw();
            invert.save();
		}
	}



}

