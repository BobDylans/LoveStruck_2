-- 2023-07-05 17:20:07 by shurun
CREATE TABLE `czh`( `uuid` varchar(32) NOT NULL COMMENT 'ID',`is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标记',`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',PRIMARY KEY (`uuid`)) DEFAULT CHARSET=utf8mb4 COMMENT '程子豪';
-- 2023-07-05 17:27:26 by shurun
CREATE TABLE `test_t`( `uuid` varchar(32) NOT NULL COMMENT 'ID',`is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标记',`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',PRIMARY KEY (`uuid`)) DEFAULT CHARSET=utf8mb4 COMMENT '程子豪';
-- 2023-07-05 17:33:06 by shurun
CREATE TABLE `text_t`( `uuid` varchar(32) NOT NULL COMMENT 'ID',`is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '删除标记',`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',PRIMARY KEY (`uuid`)) DEFAULT CHARSET=utf8mb4 COMMENT 'text';
