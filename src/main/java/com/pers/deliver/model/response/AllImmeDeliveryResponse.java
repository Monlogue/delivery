package com.pers.deliver.model.response;

import com.pers.deliver.model.Delivery;
import lombok.Data;

import java.util.List;

@Data
public class AllImmeDeliveryResponse extends CommonResponse {
    List<Delivery> list;
}
