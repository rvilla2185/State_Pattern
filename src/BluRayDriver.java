public class BluRayDriver {
    public static void main(String[] args){
        BluRayPlayer disc = new BluRayPlayer(true, "Silence of the Lambs");

        System.out.println(disc);

        disc.getStartState();
        //Check if it recognizes a disc is in the blu-ray player
        disc.setInsertDisc(true);
        System.out.println();

        //Stop the movie
        disc.stopDisc();
        //Check if it recognizes that is cannot pause a stopped movie
        disc.pauseDisc();
        disc.startDisc();
        // remove the movie
        disc.removeDisc();
        System.out.println();

        disc.insertDisc("Anchorman");

        //check if it recognizes there is no movie to remove;
        disc.removeDisc();

    }
}
