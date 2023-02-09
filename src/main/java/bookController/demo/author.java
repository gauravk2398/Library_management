package bookController.demo;

public class author {
    private String name;

    private int rating;
    private int noOfPages;

    public author(String name, int noOfPages) {
        this.name = name;
        this.noOfPages = noOfPages;
    }

    public author(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public author(String name, int rating, int noOfPages) {
        this.name = name;
        this.rating = rating;
        this.noOfPages = noOfPages;
    }
}
