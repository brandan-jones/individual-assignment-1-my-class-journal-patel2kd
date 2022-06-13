package edu.uc.cech.soit.myclassjournal.dto;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Data;
import lombok.Generated;

public @Data
class JournalEntry {
    private String Notes;
    private String Date;
}
