package com.thv.hoangvu.Emusic.Service;

public class APIService {
    private static String base_url = "https://hoangvu2006.000webhostapp.com/Server/";

    public static DataService getService() {
        return APIRetrofitClient.getClient(base_url).create(DataService.class);
    }
}
