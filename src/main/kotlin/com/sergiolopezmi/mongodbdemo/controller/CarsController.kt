package com.sergiolopezmi.mongodbdemo.controller

import com.sergiolopezmi.mongodbdemo.domain.Brand
import com.sergiolopezmi.mongodbdemo.dto.BrandDto
import com.sergiolopezmi.mongodbdemo.mapper.BrandMapper
import com.sergiolopezmi.mongodbdemo.repository.BrandRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/cars")
class CarsController (
        private val brandRepository: BrandRepository,
        private val brandMapper: BrandMapper
        ) {

    @GetMapping
    fun getAllCars(): ResponseEntity<List<Brand>> {
        return  ResponseEntity(brandRepository.findAll(), HttpStatus.OK)
    }

    @PostMapping
    fun addCarBrand(@RequestBody brandDto: BrandDto): ResponseEntity<Brand> {
        val brand: Brand = brandMapper.map(brandDto)
        return ResponseEntity(brandRepository.insert(brand), HttpStatus.OK)
    }

    @GetMapping("/brandByCountry")
    fun findBrandByCountry(@RequestBody brandDto: BrandDto): ResponseEntity<List<Brand>> {
        val brand: Brand = brandMapper.map(brandDto)
        return ResponseEntity(brandRepository.findBrandByCountry(brand.country), HttpStatus.OK)
    }
}