package interfaces;

import objects.Book;
import enums.Literature;

public interface Human {
    void say(String subjectName, String phrase, boolean isMeaningful, boolean isConfident);
    void read(String reader, Book b, boolean isInProgress, Literature type);
}

