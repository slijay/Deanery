CREATE TABLE AUD (
	number VARCHAR(6) NOT NULL,
	PRIMARY KEY (number)
);

CREATE TABLE CATHEDRA (
	name VARCHAR(30) NOT NULL,
	aud VARCHAR(6) NOT NULL,
	PRIMARY KEY (name),
	FOREIGN KEY (aud) REFERENCES AUD(number)
);

CREATE TABLE PROFESSOR (
	id int(11) NOT NULL AUTO_INCREMENT,
	name VARCHAR(30) NOT NULL,
	cathedra_name VARCHAR(30) NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (cathedra_name) REFERENCES CATHEDRA(name)
);

CREATE TABLE COURSE (
	name VARCHAR(30) NOT NULL,
	pidsum VARCHAR(30) NOT NULL,
	credits int(11) NOT NULL,
	cathedra_name VARCHAR(30) NOT NULL,
	precondition VARCHAR(30),
	PRIMARY KEY (name),
	FOREIGN KEY (cathedra_name) REFERENCES CATHEDRA(name),
	FOREIGN KEY (precondition) REFERENCES COURSE(name)
);

CREATE TABLE EXAM (
	course_name VARCHAR(30) NOT NULL,
	grupa_year int(11) NOT NULL,
	date date NOT NULL,
	professor_id int(11) NOT NULL,
	aud VARCHAR(30) NOT NULL,
	PRIMARY KEY (course_name, grupa_year),
	FOREIGN KEY (course_name) REFERENCES COURSE(name),
	FOREIGN KEY (professor_id) REFERENCES PROFESSOR(id)
);

CREATE TABLE GRUPA (
	id int(11) NOT NULL,
	year int(11) NOT NULL,
	semester VARCHAR(30) NOT NULL,
	number int(11) NOT NULL,
	professor_id int(11) NOT NULL,
	course_name VARCHAR(30) NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (course_name) REFERENCES COURSE(name),
	FOREIGN KEY (professor_id) REFERENCES PROFESSOR(id)
);

CREATE TABLE STUDENT (
	id int(11) NOT NULL AUTO_INCREMENT,
	name VARCHAR(30) NOT NULL,
	speciality VARCHAR(30) NOT NULL,
	stud_start date NOT NULL,
	study_finish date,
	finish_reason VARCHAR(30),
	credits int(11) NOT NULL,
	PRIMARY KEY(id)
);


CREATE TABLE RESULT (
	grupa_id int(11) NOT NULL,
	student_id int(11) NOT NULL,
	mark VARCHAR(30),
	PRIMARY KEY (grupa_id, student_id),
	FOREIGN KEY (grupa_id) REFERENCES GRUPA(id),
	FOREIGN KEY (student_id) REFERENCES STUDENT(id)
);

CREATE TABLE SCHEDULE (
	day VARCHAR(30) NOT NULL,
	lesson int(11) NOT NULL,
	grupa_id int(11) NOT NULL,
	aud VARCHAR(30) NOT NULL,
	PRIMARY KEY(day, lesson),
	FOREIGN KEY (grupa_id) REFERENCES GRUPA(id),
	FOREIGN KEY (aud) REFERENCES AUD(number)
);
