## JAVA程序设计课堂笔记 ——1.Java语法基础

### 1.数据类型

​	java的数据类型分为两类，一类是基本数据类型，这些是语言本身就定义的，包括boolean (布尔型)、byte (字节型)、short (短整型)、int (整型)、long (长整型)、char (字符型)、float (单精度浮点数型)、double (双精度浮点数型)共八种。 

​	另一类是引用的数据类型，包括数组、字符串、类、接口、用户自定义类型等。

​	使用数据类型，需要考虑其范围以及所占内存大小的问题：

>（1）boolean  取值true和false,在JLS（java语言规范）中没有指明具体的内存大小，在JVM中具体实现是通过32位的整数实现，一般不考虑；
>
>
>
>```
>
>```
>
>（2）char      在语言参差规定为2B 16b，可以理解为无符号的16位整数；
>
>
>
>> 在c语言中以下四种的内存具体大小是交给编译器实现，与机器有关，而在Java中，规定了对应具体的数据类型大小。
>
>
>
>（3）byte  1B，8b，范围-128-127；
>
>（4）short   2B\16b   ；-32768 —  32767;
>
>（5）int    4B\32b；     
>
>（6）long  8B\32B
>
>
>
>（7）float        4B
>
>（8）double   8B

注：（1） 对于特大的数计算，或者需要特别的精度的处理，java使用对应的大数计算的类来进行计算，如BigInteger类等；

（2）对于java语言中的数据类型定义，需要标记一下数据：

```java
float pi=3.14；//报错
float pi= (float)3.14;//强制类型转换
float pi= 3.14L;
double PI = 3.14D;
```

(3)char类型常常用java处理汉字，汉字编码补充：

​	中国汉字编码 	GB18030兼容GBK、GB2312-80，三者都是我国使用编码

java使用Unicode，utf-16；使得安卓、win都是使用utf-16；



### 2.类型转换

#### （1）宽转换（自动类型转换）

位拓展

> (1) byte可直接转换到short、int、long、float、double。
>
> (2) short可直接转换到int、long、float、double。
>
> (3) char 可直接转换到int、long、float、double。
>
> (4) int可直接转换到long、float、double。
>
> (5) long可直接转换到float、double。
>
> (6) float可直接转换到double。
>
> **注意：**(1) byte、short、int都是有符号的数，因而宽转换时(如转换到long)进行符号位扩展。
>
> (2) int转换到float或long转换到double，很可能会造成精度丢失

```java
byte b =2;
float  f = 3.14f;
//b+f  的数据类型为float 类型
```

由窄自动转宽，char和short不可转；

#### （2）窄转换（强制类型转换）

位截断

>窄转换的转换规则如下：
>
> (1) short可直接转换到byte、char。
>
> (2) char可直接转换到byte、short。
>
> (3) int 可直接转换到byte、short、char。
>
> (4) long可直接转换到byte、short、char、int。
>
> (5) float可直接转换到byte、short、char、int、long。
>
> (6) double可直接转换到byte、short、char、int、long、float。
>
>**注意：**(1) 窄转换在大多数情况下会丢失信息。
>
> (2) char窄转换到short，将char的两个字节(16位)直接放入到short中。



### 3.运算符

（1）面试考题：

```java
byte bVar = 2;
bVar = bVar + 1;//错误
bVar++;//正确
bVar += 1;//正确
```

（2）任何类型都可以和字符串相加，相加结果是一个字符串；

（3）除法区分整除和实数除，同c系语言；

（4）a && b 可用于对b进行false短路计算，而a & b没有false短路计算；而或有true短路计算；短路计算特定情况下可以用于替代一些if；



### 更新中......

