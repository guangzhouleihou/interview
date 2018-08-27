/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     2018/8/27 14:55:51                           */
/*==============================================================*/


alter table auth_token
   drop constraint fk_auth_tok_reference_hm_user;

alter table data_authority
   drop constraint fk_data_aut_reference_role;

alter table file_authority
   drop constraint fk_file_aut_reference_role;

alter table func_authority
   drop constraint fk_func_aut_reference_role;

alter table role_menu
   drop constraint fk_role_men_reference_role;

alter table role_menu
   drop constraint fk_role_men_reference_menu;

alter table simple_data_authority
   drop constraint fk_simple_d_reference_role;

alter table user_role
   drop constraint fk_user_rol_reference_hm_user;

alter table user_role
   drop constraint fk_user_rol_reference_role;

drop table auth_token cascade constraints;

drop table company cascade constraints;

drop table data_authority cascade constraints;

drop table department cascade constraints;

drop table department_type cascade constraints;

drop table file_authority cascade constraints;

drop table func_authority cascade constraints;

drop table hm_user cascade constraints;

drop table menu cascade constraints;

drop table role cascade constraints;

drop table role_menu cascade constraints;

drop table simple_data_authority cascade constraints;

drop table user_role cascade constraints;

/*==============================================================*/
/* Table: auth_token                                            */
/*==============================================================*/
create table auth_token 
(
   id                   varchar2(128char)    not null,
   user_id              varchar2(128char),
   token                varchar2(32char),
   create_time          date,
   valid_time           date,
   constraint sys_c009069 primary key (id),
   constraint sys_c009068 check ("id" is not null)
);

comment on table auth_token is
'身份令牌';

comment on column auth_token.id is
'身份令牌ID';

comment on column auth_token.user_id is
'用户ID';

comment on column auth_token.token is
'令牌';

comment on column auth_token.create_time is
'创建时间';

comment on column auth_token.valid_time is
'有效时间';

/*==============================================================*/
/* Table: company                                               */
/*==============================================================*/
create table company 
(
   id                   varchar2(128char)    not null,
   name                 varchar2(128char),
   constraint sys_c009083 primary key (id),
   constraint sys_c009082 check ("id" is not null)
);

comment on table company is
'公司';

comment on column company.id is
'公司ID';

comment on column company.name is
'公司名称';

/*==============================================================*/
/* Table: data_authority                                        */
/*==============================================================*/
create table data_authority 
(
   id                   varchar2(128byte)    not null,
   role_id              varchar2(128byte),
   department_range     number,
   business_scene_definition_id varchar2(32byte),
   operation            varchar2(8byte),
   create_time          date,
   constraint sys_c009071 primary key (id),
   constraint sys_c009070 check ("id" is not null)
);

comment on table data_authority is
'数据权限';

comment on column data_authority.id is
'数据权限ID';

comment on column data_authority.role_id is
'角色ID';

comment on column data_authority.department_range is
'部门范围';

comment on column data_authority.business_scene_definition_id is
'业务场景定义ID';

comment on column data_authority.operation is
'操作';

comment on column data_authority.create_time is
'创建时间';

/*==============================================================*/
/* Table: department                                            */
/*==============================================================*/
create table department 
(
   id                   varchar2(128char)    not null,
   parent_department_id varchar2(128char),
   code                 varchar2(128char),
   name                 varchar2(128char),
   description          varchar2(128char),
   view_order           number(11,0),
   department_type_id   varchar2(128char),
   create_time          date,
   last_update_time     date,
   security_level       number(11,0),
   simple_name          varchar2(128char),
   constraint sys_c009072 primary key (id),
   constraint sys_c009062 check ("id" is not null)
);

comment on table department is
'部门';

comment on column department.id is
'部门ID';

comment on column department.parent_department_id is
'父部门ID';

comment on column department.code is
'编码';

comment on column department.name is
'名字';

comment on column department.description is
'描述';

comment on column department.view_order is
'可看订单';

comment on column department.department_type_id is
'部门类型ID';

comment on column department.create_time is
'创建时间';

comment on column department.last_update_time is
'最后更新时间';

comment on column department.security_level is
'安全等级';

comment on column department.simple_name is
'简称';

/*==============================================================*/
/* Table: department_type                                       */
/*==============================================================*/
create table department_type 
(
   id                   varchar2(128char)    not null,
   name                 varchar2(32char),
   create_time          date,
   description          varchar2(1024char),
   constraint sys_c009073 primary key (id),
   constraint sys_c009061 check ("id" is not null)
);

comment on table department_type is
'部门类型';

comment on column department_type.id is
'部门类型ID';

comment on column department_type.name is
'姓名';

comment on column department_type.create_time is
'创建时间';

comment on column department_type.description is
'描述';

/*==============================================================*/
/* Table: file_authority                                        */
/*==============================================================*/
create table file_authority 
(
   id                   varchar2(128byte)    not null,
   role_id              varchar2(128byte),
   operation            varchar2(32byte),
   create_time          date,
   constraint sys_c009074 primary key (id),
   constraint sys_c009063 check ("id" is not null)
);

comment on table file_authority is
'文件权限';

comment on column file_authority.id is
'文件权限ID';

comment on column file_authority.role_id is
'角色ID';

comment on column file_authority.operation is
'操作';

comment on column file_authority.create_time is
'创建时间';

/*==============================================================*/
/* Table: func_authority                                        */
/*==============================================================*/
create table func_authority 
(
   id                   varchar2(128char)    not null,
   role_id              varchar2(128char),
   business_scene_definition_id varchar2(128char),
   operation            varchar2(8char),
   create_time          date,
   constraint sys_c009076 primary key (id),
   constraint sys_c009075 check ("id" is not null)
);

