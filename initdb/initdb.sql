DROP SCHEMA IF EXISTS Attendance_db;
CREATE SCHEMA Attendance_db;
USE Attendance_db;

DROP TABLE IF EXISTS employee;
create table if not exists employee (
  id int not null auto_increment,
  name varchar(30) not null,
  height smallint,
  blood varchar(2),
  birthday date,
  birthplace_id smallint,
  update_at timestamp(6) not null default current_timestamp(6) on update current_timestamp(6),
  primary key (id)
) engine = INNODB;

insert into employee (name, height, blood, birthday, birthplace_id) values
('田中太郎', 175, 'O',  '1993-07-17', 10),
('佐藤花子', 160, 'O',  '1999-12-16', 13);

DROP TABLE IF EXISTS work_time;
create table if not exists work_time (
  id int not null auto_increment,
  work_date datetime,
  start_date datetime,
  end_date datetime,
  primary key (id)
) engine = INNODB;



DROP TABLE IF EXISTS from_area;
create table if not exists from_area (
  id int not null auto_increment,
  name varchar(6) not null,
  primary key (id)
) engine = INNODB;

insert into from_area (id, name) values
(1,'北海道'),(2,'青森県'),(3,'岩手県'),(4,'宮城県'),(5,'秋田県'),(6,'山形県'),(7,'福島県'),
(8,'茨城県'),(9,'栃木県'),(10,'群馬県'),(11,'埼玉県'),(12,'千葉県'),(13,'東京都'),(14,'神奈川県'),
(15,'新潟県'),(16,'富山県'),(17,'石川県'),(18,'福井県'),(19,'山梨県'),(20,'長野県'),(21,'岐阜県'),
(22,'静岡県'),(23,'愛知県'),(24,'三重県'),(25,'滋賀県'),
(26,'京都府'),(27,'大阪府'),(28,'兵庫県'),(29,'奈良県'),(30,'和歌山県'),
(31,'鳥取県'),(32,'島根県'),(33,'岡山県'),(34,'広島県'),(35,'山口県'),
(36,'徳島県'),(37,'香川県'),(38,'愛媛県'),(39,'高知県'),
(40,'福岡県'),(41,'佐賀県'),(42,'長崎県'),(43,'熊本県'),(44,'大分県'),(45,'宮崎県'),(46,'鹿児島県'),(47,'沖縄県');