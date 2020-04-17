package in.helloclient.hcbookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.helloclient.hcbookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
