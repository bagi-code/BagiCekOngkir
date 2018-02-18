package com.bagicode.cekongkir.model.city;

/**
 * Created by Robby Dianputra on 2/13/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemCity {

    @SerializedName("rajaongkir")
    @Expose
    private Rajaongkir rajaongkir;

    public Rajaongkir getRajaongkir() {
        return rajaongkir;
    }

    public void setRajaongkir(Rajaongkir rajaongkir) {
        this.rajaongkir = rajaongkir;
    }

}
