=begin comment

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

=end comment

=cut

#
# NOTE: This class is auto generated by Swagger Codegen
# Please update the test cases below to test the API endpoints.
# Ref: https://github.com/swagger-api/swagger-codegen
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::SwaggerClient::DataApi');

my $api = WWW::SwaggerClient::DataApi->new();
isa_ok($api, 'WWW::SwaggerClient::DataApi');

#
# get_app_dev_data_payload test
#
{
    my $app_eui = undef; # replace NULL with a proper value
    my $dev_eui = undef; # replace NULL with a proper value
    my $result = $api->get_app_dev_data_payload(app_eui => $app_eui, dev_eui => $dev_eui);
}

#
# get_app_dev_last_data_timestamp test
#
{
    my $app_eui = undef; # replace NULL with a proper value
    my $dev_eui = undef; # replace NULL with a proper value
    my $result = $api->get_app_dev_last_data_timestamp(app_eui => $app_eui, dev_eui => $dev_eui);
}

#
# get_app_dev_latest_counter test
#
{
    my $app_eui = undef; # replace NULL with a proper value
    my $dev_eui = undef; # replace NULL with a proper value
    my $result = $api->get_app_dev_latest_counter(app_eui => $app_eui, dev_eui => $dev_eui);
}

#
# get_app_last_data_method test
#
{
    my $app_eui = undef; # replace NULL with a proper value
    my $result = $api->get_app_last_data_method(app_eui => $app_eui);
}

#
# get_app_last_data_timestamp test
#
{
    my $app_eui = undef; # replace NULL with a proper value
    my $result = $api->get_app_last_data_timestamp(app_eui => $app_eui);
}


1;