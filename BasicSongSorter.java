import java.util.ArrayList;

public class BasicSongSorter {

    static String[] songs = {

        "American Pie", "Bohemian Rhapsody", "Imagine", "Hotel California", "Stairway to Heaven", "Smells Like Teen Spirit",
        "Sweet Child O' Mine", "Hey Jude", "Like a Rolling Stone", "Purple Haze", "Billie Jean",
        "Losing My Religion", "Wonderwall", "Yesterday", "I Want to Hold Your Hand", "Halo", "Rolling in the Deep",
        "Uptown Funk", "Blinding Lights", "Shape of You", "Someone Like You", "Clocks", "Viva La Vida", "Take Me to Church", "Creep",
        "Radioactive", "Fix You", "Yellow", "The Scientist", "Karma Police", "No Surprises"
        
    };

    static ArrayList<String> songsPrinterByCharacter = new ArrayList<>();

    public static void main(String[] args) {
        //option four... loops through an array of alphabetical characters, each loop sends the character to the filtersongsarraybyletter method
        String[] character = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            for (int i = 0; i < character.length; i++){
                String chosenCharacterFromAlphabet = character[i];
                filterSongsArrayByLetter(chosenCharacterFromAlphabet);
                //the flitersongsarraybyletter method checks each song in the song array to see if a condition is met, if it is it adds that song to the songsprinterbycharacter arraylist
                System.out.println (chosenCharacterFromAlphabet + " = " + songsPrinterByCharacter);
                songsPrinterByCharacter.clear();
            }                
    }





    //the goal of the method is to check if a String in song[] array has the first letter chosen in the main method, and if so send them back to be output for the user
    static void filterSongsArrayByLetter (String chosenCharacterFromAlphabet){
        for(int i = 0; i < songs.length; i++){
            String songBeingChecked = songs[i];
            if( songBeingChecked.toLowerCase() .startsWith(chosenCharacterFromAlphabet)  ){
                songsPrinterByCharacter.add(songBeingChecked);
            }            
        }
    }
