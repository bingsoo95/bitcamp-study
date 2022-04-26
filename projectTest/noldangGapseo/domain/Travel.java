package com.noldangGapseo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Travel {

    private Integer travelId;
    private String travelName;
    private String period;
    private String dDay;
    private Integer totalCost;
    private String nickName;
}
