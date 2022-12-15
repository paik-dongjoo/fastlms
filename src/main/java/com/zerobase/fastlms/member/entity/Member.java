package com.zerobase.fastlms.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Member {

    @Id
    private String userId;

    private String userName;
    private String phone;
    private String password;

    // 화면에는 보이지 않지만 내부적으로 가입 일시를 기록하기 위함
    private LocalDateTime regDt;

    private boolean emailAuthYn;
    private String emailAuthKey;
    private LocalDateTime emailAuthDt;

}
