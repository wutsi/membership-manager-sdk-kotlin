package com.wutsi.membership.manager.dto

import kotlin.String

public data class RegisterMemberRequest(
  public val phoneNumber: String = "",
  public val displayName: String = "",
  public val pin: String = "",
)
