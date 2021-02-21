public class StopPlayer implements State{
    BluRayPlayer disc;

    public StopPlayer(BluRayPlayer disc){
        this.disc = disc;

    }
    public void insertDisc(String movie){
        disc.setInsertDisc(true);
        System.out.println("The movie inserted is: "+movie);
    }
    public void stopDisc(){
        System.out.println("The blu-ray player is stopped");
    }
    public void startDisc(){
        if (disc.getInsert()){
            disc.setState(disc.getStartState());
            System.out.println("started the movie");
        }
        else {
            System.out.println("Please insert a disc first");
        }
    }
    public void pauseDisc(){
        System.out.println("Cannot pause a movie when the blu-ray player has been stopped.");
    }
    public void removeDisc(){
        if (disc.getInsert()) {
            disc.setInsertDisc(false);
            System.out.println("The disc has been ejected");
        }
        else {
            System.out.println("There is no disc to eject");
        }
    }
    public String toString(){
        return "The movie is stopped";
    }
}
