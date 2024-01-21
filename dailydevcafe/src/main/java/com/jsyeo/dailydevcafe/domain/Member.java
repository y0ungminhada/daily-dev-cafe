package com.jsyeo.dailydevcafe.domain;

import com.jsyeo.dailydevcafe.dto.request.SignUpRequestDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Value;

@Entity
@Getter
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "member_id")
    private String id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String nickname;

    @NotEmpty
    private String email;

    @NotEmpty
    private String password;

    @Enumerated(EnumType.STRING)
    private MemberType type = MemberType.APP;

    public Member(SignUpRequestDto dto) {
        this.name = dto.getName();
        this.nickname = dto.getNickname();
        this.email = dto.getEmail();
        this.password = dto.getPassword();
    }

    public Member(String id, String email, String name, MemberType type) {
        this.id = id;
        this.name = name;
        this.nickname = id;
        this.email = email;
        this.password = "Pa$sw0rd";
        this.type = type;
    }
}
