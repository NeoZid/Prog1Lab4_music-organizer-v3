import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
    
    
    /*
     *
     * 
     * 25) If listmatching is not found, nothing is printed.
     * 
     * 28) private ArrayList<Tracks> tracks;
     * 29)
     * boolean found = false;
     * while(found) {
     *      if(the keys are in the place) {
     *          found = true
     *  }
     * 
     * 30)
     * int number = 10;
     * while((number >= 10) && (number <= 95)) {
     *      System.print.ln(number);
     *      number = number + 5; 
     *      }
     * 31) 
     * int number = 1;
     * int sum = 0;
     * while (number <= 10) {
     *     sum = sum + number;
     *      number++;
     *      }
     *      System.print.ln(sum);
     *      
     * 33)
     * isPrime(int n);
     * n=
     * 
     * 
     * 
     */
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }
    
    // #26 Challenge
    public void listMatching(String searchString) {
        boolean searching = true;
        for(String filename : files) {
            if(filename.contains(searchString)) {
                System.out.println(filename);
            } 
            if (searching = false); {
                System.out.println("Song not found");
            }
        }
    }
    // #27 
    public void playArtist(String searchString) {
        for (String filename : files) {
            if(filename.contains(searchString)) {
                player.startPlaying(filename);
            }
        }
    }
    
    // #31
    public void sum(){
    int number = 1;
    int sum = 0;
    
    while (number <= 10){
        sum = sum + number;
        number++;
    }
        System.out.println("Sum from 1 to 10 is:"+sum);
    }
    
    // #32
    public void sum_AB(int a, int b){
    int number=a;
    int sum=0;
    
    while (number <= b){
        sum = sum + number;
        number++;
    }
        System.out.println("Sum from a to b is:"+sum);
    }
    
    //33
    public boolean isPrime(int n){
       int i = 2;
       
        while (i < n) {
              if (n%i == 0) {
                  System.out.println("FALSE: "+n+" is multiple of" +i);
                  return false;
              } 
              i++;
        }
        
        return true;
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        int position = 0; // Number 24 Challenge
        for(String filename : files) {
            System.out.println(position + " : " + filename);
            position++;
            }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            player.startPlaying(filename);
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    /**
     * Play a file in the collection. Only return once playing has finished.
     * @param index The index of the file to be played.
     */
    public void playAndWait(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            player.playSample(filename);
        }
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        boolean valid;
        
        if(index < 0) {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if(index >= files.size()) {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    }
}
