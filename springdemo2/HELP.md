# Getting Started

1.配置就不唠了，用maven配置，首先jar包依赖，然后就是tomcat的配置
2.文件组织结构：
  (1)首先让当前包的framework structure设置成web，就会多出来一个带蓝点的web文件夹，里面有WEB-INF包和form.jsp，index.jsp。WEB-INF中有jsp文件包(test.jsp)和web.xml

  (2)jsp(java server page) 本质上是一种servlet ![image](https://user-images.githubusercontent.com/25454314/169689199-93db7275-3ed3-48a4-8792-f7b6af1d4798.png)
    运行逻辑：url——>controller(servlet)->servlet进行业务逻辑（访问数据库，操作巴拉巴拉）->重定向
    ![image](https://user-images.githubusercontent.com/25454314/169689367-b1685e6b-10b8-41fb-837b-5506499cdb85.png)
    
    涉及的jsp文件：index.jsp (主页) ,form.jsp(提交的表单) , test.jsp(测试？) 
    
  (3)web.xml配置 servlet(对应的java文件) 和servlet-mapping,hello这个servlet对应了/hello这个地址
  理解域名+/servlet+?method=xxx(传参)
  
  (4)tomcat把一整套打包部署到服务器，也就是localhost/8080
  
3.helloservlet
  (1) 获取前端参数，getParameter
  (2) 执行判断逻辑 ，msg里传数据值
  (3) getRequestDispatcher -到test.jsp
