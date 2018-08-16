## Java Spring 招聘

### 招聘流程

   * 笔试
   * 面试



### 笔试

* 采⽤用Spring实现 http://localhost:8080/swagger-ui.html 中的以下⼏几个接⼝：
* 登录接⼝口：http://localhost:8080/swagger-ui.html#!/accountcontroller/login  POST方式
* 创建⽤用户：http://localhost:8080/swagger-ui.html#!/hm-usercontroller/createHmUser POST方式
* 更更新⽤用户：http://localhost:8080/swagger-ui.html#!/hm-usercontroller/getHmUser  PUT方式
* 查询某个⽤用户信息：http://localhost:8080/swagger-ui.html#!/hm-usercontroller/getHmUser GET方式
* 查询⽤用户列列表：（注意接⼝口参数需要实现X-Auth-Token/pageNo/pageSize/sortItem/sortOrder/filters/includes/refers，不需要实现relates）：
    http://localhost:8080/swagger-ui.html#!/hm-user-controller/getHmUsers  GET方式

    查询接⼝口参数说明如下： 
    @param pageNo 整数,如1 起始⻚页⻚页数<br/>
    @param pageSize 整数,如10 每⻚页显示条数 <br/>
    @param sortItem 格式为"id, name" 根据字段排序 (sortItem与sortOrder一一对应) <br/>
    @param sortOrder 格式为"asc, desc" 排序的关 键字 (asc正序,desc倒叙)<br/>
    @param filters JSON字符串串, ⽤用来过滤列列表的数据, 格式为
    ```
        {
    	'table': 表名{
    		'column1': { 表中的字段
    		    like: '%abc%',                   模糊查询,包含字符”abc”
    		    notLike:  '',                    模糊查询,不包含字符
    			between: [1,10],                 取值在[1,10]之间,包含1与10
    			notBetween: [1,10],	             取值小于1大于10
    			isNull: true,                    只能为true判断字段是否为空
    			isNotNull: true,                 只能为true判断字段是否不为空
    			equalTo: "abc",                  相等于
    			notEqualTo: "abc",               不等于
    			greaterThan: 10,                 大于
    			greaterThanOrEqualTo: Í10,       大于等于
    			lessThan: 10,                    小于
    			lessThanOrEqualTo: 10,           小于等于
    			in: [],	                         包含[]中字段
    			notIn: []                        不包含[]中字段
    			}
    		}
    	}

    ```
    @param includes JSON字符串串, 用来将本表的外链字段(table_id类似的字段)指向的外链表相关联
    同时返回两张表的数据, 格式为: <br/>
   ```
        {
        	'include_table1': {
        		//外链表表名1（本表所对应的主键表）includes: ['include_table11',
        		'include_table12']与主表所对应的外键
        	},
        	'include_table2': {
        		//外链表表名2includes: ['include_table21',
        		'include_table22']与主表所对应的外键
        	}
        }
    ```    
    @param refers JSON字符串串, ⽤用来将其他表的外链字段指向本表关联，同时返回数据, 格式为:
    ```
         {
            'refer_table1': {
                //主键id所对应的外键表表名1（本表所对应的外键表）includes: ['include_table11', 'include_table12']//外键表的外键字段
            },
            'refer_table2': {
                //主键id所对应的外键表表名2includes: ['include_table21','include_table22']//外键表的外键字段
            }
         }
         
     ```
     
     
    
   ### 项目相关地址 
   
* gitlab地址：https://github.com/guangzhouleihou/interview   
* API地址：http://localhost:8080/swagger-ui.html（编写的代码，必须严格按照我们接口定义返回的格式返回）
* 数据库设计文档 : 项目目录下的 organization.pdm（pdm）   organization.png（图片）
* 数据库连接方式：mysql-demo.gzleihou.cn:3306，用户名：interview，密码：interview
* Redis连接方式：redis-demo.gzleihou.cn:6379
* RabbitMQ连接方式：http://rabbitmq-demo.gzleihou.cn:15672，用户名：admin，密码：admin

    
    
   ###   要求
* 实现我们要求的接口定义文档中的内容。
* 将代码推送到 https://github.com， 并将填写好的excel表发送给HR
* 笔试结束，演示已经完成的接口
   
    
   ###  评分标准
* 成功启动项目：1分
* 完成登录接口：2分 <br/>
    完成一般登录功能：0.5分 <br/>
    完成高并发登录功能：1.5分
    
* 完成创建用户接口：2分
* 完成一般创建用户功能：0.5分<br/>
  完成高并发创建用户功能：1.5分 <br/>
* 完成更更新用户接口：1分
  完成一般创建用户功能：0.5分 <br/>
  完成高并发创建用户功能：0.5分<br/>
* 查询某个用户信息接⼝口：1分
  完成⼀一般查询用户功能：0.5分 <br/>
    完成高并发查询用户功能：0.5分 <br/>
* 完成查询用户接口：3分
    未实现pageNo/pageSize/sortItem/sortOrder/filters/includes/relates等接口参数过滤，0.5分 <br/>
    实现pageNo/pageSize：0.5分<br/>
    实现sortItem/sortOrder：0.5分<br/>
    实现filters：0.5分<br/>
    实现includes：0.5分<br/>
    实现relates：0.5分<br/>
    
    





