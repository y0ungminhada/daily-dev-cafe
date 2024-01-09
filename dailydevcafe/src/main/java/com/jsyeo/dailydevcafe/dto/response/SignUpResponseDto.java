package com.jsyeo.dailydevcafe.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SignUpResponseDto extends ResponseDto {
    String message = "회원가입이 정상적으로 처리되었습니다.";
}
