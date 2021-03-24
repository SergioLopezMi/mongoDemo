package com.sergiolopezmi.mongodbdemo.mapper

import com.sergiolopezmi.mongodbdemo.domain.Brand
import com.sergiolopezmi.mongodbdemo.dto.BrandDto
import org.springframework.stereotype.Service

@Service
class BrandMapper {
    fun map(brandDto: BrandDto): Brand {
        val brand: Brand = Brand()
        brandDto.name?.let { brand.name = it }
        brandDto.country?.let { brand.country = it }
        return brand
    }
}