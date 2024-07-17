package rs.ac.bg.fon.njt.title;

import org.springframework.stereotype.Service;

@Service
public class TitleService {
    private final TitleRepository titleRepository;

    public TitleService(TitleRepository titleRepository) {
        this.titleRepository = titleRepository;
    }
}
