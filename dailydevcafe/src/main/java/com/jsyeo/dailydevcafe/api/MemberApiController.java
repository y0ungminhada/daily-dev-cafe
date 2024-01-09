package com.jsyeo.dailydevcafe.api;

import com.jsyeo.dailydevcafe.dto.MemberDto;
import com.jsyeo.dailydevcafe.dto.request.SignUpRequestDto;
import com.jsyeo.dailydevcafe.dto.response.ResponseDto;
import com.jsyeo.dailydevcafe.dto.response.SignUpResponseDto;
import com.jsyeo.dailydevcafe.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class MemberApiController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity registerMember(@RequestBody @Valid SignUpRequestDto signUpRequestDto) {

        MemberDto memberDto = new MemberDto();
        memberDto.setName(signUpRequestDto.getName());
        memberDto.setEmail(signUpRequestDto.getEmail());
        memberDto.setPassword(signUpRequestDto.getPassword());

        Long saveId = memberService.join(memberDto);
        memberDto.setId(saveId);
        memberDto.setPassword(null);

        ResponseDto responseDto = new SignUpResponseDto();
        responseDto.setData(memberDto);

        return ResponseEntity.ok().body(responseDto);
    }
}
