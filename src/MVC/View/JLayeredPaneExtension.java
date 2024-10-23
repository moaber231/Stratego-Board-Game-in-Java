package MVC.View;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JLayeredPane;
/**
 * This class is used for enhaning the view purposes and it extends the JlayeredPane
 * @author Konstantinos Gkogkos
 *
 */
public class JLayeredPaneExtension extends JLayeredPane {

	/**
	 * The image 
	 */
      Image image;

      /**
       * Take the image into the gui
       * @param img the image that we want to import into the gui
       */
        public JLayeredPaneExtension(Image img) {
        }

        @Override
        public void paintComponent(Graphics g) {
        }
    }