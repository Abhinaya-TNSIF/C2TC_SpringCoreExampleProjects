package annotation.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Autowired
    private SongService songService;

    public void playMusic() {
        System.out.println(songService.getSong());
    }

}
