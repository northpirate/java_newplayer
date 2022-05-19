# java_newplayer
this is a practise

# 1.0519-springMVC

直接用maven开一个project，配jar依赖的时候javax.servlet.jsp和javax.servlet导不进去，显示not found,搞了一天差点把maven重新配了也不行，重新用spring intializer开一个project就搞出来了（reload）之后，虽然在reload之前也是爆红，同时发现maven那一栏在springmvc子module下可以看到dependencies了，之前就一直没看到。
好在不爆红了

记一些小知识点，免得又忘了：
（1）source root 和 resource root
（2）pom.xml是maven用来管理当前模块下的jar依赖，所谓jar依赖就是导包？添加库吧
（3）resource里保存了配置文件，比如beans.xml,编译后生成实例，但其实是在得到applicationcontext的时候？singleton的实例会创建一个instance of singletonbean

readme怎么不能换行tmd
