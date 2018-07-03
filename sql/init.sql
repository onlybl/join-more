CREATE TABLE `product_collection`(
  `id` VARCHAR(32) NOT NULL DEFAULT '',
  `user_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '用户id',
  `product_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '商品id',
  PRIMARY KEY (`id`),
  KEY `idx_user_id`(`user_id`),
  KEY `idx_product_id`(`product_id`)
)COMMENT '商品收藏';

CREATE TABLE `shop_collection`(
  `id` VARCHAR(32) NOT NULL DEFAULT '',
  `user_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '用户id',
  `shop_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '店铺id',
  PRIMARY KEY (`id`),
  KEY `idx_user_id`(`user_id`),
  KEY `idx_product_id`(`shop_id`)
)COMMENT '店铺收藏';

CREATE TABLE `shop`(
  `id` VARCHAR(32) NOT NULL DEFAULT '',
  `user_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '所属用户id',
  `name` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '店铺名',
  `description` VARCHAR(512) COMMENT '店铺简介',
  PRIMARY KEY (`id`)
)COMMENT '店铺';