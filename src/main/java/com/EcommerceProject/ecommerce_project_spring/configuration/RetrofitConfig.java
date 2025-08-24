package com.EcommerceProject.ecommerce_project_spring.configuration;


import com.EcommerceProject.ecommerce_project_spring.gateway.api.FakeStoreCategoryApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Value("${FAKESTORE_BASE_URL}")
    private String fakeStoreBaseUrl;

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl(fakeStoreBaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit) {
        return retrofit.create(FakeStoreCategoryApi.class);
    }
}
