package Factory.FactoryMethod.factory;

import Factory.FactoryMethod.picture.GifPicture;
import Factory.FactoryMethod.picture.BasePicture;

public class GifPictureFactory implements PictureFactory {

    public BasePicture createrPicture() {
        return new GifPicture();
    }
}
