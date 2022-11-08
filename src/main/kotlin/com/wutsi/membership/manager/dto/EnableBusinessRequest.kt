package com.wutsi.membership.manager.dto

import kotlin.Long
import kotlin.String

public data class EnableBusinessRequest(
  public val displayName: String = "",
  public val categoryId: Long = 0,
  public val cityId: Long = 0,
  public val biography: String? = null,
  public val whatsapp: String? = null,
)
