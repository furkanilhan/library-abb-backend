package com.libraryapp.spring_boot_library.dao;

import com.libraryapp.spring_boot_library.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface BookRepository extends JpaRepository<Book, Long> {

    Page<Book> findByTitleContainingIgnoreCase(@RequestParam("title") String title, Pageable pageable);

    Page<Book> findByCategoryIgnoreCase(@RequestParam("category") String category, Pageable pageable);
}
