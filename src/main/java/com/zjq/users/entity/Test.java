package com.zjq.users.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 测试表
 * </p>
 *
 * @author 张建起
 * @since 2023-06-08
 */
@Data
@NoArgsConstructor
@TableName("test")
public class Test {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("`name`")
    private String name;
}
