package rocketseat.com.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.checkin.CheckIn;

public interface CheckinRepository extends JpaRepository<CheckIn, Integer> {
}
