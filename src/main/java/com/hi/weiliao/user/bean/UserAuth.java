package com.hi.weiliao.user.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAuth implements Serializable {
    private Integer id;
    private String phone;
    private String password;
    private String wxOpenid;
    private String createTime;
    private String reviseTime;
}