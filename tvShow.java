public class tvShow {
    private String showName;
    private int showTotEpisodes;
    private String showGenre;

    public tvShow(String showName) {
        this.showName = showName;
    }

    public tvShow(int showTotEpisodes) {
        this.showTotEpisodes = showTotEpisodes;
    }

    public tvShow(int showTotEpisodes, String showGenre) {
        this.showTotEpisodes = showTotEpisodes;
        this.showGenre = showGenre;
    }

    public tvShow(String showName, int showTotEpisodes) {
        this.showName = showName;
        this.showTotEpisodes = showTotEpisodes;
    }

    public tvShow(String showName, int showTotEpisodes, String showGenre) {
        this.showName = showName;
        this.showTotEpisodes = showTotEpisodes;
        this.showGenre = showGenre;
    }

    //    getters
    public String getShow() {
        return showName;
    }

    public int getEpisodes() {
        return showTotEpisodes;
    }

    public String getGenre() {
        return showGenre;
    }

    public String toString() {
        return getShow() + " is a tv show in the genre of " + getGenre() + " and it has a total of " + getEpisodes() + " episodes";
    }
}

