package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalService implements IJournalService {
    @Override
    public void save(JournalEntry journalEntry) {

    }

    @Override
    public List<JournalEntry> fetchAll() {
        return null;
    }
}
