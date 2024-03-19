package assign;

//add imports here!
import ie.tudublin.Visual;
//import processing.core.PVector

public class start extends Visual{
    screen1 screen = new screen1(this);

    
}

public void setup()
{
    startMinim();
    loadAudio(filename:);
    getAudioPlayer().play();


    //Color thing
    colorMode(RBB);
}