# coding-events-demo

What is Coding Events?
Coding Events is an app that will allow tech enthusiasts to create and explore coding events in the St. Louis area. Examples could include a tech conference, an LGBTQ+-friendly meetup, or a skill-focused networking event. Users can find opportunities that suit their experience levels and interests, or share their own events. Whether users are looking to move into the tech industry or they're experienced programmers, this app will be a great resource to get connected!


Current Design Features
Coding Events can currently be used to create and search a list of coding events. Each event is categorized by type and includes a brief description, contact email, and tags for more information. A user can view a full list of the events or search for events by type or tag. They can also delete events. 


Future Design Features
Coding Events will soon include additional features enabling users to create individual, password-protected accounts to keep track of their event information and schedules. When they find an event that interests them, they can register to attend and the event details will be stored in their account. Users will also be to manage the events they've created as well as view the number of people scheduled to attend. 

Design Plans:

PERSON CLASS
-id (int): a unique user id
-firstName (String): user's first name
-lastName (String): user's first name
-password (String): user password, will include validation
-Getters for all fields, Setters for all fields except id (won't change)

OTHER REFERENCES

-PERSON PROFILE CLASS: a class to gather all the information about a user
-List<Event> eventsAttending: a list of events to which the user has RSVP'd
    -would require EVENT class to have rsvp field?
-List<Event> eventsOwned: a list to store events the user has created
    -would require numAttending field to show amount registered
    
-PERSON would have a many-to-many relationship with EVENT via eventsAttending
-PERSON would have a one-to-many relationship with EVENT via eventsOwned
  


