package sqb.uz.marry_me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sqb.uz.marry_me.entity.ClientSimple;

@Repository
public interface ClientSimpleRepository extends JpaRepository<ClientSimple, Long> {
}
