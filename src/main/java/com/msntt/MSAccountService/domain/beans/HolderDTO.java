package com.msntt.MSAccountService.domain.beans;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HolderDTO {
    @NotBlank
    private String accountNumber;
    @NotBlank
    private String holderId;
}
