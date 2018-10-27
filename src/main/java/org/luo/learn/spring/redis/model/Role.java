package org.luo.learn.spring.redis.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable {
    private static final long serialVersionUID = -4634696446701639090L;

    private Long id;
    private String roleName;
    private String note;
}
