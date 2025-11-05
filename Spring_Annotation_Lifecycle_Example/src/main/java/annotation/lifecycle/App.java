package annotation.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 // Load Spring container (annotation-based config)
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the MusicPlayer bean
        MusicPlayer player = context.getBean(MusicPlayer.class);

        // Use the bean
        player.playMusic();
    }
}
