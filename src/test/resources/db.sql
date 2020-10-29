# 创建一个数据库
drop database if exists elmdb;
create database if not exists elmdb;

# 手动提交
commit ;

use elmdb;

# 创建数据表
# 商家信息表
drop table if exists business;
create table if not exists business
(
    bid             integer auto_increment comment '商家id',
    bname           varchar(20) not null comment '商家名称',
    bpassword       varchar(32) not null comment '登录密码',
    bimg            varchar(150) not null comment '商家图片',
    bscore          double      default null comment '评分',
    bdescription    varchar(10) default null comment '商家描述',
    courier         varchar(10) not null comment '快递方式',
    blocation       varchar(10) not null comment '商家地址',
    delivery        double      default null comment '起送费',
    freight         double      default null comment '配送费',
    add_time        timestamp default current_timestamp,
    up_time         timestamp default current_timestamp on update current_timestamp,
    primary key (`bid`)
    ) comment '商家信息表';
commit;

# 插入商家信息测试数据
insert into business (bname, bpassword, bimg, bscore,bdescription,courier,blocation,delivery,freight)
values ('万家饺子','fe8fb64eb34764f9e0a58a32a819dcb2','img/001','4.9','各种饺子炒菜','蜂鸟快送','软件园',15,3),
       ('李家饺子','fe8fb64eb34764f9e0a58a32a819dcb2','img/002','4.6','各种饺子炒菜','美团快送','软件园',15,3),
       ('张家饺子','fe8fb64eb34764f9e0a58a32a819dcb2','img/003','4.7','各种饺子炒菜','饿了么快送','软件园',15,3),
       ('王家饺子','fe8fb64eb34764f9e0a58a32a819dcb2','img/004','4.8','各种饺子炒菜','老鸟快送','软件园',15,3),
       ('赵家饺子','fe8fb64eb34764f9e0a58a32a819dcb2','img/005','4.9','各种饺子炒菜','顺丰快送','软件园',15,3);


# 活动信息表
drop table if exists promotion;
create table if not exists promotion
(
    pid          integer auto_increment comment '活动id',
    pname        varchar(20) not null comment '活动名称',
    introduction varchar(32) not null comment '活动简介',
    add_time     timestamp default current_timestamp,
    up_time      timestamp default current_timestamp on update current_timestamp,
    primary key (`pid`)
    ) comment '活动信息表';
commit;

# 插入活动信息测试数据
insert into promotion (pname, introduction)
values ('打折','第二份半价'),
       ('满减','满30减5'),
       ('满减','满60减15'),
       ('打折','3份8.5折');

# 商家--活动表
drop table if exists business_activities;
create table if not exists business_activities
(
    aid  integer auto_increment comment '商家活动id',
    abid integer not null comment '商家id',
    apid integer not null comment '活动id',
    add_time  timestamp default current_timestamp,
    up_time   timestamp default current_timestamp on update current_timestamp,
    primary key (`aid`),
    constraint `fk_ba_abid_to_b_bid` foreign key business_activities(`abid`) references business(`bid`),
    constraint `fk_ba_apid_to_p_pid` foreign key business_activities(`apid`) references promotion(`pid`)
    )auto_increment 1  comment '商家--活动表';
commit;

# 插入商家--活动测试数据
insert into business_activities (abid, apid)
values (1,2),
       (2,4),
       (3,2);

# 商品类别表
drop table if exists categorys;
create table if not exists categorys
(
    cgid       integer auto_increment comment '分类id',
    cgname     varchar(20) not null comment '分类名称',
    cdes       varchar(20) default null comment '类别介绍',
    cavatar    varchar(150) default null comment '类别图片',
    add_time   timestamp default current_timestamp,
    up_time    timestamp default current_timestamp on update current_timestamp,
    primary key (`cgid`)
    ) comment '商品信息表';
commit;

# 插入商品类别测试数据
insert into categorys (cgname,cdes,cavatar)
values ('美食','美食','img/01'),
       ('早餐','美食','img/01'),
       ('跑腿代购','美食','img/01'),
       ('汉堡披萨','美食','img/01'),
       ('甜品饮品','美食','img/01'),
       ('素食简餐','美食','img/01'),
       ('地方小吃','美食','img/01'),
       ('米粉面馆','美食','img/01'),
       ('包子粥铺','美食','img/01'),
       ('炸鸡炸串','美食','img/01');