comment on table func_authority is
'功能权限';

comment on column func_authority.id is
'功能权限ID';

comment on column func_authority.role_id is
'角色ID';

comment on column func_authority.business_scene_definition_id is
'业务场景定义ID';

comment on column func_authority.operation is
'操作';

comment on column func_authority.create_time is
'创建时间';

/*==============================================================*/
/* Table: hm_user                                               */
/*==============================================================*/
create table hm_user 
(
   id                   varchar2(128char)    not null,
   username             varchar2(256char),
   loginid              varchar2(256char)    not null,
   password             varchar2(256char),
   mobile               varchar2(16char),
   email                varchar2(256char),
   avatar               varchar2(1024char),
   create_time          date,
   last_update_time     date,
   last_login_time      date,
   security_level       number(11,0),
   type                 number(11,0),
   constraint sys_c009077 primary key (id),
   constraint sys_c009059 check ("id" is not null)
);

comment on table hm_user is
'用户';

comment on column hm_user.id is
'用户ID';

comment on column hm_user.username is
'用户名字';

comment on column hm_user.loginid is
'登录ID';

comment on column hm_user.password is
'密码';

comment on column hm_user.mobile is
'联系电话';

comment on column hm_user.email is
'邮箱';

comment on column hm_user.avatar is
'头像';

comment on column hm_user.create_time is
'创建时间';

comment on column hm_user.last_update_time is
'更新时间';

comment on column hm_user.last_login_time is
'最后登录时间';

comment on column hm_user.security_level is
'安全级别';

comment on column hm_user.type is
'1:企业，2：代理商';

/*==============================================================*/
/* Table: menu                                                  */
/*==============================================================*/
create table menu 
(
   id                   varchar2(128char)    not null,
   name                 varchar2(16char),
   menu_logo            varchar2(64char),
   superior_menu_id     varchar2(128char),
   rank                 number(11,0),
   create_time          date,
   display_position     number(11,0),
   link                 varchar2(255byte),
   type                 number(11,0),
   target_id            varchar2(255byte),
   app_url              varchar2(255byte),
   constraint sys_c009078 primary key (id),
   constraint sys_c009064 check ("id" is not null)
);

comment on table menu is
'菜单';

comment on column menu.id is
'菜单ID';

comment on column menu.name is
'名字';

comment on column menu.menu_logo is
'菜单图标';

comment on column menu.superior_menu_id is
'上级菜单ID';

comment on column menu.rank is
'等级';

comment on column menu.create_time is
'创建时间';

comment on column menu.display_position is
'展示位置';

comment on column menu.link is
'链接';

comment on column menu.type is
'类型';

comment on column menu.target_id is
'目标ID';

comment on column menu.app_url is
'APP_URL';

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role 
(
   id                   varchar2(128char)    not null,
   name                 varchar2(128char),
   description          clob,
   create_time          date,
   rank                 number,
   constraint sys_c009079 primary key (id),
   constraint sys_c009065 check ("id" is not null)
);

comment on table role is
'角色';

comment on column role.id is
'角色ID';

comment on column role.name is
'姓名';

comment on column role.description is
'描述';

comment on column role.create_time is
'创建时间';

comment on column role.rank is
'等级';

/*==============================================================*/
/* Table: role_menu                                             */
/*==============================================================*/
create table role_menu 
(
   role_id              varchar2(120char),
   menu_id              varchar2(120char)
);

comment on table role_menu is
'角色菜单';

comment on column role_menu.role_id is
'角色ID';

comment on column role_menu.menu_id is
'菜单ID';

/*==============================================================*/
/* Table: simple_data_authority                                 */
/*==============================================================*/
create table simple_data_authority 
(
   id                   varchar2(128byte)    not null,
   role_id              varchar2(128byte),
   department_range     number(11,0),
   create_time          date,
   constraint sys_c009081 primary key (id),
   constraint sys_c009080 check ("id" is not null)
);

comment on table simple_data_authority is
'简单数据权限';

comment on column simple_data_authority.id is
'简单数据权限ID';

comment on column simple_data_authority.role_id is
'角色ID';

comment on column simple_data_authority.department_range is
'部门范围';

comment on column simple_data_authority.create_time is
'创建时间';

/*==============================================================*/
/* Table: user_role                                             */
/*==============================================================*/
create table user_role 
(
   role_id              varchar2(128char)    not null,
   user_id              varchar2(128char)    not null,
   rank                 number(11,0),
   constraint sys_c009066 check ("role_id" is not null)
);

comment on table user_role is
'用户角色';

comment on column user_role.role_id is
'角色ID';

comment on column user_role.user_id is
'用户ID';

comment on column user_role.rank is
'等级';

alter table auth_token
   add constraint fk_auth_tok_reference_hm_user foreign key (user_id)
      references hm_user (id);

alter table data_authority
   add constraint fk_data_aut_reference_role foreign key (role_id)
      references role (id);

alter table file_authority
   add constraint fk_file_aut_reference_role foreign key (role_id)
      references role (id);

alter table func_authority
   add constraint fk_func_aut_reference_role foreign key (id)
      references role (id);

alter table role_menu
   add constraint fk_role_men_reference_role foreign key (role_id)
      references role (id);

alter table role_menu
   add constraint fk_role_men_reference_menu foreign key (menu_id)
      references menu (id);

alter table simple_data_authority
   add constraint fk_simple_d_reference_role foreign key (role_id)
      references role (id);

alter table user_role
   add constraint fk_user_rol_reference_hm_user foreign key (user_id)
      references hm_user (id);

alter table user_role
   add constraint fk_user_rol_reference_role foreign key (role_id)
      references role (id);

