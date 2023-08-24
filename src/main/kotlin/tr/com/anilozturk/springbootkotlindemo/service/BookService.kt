package tr.com.anilozturk.springbootkotlindemo.service

import org.springframework.stereotype.Service
import tr.com.anilozturk.springbootkotlindemo.entity.Book
import tr.com.anilozturk.springbootkotlindemo.repository.BookRepository

@Service
class BookService(var bookRepository: BookRepository) {

    fun getAll(): Iterable<Book> = bookRepository.findAll()
    fun getById(id: Int) = bookRepository.findById(id)
    fun save(book: Book) = bookRepository.save(book)
}