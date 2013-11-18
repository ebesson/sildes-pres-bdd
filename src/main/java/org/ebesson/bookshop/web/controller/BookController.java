package org.ebesson.bookshop.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

import org.ebesson.bookshop.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Etienne Besson
 */
@Controller
public class BookController {

    private static final AtomicLong bookIdGenerator = new AtomicLong(0);

    private static final ConcurrentSkipListMap<Long, Book> bookRepository = new ConcurrentSkipListMap<Long, Book>();

    @RequestMapping(value = "/book", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Book> list() {
        return new ArrayList<Book>(bookRepository.values());
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Book getById(@PathVariable final long id) {
        return bookRepository.get(id);
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(@RequestBody final Book todo) {
        long id = bookIdGenerator.incrementAndGet();
        todo.setId(id);
        bookRepository.put(id, todo);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable final long id) {
        bookRepository.remove(id);
    }

}
