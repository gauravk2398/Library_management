package bookController.demo;

public class book {
    private String name;
    private String authorName;

    private int pages;
    public book(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public book(String name, String authorName, int pages) {
        this.name = name;
        this.authorName = authorName;
        this.pages = pages;
    }
}
