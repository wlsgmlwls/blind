package com.jsframe.blind.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "membertbl")
@Data
public class Member {
  @Id
  @Column(name = "m_id", length = 20)
  private String mId;

  @Column(name="m_pwd", nullable = false, length = 100)
  private String mPwd;

  @Column(name="m_email", nullable = false, length = 100)
  private String mEmail;

  @Column(name="m_cname", nullable = false, length = 100)
  private String mCname;

}
