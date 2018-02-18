package com.bagicode.cekongkir.model.expedisi;

/**
 * Created by Robby Dianputra on 2/15/2018.
 */

public class ItemExpedisi {

    private String id;
    private String name;

    public ItemExpedisi() {
    }

    public ItemExpedisi(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
