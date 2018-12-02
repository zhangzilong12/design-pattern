package Factory.AbstractFactory.factory;

import Factory.AbstractFactory.picture.BaseColorPicture;
import Factory.AbstractFactory.picture.BaseFormatPicture;
import Factory.AbstractFactory.picture.BluePicture;
import Factory.AbstractFactory.picture.GifPicture;

public class BlueCombineFactory extends CombineFactory{
    public BaseColorPicture createColorPicture() {
        return new BluePicture();
    }

    public BaseFormatPicture createFormatPiacture() {
        return new GifPicture();
    }
}
