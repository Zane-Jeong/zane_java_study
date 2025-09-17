package com.zane.section03.references;

public class Member {
    private String memberid;

    public Member(String memberid) {
        this.memberid = memberid;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberid='" + memberid + '\'' +
                '}';
    }
}
