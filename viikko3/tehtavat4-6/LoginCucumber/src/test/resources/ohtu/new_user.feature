Feature: A new user account can be created if a proper unused username and password are given

Scenario: creation is successful with valid username and password
        Given command new is selected
        When  new username "jorma" and password "amroj1amroj" are entered
        Then  system will respond with "new user registered"

Scenario: creation fails with already taken username and valid password
        Given command new is selected
        When  new username "pekka" and password "akkep" are entered
        Then  system will respond with "new user not registered"

Scenario: creation fails with too short username and valid password
        Given command new is selected
        When  new too short username "al" and valid password "valid1password"
        Then  system will respond with "new user not registered"

Scenario: creation fails with valid username and too short password
        Given command new is selected
        When  new valid username "jorma" and too short password "lyhyt1"
        Then  system will respond with "new user not registered"

Scenario: creation fails with valid username and password long enough but consisting of only letters
        Given command new is selected
        When  new valid username "jorma" and letters only password "sateenvarjo" are entered
        Then  system will respond with "new user not registered"

Scenario: can login with successfully generated account
        Given user "eero" with password "salainen1" is created
        And   command login is selected
        When  username "eero" with password "salainen1" is entered to log in
        Then  system will respond with "logged in"