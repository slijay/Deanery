DROP TABLE IF EXISTS AUD;
CREATE TABLE AUD (
	number text NOT NULL,
	PRIMARY KEY (number(10))
);

DROP TABLE IF EXISTS CATHEDRA;
CREATE TABLE CATHEDRA (
	name text NOT NULL,
	aud text NOT NULL,
	PRIMARY KEY (name(25)),
	FOREIGN KEY (aud(10)) REFERENCES AUD(number)
);

DROP TABLE IF EXISTS COURSE;
CREATE TABLE COURSE (
	name text NOT NULL,
	pidsum text NOT NULL,
	credits int(11) NOT NULL,
	cathedra_name text NOT NULL,
	precondition text,
	PRIMARY KEY (name(25)),
	FOREIGN KEY (cathedra_name) REFERENCES CATHEDRA(name),
	FOREIGN KEY (precondition) REFERENCES COURSE(name)
);

DROP TABLE IF EXISTS EXAM;
CREATE TABLE EXAM (
	course_name text NOT NULL,
	grupa_year int(11) NOT NULL,
	date date NOT NULL,
	professor_id int(11) NOT NULL,
	aud text NOT NULL,
	PRIMARY KEY (course_name, grupa_year),
	FOREIGN KEY (course_name) REFERENCES COURSE(name),
	FOREIGN KEY (grupa_year) REFERENCES TGROUP(year),
	FOREIGN KEY (professor_id) REFERENCES PROFESSOR(id)
);

DROP TABLE IF EXISTS TGROUP;
CREATE TABLE TGROUP (
	id int(11) NOT NULL,
	year int(11) NOT NULL,
	semester text NOT NULL,
	number int(11) NOT NULL,
	professor_id int(11) NOT NULL,
	course_name text NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (course_name) REFERENCES COURSE(name),
	FOREIGN KEY (professor_id) REFERENCES PROFESSOR(id)
);

DROP TABLE IF EXISTS PROFESSOR;
CREATE TABLE PROFESSOR (
	id int(11) NOT NULL,
	name text NOT NULL,
	cathedra_name text NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (cathedra_name) REFERENCES CATHEDRA(name)
);

DROP TABLE IF EXISTS RESULT;
CREATE TABLE RESULT (
	grupa_id int(11) NOT NULL,
	student_id int(11) NOT NULL,
	mark text,
	PRIMARY KEY (grupa_id, student_id),
	FOREIGN KEY (grupa_id) REFERENCES GRUPA (id),
	FOREIGN KEY (student_id) REFERENCES STUDENT(id)
);

DROP TABLE IF EXISTS SCHEDULE;
CREATE TABLE SCHEDULE (
	day text NOT NULL,
	lesson int(11) NOT NULL,
	grupa_id int(11) NOT NULL,
	aud text NOT NULL,
	PRIMARY KEY(day, lesson),
	FOREIGN KEY (grupa_id) REFERENCES GRUPA (id),
	FOREIGN KEY (aud) REFERENCES AUD(number)
);

DROP TABLE IF EXISTS STUDENT;
CREATE TABLE STUDENT (
	id int(11) NOT NULL,
	name text NOT NULL,
	speciality text NOT NULL,
	stud_start date NOT NULL,
	study_finish date,
	finish_reason text,
	credits int(11) NOT NULL,
	PRIMARY KEY(id)
);
