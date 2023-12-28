create table user
(
    id          int unsigned auto_increment comment '主键ID'
        primary key,
    account     varchar(64)  default ''                not null comment '账号',
    password    varchar(128) default ''                not null comment '密码',
    deleted     tinyint      default 0                 not null comment '是否删除',
    create_time timestamp    default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time timestamp    default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '最后更新时间',
    constraint uk_account
        unique (account)
)
    comment '用户登录表' collate = utf8mb4_general_ci;

create table user_info
(
    id          int unsigned auto_increment comment '主键ID'
        primary key,
    user_id     int unsigned  default '0'               not null comment '用户ID',
    user_name   varchar(50)   default ''                not null comment '用户名',
    real_name   varchar(50)   default ''                not null comment '真实姓名',
    student_id  varchar(50)   default ''                not null comment '学号',
    picture     varchar(128)  default ''                not null comment '用户图像',
    phone       varchar(100)  default ''                not null comment '电话号码',
    college     varchar(50)   default ''                not null comment '学院',
    profile     varchar(225)  default ''                not null comment '个人简介',
    user_role   int           default 0                 not null comment '0 普通用户 1 超管',
    extend      varchar(1024) default ''                not null comment '扩展字段',
    ip          varchar(100)  default ''                not null comment '用户的ip信息',
    major       varchar(100)  default ''                not null comment '专业',
    deleted     tinyint       default 0                 not null comment '是否删除',
    create_time timestamp     default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time timestamp     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '最后更新时间'
)
    comment '用户个人信息表' collate = utf8mb4_general_ci;

create index key_user_id
    on user_info (user_id);