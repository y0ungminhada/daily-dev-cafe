package com.jsyeo.dailydevcafe.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto<T> {

    private int code;
    private String message;
    private T data;
}
