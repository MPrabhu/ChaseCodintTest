package com.chase.chasecodinttest.model.dataprovider;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class DataProviderRequest {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull
    @NotEmpty
    private String accountNumber;
}
