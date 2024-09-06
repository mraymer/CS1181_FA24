public class Song{
    private String title;

    public Song(){
        setTitle("Untitled");
    }
    
    /***
     * Song - create a new song
     * 
     * @param title - The song title (string)
     */
    public Song(String title){
        setTitle(title);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
        return "Title: " + this.getTitle();
    }
}