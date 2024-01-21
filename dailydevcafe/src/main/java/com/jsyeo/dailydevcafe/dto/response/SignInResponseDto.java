package com.jsyeo.dailydevcafe.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter @Setter
public class SignInResponseDto extends ResponseDto {

    private String token;
    private int expirationTime;

    private SignInResponseDto(int code, String message, ResponseMemberDto dto, String token) {
        super(code, message, dto);
        this.token = token;
        this.expirationTime = 3600;
    }

    public static SignInResponseDto success(ResponseMemberDto dto, String token) {
        return new SignInResponseDto(HttpStatus.OK.value(), "로그인 성공", dto, token);
    }

    public static ResponseDto fail(ResponseMemberDto dto) {
        return new ResponseDto(HttpStatus.BAD_REQUEST.value(), "로그인 정보가 일치하지 않습니다.", dto);
    }
}
