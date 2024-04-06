package rocketseat.com.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.attendee.Attendee;
import rocketseat.com.passin.domain.event.Event;

import java.util.List;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
    public List<Attendee> findByEventId(String eventId);
}
