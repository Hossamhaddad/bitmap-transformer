/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Bitmap {
    //Instance Variable
    BufferedImage pixelData;

    // === constructor ===
    public Bitmap() {

    }

    public Bitmap(String fileName) throws IOException {
        File f =new File(fileName);
        this.pixelData = ImageIO.read(f);
        System.out.println("Reading complete.");
        System.out.println(this.pixelData);

    }

    // === instance methods ===

    // instance that writes the new image to the desired file
    public void write(String fileNameToWrite) throws IOException {
        File f = new File(fileNameToWrite);
        ImageIO.write(this.pixelData,"bmp",f);
        System.out.println("Completed Writing");

    }

    //Converting image to grayscale
    public void convertToGrayscale(){
        for (int i = 0; i < this.pixelData.getWidth(); i++) {
            for (int j = 0; j < this.pixelData.getHeight(); j++) {
                //get RGB color on each pixel
                Color c = new Color(this.pixelData.getRGB(i,j));
                int r = c.getRed();
                int g = c.getGreen();
                int b = c.getBlue();
                int a = c.getAlpha();
                //turning color to grayscale
                int gr = (r+g+b)/3;

                //Create Gray Color
                Color grayColor = new Color(gr,gr,gr,a);
                this.pixelData.setRGB(i,j,grayColor.getRGB());

            }
            
        }
    }

    //Converting image to green
    public void convertToGreens() {
        for (int i=0; i < this.pixelData.getWidth(); i++){
            for( int j=0; j < this.pixelData.getHeight(); j++){
                //getting RGB color on each pixel
                Color c = new Color(this.pixelData.getRGB(i, j));
                int r = c.getRed();
                int g = c.getGreen();
                int b = c.getBlue();
                int a = c.getAlpha();

                Color greenColor = new Color (0, g, 0, a);
                this.pixelData.setRGB(i, j, greenColor.getRGB());
            }
        }
    }

    //Converting image to pink box
    public void convertImageToPinkBox() {
        for (int i = 0; i < this.pixelData.getWidth(); i++){
            for( int j = 0; j < this.pixelData.getHeight(); j++){
                //getting RGB color on each pixel
                Color c = new Color(this.pixelData.getRGB(i, j));
                int r = c.getRed();
                int g = c.getGreen();
                int b = c.getBlue();
                int a = c.getAlpha();

                Color opacity = new Color (255,0,144,a);
                this.pixelData.setRGB(i, j, opacity.getRGB());
            }
        }
    }


}
