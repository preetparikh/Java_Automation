Feature: Create a new meeting using Native Android/iOS Calendar App

  Given I have launched the Calendar App
  Then I want to book a meeting with the title “Introduction”
  And Set Meeting duration as 30 Minutes in the evening everyday
  And I save the meeting
  Then I Check if the meeting is created as expected