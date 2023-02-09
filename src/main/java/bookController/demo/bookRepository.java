package bookController.demo;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.HashMap;

@Repository
public class bookRepository {
    private HashMap<String,book> bookMap;
    private HashMap<String,author> authorMap;
    private  HashMap<String, List<book>> authorBookMap;

    public bookRepository(){
        this.bookMap=new HashMap<>();
        this.authorMap=new HashMap<>();
        this.authorBookMap=new HashMap<>();
    }
    public String addBook(book book){
        if(bookMap.containsKey(book.getName())){
            return "Booked already present";
        }
        if(!authorMap.containsKey(book.getAuthorName())){
            author author=new author(book.getName(),book.getPages());
            authorMap.put(author.getName(),author);
        }
        bookMap.put(book.getName(),book);
        return "Book added successfully";
    }
    public String addAuthor(author author){
        if(authorMap.containsKey(author.getName())){
            return "author already added";
        }else{
            authorMap.put(author.getName(),author);
        }
        return "Author added successfully";

    }
    public int findAuthorRatingGreaterX(int x){
        int count=0;
        for(String s:authorMap.keySet()){
            if(authorMap.get(s).getRating()<x){
                count++;
            }
        }
    return count;
    }
    public String bookWithHighPages(){
        int highPages=0;
        String book="";
        for(String s:bookMap.keySet()){
            if(bookMap.get(s).getPages()>highPages){
                highPages=bookMap.get(s).getPages();
                book=s;
            }
        }
        return book;
    }
}
