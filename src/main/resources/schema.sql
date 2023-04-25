drop table if exists groups;
create table groups (
    id bigint primary key AUTO_INCREMENT,
    number varchar(255),
    entrance varchar(255)
);

drop table if exists students;
create table students (
    id bigint primary key AUTO_INCREMENT,
    surname varchar(255),
    name varchar(255),
    middlename varchar(255),
    group_id bigint
);

drop table if exists courses;
create table courses (
    id bigint primary key AUTO_INCREMENT,
    name varchar(255)
);

drop table if exists grades;
create table grades (
    id bigint primary key AUTO_INCREMENT,
    grade varchar(255)
);

drop table if exists student_courses_grade;
create table student_courses_grade (
    id bigint primary key AUTO_INCREMENT,
    student_id bigint,
    course_id bigint,
    grade_id bigint,
    foreign key (student_id) references students(id),
    foreign key (course_id) references  courses(id),
    foreign key (grade_id) references grades(id)
);