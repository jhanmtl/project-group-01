package ca.mcgill.ecse321.petshelter.repository;

import ca.mcgill.ecse321.petshelter.model.Donation;
import ca.mcgill.ecse321.petshelter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author louis
 */
//REST endpoint specification
@RepositoryRestResource(collectionResourceRel = "donation_data", path = "donation_data")
public interface DonationRepository extends JpaRepository<Donation, Long> {
    
    Donation findDonationsByUserUserNameAndAmount(String username, double amount);
    
    //find all by username doesnt work....
    List<Donation> findAllByUserUserName(String username);
    
    
    List<Donation> findAllByUser(User user);
}
