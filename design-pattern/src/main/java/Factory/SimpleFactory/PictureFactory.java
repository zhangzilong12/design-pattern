package Factory.SimpleFactory;


import Factory.SimpleFactory.picture.GifPicture;
import Factory.SimpleFactory.picture.JpgPicture;
import Factory.SimpleFactory.picture.Picture;

public class PictureFactory {
    public static Picture create(String name){
        if (name.equals("jpg"))
            return new JpgPicture();
        if (name.equals("gif"))
            return new GifPicture();
        return null;
    }
}
