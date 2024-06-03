-- 关联用户的个人信息表
'CREATE TABLE `sys_ds_user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `read_flag` char(1) NOT NULL DEFAULT ''0'',
  `school_name` varchar(45) NOT NULL,
  `user_type` char(1) NOT NULL,
  `nick_name` varchar(45) NOT NULL,
  `user_id` varchar(45) NOT NULL,
  `approve_type` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci'
-- 评分表
'CREATE TABLE `sys_score` (
  `id` int NOT NULL AUTO_INCREMENT,
  `adjudicator_id` bigint NOT NULL,
  `adjudicator` varchar(45) NOT NULL,
  `item_id` int NOT NULL,
  `dimension1` int DEFAULT NULL,
  `dimension2` int DEFAULT NULL,
  `dimension3` int DEFAULT NULL,
  `dimension4` int DEFAULT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `total` int DEFAULT NULL,
  `dimension5` int DEFAULT NULL,
  `dimension6` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci'
-- 作品表
'CREATE TABLE `sys_items` (
  `item_id` int NOT NULL AUTO_INCREMENT,
  `class_type` char(1) DEFAULT NULL,
  `teacher` varchar(255) DEFAULT NULL,
  `phonenumber` varchar(11) DEFAULT NULL,
  `entry_form` varchar(255) DEFAULT NULL,
  `commit_time` datetime DEFAULT NULL,
  `school` varchar(45) DEFAULT NULL,
  `information` varchar(255) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `subTitle` varchar(45) DEFAULT NULL,
  `course` int DEFAULT NULL,
  `create_by` varchar(45) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `view` int DEFAULT NULL,
  `cover` varchar(255) DEFAULT NULL,
  `vote` int DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `exhibit_flag` char(1) DEFAULT NULL,
  `sort_type` int DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci'

-- 作品子集
'CREATE TABLE `sys_item_sublist` (
  `sub_id` int NOT NULL AUTO_INCREMENT,
  `item_id` int DEFAULT NULL,
  `sub_title` varchar(45) DEFAULT NULL,
  `key_word` varchar(45) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `file_type` int DEFAULT NULL,
  PRIMARY KEY (`sub_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci'