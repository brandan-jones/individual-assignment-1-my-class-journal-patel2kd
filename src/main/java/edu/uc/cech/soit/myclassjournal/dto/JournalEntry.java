package edu.uc.cech.soit.myclassjournal.dto;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Data;
import lombok.Generated;

import java.util.List;

public @Data
class JournalEntry {
    private String Notes;
    private String Date;
    private List<JournalEntry> journalEntries;
}
