# spring-integration-kafka-demo
a consumer demo with spring-integration-kafka-2.x version

## 1.使用的版本
 spring-integration-kafka-2.1.2.release
## 2.本demo使用xml的配置方式
## 3. 配置说明
spring-integration-kafka 1.x版本是基于kafka-client集成<br>
而到了spring-integration-kafka 2.0版本开始，是基于spring-kafka的方式集成，所以参数的配置方式跟spring-kafka的配置方式一样，网上也有很多的配置例子了
  ### 比较有常用的配置项有：
  bootstrap.servers：kafkad的单机或集群的地址<br>
  group.id ：消费者组<br>
  key.deserializer ：key的解码配置<br>
  value.deserializer ：value的解码配置<br>
  auto.offset.reset : latest和earliest none三个选项<br>
  session.timeout.ms : <br>
  enable.auto.commit ：是否启用kafka的自动提交offset，true或false<br>
  auto.commit.interval.ms :自动提交的间隔，多久自动提交一次<br>
  max.partition.fetch.bytes ：分区数据最大获取的字节数<br>
  max.poll.records ：当使用批量batch拉取模式的时候，poll每次拉取数据的条数<br>
  
## spring-integration的参考资料
1.https://blog.csdn.net/qq_27808011/article/details/80108622<br>
2.https://docs.spring.io/spring-integration/docs/5.0.4.RELEASE/reference/html/<br>
3.https://blog.csdn.net/xiayutai1/article/details/53302652?locationNum=4&fps=1<br>
4.http://www.iteye.com/topic/744524<br>
5.https://blog.csdn.net/slivefox/article/details/3740541<br>
6.https://my.oschina.net/zhzhenqin/blog/86586<br>
  
