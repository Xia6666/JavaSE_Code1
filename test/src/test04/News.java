package test04;

public class News {
    private String title;
    private int count;

    public News() {
    }

    public News(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", count=" + count +
                '}';
    }
}
