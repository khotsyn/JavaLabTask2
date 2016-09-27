package task2_8;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int editor;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        if (price != other.price) {
            return false;
        }
        if (null == title) {
            return (title == other.title);
        } else {
            if (!title.equals(other.title)) {
                return false;
            }
        }

        if (null == author) {
            return (author == other.author);
        } else {
            if (!author.equals(other.author)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + price;
        hash = hash * 31 + (title == null ? 0 : title.hashCode());
        hash = hash * 31 + (author == null ? 0 : author.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        String obj = "\"" + title + "\" " + author + " " + price + "$";
        return obj;
    }

}
