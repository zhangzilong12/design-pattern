package Factory.SimpleFactory;


import Factory.SimpleFactory.picture.GifPicture;
import Factory.SimpleFactory.picture.JpgPicture;
import Factory.SimpleFactory.picture.BasePicture;

public class PictureFactory {
    public static BasePicture create(String name){
        if (name.equals("jpg"))
            return new JpgPicture();
        if (name.equals("gif"))
            return new GifPicture();
        return null;
    }
}
