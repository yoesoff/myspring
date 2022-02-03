package com.yoesoff.myspring.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class FooRequestDTO implements Serializable {
    public String name;
    public String address;
}
