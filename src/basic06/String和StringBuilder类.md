1.API:应用程序编程接口（厂商提供给应用程序编程的接口，提前写好的类）。
2.ctrl+alt+v：快速生成方法的返回值。
3.ctrl+d：复制本行代码。
4.ctrl+shift+↑↓：移动本行代码。
5.Scanner中next遇到空格或tab停止接收，nextLine遇到回车换行符结束。
6.nextInt和nextLine一起使用时，由于mextInt执行会自动产生回车因此nextLine没有录入机会（可用next代替）。
7.所有双引号字符串都是String类的对象。
8.字符串是常量，创建后其值不能更改，只存在地址改变。
9.打印string对象不会出现地址而是真实记录内容。
10.字符串常量池：当使用""创建字符串对象时，系统会检查该字符串是否在字符串常量池中存在。若不存在则创建，反之复用。
11.通过构造方法new的String各具地址值。
12.""创建的字符串对象在字符串常量池中存储，构造方法创建的字符串对象在堆内存中存储。
13.domin包下存封装数据类。
14.String方法小结：equals：比较字符串内容，严格区分大小写；equalsIgnorscase：比较字符串内容，忽略大小写；
length()：返回此字符串长度；charAt：返回指定索引处char值；toCharArray：将字符串拆分为字符数组后返回；
substring：根据开始、结束索引进行截取得到新的字符串；replace：使用新值将字符串中旧值替换得到新字符串；
split：根据传入规则切割字符串得到字符串数组
15.stringbuilder是一个可变的字符串类，可以看成容器。
16.ctrl+alt+m：抽取当前代码为方法。
17.stringbuilder方法小结：append：添加数据并返回对象本身；reverse：返回相反的字符序列；
length()：返回长度；tostring：把stringbuilder转换为string
18.链式编程：如果一个方法返回的是对象类型，对象就可以继续向下调用方法。
19.string和stringbuilder区别：string不可改变而stringbuilder可改变。


