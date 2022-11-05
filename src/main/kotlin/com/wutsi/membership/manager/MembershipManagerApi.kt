package com.wutsi.membership.manager

import com.wutsi.membership.manager.dto.RegisterMemberRequest
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.String
import kotlin.Unit

public interface MembershipManagerApi {
  @RequestLine("GET /v1/members/start-registration?phone-number={phone-number}")
  @Headers(value=["Content-Type: application/json"])
  public fun startMemberRegistration(@Param("phone-number") phoneNumber: String): Unit

  @RequestLine("POST /v1/members")
  @Headers(value=["Content-Type: application/json"])
  public fun registerMember(request: RegisterMemberRequest): Unit
}
