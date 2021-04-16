package bitmap.transformer;


import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println(new File("assets/mario.bmp").getCanonicalPath());
        Bitmap newFile = new Bitmap("assets/mario.bmp");
        newFile.convertToGrayscale();
        newFile.write("assets/newMario.bmp");
        if (args.length > 0) {

            // create instance of Bitmap
            // ... and set first argument to where the original file lives
            String file = args[0];
            Bitmap BitmapFromFile = new Bitmap(file);

            // Transforms to use within the command line
            if (args[2].equals("grayscale")) {
                BitmapFromFile.convertToGrayscale();
            }
            if (args[2].equals("green")) {
                BitmapFromFile.convertToGreens();
            }
            if (args[2].equals("pink-box")) {
                BitmapFromFile.convertImageToPinkBox();
            }


            // In terminal, the second argument refers to where you want the new Bitmap to populate.
            BitmapFromFile.write(args[1]);
        }
    }
}
