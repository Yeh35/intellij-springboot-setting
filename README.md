## 소개
intellij community 버전에서 springboot 기본 세팅

## 프로젝트 실행 방법
아래의 방법은 Java8 이상 버전이 설치를 가정합니다.
````
git clone https://github.com/Yeh35/intellij-springboot-setting.git
cd intellij-springboot-setting
gradlew build  
java -jar -Dspring.profiles.active=local /build/libs/*.jar
cd build/libs
java -jar -Dspring.profiles.active=local com.springboot.default-1.0.1-SNAPSHOT.jar
````

## 참고 사이트
* https://github.com/cheese10yun/spring-guide
   