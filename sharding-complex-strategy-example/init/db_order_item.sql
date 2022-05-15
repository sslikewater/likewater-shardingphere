create database if not exists order0;
create database if not exists  order1;

use order0;

CREATE TABLE if not exists `t_order_item_0` (
  `id` bigint NOT NULL,
  `order_id` bigint not null,
  `product_id` bigint not null,
  `sku_id` bigint not null,
  `price` bigint not null comment'价格 单位分',
  `discount_amount` bigint not null comment'折扣金额',
  `quantity` int not null comment'数量',
  `total_items_amount` bigint not null comment'商品总金额',
  `gmt_create` datetime NOT NULL comment '创建时间',
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
  `status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
  `is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  INDEX `idx_order_id`(`order_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE if not exists `t_order_item_1` (
  `id` bigint NOT NULL,
  `order_id` bigint not null,
  `product_id` bigint not null,
  `sku_id` bigint not null,
  `price` bigint not null comment'价格 单位分',
  `discount_amount` bigint not null comment'折扣金额',
  `quantity` int not null comment'数量',
  `total_items_amount` bigint not null comment'商品总金额',
  `gmt_create` datetime NOT NULL comment '创建时间',
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
  `status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
  `is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  INDEX `idx_order_id`(`order_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE if not exists `t_order_item_2` (
  `id` bigint NOT NULL,
  `order_id` bigint not null,
  `product_id` bigint not null,
  `sku_id` bigint not null,
  `price` bigint not null comment'价格 单位分',
  `discount_amount` bigint not null comment'折扣金额',
  `quantity` int not null comment'数量',
  `total_items_amount` bigint not null comment'商品总金额',
  `gmt_create` datetime NOT NULL comment '创建时间',
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
  `status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
  `is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  INDEX `idx_order_id`(`order_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE if not exists `t_order_item_3` (
  `id` bigint NOT NULL,
  `order_id` bigint not null,
  `product_id` bigint not null,
  `sku_id` bigint not null,
  `price` bigint not null comment'价格 单位分',
  `discount_amount` bigint not null comment'折扣金额',
  `quantity` int not null comment'数量',
  `total_items_amount` bigint not null comment'商品总金额',
  `gmt_create` datetime NOT NULL comment '创建时间',
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
  `status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
  `is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  INDEX `idx_order_id`(`order_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

use order1;

CREATE TABLE if not exists `t_order_item_0` (
  `id` bigint NOT NULL,
  `order_id` bigint not null,
  `product_id` bigint not null,
  `sku_id` bigint not null,
  `price` bigint not null comment'价格 单位分',
  `discount_amount` bigint not null comment'折扣金额',
  `quantity` int not null comment'数量',
  `total_items_amount` bigint not null comment'商品总金额',
  `gmt_create` datetime NOT NULL comment '创建时间',
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
  `status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
  `is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  INDEX `idx_order_id`(`order_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE if not exists `t_order_item_1` (
  `id` bigint NOT NULL,
  `order_id` bigint not null,
  `product_id` bigint not null,
  `sku_id` bigint not null,
  `price` bigint not null comment'价格 单位分',
  `discount_amount` bigint not null comment'折扣金额',
  `quantity` int not null comment'数量',
  `total_items_amount` bigint not null comment'商品总金额',
  `gmt_create` datetime NOT NULL comment '创建时间',
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
  `status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
  `is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  INDEX `idx_order_id`(`order_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE if not exists `t_order_item_2` (
  `id` bigint NOT NULL,
  `order_id` bigint not null,
  `product_id` bigint not null,
  `sku_id` bigint not null,
  `price` bigint not null comment'价格 单位分',
  `discount_amount` bigint not null comment'折扣金额',
  `quantity` int not null comment'数量',
  `total_items_amount` bigint not null comment'商品总金额',
  `gmt_create` datetime NOT NULL comment '创建时间',
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
  `status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
  `is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  INDEX `idx_order_id`(`order_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE if not exists `t_order_item_3` (
  `id` bigint NOT NULL,
  `order_id` bigint not null,
  `product_id` bigint not null,
  `sku_id` bigint not null,
  `price` bigint not null comment'价格 单位分',
  `discount_amount` bigint not null comment'折扣金额',
  `quantity` int not null comment'数量',
  `total_items_amount` bigint not null comment'商品总金额',
  `gmt_create` datetime NOT NULL comment '创建时间',
  `gmt_modified` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) comment '修改时间',
  `status` smallint NOT NULL comment '状态： -1 已取消，1 新建，2 已支付，3 已发货，4确认收货',
  `is_deleted` tinyint NOT NULL comment ' 1 已删除，0 未删除',
  PRIMARY KEY (`id`),
  INDEX `idx_gmt_modified`(`gmt_modified`) USING BTREE,
  INDEX `idx_order_id`(`order_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;