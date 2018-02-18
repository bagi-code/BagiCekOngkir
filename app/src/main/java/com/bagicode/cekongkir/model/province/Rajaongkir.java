package com.bagicode.cekongkir.model.province;

/**
 * Created by Robby Dianputra on 2/12/2018.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rajaongkir {

    @SerializedName("query")
    @Expose
    private List<Object> query = null;
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    public List<Object> getQuery() {
        return query;
    }

    public void setQuery(List<Object> query) {
        this.query = query;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

}
