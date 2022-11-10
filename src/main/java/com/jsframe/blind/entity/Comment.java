package com.jsframe.blind.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="commenttbl")
@Data
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="c_no")
  private Long cNo;

  @ManyToOne
  @JoinColumn(name="m_id")
  private Member m_id;

  @ManyToOne
  @JoinColumn(name="b_no")
  private Board bNo;


  @Column(name="c_date")
  @CreationTimestamp
  private Timestamp cDate;


  @Column(name="c_like")
  private int cLike;

  @Column(name="c_content", length = 200, nullable = false)
  private String cContent;

  @Column(name="c_report")
  private int cReport;
}
