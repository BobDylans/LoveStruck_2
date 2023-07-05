-- user
create table user
(
    id         bigint auto_increment comment '用户id'
        primary key,
    profile_id bigint                             null comment '用户资料 id',
    username   varchar(255)                       null comment '用户名',
    address_id varchar(255)                       null comment '地址id',
    avatar     varchar(255) default 'default.jpg' null comment '用户头像',
    role       int          default 0             null comment '用户角色',
    gender     int          default 0             null comment '性别',
    password   varchar(255) default '12345'       null comment '个人密码',
    emil       varchar(255)                       null comment '个人邮箱',
    age        int                                null comment '年龄',
    status     int          default 1             null comment '是否上线'
)comment '用户表;';
-- 字典表
create table dictionary
(
    id                     bigint auto_increment comment '字典ID'
        primary key,
    dictionary_create_time datetime     null comment '创建时间',
    dictionary_update_time datetime     null comment '更新时间',
    related_id             int          null comment '相关ID',
    related_type           varchar(255) null comment '相关类型',
    related_name           varchar(255) null comment '相关名',
    status                 int          null comment '状态(1正常，0正常)'
)comment '字典表;';
-- auto-generated definition
create table friendships
(
    id                      bigint auto_increment comment 'id号'
        primary key,
    friendships_create_time datetime      null comment '创建时间',
    user_id                 bigint        null comment '用户id',
    friend_id               bigint        null comment '朋友Id',
    degree                  int default 0 null comment '友情程度',
    concern                 int default 0 null comment '关注程度'
)comment '好友关系表;';
-- auto-generated definition
create table profile
(
    profile_create_time datetime                  not null comment '创建时间',
    profile_update_time datetime                  null comment '更新时间',
    id                  bigint auto_increment comment 'id'
        primary key,
    height              decimal(24, 2)            null comment '身高单位（cm)',
    Weight              decimal(24, 2)            null comment '体重（kg)',
    education           varchar(100) default '专科' null comment '学历',
    occupation          varchar(100) default '鸡哥' null comment '职业',
    `desc`              text                      null comment '个人简介',
    nation              varchar(100)              null comment '民族',
    political           int          default 0    null comment '政治面貌',
    favorite            text                      null comment '爱好'
)comment '个人资料表;';

DROP TABLE IF EXISTS address;
CREATE TABLE address(
                        `id` bigint auto_increment comment '地址id' ,
                        `province` VARCHAR(100)    COMMENT '省' ,
                        `city` VARCHAR(100)    COMMENT '市' ,
                        `county` VARCHAR(100)    COMMENT '县' ,
                        `area` VARCHAR(100)    COMMENT '区' ,
                        `street` VARCHAR(100)    COMMENT '街道' ,
                        `detail` VARCHAR(100)    COMMENT 'xx号' ,
                        PRIMARY KEY (id)
)  COMMENT = '地址表;';
