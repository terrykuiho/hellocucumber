Feature: Customer API Testing

  @Bitcoin
  Scenario: Getting Realtime Bitcoin price
    Given a BitCoin public api "https://api.coindesk.com/v1/bpi/currentprice.json" is provided
    When User calls API
    Then the USD price is available

