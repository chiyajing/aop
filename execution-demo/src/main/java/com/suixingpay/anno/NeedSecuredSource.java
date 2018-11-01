package com.suixingpay.anno;

import java.lang.annotation.*;


@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@Inherited
public @interface NeedSecuredSource {
}
