package cn.lovelimei;

import org.apache.dubbo.common.extension.SPI;

/**
 * Created by DesertSnow on 2019/10/1 22:35.
 */
@SPI
public interface Robot {
    void sayHello();
}
