package com.jsframe.blind.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

@Entity
@Table(name = "boardtbl")
@Data
public class Board {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="b_no")
  private Long bNo;

  @ManyToOne
  @JoinColumn(name = "m_id")
  private Member mId;

  @Column(name = "b_title", nullable = false, length = 50)
  private String bTitle;

  @Column(name = "b_content", length = 1000)
  private String bContent;

  @Column(name = "b_category", nullable = false, length = 20)
  private String bCategory;

  @Column(name = "b_update", length = 10)
  private String bUpdate;

  @Column(name = "b_view")
  private int bView;

  @Column(name = "b_like")
  private int bLike;

  @Column(name = "b_report")
  private int bReport;

  @Column(name = "b_comment")
  private int bComment;

  @Column(name = "b_date")
  @CreationTimestamp
  private String bDate;


}
