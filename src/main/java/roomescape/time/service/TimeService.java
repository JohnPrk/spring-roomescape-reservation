package roomescape.time.service;

import org.springframework.stereotype.Service;
import roomescape.time.domain.Time;
import roomescape.time.domain.TimeRepository;

import java.util.List;

@Service
public class TimeService {

    private final TimeRepository timeRepository;

    public TimeService(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    public Time save(Time time) {
        Long id = timeRepository.save(time);
        return timeRepository.findById(id);
    }

    public List<Time> findAll() {
        return timeRepository.findAll();
    }
}
