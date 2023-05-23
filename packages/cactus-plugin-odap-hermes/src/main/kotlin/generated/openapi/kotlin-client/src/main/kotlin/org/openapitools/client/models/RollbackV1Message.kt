/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param sessionID 
 * @param success 
 * @param actionPerformed 
 * @param proofs 
 * @param signature 
 */


data class RollbackV1Message (

    @Json(name = "sessionID")
    val sessionID: kotlin.String,

    @Json(name = "success")
    val success: kotlin.Boolean,

    @Json(name = "actionPerformed")
    val actionPerformed: kotlin.collections.List<kotlin.String>,

    @Json(name = "proofs")
    val proofs: kotlin.collections.List<kotlin.String>,

    @Json(name = "signature")
    val signature: kotlin.String

)
