package jhon.kiss.picpay_project.domain.repositories;

import jhon.kiss.picpay_project.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
