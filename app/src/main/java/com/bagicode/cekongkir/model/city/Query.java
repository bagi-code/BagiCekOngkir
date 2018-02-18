package com.bagicode.cekongkir.model.city;

/**
 * Created by Robby Dianputra on 2/13/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Query {

    @SerializedName("province")
    @Expose
    private String province;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

}
