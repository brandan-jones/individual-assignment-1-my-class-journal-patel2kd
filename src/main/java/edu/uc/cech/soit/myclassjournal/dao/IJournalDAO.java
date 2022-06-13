package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;

import java.util.List;

public interface IJournalDAO {
    List<JournalEntry> save() throws Exception;

    Object save(JournalEntry journalEntry);
}
