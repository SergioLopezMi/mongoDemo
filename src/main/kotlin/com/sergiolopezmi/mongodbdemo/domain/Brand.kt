package com.sergiolopezmi.mongodbdemo.domain

import org.hibernate.annotations.GenericGenerator
import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Document(collection = "Brand")
class Brand {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    var id: String = ""
    var name: String = ""
    var country: String = ""
}
