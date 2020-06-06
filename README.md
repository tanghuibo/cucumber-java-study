# cucumber study
``
## 文件结构

```text
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   └── io.github.tanghuibo.cucumberstudy
    │   │       ├── CucumberStudyApplication.java
    │   │       └── service
    │   │           ├── impl
    │   │           │   └── WelcomeServiceImpl.java
    │   │           └── WelcomeService.java
    │   └── resources
    │       └── application.properties
    └── test
        ├── java
        │   └── io.github.tanghuibo.cucumberstudy
        │       ├── AbstractDefs.java //测试基础类
        │       ├── CucumberStudyApplicationTests.java //测试入口
        │       └── step
        │           └── TestStep.java //测试用例实现
        └── resources
            └── use-cases //测试用例
                └── test.feature
```
## 快速开始

1. 运行 CucumberStudyApplicationTests
2. 运行完成后查看 src/test/resources/test-result

## 编写步骤

1. 编写测试用例
2. 实现测试用例

## 常见问题

1. 如何保存上下文?
> 可以写成字段，或者放进 `ThreadLocal`

2. 如何与 springboot 集成?
> 添加 pom: `cucumber-spring`，测试用例集成: `AbstractDefs`

3. 如何生成 html 结果
> 使用 CucumberOptions 添加 html 插件

