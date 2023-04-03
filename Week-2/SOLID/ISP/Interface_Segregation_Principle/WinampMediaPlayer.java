package ISP.Interface_Segregation_Principle;

public class WinampMediaPlayer implements AudioMediaPlayer{
    @Override
    public void playAudio() {
        System.out.println(" Playing audio........");

    }
}
