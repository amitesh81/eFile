package gov.mo.courts.cases.controller;

import gov.mo.courts.cases.dto.CaseDto;
import gov.mo.courts.cases.dto.ContactDto;
import gov.mo.courts.cases.dto.EfileSubmissionResponseDto;
import gov.mo.courts.cases.model.Case;
import gov.mo.courts.cases.service.ICaseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api", produces = "application/json")
public class CasesController {
    @Autowired
    private ICaseService caseService;
    @Autowired
    private ContactDto contactDto;

    @GetMapping ("/contact")
    public ResponseEntity<ContactDto> getContact() {
        return ResponseEntity.status(HttpStatus.OK).body(contactDto);
    }

    @GetMapping ("/getAllCasesByUserName")
    public List<Case> getCases(String userName) {
        // This method will handle requests to get cases
        return null;
    }
    @GetMapping ("/getCase/{id}")
    public Case getCaseById(String caseNumber) {
        // This method will handle requests to get a case by its ID
        return new Case();
    }
    @PostMapping("/createCase")
    public ResponseEntity<EfileSubmissionResponseDto> createCase(@RequestBody CaseDto caseDto) {
        caseService.createCase(caseDto);
       return ResponseEntity.status(HttpStatus.CREATED).body(new EfileSubmissionResponseDto(HttpStatus.CREATED.toString(), HttpStatus.CREATED.getReasonPhrase()));
    }
    @PatchMapping("/updateCase")
    public Case updateCase(Long id, @RequestBody CaseDto caseDto) {
        // This method will handle requests to update an existing case
        return null;
    }
    @DeleteMapping("/deleteCase")
    public void deleteCase(String caseNumber) {
        // This method will handle requests to delete a case

    }
}
