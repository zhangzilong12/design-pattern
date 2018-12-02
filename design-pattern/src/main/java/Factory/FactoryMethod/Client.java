package Factory.FactoryMethod;

import Factory.FactoryMethod.picture.BasePicture;
import Factory.FactoryMethod.factory.GifPictureFactory;
import Factory.FactoryMethod.factory.JpgPictureFeactory;
import Factory.FactoryMethod.factory.PictureFactory;

public class Client {
    public static void main(String[] args) {
        PictureFactory factory;
        factory = new GifPictureFactory();
        BasePicture gif = factory.createrPicture();
        gif.print();

        factory = new JpgPictureFeactory();
        BasePicture jpg = factory.createrPicture();
        jpg.print();
    }
}
