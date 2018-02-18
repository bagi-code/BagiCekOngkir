package com.bagicode.cekongkir.model.cost;

/**
 * Created by Robby Dianputra on 2/14/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("costs")
    @Expose
    private List<Cost> costs = null;

    public Result(String code, String name, List<Cost> costs) {
        this.code = code;
        this.name = name;
        this.costs = costs;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cost> getCosts() {
        return costs;
    }

    public void setCosts(List<Cost> costs) {
        this.costs = costs;
    }

}
