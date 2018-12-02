package Factory.AbstractFactory.factory;

import Factory.AbstractFactory.picture.BaseColorPicture;
import Factory.AbstractFactory.picture.BaseFormatPicture;

public abstract class CombineFactory {
    public abstract BaseColorPicture createColorPicture();
    public abstract BaseFormatPicture createFormatPiacture();
}
