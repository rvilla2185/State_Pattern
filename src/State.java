public interface State {
    void insertDisc(String movie);
    void stopDisc();
    void startDisc();
    void pauseDisc();
    void removeDisc();
}
