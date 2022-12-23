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
public class Member implements MemberCode {

    @Id
    private String userId;
    private String userName;
    private String phone;
    private String password;

    // 화면에는 보이지 않지만 내부적으로 가입 일시를 기록하기 위함
    private LocalDateTime regDt;

    private boolean emailAuthYn;
    private LocalDateTime emailAuthDt;
    private String emailAuthKey;

    private String resetPasswordKey;
    private LocalDateTime resetPasswordLimitDt;

    // 관리자 여부를 지정할 것인지?
    // 회원에 따른 ROLE 을 지정할 것인지? - 준회원, 정회원, 특별회원, 관리자
    private boolean adminYn;

    // 이용 가능한 상태, 정지 상태
    private String userStatus;

}
