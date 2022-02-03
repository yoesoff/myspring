package com.yoesoff.myspring.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
public class GeneralResponseDTO {
    public String message;
    public Object data;
}
