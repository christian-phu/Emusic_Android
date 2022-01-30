package com.thv.hoangvu.Emusic.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class ChuDe implements Serializable {

@SerializedName("IdChude")
@Expose
private String idChude;
@SerializedName("Tenchude")
@Expose
private String tenchude;
@SerializedName("Hinhchude")
@Expose
private String hinhchude;

public String getIdChude() {
return idChude;
}

public void setIdChude(String idChude) {
this.idChude = idChude;
}

public String getTenchude() {
return tenchude;
}

public void setTenchude(String tenchude) {
this.tenchude = tenchude;
}

public String getHinhchude() {
return hinhchude;
}

public void setHinhchude(String hinhchude) {
this.hinhchude = hinhchude;
}

}