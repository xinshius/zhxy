package com.example.myzhxy.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_notification_pub")
public class Notificationpub {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String publisher;//发布者
    private String receiver;//接收者（为某位学生）
    private String data;//通知内容
    private Integer status;//查阅状态  0 ：未读 1：已读
}

