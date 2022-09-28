CREATE TABLE topics(
	department varchar(25) PRIMARY KEY 
);

INSERT INTO topics 
VALUES
	('Math'),
	('History'),
	('English'),
	('Science'),
	('Foreign Languages');
	
CREATE TABLE teachers (
	teacher_id serial PRIMARY KEY UNIQUE,
	"first" varchar(25),
	"last name" varchar(25),
	department varchar(25) REFERENCES topics,
	email varchar(25),
	phoneNumber varchar(25)
);

CREATE TABLE courses (
	course_id serial PRIMARY KEY UNIQUE,
	course_name varchar(25),
	teacher_id int REFERENCES teachers,
	department varchar(25) REFERENCES topics
);

CREATE TABLE students (
	student_id serial PRIMARY KEY UNIQUE, 
	"first" varchar(25),
	"last" varchar(25),
	phone_number varchar(25),
	email varchar(25)
);

--junction table between course and student
CREATE TABLE course_roster (
	course_id int REFERENCES courses,
	student_id int REFERENCES students
);


INSERT INTO teachers ("first", "last name", "department", "email", "phonenumber")
VALUES 
	('Joe', 'Chill', 'Math', 'joechill@gmail.com', '(812)276-8192'),
	('Jack', 'Joseph', 'Foreign Languages', 'jackjoseph@gmail.com', '(812)721-9075'),
	('Nancy', 'Wheeler', 'English', 'nancywheeler@gmail.com', '(812)007-3478');

INSERT INTO courses ("course_name", "teacher_id", "department")
VALUES 
	('Trigonometry', 4, 'Math'),
	('Introduction to French', 5, 'Foreign Languages'),
	('Advanced Journalism', 6, 'English');

INSERT INTO students ("first", "last", "phone_number", "email")	
VALUES 
	('Zach', 'Wack', '(567)746-8905', 'zachwack@gmail.com'),
	('Frank', 'Kaminsky', '(567)648-8825', 'frankthetank@gmail.com'),
	('Lebron', 'James', '(567)909-4356', 'thegoat@gmail.com'),
	('Tom', 'Brady', '(567)456-4301', 'toomanyrings@gmail.com'),
	('Lionel', 'Messi', '(567)783-4110', 'goldenboot@gmail.com');

INSERT INTO course_roster 
VALUES
	(1, 1),
	(1, 2),
	(1, 3),
	(2, 1),
	(2, 2),
	(3, 1),
	(1, 3),
	(3, 5),
	(2, 4);
	
