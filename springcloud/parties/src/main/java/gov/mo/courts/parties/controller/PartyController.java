package gov.mo.courts.parties.controller;

import gov.mo.courts.parties.dto.EfileSubmissionResponseDto;
import gov.mo.courts.parties.dto.PartyDto;
import gov.mo.courts.parties.model.Party;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path="/api", produces = "application/json")
public class PartyController {
    @GetMapping("/getAllParties")
    public List<Party> getParties(String submissionNumber) {
        // This method will handle requests to get Partys
        return null;
    }
    @GetMapping ("/testPartyApi")
    public String testPartyApi() {
        // This method will handle requests to get a Party by its ID
        return "Success test party api";
    }
    @GetMapping ("/getParty/{id}")
    public Party getPartyById(String pidm) {
        // This method will handle requests to get a Party by its ID
        return new Party();
    }
    @PostMapping("/createParty")
    public ResponseEntity<EfileSubmissionResponseDto> createParty(@RequestBody PartyDto partyDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(new EfileSubmissionResponseDto(HttpStatus.CREATED.toString(), HttpStatus.CREATED.getReasonPhrase()));
    }
    @PatchMapping("/updateParty")
    public Party updateParty(Long id, @RequestBody PartyDto partyDto) {
        // This method will handle requests to update an existing Party
        return null;
    }
    @DeleteMapping("/deleteParty")
    public void deleteParty(String pidm) {
        // This method will handle requests to delete a Party
    }
}
