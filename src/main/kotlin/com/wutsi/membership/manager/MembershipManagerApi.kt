package com.wutsi.membership.manager

import com.wutsi.membership.manager.dto.EnableBusinessRequest
import com.wutsi.membership.manager.dto.GetMemberResponse
import com.wutsi.membership.manager.dto.RegisterMemberRequest
import com.wutsi.membership.manager.dto.SearchMemberRequest
import com.wutsi.membership.manager.dto.SearchMemberResponse
import com.wutsi.membership.manager.dto.SearchPlaceRequest
import com.wutsi.membership.manager.dto.SearchPlaceResponse
import com.wutsi.membership.manager.dto.UpdateMemberAttributeRequest
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.String
import kotlin.Unit

public interface MembershipManagerApi {
  @RequestLine("POST /v1/members/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchMember(request: SearchMemberRequest): SearchMemberResponse

  @RequestLine("GET /v1/members")
  @Headers(value=["Content-Type: application/json"])
  public fun getMember(): GetMemberResponse

  @RequestLine("POST /v1/members")
  @Headers(value=["Content-Type: application/json"])
  public fun registerMember(request: RegisterMemberRequest): Unit

  @RequestLine("DELETE /v1/members")
  @Headers(value=["Content-Type: application/json"])
  public fun deleteMember(): Unit

  @RequestLine("POST /v1/members/attributes")
  @Headers(value=["Content-Type: application/json"])
  public fun updateMemberAttribute(request: UpdateMemberAttributeRequest): Unit

  @RequestLine("POST /v1/members/business")
  @Headers(value=["Content-Type: application/json"])
  public fun enableBusiness(request: EnableBusinessRequest): Unit

  @RequestLine("DELETE /v1/members/business")
  @Headers(value=["Content-Type: application/json"])
  public fun disableBusiness(): Unit

  @RequestLine("GET /v1/categories/import?language={language}")
  @Headers(value=["Content-Type: application/json"])
  public fun importCategory(@Param("language") language: String): Unit

  @RequestLine("GET /v1/places/import?country={country}")
  @Headers(value=["Content-Type: application/json"])
  public fun importPlace(@Param("country") country: String): Unit

  @RequestLine("POST /v1/places/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchPlace(request: SearchPlaceRequest): SearchPlaceResponse
}