# 商品信息表
drop table if exists goods;
create table if not exists goods
(
    gid              integer auto_increment comment '商品id',
    gname            varchar(20) not null comment '商品名称',
    gimg             varchar(150) not null comment '商品图片',
    gintroduction    varchar(20)   default   null comment '商品介绍',
    gprice           double not null comment '商品价格',
    gcgid            integer not null comment '所属分类id',
    gbid             integer not null comment '所属商家id',
    add_time         timestamp default current_timestamp,
    up_time          timestamp default current_timestamp on update current_timestamp,
    primary key (`gid`),
    constraint `fk_g_gcgid_to_c_cgid` foreign key goods_info(`gcgid`) references categorys(`cgid`),
    constraint `fk_g_gbid_to_b_bid` foreign key goods_info(`gbid`) references business(`bid`)
    ) comment '商品信息表';
commit;

# 插入商品信息测试数据
insert into goods (gname, gimg, gintroduction, gprice, gcgid,gbid)
values ('纯肉鲜肉','img/0001','鲜肉猪肉',15,1,1);

# ----------------------------------------------------------------
# 创建客户数据表
drop table if exists customer;
create table if not exists customer
(
    cid integer auto_increment comment '客户id',
    cname varchar(20) not null comment '客户姓名',
    cphone varchar(20) default null comment '联系电话',
    cemail varchar(64) default null comment '邮箱地址',
    cpass varchar(32) not null comment '密码',
    cbirth date default null comment '生日',
    cavatar varchar(150) default null comment '头像',
    cgender boolean default false comment '性别',
    cstatus boolean default false comment '是否禁用',
    add_time timestamp   not null default current_timestamp comment '创建时间',
    up_time  timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`cid`),
    UNIQUE KEY `cid` (`cid`),
    UNIQUE KEY `cname` (`cname`),
    UNIQUE KEY `cphone` (`cphone`),
    UNIQUE KEY `cemail` (`cemail`)
    ) auto_increment=1 charset=utf8 comment '客户基本信息表';
commit ;

# 通过批处理插入测试数据
DROP PROCEDURE
    IF
    EXISTS customer_insert;

DELIMITER $$
CREATE PROCEDURE customer_insert ()
BEGIN
    DECLARE
i INT DEFAULT 1;
    WHILE
i < 100 DO
            insert into customer (cname,cpass) value (concat('cus',i),'696aa7bb5ee7ac9135f7ed4ef526fe4d') ;
            SET i = i + 1;

END WHILE;
COMMIT;

END $$
DELIMITER ;
CALL customer_insert ();


# 创建管理用户数据表
drop table if exists adminuser;
create table if not exists adminuser
(
    uid      integer auto_increment comment '用户id',
    username varchar(20) not null comment '用户登录名',
    password varchar(32) not null comment '登录密码',
    add_time timestamp   not null default current_timestamp comment '创建时间',
    up_time  timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`uid`)
    ) comment '管理用户登录表';

commit;
# 插入管理用户测试数据
insert into adminuser (username, password)
values ('administrator', 'fe8fb64eb34764f9e0a58a32a819dcb2');
insert into adminuser ( username, password)
values ('admin2', 'fe8fb64eb34764f9e0a58a32a819dcb2');

#创建订单表orderlist
drop table if exists orderlist;
create table if not exists orderlist
(
    oid           integer auto_increment comment '订单表Id',
    oamount       integer     not null comment '订购产品数量',
    paysstatus    integer not null comment '用户结算状态',
    ogid          integer not null comment '订购商品id',
    ocid          integer not null comment '所属用户id',
    obid          integer not null comment '所属商家id',
    add_time      timestamp   not null default current_timestamp comment '创建时间',
    up_time       timestamp   not null default current_timestamp on update current_timestamp comment '订单修改时间',
    primary key (`oid`),
    constraint `fk_o_ogid_to_g_gid` foreign key orderlist(`ogid`) references goods(`gid`),
    constraint `fk_o_ocid_to_c_cid` foreign key orderlist(`ocid`) references customer(`cid`),
    constraint `fk_o_obid_to_b_bid` foreign key orderlist(`obid`) references business(`bid`)
    ) comment '订单表';
commit;

#插入订单表插入测试数据
insert into orderlist(oamount, paysstatus, ogid, ocid, obid)
VALUES (1,1,1,1,2);
commit;

#批量插入测试数据
DROP PROCEDURE
    IF EXISTS orderlist_insert;
DELIMITER $$
CREATE PROCEDURE orderlist_insert()
BEGIN
    DECLARE
i INT DEFAULT 1;
    WHILE i < 100
        DO
            insert into orderlist(oamount, paysstatus, ogid, ocid, obid)
            VALUES (1,1,1,1,2);
            SET i = i + 1;
end while;
COMMIT;
end $$
DELIMITER ;
CALL orderlist_insert();



