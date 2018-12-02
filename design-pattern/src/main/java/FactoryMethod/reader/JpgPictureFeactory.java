package FactoryMethod.reader;

import FactoryMethod.picture.JpgPicture;
import FactoryMethod.picture.Picture;

public class JpgPictureFeactory implements PictureFactory {

    public Picture createrPicture() {
        return new JpgPicture();
    }
}
