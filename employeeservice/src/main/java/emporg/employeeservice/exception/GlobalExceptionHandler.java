package emporg.employeeservice.exception;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import emporg.employeeservice.constants.EmployeeConstants;
import emporg.employeeservice.support.Designation;
import emporg.employeeservice.support.ErrorResponse;
import jakarta.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        Map<String, String> errorMap = new HashMap<>();
        List<ObjectError> validationErrors = ex.getBindingResult().getAllErrors();

        for (ObjectError error : validationErrors) {
            String field = ((FieldError) error).getField();
            String errorMsg = error.getDefaultMessage();
            errorMap.put(field, errorMsg);
        }

        return new ResponseEntity<>(errorMap, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidFormatException.class)
    public void handleInvalidDesignationException(HttpServletResponse response, InvalidFormatException ex)
            throws IOException {
        if (ex.getTargetType().isAssignableFrom(Designation.class)) {
            response.sendError(HttpStatus.BAD_REQUEST.value(), EmployeeConstants.INVALID_DESIGNATION);
        } else {
            response.sendError(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
        }
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex,
            WebRequest request) {
        ErrorResponse error = new ErrorResponse(request.getDescription(false), HttpStatus.NOT_FOUND, ex.getMessage(),
                LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ResourceAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleResourceAlreadyExistsException(ResourceAlreadyExistsException ex,
            WebRequest request) {
        ErrorResponse error = new ErrorResponse(request.getDescription(false), HttpStatus.CONFLICT, ex.getMessage(),
                LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.CONFLICT);
    }
}
