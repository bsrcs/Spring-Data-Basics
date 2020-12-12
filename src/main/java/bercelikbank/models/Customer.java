package bercelikbank.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    //TODO : read about 'cascade' & 'fetch'
    @OneToMany(mappedBy = "customer",cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Address> addresses;
    private String phoneNumber;
    @OneToOne
    private BankAccount bankAccount;
}
