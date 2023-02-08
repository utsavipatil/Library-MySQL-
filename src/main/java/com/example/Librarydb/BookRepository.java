package com.example.Librarydb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //1st para - which Schema we want to join, 2nd para - Type of primary Key
public interface BookRepository extends JpaRepository <Book , Integer>{
}
