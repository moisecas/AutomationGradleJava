Feature: Automated Email Sending with an Attachment from Google Drive

  Background:
    Given the user is logged into Google

  Scenario: User sends an email with an attachment from Google Drive
    Given the user is on the Gmail page
    When the user writes an email
    And the user clicks the Send button
    Then the email should be sent successfully

