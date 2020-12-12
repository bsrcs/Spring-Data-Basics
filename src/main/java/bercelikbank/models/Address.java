package bercelikbank.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String addressTitle;
    private String line1;
    private String line2;
    private String country;
    private String city;
    private String pinCode;
    @ManyToOne
    private Customer customer;
}