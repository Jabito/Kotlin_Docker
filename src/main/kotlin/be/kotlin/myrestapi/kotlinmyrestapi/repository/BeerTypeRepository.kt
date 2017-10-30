package be.kotlin.myrestapi.kotlinmyrestapi.repository

import be.kotlin.myrestapi.kotlinmyrestapi.entity.BeerTypeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface BeerTypeRepository : JpaRepository<BeerTypeEntity, Long>{
    fun findBeerTypeByName(beerTypeName: String): Iterable<BeerTypeEntity>

    fun findBeerTypeByJudgeCertification(beerTypeJudgeCertification: String): Iterable<BeerTypeEntity>
}