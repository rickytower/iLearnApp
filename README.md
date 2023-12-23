# iLearn

Riccardo Torre: VR510616
Andrea Toffaletti: ?

## Scenario 1: login and access as a student
- **Initial assumption**: A user intends to access as a student to the ILearn platform. The user should possess the credentials associated with the student role required for access, which has already been registered in the system by the assigned personnel.
- **Normal execution**: The user enters his/her username and password into the respective text fields and requests access. The system verifies that the credentials. If they are correct, authenticate the user as a student, and redirect him/her to the dashboard web page.
- **Possible issues**: If the user tries to log in to the system with incorrect credentials, the system, the system displays an error message on the login page.  If the user uses credentials associated with another role, they will be authenticated with that specific role and redirected to the specific dashboard.
- **Status upon completion**: The user is authenticated with the student role and is viewing the related dashboard.
## Scenario 2: view exams list
- **Initial assumption**: A student intends to access the list of available exams related to his/her academic program within the iLearn system. The student is supposed to have already logged in and should appear as enrolled.
- **Normal execution**: The student navigates to the website's dedicated section and sees the exams he/she can take during the semester.  The system should indicate whether there are available exams or not.
- **Possible issues**: The system must notify the student who is not enrolled in any course and tries to access the list of available exams. The system should only display the exams relating to the chosen courses.
- **Status upon completion**: The student can view the list of available exam sessions and choose which ones to register for.
## Scenario 3: exams registration
- **Initial assumption**: A student intends to register for an exam within the iLearn system.  The student is supposed to have already logged in with a unique ID and an active enrollment status.
- **Normal execution**: A student provide any details needed for exam registration.  Upon submission, the system verifies the information, authenticates them, and confirms the exam registration.  The student is notified with a confirmation note within the page, and see a summary of the registered exam.
- **Possible issues**: If the student is not currently enrolled or cannot access the exam related faculty, the system should display an appropriate error message, indicating the registration failure. If the system has any problem to retrieve the exam list, it should display an appropriate error message.
- **Status upon completion**: The student successfully see hi/her exam and can view the details of the exams.
## Scenario 4: Viewing and accepting/declining exam result
- **Initial assumption**:  A student intends to review the results of their previous exams within the iLearn system. The student is supposed to have already logged in with a unique ID and an active enrollment status. The information about the student is recorded in the system along with their corresponding exam results.
- **Normal execution**: The student navigates to the section dedicated to viewing exam results. The system presents two distinct sections:  
	1. the first one shows the exams for which the grades have already been accepted/declined  
	2. the second one shows the exams with pending actions.  

	If the student accepts a grade, the system updates the corresponding record and archives the result. If the student declines a grade, the system may prompt the student to provide a reason or additional information about the decline. The declined grade is then marked accordingly in the system.
- **Possible issues**: If there are technical issues or delays in retrieving exam results, the system should provide a notification and advise the student to contact support.  
If there are discrepancies or errors in the displayed results, the system should allow the student to submit a request for review or correction.
- **Status upon completion**: The student can successfully review the results of previous exams by accepting or declining grades. The page is divided into two parts, clearly indicating the exams with accepted/declined grades and those still pending the student's action.
## Scenario 5: compiling the teaching plan
- **Initial assumption**: A student intends to compile the teaching plan within the iLearn system. The student is supposed to have already logged in with a unique ID and an active enrollment status. The student wants to edit or hasn't compiled the teaching plan yet.
- **Normal execution**: The student navigates to the compilation teaching plan page where he/she can choose which courses to take.

	Courses are divided into:

	-   compulsory courses (A)
	-   optional courses (B)
	-   apprenticeship (C)
	-   thesis (D)

	where (A), (B), (C), (D) are tags used to identify the type of activity.
- **Possible issues**: The compilation teaching plan must be a transactional operation. So, if the student doesn't confirm the plan on the latest web page, the plan must be in a state "not confirmed". The user must confirm the plan before a deadline and should be advised on the dashboard. The exams the user sees are relative to the courses he/she has chosen.
- **Status upon completion**: The student can successfully review the results of previous exams, by accepting or declining grades. The page is divided into two parts, clearly indicating the exams with accepted/declined grades and those still pending the student's action.
## Scenario 6: editing personal information
- **Initial assumption**: A student intends to update their personal information, excluding student ID, enrolled major, name, and last name, within the iLearn System. The student is supposed to have already logged in with a unique ID and an active enrollment status.
- **Normal execution**: The student navigates to the section dedicated to editing personal information. The system presents a form where the student can modify anagraphical information such as contact details, living address, phone number, and other personal data. The system includes simple validation checks to ensure that the information entered meets specified criteria. After making the desired changes, the student submits the updated information. The system then verifies the changes, updates the student's record, and provides a confirmation message to the student.
- **Possible issues**: If there are errors in the entered information or if the changes cannot be validated, the system should display an error message and guide the student on correcting the issues. Security measures should be in place to prevent unauthorized access to sensitive information during the editing process.
- **Status upon completion**: The student successfully updates their anagraphical data and receives a confirmation that the changes have been recorded. The system is designed to allow students to maintain accurate personal information, ensuring the integrity and relevance of their records.
## Scenario 7: pay taxes
- **Initial assumption**: A student intends to make payments for university bills, which are scheduled three times a year on January 1, June 1, and December 1. The student is supposed to have already logged in with a unique ID and an active enrollment status.
- **Normal execution**: The student navigates to the section dedicated to bill payments. The system presents the current outstanding bills, indicating the amounts due and the corresponding due dates. The student selects the bills they want to pay, enters the payment details (such as credit card information or other payment methods), and submits the payment. The system processes the payment securely, updates the student's payment history, and provides a confirmation message, including the details of the transaction and the updated balance.
- **Possible issues**: If there are issues with the payment processing, such as a declined transaction or technical errors, the system should display an error message and guide the student on resolving the issue. Notifications should be sent well in advance to remind students of upcoming payment deadlines.
- **Status upon completion**: The student successfully logs in, pays the outstanding bills for the current period, and receives confirmation of the completed transaction. The system is designed to facilitate secure and efficient payment processes, ensuring that students can easily manage their financial obligations to the university.
