package Factory.SimpleFactory;

import Factory.SimpleFactory.picture.BasePicture;

public class Client {
    public static void main(String[] args) {
        BasePicture picture = PictureFactory.create("gif");
        picture.print();
    }
}
