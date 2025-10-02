package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_KEY extends SuperObject{
    public OBJ_KEY() {
        name = "Key";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("objects/key.png"));

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
