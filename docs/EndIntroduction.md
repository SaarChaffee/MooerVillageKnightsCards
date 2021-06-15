# End Introduction

## Client, Server and DataBase

> 客户端：负责与用户的交互，用户的所有操作都通过客户端传给服务端与数据库

> 服务端：负责处理用户对战，实现了在不同设备上的实时对战功能。对战数据在服务端实时处理后传回客户端并向数据库更新

> 数据库：负责持久化存储用户的信息

## DataBase

- 多层封装，Drives层,Dao层,Util层
- 功能细分，DQL和DML，DCL，DDL调用的Dao层方法隔离，Util层一个方法对应一个SQL语句
- 直接返回指定数据，前端无需再做处理
- 高度自由定制，可以随时添加想要的源数据操作

**实现：**
> 驱动层：由JDBC的SQLSERVER驱动获取与数据库的连接对象conn，由Statement创建执行对象stat，并由getStat()方法传出

> Dao层：stat是执行SQL语句的对象，根据实际需求删减方法，但至少有两个：Update()与Search()。Update()负责执行DDL与DML语句，Search()负责执行DQL语句。Update()
> 返回一个状态值，每成功进行一个操作该值+1。Search()返回一个结果集。

> Util层：该层是与前端交互的最外层，前端通过调用方法并传入参数来获得想要的数据。一个数据有且仅有一个方法能获取。