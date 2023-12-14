package com.demo.springbootinterviewquestions.contoller;

import com.demo.springbootinterviewquestions.dto.Book;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DeserilizationControllerDemo {
    @PostMapping("/books")
    public String processBook(@RequestBody Book book){
        return book.getTitle()+" New book has been published on year "+book.getPublicationYear();
    }
}
