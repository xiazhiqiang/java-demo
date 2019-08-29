[<<返回](../README.md)

## 定义包

- 修改目录结构，源码目录和包路径保持一致
```
tree -L 4 -I 'out'
```
```
src
└── chengmu
    ├── HelloWorld.java
    ├── Main.java
    └── utils
        └── Test.java
```
- 在Test.java最开始增加package包名（包名全部小写）
```
package chengmu.utils
```
- 编译命令
```
cd src
javac -d ../out chengmu/Main.java
```
- 执行命令
```
cd out
java -classpath ./ chengmu.Main
```

几点说明

- 必须小写，有意义的单词，以.分割
- 一个源文件(.java)，package语句必须位于第一条非注释性语句
- 一个源文件，可以定义多个类，但只能包含一条package语句
- 同一个包下面的类，可以不用添加包前缀
- 不同包（即使存在相同的父包，也是不同的包）下的类，引用时需要带上包前缀，也可以在开始import引入包下的类

## 引入包

```
import chengmu.*
```

几点说明：

- 星号*只能代表类名
- java默认为所有源文件导入java.lang包下的所有类
- 如遇到已引入的包中类有冲突，则需要使用 包.类 全名