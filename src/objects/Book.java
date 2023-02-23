package objects;

import enums.Literature;

public class Book {
    private String bookName;
    private String whereFrom;
    private Literature type;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setWhereFrom(String library) {
        this.whereFrom = library;
    }

    public String getWhereFrom() {
        return whereFrom;
    }

    public void setType(Literature type) {
        this.type = type;
    }

    public Literature getType() {
        return type;
    }
}
