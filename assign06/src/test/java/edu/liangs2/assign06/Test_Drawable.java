package edu.liangs2.assign06;
import edu.liangs2.assign04.ScreenBuffer;
//NOTE: CHANGE realemj to YOUR SITNETID!!!
import org.testng.annotations.Test;

public class Test_Drawable {

    private class DrawTest implements Drawable {
        public void draw(ScreenBuffer map) {

        }
    }

    @Test()
    public void testDrawable() {
        Drawable drawableThing = new DrawTest();
        drawableThing.draw(new ScreenBuffer(1,1,'.'));
    }
}
