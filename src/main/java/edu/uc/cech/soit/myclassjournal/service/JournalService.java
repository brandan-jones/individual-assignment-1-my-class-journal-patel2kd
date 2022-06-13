package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dao.IJournalDAO;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class JournalService implements IJournalService {
    private IJournalDAO journalDAO;

    public JournalService(){
    }
    public JournalService(IJournalDAO journalDAO){

        this.journalDAO = journalDAO;
    }
    @Override
    public void save(JournalEntry journalEntry) {
    }

    @Override
    public List<JournalEntry> fetchAll() throws Exception { return journalDAO.save(); }
}
