package gov.mo.courts.cases.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data @AllArgsConstructor
public class ErrorResponseDto {
    private String errorCode;
    private String errorMessage;
    private String apPath;
    private LocalDateTime erroTimestamp;
}
