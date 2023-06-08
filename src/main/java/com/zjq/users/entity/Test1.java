package com.zjq.users.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
* <p>
    * 测试表
    * </p>
*
* @author 张建起
* @since 2023-06-08
*/
@Getter
@Setter
@TableName("test1")
public class Test1 {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

     @TableField("`name`")
    private String name;
}
