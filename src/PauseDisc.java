public class PauseDisc implements State {
    BluRayPlayer disc;

    public PauseDisc(BluRayPlayer disc){
        this.disc = disc;
    }
    public void insertDisc(String movie) {
        System.out.println("first remove the current movie before inserting another disc");
    }
    public void stopDisc(){
        disc.setState(disc.getStopState());
        System.out.println("The movie has been stopped");
    }
    public void startDisc(){
        disc.setState(disc.getStartState());
        System.out.println("Starting the movie back up");
    }
    public void pauseDisc(){
        System.out.println("The movie is already paused");
    }
    public void removeDisc(){
        disc.setState(disc.getStopState());
        System.out.println("The movie has been stopped and ejected");
    }
    public String toString(){
        return "The movie has been paused";
    }
}
