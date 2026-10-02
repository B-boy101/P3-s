public class Song{
    // The "Big 3"
    // 1. private instance variables
    // "private" is the visibility, it means something I only know
    // the user can't change or see, unless I give them a way to
    // information hiding
    // create "cups" of certain types, but nothing in them, just declaring
    private String artist;
    private String title;
    private double cost;
    private boolean isDownloaded;
    private int runTime;
    private int yearReleased;
   
    // 2. constructors (zero and multi-arg)
    // initialization
    // must have same name as class and parentheses in which arguments go
    public Song(){
        artist = null;
        title = null;
        cost = 0.0;
        isDownloaded = false;
    }// end zero-arg constructor
   
        public Song( String initialArtist, String initialTitle, double initialCost, boolean initialIsDownloaded, int initialRunTime, int initialYearReleased ){
        artist = initialArtist;
        title = initialTitle;
        cost = initialCost;
        isDownloaded = initialIsDownloaded;
        runTime = initialRunTime;
        yearReleased = initialYearReleased;
    }// end zero-arg constructor
   
    // the "Dynamic Duo"
    // 4. getter (accessor) methods
    // get and return information about the state of the object
    // ( the values of its instance variables)
    // necessary if the client needs to get this information from private variables
    public String getTitle(){
        return title;
    }// end method getTitle
   
    public boolean getIsDownloaded(){
        return isDownloaded;
    }// end method getIsDownloaded
   
    // 5. setter (mutator) methods
    //  change values of private instance variables
    // usually return type of "void", since don't return anything
    // and usually take an argument
    public void setTitle( String newTitle ){
        title = newTitle;
    }// end method setTitle
   
    public void setCost( double newCost ){
        cost = newCost;
    }// end method setCost
   
    public String getYearReleased(){
        return title;
    }// end method getTitle
    
    public void setYearReleased(int newYear){
        yearReleased = newYear;
    }// end method getTitle
    public int getRunTime(){
        return runTime;
    }
    public String convertToMinSec(){
        int minutes = runTime / 60;
        int seconds = runTime % 60;
        String runTimeMinutes = String.valueOf(minutes + ":" + seconds);
        
        return runTimeMinutes;
    }
    
    // the "Brain" (public or private)
    // 6. processor method(s)
    // (algorithmic processing)
    // does all the work!
   
    // 3. toString() method
    // turns into a nice printable String (stringifys it)
    // returns type String and takes no arguments
    public String toString(){
        return "The song is " + title + " by " + artist + " and costs " + cost +
               " and is downloaded: " + isDownloaded + " RT: " + convertToMinSec() + " Year Released: " + yearReleased;
    }// end method toString
} // end class song