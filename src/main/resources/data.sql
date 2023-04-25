insert into students (surname, name, middlename, group_id)
values ('Ivanov', 'Fyodor', 'Mikhailovich', 1),
       ('Petrov', 'Stepan', 'Nikolayevich', 1),
       ('Sidorov', 'Vecheslav', 'Grigoryevich', 1),
       ('Romanov', 'Dmitriy', 'Konstantinovich', 2),
       ('Gromov', 'Artyom', 'Stepanovich', 2),
       ('Dmitriev', 'Maksim', 'Alekseevich', 2),
       ('Maksimenko', 'Georgiy', 'Fyodorovich', 3),
       ('Chernov', 'Ilya', 'Evgenievich', 3),
       ('Tulikov', 'Nikita', 'Sergeevich', 3);

insert into groups (number, entrance)
values ('3', '2018'),
       ('6', '2018'),
       ('12', '2018');

insert into courses (name)
values ('economics'),
       ('programming'),
       ('english');

insert into grades (grade)
values ('1'), ('2'), ('3'), ('4'), ('5');

insert into student_courses_grade(student_id, course_id, grade_id)
values (1, 1, 5),   (1, 2, 4),   (1, 3, 5),
       (2, 1, 4),   (2, 2, 4),   (2, 3, 4),
       (3, 1, 5),   (3, 2, 3),   (3, 3, 5),
       (4, 1, 5),   (4, 2, 5),   (4, 3, 5),
       (5, 1, 4),   (5, 2, 5),   (5, 3, 5),
       (6, 1, 4),   (6, 2, 3),   (6, 3, 2),
       (7, 1, 2),   (7, 2, 3),   (7, 3, 4),
       (8, 1, 5),   (8, 2, 5),   (8, 3, 5),
       (9, 1, 3),   (9, 2, 4),   (9, 3, 3);