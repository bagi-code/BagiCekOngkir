package com.bagicode.cekongkir.model.province;

/**
 * Created by Robby Dianputra on 2/12/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemProvince {

    @SerializedName("rajaongkir")
    @Expose
    private Rajaongkir rajaongkir;

    public ItemProvince(Rajaongkir rajaongkir) {
        this.rajaongkir = rajaongkir;
    }

    public Rajaongkir getRajaongkir() {
        return rajaongkir;
    }

    public void setRajaongkir(Rajaongkir rajaongkir) {
        this.rajaongkir = rajaongkir;
    }

}
