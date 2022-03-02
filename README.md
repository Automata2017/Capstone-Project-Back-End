# Capstone-Project-Back-End

Back End of CinQue Wilson's Capstone Project: The Mini Ticket Survey

Link to Front End: https://github.com/Automata2017/Capstone-Project-Front-End

## Welcom to the Back End of the Mini Ticket Survey App with Java Spring Boot

This project is about recreating a smaller version of the exit tickets given by General Assembly at the end of each class using a REST API to allow users to submit surveys into a database in a very similar manner. These faux exit tickets can be accessed by anyone with the app so they can post their own tickets with their own comments and information.

### Back End notes

1. To create the back the back end, the first step is to create a new database called survey (incorrectly spelled servey by mistake) in postgres.
2. The next step is to connect this survey using the application-dev.properties in the resources folder and congfigure it so it wall always automatically update when the app is running
3. After that, you need a defined relationship for the ticket. Since this application is only concerned with recieving and storing tickets, we'll be using a single model relationship.

### Entity Relationship Diagram (ERD):

| Tickets |
| --- | :--- |
|ticket_id|INT|
|full_name|STRING|
|email_address|STRING|
|week_number|INT|
|lesson_name|STRING|
|student_rating|STRING|
|student_comment|INT|
|student_recomendation|BOOLEAN|

### Endpoints

|ENDPOINT  | FUNCTIONALITY  |ACCESS |
| --- | :--- | :---|
|GET/(website) |GET Homepage |Public |
|GET tickets |GET all tickets |Public |
|GET/tickets/(ticketId) |GET a single ticket ticket |Public |
|POST tickets|POST new ticket|Public |

### User Stories

|:---|
|As a student I want to type out answers for questions that ask me to type|
|As a student I want to answer questions that ask for number between 1 and 10|
|As a student I want to answer yes or no questions with a button|
|As a student I want to submit my servey when completed for the teacher to see|
|As a student I want the severy submit button to not be available until all ansers are filled|
|As a teacher I want to pull up the servey of my students to review them|

### System Tools Used
1. Postman
2. IntelliJ IDEA 17
3. Postgress
4. Springboot
5. LucidApp
6. Visual Studio Code

### Project Challenges

1. The first challenge in coding was figuring out what it was I needed in order to make the mini tickets functional.I later realized I was overcomplicating things as I would just need a basic single model to encompase the entire ticket as that's all you'd need to make it functional and efficient.
2. The second was th POM dependencies, as there were several changes needed to be made in order to make the code work. And not all of which were taught in class. Thankfully, with the help of several other students, we managed to the dependencies needed.
