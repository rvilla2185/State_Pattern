public class BluRayPlayer {
    private State startState;
    private State stopState;
    private State pauseState;
    private boolean discInserted;
    private String movie;

    private State state;

    public BluRayPlayer(boolean discInserted, String movie) {
     this.startState = new StartPlayer(this);
     this.stopState = new StopPlayer(this);
     this.pauseState = new PauseDisc(this);

     this.discInserted = discInserted;
     this.movie = movie;
     this.state = stopState;

    }
    public void insertDisc(String movie){
        state.insertDisc(movie);
    }
    public void stopDisc(){
        state.stopDisc();
    }
    public void startDisc(){
        state.startDisc();
    }
    public void pauseDisc(){
        state.pauseDisc();
    }
    public void removeDisc(){
        state.removeDisc();
    }
    public void setState(State state){
        this.state = state;
    }
    public State getStartState(){
        return startState;
    }
    public State getStopState(){
        return stopState;
    }
    public State getPauseState(){
        return pauseState;
    }
    public void setInsertDisc(boolean discInserted){
        if(this.discInserted && (this.discInserted == discInserted)){
            System.out.println("Disc already in the blu-ray player");
        }
        else if (!this.discInserted &&  discInserted){
            this.discInserted = discInserted;
            System.out.println("The disc has been inserted");
        }
        else {
            this.discInserted = discInserted;
        }
    }
    public boolean getInsert(){
        return discInserted;
    }
    public String toString(){
        StringBuffer output = new StringBuffer();
        output.append("This is your choice:\n");
        output.append(movie+"\n");
        return output.toString();
    }
}
