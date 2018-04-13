# 🎩 reflectje
A platform for doing reflection during studying psychology


# 👍 how is it going to work
As a student you suppose to do Reflection. 

Reflection — writing down your life events, thoughts and emotions. 

According to you therepist, a lot of other things can be reflected: dreams, jokes, neurotic reactions, etc.
So, we want to have the platfor as flexible as possible. That is why the current set of technologies has been picked. 

Every day the student suppose to enter reflection records. There can be more than one record a day. Preferrably, more. 

Once records have been added, they suppose to be seen on private page, which is accessible by the student and by the therapist. 

We are going to store very sensitive private data, so we have to think about encryption or other measures of guarding privacy.

This project could be a good place to investigate and implement GDPR things.

# 👍 We also would like to make some analysis
What does it mean?
Everyday day the student writes down the reflection and choose appropriate emotions. At the end of week Reflectje summarize given emotions and say how good is the emotional state of the student. 
If it is good – Reflectje shows the  results «Keep it up», if it is bad – «You should work better» and indicate the days which led to bad emotions


# 👨🏻‍💻 tech overview
Structurally project will be separated to API and Frontend. My intention, as a backend guy, is to implement CQRS, so the frontend will be kept as simple as possible. 

The project will have a lot of business logic, which must be covered by tests. In this case Acceptance tests are needed, and for implementing them I've chosen Behat. ATDD must be the way to go. 


# 🎛 technologies
- CQRS + DDD
- Symfony Flex
- http://getprooph.org
- Mockery
- Behat
