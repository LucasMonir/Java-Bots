import java.io.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
public class PixelColorBot{
    public static void main(String args[]) throws IOException{
        File file= new File("image.png");
        BufferedImage image = ImageIO.read(file);
        
        int clr = image.getRGB(1000,1000); 
        int red = (clr & 0x00ff0000) >> 16;
        int green = (clr & 0x0000ff00) >> 8;
        int blue = clr & 0x000000ff;
        
        System.out.println("Red Color value = "+ red);
        System.out.println("Green Color value = "+ green);
        System.out.println("Blue Color value = "+ blue);
    }
}   
    
