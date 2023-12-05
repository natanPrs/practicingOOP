public class Visualization {
    private Student viewer;
    private Video movie;

    public Visualization(Student viewer, Video movie) {
        this.viewer = viewer;
        this.movie = movie;
        this.viewer.setTotalWatched(this.viewer.getTotalWatched()+1);
        this.movie.setViews(this.movie.getViews()+1);
    }

    public void rate() {
        this.movie.setReview(5);
    }
    public void rate(int note) {
        this.movie.setReview(note);
    }
    public void rate(float percentage) {
        int total = 0;
        if (percentage <= 20) {
            total = 3;
        }else if (percentage <= 50) {
            total = 5;
        }else if (percentage <= 90) {
            total = 8;
        }else {
            total = 10;
        }
        this.movie.setReview(total);
    }
    public Student getViewer() {
        return viewer;
    }

    public void setViewer(Student viewer) {
        this.viewer = viewer;
    }

    public Video getMovie() {
        return movie;
    }

    public void setMovie(Video movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Visualization{" +
                "viewer=" + viewer +
                ", movie=" + movie +
                '}';
    }
}
