package com.zjq.server.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* <p>
* 
* </p>
*
* @author 张建起
* @since 2023-06-27
*/
@Data
@NoArgsConstructor
@TableName("oauth2_authorization_consent")
public class Oauth2AuthorizationConsent {
    private static final long serialVersionUID = 1L;

    private String registeredClientId;

    private String principalName;

    private String authorities;
}
