package com.adminportal.web;

import com.adminportal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class ResourceController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/book/removeList", method = POST)
    public String removeList(
            @RequestBody ArrayList<String> bookIdList, Model model
    ) {

        for (String id : bookIdList) {
            String bookId = id.substring(8);
            bookService.removeOne(Long.parseLong(bookId));
        }

        return "delete success";
    }
}