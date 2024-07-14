package jhon.kiss.picpay_project.domain.transaction;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "transactions")
@Table(name = "transactions")
@Setter
@Getter
@EqualsAndHashCode(of = "id")

public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "payer-id")
    private User payer;

    @ManyToOne
    @JoinColumn(name = "payee_id")
    private User payee;

    private LocalDateTime transactionTime


}
