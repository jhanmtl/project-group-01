package ca.mcgill.ecse321.petshelter.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class AdvertisementException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AdvertisementException(String msg) {
        super(msg);
    }
}