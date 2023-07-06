-- 2023-07-05 17:20:07 by shurun
CREATE TABLE `czh`( `uuid` varchar(32) NOT NULL COMMENT 'ID',`is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标记',`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',PRIMARY KEY (`uuid`)) DEFAULT CHARSET=utf8mb4 COMMENT '程子豪';
-- 2023-07-05 17:27:26 by shurun
CREATE TABLE `test_t`( `uuid` varchar(32) NOT NULL COMMENT 'ID',`is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标记',`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',PRIMARY KEY (`uuid`)) DEFAULT CHARSET=utf8mb4 COMMENT '程子豪';
-- 2023-07-05 17:33:06 by shurun
CREATE TABLE `text_t`( `uuid` varchar(32) NOT NULL COMMENT 'ID',`is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标记',`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',PRIMARY KEY (`uuid`)) DEFAULT CHARSET=utf8mb4 COMMENT 'text';
-- 2023-07-06 10:49:08 by shurun
CREATE TABLE `tb_trends`( `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',`is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标记',`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',PRIMARY KEY (`id`))AUTO_INCREMENT=10000002 DEFAULT CHARSET=utf8mb4 COMMENT '动态';
-- 2023-07-06 10:49:36 by shurun
CREATE TABLE `tb_content`( `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',`is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标记',`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',PRIMARY KEY (`id`))AUTO_INCREMENT=10000002 DEFAULT CHARSET=utf8mb4 COMMENT '评论区';
-- 2023-07-06 10:49:51 by shurun
CREATE TABLE `tb_user`( `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',`is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标记',`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',PRIMARY KEY (`id`))AUTO_INCREMENT=10000002 DEFAULT CHARSET=utf8mb4 COMMENT '用户信息';
-- 2023-07-06 10:50:13 by shurun
CREATE TABLE `tb_user_info`( `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',`is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标记',`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',PRIMARY KEY (`id`))AUTO_INCREMENT=10000002 DEFAULT CHARSET=utf8mb4 COMMENT '用户详细信息';
-- 2023-07-06 10:58:28 by shurun
ALTER TABLE `tb_content` ADD COLUMN `userId` char(50) COMMENT '发布者用户名' AFTER `create_time`;
-- 2023-07-06 10:58:28 by shurun
ALTER TABLE `tb_content` ADD COLUMN `title` varchar(100) COMMENT '标题' AFTER `userId`;
-- 2023-07-06 10:58:28 by shurun
ALTER TABLE `tb_content` ADD COLUMN `contest` varchar(200) COMMENT '内容' AFTER `title`;
-- 2023-07-06 10:58:28 by shurun
ALTER TABLE `tb_content` ADD COLUMN `img` varchar(100) COMMENT '图片路径' AFTER `contest`;
-- 2023-07-06 10:58:28 by shurun
ALTER TABLE `tb_content` ADD COLUMN `status` varchar(100) COMMENT '状态(已发布,草稿)' AFTER `img`;
-- 2023-07-06 10:58:29 by shurun
ALTER TABLE `tb_content` ADD COLUMN `examin` varchar(100) COMMENT '审核' AFTER `status`;
-- 2023-07-06 10:58:29 by shurun
ALTER TABLE `tb_content` ADD COLUMN `liked` varchar(100) COMMENT '点赞数' AFTER `examin`;
-- 2023-07-06 10:58:29 by shurun
ALTER TABLE `tb_content` ADD COLUMN `area` varchar(100) COMMENT '发布地点(朋友圈或广场)' AFTER `liked`;
-- 2023-07-06 11:09:44 by shurun
ALTER TABLE `tb_content` ADD COLUMN `examin` tinyint(1) COMMENT '审核状态' AFTER `create_time`;
-- 2023-07-06 11:09:44 by shurun
ALTER TABLE `tb_content` ADD COLUMN `trends_id` bigint COMMENT '动态id' AFTER `examin`;
-- 2023-07-06 11:09:44 by shurun
ALTER TABLE `tb_content` ADD COLUMN `follow_user_id` bigint COMMENT '评论者id' AFTER `trends_id`;
-- 2023-07-06 11:09:44 by shurun
ALTER TABLE `tb_content` ADD COLUMN `content` varchar(100) COMMENT '评论内容' AFTER `follow_user_id`;
-- 2023-07-06 11:09:44 by shurun
ALTER TABLE `tb_content` ADD COLUMN `img` varchar(100) COMMENT '图片路径' AFTER `content`;
-- 2023-07-06 11:09:44 by shurun
ALTER TABLE `tb_content` ADD COLUMN `liked` int(8) COMMENT '点赞数' AFTER `img`;
-- 2023-07-06 11:11:28 by shurun
CREATE TABLE `tb_content_trends`( `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',`is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标记',`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',PRIMARY KEY (`id`))AUTO_INCREMENT=10000002 DEFAULT CHARSET=utf8mb4 COMMENT '与动态交互的信息';
-- 2023-07-06 11:16:39 by shurun
ALTER TABLE `tb_content_trends` ADD COLUMN `trend_id` varchar(100) COMMENT '动态id' AFTER `create_time`;
-- 2023-07-06 11:16:39 by shurun
ALTER TABLE `tb_content_trends` ADD COLUMN `follow_user_id` varchar(100) COMMENT '评论者id' AFTER `trend_id`;
-- 2023-07-06 11:16:39 by shurun
ALTER TABLE `tb_content_trends` ADD COLUMN `isliked` tinyint(1) COMMENT '是否点赞' AFTER `follow_user_id`;
-- 2023-07-06 11:17:43 by shurun
ALTER TABLE `tb_trends` MODIFY COLUMN `status` varchar(100) COMMENT '状态(已发布,草稿,发布中)' AFTER `img`;
-- 2023-07-06 11:26:06 by shurun
DROP TABLE IF EXISTS basic_info;
-- 2023-07-06 11:26:18 by shurun
DROP TABLE IF EXISTS basic_info;
-- 2023-07-06 11:27:07 by shurun
drop table if exists user;
-- 2023-07-06 11:27:07 by shurun
drop table if exists friendships;
-- 2023-07-06 11:27:07 by shurun
drop table if exists profile;
