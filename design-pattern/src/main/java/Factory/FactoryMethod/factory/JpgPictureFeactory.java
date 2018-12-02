package Factory.FactoryMethod.factory;

import Factory.FactoryMethod.picture.JpgPicture;
import Factory.FactoryMethod.picture.BasePicture;

public class JpgPictureFeactory implements PictureFactory {

    public BasePicture createrPicture() {
        return new JpgPicture();
    }
}
