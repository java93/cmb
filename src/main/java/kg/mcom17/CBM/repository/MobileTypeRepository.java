package kg.mcom17.CBM.repository;

import kg.mcom17.CBM.entity.MobileType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileTypeRepository extends JpaRepository<MobileType, Long> {


}
