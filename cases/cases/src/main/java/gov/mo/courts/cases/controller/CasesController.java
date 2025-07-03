package gov.mo.courts.cases.controller;

import gov.mo.courts.cases.dto.CaseDto;
import gov.mo.courts.cases.dto.EfileSubmissionResponseDto;
import gov.mo.courts.cases.model.Case;
import gov.mo.courts.cases.service.ICaseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path="/api", produces = "application/json")
public class CasesController {
    private ICaseService caseService;

    @GetMapping ("/test")
    public String testApi() {
        // This method will handle requests to get cases
        return "Api Test";
    }

    @GetMapping ("/cases")
    public List<Case> getCases() {
        // This method will handle requests to get cases
        return null;
    }
    @GetMapping ("/cases/{id}")
    public Case getCaseById(@PathVariable Long id) {
        // This method will handle requests to get a case by its ID
        return new Case();
    }
    @PostMapping("/createCase")
    public ResponseEntity<EfileSubmissionResponseDto> createCase(@RequestBody CaseDto caseDto) {
        caseService.createCase(caseDto);
       return ResponseEntity.status(HttpStatus.CREATED).body(new EfileSubmissionResponseDto(HttpStatus.CREATED.toString(), HttpStatus.CREATED.getReasonPhrase()));
    }
    @PatchMapping
    public Case updateCase(Long id, Case updatedCase) {
        // This method will handle requests to update an existing case
        return null;
    }
    @DeleteMapping
    public void deleteCase(Long id) {
        // This method will handle requests to delete a case

    }
}
