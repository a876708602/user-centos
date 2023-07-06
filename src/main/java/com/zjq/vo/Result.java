package com.zjq.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 2023/7/6 17:31
 * @author DELL
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    private Integer code;

    private String message;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private T data;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Integer total;

}
