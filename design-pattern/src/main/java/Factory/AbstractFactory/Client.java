package Factory.AbstractFactory;

import Factory.AbstractFactory.factory.BlueCombineFactory;
import Factory.AbstractFactory.factory.CombineFactory;
import Factory.AbstractFactory.factory.RedCombineFactory;

public class Client {
    public static void main(String[] args) {
        CombineFactory factory;
        factory = new RedCombineFactory();
        factory.createColorPicture().colorPrint();
        factory.createFormatPiacture().formatPrint();

        factory = new BlueCombineFactory();
        factory.createColorPicture().colorPrint();
        factory.createFormatPiacture().formatPrint();
    }
}
