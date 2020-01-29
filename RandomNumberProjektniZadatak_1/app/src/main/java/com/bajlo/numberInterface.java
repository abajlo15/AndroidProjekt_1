package com.bajlo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface numberInterface {



    @GET("/numbers/base/binary")
    Call<ContentsRequest> dohvatiBroj(@Query(value="number") int number );

}
