Feature: Customer API Testing

#  Scenario: Calling login API
#    Given Login API is provided
#    When User call login API
#    Then a token will be generated
#
#  Scenario: Calling customer list API
#    Given Customer list API is provided
#    When User call customer list API
#    Then Customer list will be shown
#
#  Scenario: Calling customer get API
#    Given Customer get API is provided
#    When User call customer get API
#    Then Specific customer info will be shown

  Scenario: Getting Realtime Bitcoin price
    Given a BitCoin public api "https://api.coindesk.com/v1/bpi/currentprice.json" is provided
    When User calls API
    Then the USD price is available

