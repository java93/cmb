package kg.mcom17.CBM.repository;

import kg.mcom17.CBM.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmailRepository extends JpaRepository<Email, Long> {
}
