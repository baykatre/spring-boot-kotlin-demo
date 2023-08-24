package tr.com.anilozturk.springbootkotlindemo.repository

import org.springframework.data.jpa.repository.JpaRepository
import tr.com.anilozturk.springbootkotlindemo.entity.Book

interface BookRepository: JpaRepository<Book, Int>