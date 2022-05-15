create database if not exists order0;
create database if not exists order1;

use order0;

CREATE TABLE if not exists `t_order_0` (
 `id` bigint NOT NULL,
 `pay_time` datetime comment '支付时间',
 `ship_time` datetime comment '发货时间',
 `end_time` datetime comment'交易完成/取消时间',
 `user_id` bigint NOT NULL comment '买家id',
 `seller_id` bigint NOT NULL comment '卖家id',
 `store_id` bigint NOT NULL comment '卖家店铺id',
 `delivery_amount`  bigint NOT NULL DEFAULT 0 comment '邮费',
 `total_items_amount` bigint NOT NULL comment '商品总金额 单位 分',
 `discount_amount` bigint NOT NULL DEFAULT 0 comment '总折扣金额，单位 分',
 `total_amount` bigint NOT NULL comment '实付总金额， 单位 分',
 `delivery_address` varchar(128) NOT NULL comment '收获地址 ',
 `gmt_create` datetime NOT NULL comment '创建时间',
 `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
 `status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
 `is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
 PRIMARY KEY (`id`),
 INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
 INDEX `idx_user_id`(`user_id`) USING BTREE,
 INDEX `idx_seller_id`(`seller_id`) USING BTREE,
 INDEX `idx_store_id`(`store_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE if not exists `t_order_1` (
 `id` bigint NOT NULL,
 `pay_time` datetime comment '支付时间',
 `ship_time` datetime comment '发货时间',
 `end_time` datetime comment'交易完成/取消时间',
 `user_id` bigint NOT NULL comment '买家id',
 `seller_id` bigint NOT NULL comment '卖家id',
 `store_id` bigint NOT NULL comment '卖家店铺id',
 `total_items_amount` bigint NOT NULL comment '商品总金额 单位 分',
 `delivery_amount`  bigint NOT NULL DEFAULT 0 comment '邮费',
 `discount_amount` bigint NOT NULL DEFAULT 0  comment '总折扣金额，单位 分',
 `total_amount` bigint NOT NULL comment '实付总金额， 单位 分',
 `delivery_address` varchar(128) NOT NULL comment '收获地址 ',
 `gmt_create` datetime NOT NULL comment '创建时间',
 `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
 `status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
 `is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
 PRIMARY KEY (`id`),
 INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
 INDEX `idx_user_id`(`user_id`) USING BTREE,
 INDEX `idx_seller_id`(`seller_id`) USING BTREE,
 INDEX `idx_store_id`(`store_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE if not exists `t_order_2` (
 `id` bigint NOT NULL,
 `pay_time` datetime comment '支付时间',
 `ship_time` datetime comment '发货时间',
 `end_time` datetime comment'交易完成/取消时间',
 `user_id` bigint NOT NULL comment '买家id',
 `seller_id` bigint NOT NULL comment '卖家id',
 `store_id` bigint NOT NULL comment '卖家店铺id',
 `delivery_amount`  bigint NOT NULL DEFAULT 0 comment '邮费',
 `total_items_amount` bigint NOT NULL comment '商品总金额 单位 分',
 `discount_amount` bigint NOT NULL DEFAULT 0  comment '总折扣金额，单位 分',
 `total_amount` bigint NOT NULL comment '实付总金额， 单位 分',
 `delivery_address` varchar(128) NOT NULL comment ' 收获地址 ',
 `gmt_create` datetime NOT NULL comment '创建时间',
 `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
 `status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
 `is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
 PRIMARY KEY (`id`),
 INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
 INDEX `idx_user_id`(`user_id`) USING BTREE,
 INDEX `idx_seller_id`(`seller_id`) USING BTREE,
 INDEX `idx_store_id`(`store_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE if not exists `t_order_3` (
`id` bigint NOT NULL,
`pay_time` datetime comment '支付时间',
`ship_time` datetime comment '发货时间',
`end_time` datetime comment'交易完成/取消时间',
`user_id` bigint NOT NULL comment '买家id',
`seller_id` bigint NOT NULL comment '卖家id',
`store_id` bigint NOT NULL comment '卖家店铺id',
`delivery_amount`  bigint NOT NULL DEFAULT 0 comment '邮费',
`total_items_amount` bigint NOT NULL comment '商品总金额 单位 分',
`discount_amount` bigint NOT NULL DEFAULT 0  comment '总折扣金额，单位 分',
`total_amount` bigint NOT NULL comment '实付总金额， 单位 分',
`delivery_address` varchar(128) NOT NULL comment '收获地址 ',
`gmt_create` datetime NOT NULL comment '创建时间',
`gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
`status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
`is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
PRIMARY KEY (`id`),
INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
INDEX `idx_user_id`(`user_id`) USING BTREE,
INDEX `idx_seller_id`(`seller_id`) USING BTREE,
INDEX `idx_store_id`(`store_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


use order1;

CREATE TABLE if not exists `t_order_0` (
`id` bigint NOT NULL,
`pay_time` datetime comment '支付时间',
`ship_time` datetime comment '发货时间',
`end_time` datetime comment'交易完成/取消时间',
`user_id` bigint NOT NULL comment '买家id',
`seller_id` bigint NOT NULL comment '卖家id',
`store_id` bigint NOT NULL comment '卖家店铺id',
`delivery_amount`  bigint NOT NULL DEFAULT 0 comment '邮费',
`total_items_amount` bigint NOT NULL comment '商品总金额 单位 分',
`discount_amount` bigint NOT NULL DEFAULT 0  comment '总折扣金额，单位 分',
`total_amount` bigint NOT NULL comment '实付总金额， 单位 分',
`delivery_address` varchar(128) NOT NULL comment '收获地址 ',
`gmt_create` datetime NOT NULL comment '创建时间',
`gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
`status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
`is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
PRIMARY KEY (`id`),
INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
INDEX `idx_user_id`(`user_id`) USING BTREE,
INDEX `idx_seller_id`(`seller_id`) USING BTREE,
INDEX `idx_store_id`(`store_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE if not exists `t_order_1` (
`id` bigint NOT NULL,
`pay_time` datetime comment '支付时间',
`ship_time` datetime comment '发货时间',
`end_time` datetime comment'交易完成/取消时间',
`user_id` bigint NOT NULL comment '买家id',
`seller_id` bigint NOT NULL comment '卖家id',
`store_id` bigint NOT NULL comment '卖家店铺id',
`delivery_amount`  bigint NOT NULL DEFAULT 0 comment '邮费',
`total_items_amount` bigint NOT NULL comment '商品总金额 单位 分',
`discount_amount` bigint NOT NULL DEFAULT 0  comment '总折扣金额，单位 分',
`total_amount` bigint NOT NULL comment '实付总金额， 单位 分',
`delivery_address` varchar(128) NOT NULL comment '收获地址 ',
`gmt_create` datetime NOT NULL comment '创建时间',
`gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
`status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
`is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
PRIMARY KEY (`id`),
INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
INDEX `idx_user_id`(`user_id`) USING BTREE,
INDEX `idx_seller_id`(`seller_id`) USING BTREE,
INDEX `idx_store_id`(`store_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE if not exists `t_order_2` (
`id` bigint NOT NULL,
`pay_time` datetime comment '支付时间',
`ship_time` datetime comment '发货时间',
`end_time` datetime comment'交易完成/取消时间',
`user_id` bigint NOT NULL comment '买家id',
`seller_id` bigint NOT NULL comment '卖家id',
`store_id` bigint NOT NULL comment '卖家店铺id',
`delivery_amount`  bigint NOT NULL DEFAULT 0 comment '邮费',
`total_items_amount` bigint NOT NULL comment '商品总金额 单位 分',
`discount_amount` bigint NOT NULL DEFAULT 0  comment '总折扣金额，单位 分',
`total_amount` bigint NOT NULL comment '实付总金额， 单位 分',
`delivery_address` varchar(128) NOT NULL comment '收获地址',
`gmt_create` datetime NOT NULL comment '创建时间',
`gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
`status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
`is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
PRIMARY KEY (`id`),
INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
INDEX `idx_user_id`(`user_id`) USING BTREE,
INDEX `idx_seller_id`(`seller_id`) USING BTREE,
INDEX `idx_store_id`(`store_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE if not exists `t_order_3` (
`id` bigint NOT NULL,
`pay_time` datetime comment '支付时间',
`ship_time` datetime comment '发货时间',
`end_time` datetime comment'交易完成/取消时间',
`user_id` bigint NOT NULL comment '买家id',
`seller_id` bigint NOT NULL comment '卖家id',
`store_id` bigint NOT NULL comment '卖家店铺id',
`delivery_amount`  bigint NOT NULL DEFAULT 0 comment '邮费',
`total_items_amount` bigint NOT NULL comment '商品总金额 单位 分',
`discount_amount` bigint NOT NULL DEFAULT 0 comment '总折扣金额，单位 分',
`total_amount` bigint NOT NULL comment '实付总金额， 单位 分',
`delivery_address` varchar(128) NOT NULL comment '收获地址',
`gmt_create` datetime NOT NULL comment '创建时间',
`gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
`status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
`is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
PRIMARY KEY (`id`),
INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
INDEX `idx_user_id`(`user_id`) USING BTREE,
INDEX `idx_seller_id`(`seller_id`) USING BTREE,
INDEX `idx_store_id`(`store_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;