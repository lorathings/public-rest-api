# swagger_client

SwaggerClient - the Ruby gem for the SERTONE REST API

This is the SERTONE REST API server for the  Sertone IOT Developers.  You can find out more about IOT at [http://www.sertone.com](http://www.sertone.com) or about the API on [API Reference](http://dev.sertone.com/public-rest-api).

This SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 0.0.1
- Package version: 1.0.0
- Build date: 2016-12-09T07:17:36.563Z
- Build package: class io.swagger.codegen.languages.RubyClientCodegen

## Installation

### Build a gem

To build the Ruby code into a gem:

```shell
gem build swagger_client.gemspec
```

Then either install the gem locally:

```shell
gem install ./swagger_client-1.0.0.gem
```
(for development, run `gem install --dev ./swagger_client-1.0.0.gem` to install the development dependencies)

or publish the gem to a gem hosting service, e.g. [RubyGems](https://rubygems.org/).

Finally add this to the Gemfile:

    gem 'swagger_client', '~> 1.0.0'

### Install from Git

If the Ruby gem is hosted at a git repository: https://github.com/GIT_USER_ID/GIT_REPO_ID, then add the following in the Gemfile:

    gem 'swagger_client', :git => 'https://github.com/GIT_USER_ID/GIT_REPO_ID.git'

### Include the Ruby code directly

Include the Ruby code directly using `-I` as follows:

```shell
ruby -Ilib script.rb
```

## Getting Started

Please follow the [installation](#installation) procedure and then run the following code:
```ruby
# Load the gem
require 'swagger_client'

# Setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: server_token
  config.api_key['Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['Authorization'] = 'Bearer'

  # Configure API key authorization: client_id
  config.api_key['ClientID'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['ClientID'] = 'Bearer'
end

api_instance = SwaggerClient::ApplicationsApi.new

user_id = "user_id_example" # String | The userId whom to get owned applications


begin
  #getApplicationsByUserId() - Gets all applications owned by given user.
  result = api_instance.get_applications_by_user_id(user_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ApplicationsApi->get_applications_by_user_id: #{e}"
end

```

## Documentation for API Endpoints

All URIs are relative to *http://api.dds.sertone.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SwaggerClient::ApplicationsApi* | [**get_applications_by_user_id**](docs/ApplicationsApi.md#get_applications_by_user_id) | **GET** /users/{userId}/applications | getApplicationsByUserId() - Gets all applications owned by given user.
*SwaggerClient::ApplicationsApi* | [**get_applications_by_user_id_and_app_id**](docs/ApplicationsApi.md#get_applications_by_user_id_and_app_id) | **GET** /users/{userId}/applications/{appEui} | getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.
*SwaggerClient::DataApi* | [**get_app_dev_data_payload**](docs/DataApi.md#get_app_dev_data_payload) | **GET** /data/{appEui}/nodes/{devEui} | getAppDevDataPayload() - Gets payload data of given application and device.
*SwaggerClient::DataApi* | [**get_app_dev_last_data_timestamp**](docs/DataApi.md#get_app_dev_last_data_timestamp) | **GET** /data/{appEui}/nodes/{devEui}/timestamp | getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.
*SwaggerClient::DataApi* | [**get_app_dev_latest_counter**](docs/DataApi.md#get_app_dev_latest_counter) | **GET** /data/{appEui}/nodes/{devEui}/count | getAppDevLatestCounter() - Gets the latest counter for a given application and device.
*SwaggerClient::DataApi* | [**get_app_last_data_method**](docs/DataApi.md#get_app_last_data_method) | **GET** /data/{appEui}/method | getAppLastDataMethod() - Gets last data delivery method for a given application.
*SwaggerClient::DataApi* | [**get_app_last_data_timestamp**](docs/DataApi.md#get_app_last_data_timestamp) | **GET** /data/{appEui}/timestamp | getAppLastDataTimestamp() - Gets last data timestamp for a given application.
*SwaggerClient::GatewaysApi* | [**get_gateway_status**](docs/GatewaysApi.md#get_gateway_status) | **GET** /gateways/{gwEui}/status | getGatewayStatus() - Gets current status of gateway.
*SwaggerClient::GatewaysApi* | [**get_gateways_by_user_id**](docs/GatewaysApi.md#get_gateways_by_user_id) | **GET** /users/{userId}/gateways | getGatewaysByUserId() - Gets all gateways owned by given user.
*SwaggerClient::NodesApi* | [**get_nodes_by_user_id**](docs/NodesApi.md#get_nodes_by_user_id) | **GET** /users/{userId}/nodes | getNodesByUserId() - Gets all nodes owned by given user.
*SwaggerClient::NodesApi* | [**get_nodes_by_user_id_and_sensor_id**](docs/NodesApi.md#get_nodes_by_user_id_and_sensor_id) | **GET** /users/{userId}/nodes/{devEui} | getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.
*SwaggerClient::SystemApi* | [**get_system_healthz**](docs/SystemApi.md#get_system_healthz) | **GET** /system/healthz | getSystemHealthz() - Gets status health of the api server


## Documentation for Models

 - [SwaggerClient::Applications](docs/Applications.md)
 - [SwaggerClient::DataPayload](docs/DataPayload.md)
 - [SwaggerClient::Gateways](docs/Gateways.md)
 - [SwaggerClient::GatewaysStatus](docs/GatewaysStatus.md)
 - [SwaggerClient::NodeInfo](docs/NodeInfo.md)
 - [SwaggerClient::Nodes](docs/Nodes.md)


## Documentation for Authorization


### petstore_auth

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: http://petstore.www.sertone.com/oauth/dialog
- **Scopes**: 
  - write:pets: modify pets in your account
  - read:pets: read your pets

### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: HTTP header

### server_token

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

### client_id

- **Type**: API key
- **API key parameter name**: ClientID
- **Location**: HTTP header
