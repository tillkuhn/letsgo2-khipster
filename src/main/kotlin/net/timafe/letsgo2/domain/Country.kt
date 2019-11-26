package net.timafe.letsgo2.domain

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable
import net.timafe.letsgo2.config.DYNAMODB_PREFIX

// @Entity
@DynamoDBTable(tableName = DYNAMODB_PREFIX + "country")
data class Country(

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    var id: String?,

    @DynamoDBAttribute
    var name: String

    // @DynamoDBAttribute
    // var updated: LocalDateTime = LocalDateTime.now()
)
