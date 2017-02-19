package soundsystem.xmlconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MyMediaPlayer{
    private CompactDisc compactDisc;

    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }


    public void play() {
        compactDisc.play();
    }
}
