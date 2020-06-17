Feature: Create a new meeting using Native Android/iOS Calendar App

  Given I have launched the Calendar App
  When It is not a weekend
  And It is not a public holiday
  Then I want to book a meeting with the title “Introduction”
  And Set Meeting duration as 30 Minutes in the evening
  And I invite people
  And I save the meeting
  Then I Check if the meeting is created as expected