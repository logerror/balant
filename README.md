# balant
服务拆分，基于springboot + dubbo + zookeeper的脚手架工程     
注册中心可选 zookeeper nacos（侧重于CAP理论中的不同方向）       

nacos      
支持AP和CP模式,他根据服务注册选择临时和永久来决定走AP模式还是CP模式    
阿里nacos异常情况 leader挂了

   1. 不影响服务之间互相调用
   2. 不影响服务注册
   3. 不影响服务正常启动拉取配置文件
   4. 选举新leader差不多4,5秒钟
