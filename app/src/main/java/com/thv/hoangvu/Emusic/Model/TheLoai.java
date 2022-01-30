package com.thv.hoangvu.Emusic.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TheLoai implements Serializable {

@SerializedName("IdTheloai")
@Expose
private String idTheloai;
@SerializedName("IdKeychude")
@Expose
private String idKeychude;
@SerializedName("Tentheloai")
@Expose
private String tentheloai;
@SerializedName("Hinhtheloai")
@Expose
private String hinhtheloai;

public String getIdTheloai() {
return idTheloai;
}

public void setIdTheloai(String idTheloai) {
this.idTheloai = idTheloai;
}

public String getIdKeychude() {
return idKeychude;
}

public void setIdKeychude(String idKeychude) {
this.idKeychude = idKeychude;
}

public String getTentheloai() {
return tentheloai;
}

public void setTentheloai(String tentheloai) {
this.tentheloai = tentheloai;
}

public String getHinhtheloai() {
return hinhtheloai;
}

public void setHinhtheloai(String hinhtheloai) {
this.hinhtheloai = hinhtheloai;
}

}