package Factory.AbstractFactory.factory;

import Factory.AbstractFactory.picture.BaseColorPicture;
import Factory.AbstractFactory.picture.BaseFormatPicture;
import Factory.AbstractFactory.picture.JpgPicture;
import Factory.AbstractFactory.picture.RedPicture;

public class RedCombineFactory extends CombineFactory{

    public BaseColorPicture createColorPicture() {
        return new RedPicture();
    }

    public BaseFormatPicture createFormatPiacture() {
        return new JpgPicture();
    }
}
