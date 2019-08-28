[<<返回](../README.md)

## 一切从Hello world开始

- 创建HelloWorld.java

```
mkdir src // 创建源码目录
mkdir out // 创建编译后的目录
cd src
touch HelloWorld.java
```
- 命令行运行编译
```
# javac -d outputdir srcFile
javac -d out src/HelloWorld.java
```
- 执行命令
```
# java -classpath [类环境变量临时路径] 类名
java -classpath out HelloWorld
```
