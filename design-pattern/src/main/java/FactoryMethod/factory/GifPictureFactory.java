package FactoryMethod.factory;

import FactoryMethod.picture.GifPicture;
import FactoryMethod.picture.Picture;

public class GifPictureFactory implements PictureFactory {

    public Picture createrPicture() {
        return new GifPicture();
    }
}
