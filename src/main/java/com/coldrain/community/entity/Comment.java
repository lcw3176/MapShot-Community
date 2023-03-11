package com.coldrain.community.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "comment")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    @Column(name = "content", nullable = false, length = 1000)
    private String content;

    @Column(name = "commenter_ip_address", nullable = false)
    private String commenterIpAddress;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;


    @Builder
    public Comment(String content, String commenterIpAddress, Board board) {
        this.content = content;
        this.commenterIpAddress = commenterIpAddress;

        if (this.board != null) {
            this.board.getComments().remove(this);
        }

        this.board = board;
        board.getComments().add(this);
    }


}
