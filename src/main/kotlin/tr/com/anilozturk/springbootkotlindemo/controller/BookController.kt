package tr.com.anilozturk.springbootkotlindemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import tr.com.anilozturk.springbootkotlindemo.entity.Book
import tr.com.anilozturk.springbootkotlindemo.service.BookService

@RestController
@RequestMapping("/book")
class BookController(val bookService: BookService) {

    @GetMapping
    fun getAllBooks() = bookService.getAll();

    @GetMapping("/{id}")
    fun getAllBooks(@PathVariable id: Int) = bookService.getById(id);

    @PostMapping
    fun save(@RequestBody book: Book) = bookService.save(book);
}