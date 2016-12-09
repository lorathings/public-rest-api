package io.swagger.client.model




case class NodeInfo (
  /* Registration Type - OTAA or ABP */
  regType: String,
devEui: String,
appEui: String,
appKey: String,
appSKey: String,
devAddr: String,
nwkSKey: String,
fcntUp: Integer,
fcntDown: Integer,
flags: String,
activated: Boolean)
