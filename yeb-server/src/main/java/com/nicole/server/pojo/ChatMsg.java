package com.nicole.server.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * 消息
 *
 * @author zhanglishen
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class ChatMsg {
    private String from;
    private String to;
    private String content;
    private LocalDateTime date;
    private String fromNickName;
}
