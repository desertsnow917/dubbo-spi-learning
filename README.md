# dubbo-spi-learning
Dubbo SPI 实例
Dubbo 并未使用 Java SPI，而是重新实现了一套功能更强的 SPI 机制。

Dubbo SPI 的相关逻辑被封装在了 ExtensionLoader 类中，通过 ExtensionLoader，我们可以加载指定的实现类。Dubbo SPI 所需的配置文件需放置在 META-INF/dubbo 路径下，配置内容如下。

optimusPrime = org.apache.spi.OptimusPrime
bumblebee = org.apache.spi.Bumblebee

与 Java SPI 实现类配置不同，Dubbo SPI 是通过键值对的方式进行配置，这样我们可以按需加载指定的实现类。
另外，在测试 Dubbo SPI 时，需要在 Robot 接口上标注 @SPI 注解。
