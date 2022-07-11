package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dao.IJournalDAO;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component

public class JournalService implements IJournalService {
    List<JournalEntry> journalEntryList = new ArrayList<>();

    @Override
    public void save(JournalEntry journalEntry) {
        JournalEntryjournalentry = new JournalEntry();
        journalentry.setDate("May 2021");
        journalentry.setNotes("I entered my first notes!");
        journalEntryList.add(journalentry);
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntryList;
    }
}
