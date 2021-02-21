public class StartPlayer implements State {
    BluRayPlayer disc;

    public StartPlayer(BluRayPlayer disc){
        this.disc = disc;

    }
    public void insertDisc(String movie) {
        System.out.println("first remove the current movie before inserting another disc");
    }
    public void stopDisc(){
        disc.setState(disc.getStopState());
        System.out.println( "The movie has been stopped");
    }
    public void startDisc(){

        System.out.println("Already started movie");
    }
    public void pauseDisc(){
        disc.setState(disc.getPauseState());
        System.out.println("The movie has been paused");
    }
    public void removeDisc(){
        System.out.println("The disc has been stopped and ejected.");
        disc.setInsertDisc(false);
        disc.setState(disc.getStopState());
    }
}
