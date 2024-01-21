package com.jsyeo.dailydevcafe.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter @Setter
public class SignUpResponseDto extends ResponseDto {

    private SignUpResponseDto(int code, String message, ResponseMemberDto dto) {
        super(code, message, dto);
    }

    public static SignUpResponseDto success(ResponseMemberDto dto) {
        return new SignUpResponseDto(HttpStatus.OK.value(), "회원가입이 완료되었습니다.", dto);
    }

    public static SignUpResponseDto duplicateEmail(ResponseMemberDto dto) {
        return new SignUpResponseDto(HttpStatus.BAD_REQUEST.value(), "이미 존재하는 이메일입니다.", dto);
    }

    public static SignUpResponseDto duplicateNickname(ResponseMemberDto dto) {
        return new SignUpResponseDto(HttpStatus.BAD_REQUEST.value(), "이미 존재하는 닉네임입니다.", dto);
    }
}
