package bercelikbank.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BANK_ACCOUNT")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="ACCOUNT_NUMBER", length = 5, nullable=false, unique=true)
    private String accountNum;
    private int balance;
}
