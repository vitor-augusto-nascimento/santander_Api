package vitorAugusto.santander_Api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vitorAugusto.santander_Api.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);
}
