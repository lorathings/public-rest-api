package io.swagger.client.model




case class GatewaysStatus (
  gatewayEui: String,
/* Gateway activity can be Active, Inactive, Not Found */
  gatewayActivity: String,
lastPullData: String,
lastPushData: String,
pullDataCount: String,
pushDataCount: String)
