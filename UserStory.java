import java.util.Scanner;

public class UserStory {
  //Instance Variables
  private String[] artists; 
  private String[] trackNames; 
  private String[] multipleArtists; 
  private String [] albumNames; 
  private int [] trackPopularity;
  private String [] explicit; 
// Adds the information of the text files onto the respective arrays
public UserStory(String artistsFile, String trackNamesFile, String multipleArtistsFile, String albumNamesFile, String trackPopularityFile, String explicitFile){
  artists = FileReader.toStringArray(artistsFile);
  trackNames = FileReader.toStringArray(trackNamesFile);
  multipleArtists = FileReader.toStringArray(multipleArtistsFile);
  albumNames = FileReader.toStringArray(albumNamesFile);
  trackPopularity = FileReader.toIntArray(trackPopularityFile);
    explicit = FileReader.toStringArray(explicitFile);
}

public String toString() {
  String result = "Respective Artist Information: ";

  for (int i = 0; i < artists.length; i++) {
    String artistText = "\nArtists: "+ artists[i]+"\n";
String trackNamesText = "Track Name:" + trackNames[i]+"\n";
    String multipleArtistsText= "Multiple Artists?: " +multipleArtists[i]+"\n";
    String albumNamesText = "Album Name: "+albumNames[i]+ "\n";
    String trackPopularityText = "Track Popularity: "+trackPopularity[i]+"\n";
    String explicitText = "Explicit?: "+explicit[i]+"\n";
//Combines the arrays of information to print 
     result += artistText + trackNamesText
     +  multipleArtistsText+albumNamesText+trackPopularityText+explicitText;
    /* Prints the artists information in an organized manner:
"
  Artists:
  Track Name:
  Multiple Artists?: 
  Album Name:
  Track Popularity:
  Explicit?:
"
  *
  */
  }


  return result;
}



  
}
