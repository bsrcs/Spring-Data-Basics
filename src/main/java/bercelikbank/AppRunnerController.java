package bercelikbank;

import bercelikbank.models.Address;
import bercelikbank.models.Customer;
import bercelikbank.repositories.AddressRepo;
import bercelikbank.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@SpringBootApplication
public class AppRunnerController implements CommandLineRunner {


    @Autowired
    CustomerRepo customerRepo;

    public static void main(String[] args) {
        SpringApplication.run(AppRunnerController.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //save customer with address
        Customer c = new Customer();
        c.setFirstName("Micheal");
        c.setLastName("Jackson");
        Address wAddress=new Address();
        wAddress.setAddressTitle("home address");
        Set<Address> addresses = new HashSet<>();
        addresses.add(wAddress);
        c.setAddresses(addresses);
        //customerRepo.save(c);

        Customer cus = customerRepo.findFirstByFirstName("Steve");
        System.out.println(cus);
    }
}
