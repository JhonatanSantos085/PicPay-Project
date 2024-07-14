package jhon.kiss.picpay_project.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import jhon.kiss.picpay_project.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
