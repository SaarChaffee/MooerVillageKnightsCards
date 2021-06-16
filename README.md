# Mooer Village Knights Cards

## full version of JavaClosingHomework

<h1>

<a href="https://www.oracle.com/java/"><img src="https://img.shields.io/badge/JDK-1.8.0-red"/></a>
<a herf="https://www.microsoft.com/zh-cn/sql-server"><img src="https://img.shields.io/badge/DataBase-MSSQL-yellow"></a>
[![wakatime](https://wakatime.com/badge/github/SaarChaffee/MooerVillageKnightsCards.svg)](https://wakatime.com/badge/github/SaarChaffee/MooerVillageKnightsCards)
</h1>
<h2>

## Members

- [SaarChaffee](https://github.com/saarchaffee)
- [Evistix](https://gitee.com/Evistix)
- [BingyeAkie](https://gitee.com/BingyeAkie)
- [arua](https://gitee.com/arua)

## Main Function

- Gacha
- Khorium
- 1v1 Battle
- Friend

[comment]: <> (### Details please read documents[docs]&#40;docs/api.md&#41;)

## Realization method

- [Realization method](docs/EndIntroduction.md)

## Submodules

- [full version of Back-end](https://github.com/saarchaffee/JavaClosingHomework)

  </h2>

### Structure Tree View


```mermaid
graph TD
A(登录界面) --> B(注册)
A(登录界面) --> C(登录)
A(登录界面) --> D(注销)
A(登录界面) --> E(退出)
B -->  F[玩家ID,密码,确认密码,手机]
B -->  G(修改密码)
C -->  H(游戏主界面)
H -->  I(商城)
H -->  J(对战)
H -->  K(个人信息)
H -->  L(好友)
I -->  M[充值,道具购买,抽卡]
J -->  N(搜索用户名对战)
K -->  O[玩家uid,玩家昵称,玩家等级,玩家场次,被举报次数,拥有卡牌数量,点券余额]
L -->  P[查看好友,删除好友,拉黑,举报,发送信息]
M -->  Q(充值界面)
M -->  R(抽卡,判断余额)
R -->  S(余额足够显示抽卡所得)
R -->  T(余额不足跳转充值界面)
    
```