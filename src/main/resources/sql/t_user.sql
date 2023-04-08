CREATE TABLE `t_user`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
    `username`    varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户姓名',
    `nickname`    varchar(80) COLLATE utf8mb4_general_ci                       DEFAULT NULL COMMENT '用户昵称',
    `sex`         int(1) DEFAULT NULL COMMENT '用户性别 1-男 0-女',
    `password`    varchar(80) COLLATE utf8mb4_general_ci                       DEFAULT NULL COMMENT '用户密码',
    `phone`       int(11) DEFAULT NULL COMMENT '用户手机号码',
    `email`       varchar(80) COLLATE utf8mb4_general_ci                       DEFAULT NULL COMMENT '邮箱',
    `create_time` datetime                                                     DEFAULT NULL COMMENT '注册时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;