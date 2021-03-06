[![CircleCI](https://circleci.com/gh/ibudasov/reflectje.svg?style=svg)](https://circleci.com/gh/ibudasov/reflectje)
[![Maintainability](https://api.codeclimate.com/v1/badges/9cf024851c39d04b9660/maintainability)](https://codeclimate.com/github/ibudasov/reflectje/maintainability)
[![Test Coverage](https://api.codeclimate.com/v1/badges/9cf024851c39d04b9660/test_coverage)](https://codeclimate.com/github/ibudasov/reflectje/test_coverage)

# 🎩 Reflectje → [try it!]
A platform for doing reflection during studying psychology


# 💡 The idea
As a student you suppose to do Reflection. 

Reflection — writing down your life events, thoughts and emotions. 

According to you therapist, a lot of other things can be reflected: dreams, jokes, neurotic reactions, etc.
So, we want to have the platform as flexible as possible. That is why the current set of technologies has been picked. 

Every day the student suppose to enter reflection records. There can be more than one reflectionRecord a day. Preferrably, more. 

Once records have been added, they suppose to be shown on private page, which is accessible by the student and by the therapist. 

We are going to store very sensitive private data, so we have to think about encryption or other measures of guarding privacy.

# 🚸 Roadmap
- ✅ endpoint for the index page
- ✅ endpoint for swagger docs
- 🚧 add the record
- save records to a file storage (research needed)
- add thread-safety
- retrieve last 50 records
- retrieve records by date
- retrieve a record by ID
- add authentication
- use some database
- make it GDPR-compliant 

# 🍿 We also would like to make some analysis
Everyday day the student writes down the reflection and choose appropriate emotions. At the end of week Reflectje summarize given emotions and say how good is the emotional state of the student. 
If it is good – Reflectje shows the  results «Keep it up», if it is bad – «You should work better» and indicate the days which led to bad emotions

# 💻 Tech overview
Structurally project will be separated to API and Frontend.
This repository is responsible only about the API part, Frontend part is coming.  

# API reference
Swagger file is here: https://reflectje.herokuapp.com/v2/api-docs

# ⚙ Technologies
- Java
- Spring
- Spring Boot
- Maven — build tool
- JUnit — for testing in general
- AssertJ — for nice readable assertions
- Pitest — for mutation testing
- Jacoco — for test coverage reports
- Swagger 

[try it!]: https://reflectje.herokuapp.com