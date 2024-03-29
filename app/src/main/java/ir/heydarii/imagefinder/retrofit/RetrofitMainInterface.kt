package ir.heydarii.imagefinder.retrofit

import io.reactivex.Single
import ir.heydarii.imagefinder.pojos.ImageSearchResponseModel
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Retrofit interface
 */
interface RetrofitMainInterface {

    @GET("images/search")
    fun searchPhoto(@Query("query") query: String, @Query("page") page: Int): Single<ImageSearchResponseModel>
}