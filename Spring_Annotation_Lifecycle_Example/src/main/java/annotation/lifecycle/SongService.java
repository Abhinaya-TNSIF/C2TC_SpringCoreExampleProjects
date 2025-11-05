package annotation.lifecycle;

import org.springframework.stereotype.Component;

@Component
public class SongService {
    public String getSong() {
        return "Playing song: 'Unstoppable' by Sia";
    }
}
