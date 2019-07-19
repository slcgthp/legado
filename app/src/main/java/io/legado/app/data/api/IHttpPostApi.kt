package io.legado.app.data.api

import kotlinx.coroutines.Deferred
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.*

/**
 * Created by GKF on 2018/1/29.
 * post
 */

interface IHttpPostApi {

    @FormUrlEncoded
    @POST
    fun postMapAsync(
        @Url url: String,
        @FieldMap(encoded = true) fieldMap: Map<String, String>,
        @HeaderMap headers: Map<String, String>
    ): Deferred<Response<String>>

    @POST
    fun postBodyAsync(
        @Url url: String,
        @Body body: RequestBody,
        @HeaderMap headers: Map<String, String>
    ): Deferred<Response<String>>
}
