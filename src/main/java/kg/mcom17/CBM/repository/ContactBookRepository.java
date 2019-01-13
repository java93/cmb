package kg.mcom17.CBM.repository;

import kg.mcom17.CBM.entity.ContactBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactBookRepository extends JpaRepository<ContactBook, Long> {
}
