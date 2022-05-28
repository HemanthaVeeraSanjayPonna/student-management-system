


User -> 
	1. role(enum) – Admin, Teacher, Student
	2.fname
	3.lname
	4.mobilenum
	5.email
	6.city
	7.password
	8.user_id (Primary Key)
Subject ->
	1.id
	2.name
	3.class_id (f.K)

Marks ->
1.id
2.marks
3.subject_id (f.K)
4.user_id (f.K)
Class ->
	1. Id
	2.name
	// 3.user_id (f.K)

User(Student) – marks  -> One to many
 Subject – marks    -> One to many

______________________________________________________________________________________________________


HTTP request -> url (https://localhost:8080/students/addMarks/1)
             -> RequestType : GET, POST, PUT, DELETE, HEAD
             -> RequestBody : JSON/XML/TEXT
             -> Header : Metadata in key/value format
                        -> Authorization : Bearer/Basic JWT token
                        -> content-type : application/json



_______________________________________________________________________________________________




***** /students/(studentId}/info?age=90&name=hemanth
        → {studentId} →path variable 
        → age and name are request parameters

// Api Info
* Adding all subjects marks for particular student api endpoint.
    POST - (/students/addMarks/{studentId})
        Payload sent by client : 
            Requestbody → dto 
                            {
                                "studentMarks": [
                                    {
                                        "subjectId": 1,
                                        "marks": 67
                                    },
                                    {
                                        "subjectId": 2,
                                        "marks”": 89
                                    }
                                ]
                            }
            ResponseBody → dto
                            {
                                "message" : "Succesfully inserted marks for student {name}"
                            } 



Regular HTML -> 

<!DOCTYPE html> <!--HTML 5-->
<!--
<html>
<head>
<title>Page Title</title>
</head>
<body>

<h1>This is a Heading</h1>
<p>This is a paragraph.</p>

</body>
</html>
-->
