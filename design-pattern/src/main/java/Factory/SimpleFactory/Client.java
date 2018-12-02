package Factory.SimpleFactory;

import Factory.SimpleFactory.picture.Picture;

public class Client {
    public static void main(String[] args) {
        Picture picture = PictureFactory.create("gif");
        picture.print();
    }
}
