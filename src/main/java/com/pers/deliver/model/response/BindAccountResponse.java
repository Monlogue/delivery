package com.pers.deliver.model.response;

import com.pers.deliver.model.Shop;
import lombok.Data;

import java.util.List;

@Data
public class BindAccountResponse extends CommonResponse {
    List<Shop> shopList;

}
