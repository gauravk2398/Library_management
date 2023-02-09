package bookController.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookService {
    @Autowired
    bookRepository bookRepositoryOb;
    public String addBook(book book){

        return bookRepositoryOb.addBook(book);
    }
    public String addAuthor(author author){
        return bookRepositoryOb.addAuthor(author);
    }
    public int findAuthorRatingGreaterX(int x){
        return bookRepositoryOb.findAuthorRatingGreaterX(x);
    }
    public String bookWithHighPages(){
        return bookRepositoryOb.bookWithHighPages();
    }
}
