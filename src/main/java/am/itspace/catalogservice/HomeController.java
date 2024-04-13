package am.itspace.catalogservice;

import am.itspace.catalogservice.config.BookshopProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {


    private final BookshopProperties bookshopProperties;

    public HomeController(BookshopProperties bookshopProperties) {
        this.bookshopProperties = bookshopProperties;
    }

    @GetMapping("/")
    public String getGreeting(){
        return bookshopProperties.getGreeting();
    }
}
