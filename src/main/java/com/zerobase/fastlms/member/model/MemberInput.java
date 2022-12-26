package com.zerobase.fastlms.member.model;

import lombok.*;

@Data
@ToString
public class MemberInput {

    private String userId;
    private String userName;
    private String phone;
    private String password;

    private String newPassword;

    private String zipcode;
    private String addr;
    private String addrDetail;

}
