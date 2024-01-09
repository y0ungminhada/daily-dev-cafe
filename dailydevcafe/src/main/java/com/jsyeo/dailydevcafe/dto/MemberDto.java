package com.jsyeo.dailydevcafe.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {

    private Long id;
    private String name;
    private String email;
    private String password;
}
