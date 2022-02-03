package com.yoesoff.myspring.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class MessageResponseDTO {
    public String message;
}
