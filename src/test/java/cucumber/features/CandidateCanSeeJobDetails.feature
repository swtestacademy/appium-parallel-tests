@Candidate
  Feature: Candidate can see the job's details.

    Scenario Outline: Candidate opens a job's page and see its details.
      Given Candidate is on the jobs listing screen
      When Candidate opens a job which has index of <index>
      Then Candidate should see the jobs details
      Examples: First and Second jobs
        | index |
        | 0     |
        | 1     |
