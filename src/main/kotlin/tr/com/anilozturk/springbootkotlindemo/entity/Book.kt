package tr.com.anilozturk.springbootkotlindemo.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val isbn: Int,
    val name: String,
    val author: String,
    val year: Int?
    )