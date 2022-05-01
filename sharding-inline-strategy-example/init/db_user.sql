create database user0;
create database user1;

use user0;

CREATE TABLE `user_0` (
  `id` bigint NOT NULL,
  `user_name` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `id_card_no` varchar(64) NOT NULL,
  `mobile` varchar(16) NOT NULL,
  `email` varchar(64) NOT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `status` smallint NOT NULL,
  `is_deleted` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  UNIQUE INDEX `idx_id_card_no`(`id_card_no`) USING BTREE,
  UNIQUE INDEX `idx_email`(`email`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_1` (
  `id` bigint NOT NULL,
  `user_name` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `id_card_no` varchar(64) NOT NULL,
  `mobile` varchar(16) NOT NULL,
  `email` varchar(64) NOT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `status` smallint NOT NULL,
  `is_deleted` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  UNIQUE INDEX `idx_id_card_no`(`id_card_no`) USING BTREE,
  UNIQUE INDEX `idx_email`(`email`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_2` (
  `id` bigint NOT NULL,
  `user_name` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `id_card_no` varchar(64) NOT NULL,
  `mobile` varchar(16) NOT NULL,
  `email` varchar(64) NOT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `status` smallint NOT NULL,
  `is_deleted` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  UNIQUE INDEX `idx_id_card_no`(`id_card_no`) USING BTREE,
  UNIQUE INDEX `idx_email`(`email`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `user_3` (
  `id` bigint NOT NULL,
  `user_name` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `id_card_no` varchar(64) NOT NULL,
  `mobile` varchar(16) NOT NULL,
  `email` varchar(64) NOT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `status` smallint NOT NULL,
  `is_deleted` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  UNIQUE INDEX `idx_id_card_no`(`id_card_no`) USING BTREE,
  UNIQUE INDEX `idx_email`(`email`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

use user1;

CREATE TABLE `user_0` (
  `id` bigint NOT NULL,
  `user_name` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `id_card_no` varchar(64) NOT NULL,
  `mobile` varchar(16) NOT NULL,
  `email` varchar(64) NOT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `status` smallint NOT NULL,
  `is_deleted` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  UNIQUE INDEX `idx_id_card_no`(`id_card_no`) USING BTREE,
  UNIQUE INDEX `idx_email`(`email`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_1` (
  `id` bigint NOT NULL,
  `user_name` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `id_card_no` varchar(64) NOT NULL,
  `mobile` varchar(16) NOT NULL,
  `email` varchar(64) NOT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `status` smallint NOT NULL,
  `is_deleted` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  UNIQUE INDEX `idx_id_card_no`(`id_card_no`) USING BTREE,
  UNIQUE INDEX `idx_email`(`email`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_2` (
  `id` bigint NOT NULL,
  `user_name` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `id_card_no` varchar(64) NOT NULL,
  `mobile` varchar(16) NOT NULL,
  `email` varchar(64) NOT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `status` smallint NOT NULL,
  `is_deleted` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  UNIQUE INDEX `idx_id_card_no`(`id_card_no`) USING BTREE,
  UNIQUE INDEX `idx_email`(`email`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `user_3` (
  `id` bigint NOT NULL,
  `user_name` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `id_card_no` varchar(64) NOT NULL,
  `mobile` varchar(16) NOT NULL,
  `email` varchar(64) NOT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `status` smallint NOT NULL,
  `is_deleted` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  UNIQUE INDEX `idx_id_card_no`(`id_card_no`) USING BTREE,
  UNIQUE INDEX `idx_email`(`email`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
