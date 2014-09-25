package com.m3.octoparts.model.config.json

import com.fasterxml.jackson.module.scala.JsonScalaEnumeration
import com.m3.octoparts.model.config.ParamType
import com.m3.octoparts.model.jackson.ParamTypeType
import com.wordnik.swagger.annotations.ApiModelProperty

import scala.annotation.meta.field

case class PartParam(
  @(ApiModelProperty @field)(required = true) required: Boolean,
  @(ApiModelProperty @field)(required = true) versioned: Boolean,
  @(ApiModelProperty @field)(required = true, dataType = "string", allowableValues = "query, path, header, cookie, body")@JsonScalaEnumeration(classOf[ParamTypeType]) paramType: ParamType.Value,
  @(ApiModelProperty @field)(required = true) outputName: String,
  @(ApiModelProperty @field)(required = false, dataType = "string") inputNameOverride: Option[String] = None,
  cacheGroups: Set[CacheGroup] = Set.empty)