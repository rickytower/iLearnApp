# Project Documentation

## Intro

This document provides an overview of the project scenarios, initial assumptions, normal execution, possible issues, and the status upon completion.

## Scenarios

### Scenario 1: Login and access (as a student)

**Initial Assumptions:**
- A user intends to access as a student to the ILearn platform.
- The user should possess the credentials associated with the student role required for access, which has already been registered in the system by the assigned personnel.

**Normal Execution:**
- The user enters his/her username and password into the respective text fields and requests access.
- The system verifies the credentials. If they are correct, authenticate the user as a student, and redirect him/her to the dashboard web page.

**Possible Issues:**
- If the user tries to log in to the system with incorrect credentials, the system, the system displays an error message on the login page.
- If the user uses credentials associated with another role, they will be authenticated with that specific role and redirected to the specific dashboard.

**Status Upon Completion:**
- The user is authenticated with the student role and he/she is viewing the related dashboard.

### Scenario 2: View exams list

**Initial Assumptions:**
- A student intends to access the list of available exams related to his/her academic program within the iLearn system.
- The student is supposed to have already logged in, and an active enrolment status.


**Normal Execution:**
- The student navigates to the website's dedicated section and sees the exams he/she can take during the semester.
- The system should indicate whether there are available exams or not.

**Possible Issues:**
- The system should only display the exams relating to the chosen courses and none of the others.


**Status Upon Completion:**
- The student can view the list of available exam sessions and choose which ones to register for (see next scenario).

### Scenario 3: Exams registration

**Initial Assumptions:**
- A student intends to register for an exam within the iLearn system.
- The student is supposed to have already logged in, and an active enrolment status.

**Normal Execution:**
- A student need to provide any details needed for exam registration.
- Upon submission, the system verifies the information, authenticates them, and confirms the exam registration.
- The student is notified with a  confirmation note within the page, and see a  summary of the registered exam.

**Possible Issues:**
- If the student cannot access the exam related faculty, the system should display an appropriate error message, indicating the registration failure.
- If the system has any problem to retrieve the exam list, it should display an appropriate error message

**Status Upon Completion:**
- The student successfully see hi/her exam subscription and can view the details of the test.

### Scenario 4: Viewing and accepting/declining exam result

**Initial Assumptions:**
- A student intends to review the results of their previous exams within the iLearn system.
- The student is supposed to have already logged in, and an active enrolment status.
- The information about the student is recorded in the system along with their corresponding exam results.

**Normal Execution:**
- In the section dedicated to viewing exam results, the system presents two distinct sections:
1) one shows the exams for which the grades have already been accepted/declined
2) one shows the exams with pending actions.
- If the student accepts a grade, the system updates the corresponding record and archives the result.
- If the student declines a grade, the system may prompt the student to provide a reason or additional information about the decline. The declined grade is then marked accordingly in the system.

**Possible Issues:**
- If there are technical issues or delays in retrieving exam results, the system should provide a notification and advise the student to contact support.
- If there are discrepancies or errors in the displayed results, the system should allow the student to submit a request for review or correction.

**Status Upon Completion:**
- The student can successfully review the results of previous exams by accepting or declining grades.

### Scenario 5: Compiling the teaching plan

**Initial Assumptions:**
- A student intends to compile the teaching plan within the iLearn system.
- The student is supposed to have already logged in, and an active enrolment status.

**Normal Execution:**
- In the section dedicated to the compilation teaching plan, a student can choose the courses to enrolling.
- Courses are divided into: compulsory courses (A), optional courses (B), apprenticeship (C), and thesis (D), where (A), (B), (C), (D) are tags used to identify the type of activity.

**Possible Issues:**
- The compilation teaching plan must be a transactional operation. So, if the student doesn't confirm the plan on the latest web page, the plan must be in a state "not confirmed".
- A student cannot see courses of other faculty than his/her own.

**Status Upon Completion:**
- 

### Scenario 6: Editing personal information

**Initial Assumptions:**
- A student intends to update their personal information, excluding student ID, enrolled major, name, and last name, within the iLearn System.
- The student is supposed to have already logged in with a unique ID.
- The system is designed to allow students to maintain accurate personal information, ensuring the integrity and relevance of their records.

**Normal Execution:**
- The student navigates to the section dedicated to bill payments.
- The system presents the current outstanding bills, indicating the amounts due and the corresponding due dates.
- The student selects the bills they want to pay, enters the payment details (such as credit card information or other payment methods), and submits the payment.
- The system processes the payment securely, updates the student's payment history, and provides a confirmation message, including the details of the transaction and the updated balance.

**Possible Issues:**
- If there are errors in the entered information or if the changes cannot be validated, the system should display an error message and guide the student on correcting the issues.

**Status Upon Completion:**
- The student successfully updates their anagraphical data and receives a confirmation that the changes have been recorded.

### Scenario 7: [Scenario Title]

**Initial Assumptions:**
- A student intends to make payments for university bills, which are scheduled three times a year.
- The student is supposed to have already logged in with a unique ID.

**Normal Execution:**
- The student navigates to the section dedicated to bill payments.
- The system presents the current outstanding bills, indicating the amounts due and the corresponding due dates.
- The student selects the bills they want to pay, enters the payment details (such as credit card information or other payment methods), and submits the payment.
- The system processes the payment securely, updates the student's payment history, and provides a confirmation message, including the details of the transaction and the updated balance.

**Possible Issues:**
- If there are issues with the payment processing, such as a declined transaction or technical errors, the system should display an error message and guide the student on resolving the issue.
- Notifications should be sent well in advance to remind students of upcoming payment deadlines.

**Status Upon Completion:**
- The student successfully logs in, pays the outstanding bills for the current period, and receives confirmation of the completed transaction.
- The system is designed to facilitate secure and efficient payment processes, ensuring that students can easily manage their financial obligations to the university.

## Admin Note

[Include any additional administrative notes or instructions here.]

