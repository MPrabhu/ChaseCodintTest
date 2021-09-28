package com.chase.chasecodinttest.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ServiceResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<ResponseData> result;
}
