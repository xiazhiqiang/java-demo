[<<返回](../README.md)

## 增加包名

- 修改目录结构，源码目录和包路径保持一致
```
└── src
    └── chengmu
        ├── HelloWorld.java
        └── Test.java
```
- 在Test.java最开始增加package包名（包名全部小写）
```
package chengmu
```
- 编译命令
```
javac -d out src/chengmu/Test.java
```
- 执行命令
```
java -classpath out chengmu.Test
```
