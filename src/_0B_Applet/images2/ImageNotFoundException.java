package _0B_Applet.images2;

import java.awt.image.ImageProducer;

class ImageNotFoundException extends Exception {
    ImageNotFoundException(ImageProducer source) {
	super(source+"");
    }
}

