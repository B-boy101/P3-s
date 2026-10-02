public class SongDriver
{
    public static void main( String args[] )
    {
        Song wakeUpSong = new Song();
        System.out.println(wakeUpSong.toString());
     
        Song goToSleepSong = new Song ( "Bed Bugs ", "SleepyHeads", 1.67, true, 100 , 1999 );
        System.out.println(goToSleepSong.toString());
        
       
    }// end method main
}// end class SongDriver