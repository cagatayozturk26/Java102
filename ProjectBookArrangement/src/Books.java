public class Books implements Comparable<Books>{
    private String name;
    private int totalPage;
    private String author;
    private String publishDate;

    public int compareTo(Books books){
        return this.getTotalPage() - books.getTotalPage();
    }
    public Books(String name, int totalPage, String author, String publishDate) {
        this.name = name;
        this.totalPage = totalPage;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
}
