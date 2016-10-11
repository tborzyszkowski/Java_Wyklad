package _09_Swing;


/**
   @version 1.12 2004-08-24
   @author Cay Horstmann
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;

/**
   Program demonstrujacy tworzenie obrazu
   z pojedynczych pikseli.
*/
public class MandelbrotTest
{  
   public static void main(String[] args)
   {  
      JFrame frame = new MandelbrotFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

/**
   Ramka wyswietlajaca zbi�r Mandelbrota.
*/
class MandelbrotFrame extends JFrame
{  
   public MandelbrotFrame()
   {  
      setTitle("MandelbrotTest");
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
      BufferedImage image = makeMandelbrot(DEFAULT_WIDTH, DEFAULT_HEIGHT);
      add(new JLabel(new ImageIcon(image)), BorderLayout.CENTER);
   }

   /**
      Tworzy obraz zbioru Mandelbrota.
      @param width szerokosc
      @parah height wysokosc
      @return obraz
   */
   public BufferedImage makeMandelbrot(int width, int height)
   {  
      BufferedImage image = new BufferedImage(width, height, 
      					BufferedImage.TYPE_INT_ARGB);
      WritableRaster raster = image.getRaster();
      ColorModel model = image.getColorModel();

      Color fractalColor = Color.blue;
      int argb = fractalColor.getRGB();
      Object colorData = model.getDataElements(argb, null);

      for (int i = 0; i < width; i++)
         for (int j = 0; j < height; j++)
         {  
            double a = XMIN + i * (XMAX - XMIN) / width;
            double b = YMIN + j * (YMAX - YMIN) / height;
            if (!escapesToInfinity(a, b))
               raster.setDataElements(i, j, colorData);
         }
      return image;
   }

   private boolean escapesToInfinity(double a, double b)
   {  
      double x = 0.0;
      double y = 0.0;
      int iterations = 0;
      do
      {  
         double xnew = x * x - y * y + a;
         double ynew = 2 * x * y + b;
         x = xnew;
         y = ynew;
         iterations++;
         if (iterations == MAX_ITERATIONS) return false;
      }
      while (x <= 2 && y <= 2);
      return true;
   }

   private static final double XMIN = -2;
   private static final double XMAX = 2;
   private static final double YMIN = -2;
   private static final double YMAX = 2;
   private static final int MAX_ITERATIONS = 4000;
   private static final int DEFAULT_WIDTH = 600;
   private static final int DEFAULT_HEIGHT = 600;
}
