package bookController.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class bookController {
    @Autowired
    bookService bookServiceOb;
    @PostMapping("/add-book")
    public String addBook(@RequestBody book book){
        return bookServiceOb.addBook(book);
    }
    @PostMapping("/add-author")
    public String addAuthor(@RequestBody author author){
        return bookServiceOb.addAuthor(author);
    }
    @GetMapping("/find-author-with-rating-x/{x}")
    public int findAuthorWithRatingGreaterX(@PathVariable("x") int x){
        return bookServiceOb.findAuthorRatingGreaterX(x);
    }
    @GetMapping("/book-with-high-pages")
    public String bookWithHighPages(){
        return bookServiceOb.bookWithHighPages();
    }
}
