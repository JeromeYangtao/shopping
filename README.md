Java Spring Boot 开发电商系统接口，个人学习练手项目



### 项目运行


相关版本:

JDK  1.8

maven 3.x

Spring Boot 2.x



方式一(推荐)

```bash
git clone https://github.com/JeromeYangtao/shopping.git
```

IDE打开项目后使用IDE运行



方式二

```bash
git clone https://github.com/JeromeYangtao/shopping.git

cd shopping

mvn spring-boot:run
```





### TODOList:

- [x] 产品product 增删改查

- [x] 用户user 增删改查

- [x] validator校验

- [x] JDBC连接SQLite数据库

- [x] Junit单元测试

- [ ] 登录注册



### 相关API

swagger接口文档地址:

本地运行后访问:

http://localhost:8080/swagger-ui.html#/

| 请求类型 | URL       | 功能说明           |
| -------- | --------- | ------------------ |
| GET      | /users    | 查询用户列表       |
| POST     | /users    | 创建一个用户       |
| GET      | /users/id | 根据id查询一个用户 |
| PUT      | /users/id | 根据id更新一个用户 |
| DELETE   | /users/id | 根据id删除一个用户 |



