package FactoryMethod;

import FactoryMethod.picture.Picture;
import FactoryMethod.reader.GifPictureFactory;
import FactoryMethod.reader.JpgPictureFeactory;
import FactoryMethod.reader.PictureFactory;

public class Client {
    public static void main(String[] args) {
        PictureFactory factory;
        factory = new GifPictureFactory();
        Picture gif = factory.createrPicture();
        gif.print();

        factory = new JpgPictureFeactory();
        Picture jpg = factory.createrPicture();
        jpg.print();
    }
}
