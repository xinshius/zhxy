package com.example.myzhxy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**  班级实体类
 * @Author hongxiaobin
 * @Time 2022/10/11-19:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_clazz")
public class Clazz {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer number;
    private String introducation;
    private String headmaster;
    private String email;
    private String telephone;
    private String gradeName;
}
