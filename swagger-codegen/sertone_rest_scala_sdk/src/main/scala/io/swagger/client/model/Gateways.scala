package io.swagger.client.model




case class Gateways (
  id: Long,
owner: String,
gatewayEui: String,
/* Gateway status can be Planned, Active, Inactive, Maintenance, Deprecated */
  gatewayStatus: String,
longitude: String,
latitude: String,
altitude: String,
address: String,
baseModel: String,
city: String,
concentrator: String,
country: String,
freqPlan: String,
region: String,
relCustomerUid: String,
gatewayTitle: String,
zipCode: String,
createdOn: String)
