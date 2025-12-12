import java.awt.Color;

/**
 * Demonstrates the morphs an image into its grayscaled version. 
 * The program recieves two command-line arguments: a string representing the name
 * of the PPM file of a source image and the number of morphing steps (an int). 
 * For example, to transform the colored cake image into a black and white cake image, in 15 steps, use:
 * java Editor4 cake.ppm 15
 */

public class Editor4 {
   
    public static void main (String[] args){
       String source = args[0];
       int n = Integer.parseInt(args[1]);

        Color[][] sourceImage = Runigram.read(source);
	    Color[][] targetImage = Runigram.grayScaled(sourceImage);

        Runigram.setCanvas(sourceImage);
        Runigram.morph(sourceImage, targetImage, n);  
    }
}
