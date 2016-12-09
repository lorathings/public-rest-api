=begin
SERTONE REST API

This is the SERTONE REST API server for the  Sertone IOT Developers.  You can find out more about IOT at [http://www.sertone.com](http://www.sertone.com) or about the API on [API Reference](http://dev.sertone.com/public-rest-api).

OpenAPI spec version: 0.0.1
Contact: email@sertone.com
Generated by: https://github.com/swagger-api/swagger-codegen.git

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

=end

require "uri"

module SwaggerClient
  class ApplicationsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # getApplicationsByUserId() - Gets all applications owned by given user.
    # 
    # @param user_id The userId whom to get owned applications
    # @param [Hash] opts the optional parameters
    # @return [Array<Applications>]
    def get_applications_by_user_id(user_id, opts = {})
      data, _status_code, _headers = get_applications_by_user_id_with_http_info(user_id, opts)
      return data
    end

    # getApplicationsByUserId() - Gets all applications owned by given user.
    # 
    # @param user_id The userId whom to get owned applications
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<Applications>, Fixnum, Hash)>] Array<Applications> data, response status code and response headers
    def get_applications_by_user_id_with_http_info(user_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ApplicationsApi.get_applications_by_user_id ..."
      end
      # verify the required parameter 'user_id' is set
      fail ArgumentError, "Missing the required parameter 'user_id' when calling ApplicationsApi.get_applications_by_user_id" if user_id.nil?
      # resource path
      local_var_path = "/users/{userId}/applications".sub('{format}','json').sub('{' + 'userId' + '}', user_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      local_header_accept = ['application/xml', 'application/json']
      local_header_accept_result = @api_client.select_header_accept(local_header_accept) and header_params['Accept'] = local_header_accept_result

      # HTTP header 'Content-Type'
      local_header_content_type = ['application/xml', 'application/json']
      header_params['Content-Type'] = @api_client.select_header_content_type(local_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
            auth_names = ['server_token', 'client_id']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Applications>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ApplicationsApi#get_applications_by_user_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.
    # 
    # @param user_id The userId where application will be retrieved
    # @param app_eui The applicationId to be retrieved
    # @param [Hash] opts the optional parameters
    # @return [Applications]
    def get_applications_by_user_id_and_app_id(user_id, app_eui, opts = {})
      data, _status_code, _headers = get_applications_by_user_id_and_app_id_with_http_info(user_id, app_eui, opts)
      return data
    end

    # getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.
    # 
    # @param user_id The userId where application will be retrieved
    # @param app_eui The applicationId to be retrieved
    # @param [Hash] opts the optional parameters
    # @return [Array<(Applications, Fixnum, Hash)>] Applications data, response status code and response headers
    def get_applications_by_user_id_and_app_id_with_http_info(user_id, app_eui, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ApplicationsApi.get_applications_by_user_id_and_app_id ..."
      end
      # verify the required parameter 'user_id' is set
      fail ArgumentError, "Missing the required parameter 'user_id' when calling ApplicationsApi.get_applications_by_user_id_and_app_id" if user_id.nil?
      # verify the required parameter 'app_eui' is set
      fail ArgumentError, "Missing the required parameter 'app_eui' when calling ApplicationsApi.get_applications_by_user_id_and_app_id" if app_eui.nil?
      # resource path
      local_var_path = "/users/{userId}/applications/{appEui}".sub('{format}','json').sub('{' + 'userId' + '}', user_id.to_s).sub('{' + 'appEui' + '}', app_eui.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      local_header_accept = ['application/xml', 'application/json']
      local_header_accept_result = @api_client.select_header_accept(local_header_accept) and header_params['Accept'] = local_header_accept_result

      # HTTP header 'Content-Type'
      local_header_content_type = ['application/xml', 'application/json']
      header_params['Content-Type'] = @api_client.select_header_content_type(local_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
            auth_names = ['server_token', 'client_id']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Applications')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ApplicationsApi#get_applications_by_user_id_and_app_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end