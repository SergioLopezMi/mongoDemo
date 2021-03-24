package com.sergiolopezmi.mongodbdemo.repository

import com.sergiolopezmi.mongodbdemo.domain.Brand
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface BrandRepository: MongoRepository<Brand, String> {
    override fun findAll(): MutableList<Brand>
    override fun <S : Brand?> insert(p0: S): S
    @Query("{'country': ?0}")
    fun findBrandByCountry(country: String): MutableList<Brand>
}