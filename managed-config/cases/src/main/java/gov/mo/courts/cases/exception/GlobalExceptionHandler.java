package gov.mo.courts.cases.exception;

import gov.mo.courts.cases.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {
    // This class will handle global exceptions for the application
    // You can define methods here to handle specific exceptions and return appropriate responses
    // For example, you can handle CaseException or any other custom exceptions you create

    // Example method to handle CaseException
     @ExceptionHandler(CaseException.class)
     public ResponseEntity<ErrorResponseDto> handleCaseException(CaseException ex, WebRequest webRequest) {
            ErrorResponseDto errorResponseDto = new ErrorResponseDto(
                    HttpStatus.BAD_REQUEST.toString(),
                    ex.getMessage(),
                    webRequest.getDescription(false),
                    LocalDateTime.now()
            );

         return new ResponseEntity<>(errorResponseDto, HttpStatus.BAD_REQUEST);
     }

}
