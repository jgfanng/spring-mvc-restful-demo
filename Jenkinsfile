node {
    stage ('Git Checkout') {
        echo 'before git'
        sh 'pwd'
        git 'https://github.com/jiaguofang/spring-mvc-restful-demo.git'
        echo 'after git'
        sh 'pwd'
    }
    stage ('Maven Build') {
        def mvnHome = tool 'Maven 3.2.5'
        echo 'build'
        sh 'pwd'
        sh '${mvnHome}/bin/mvn clean install'
    }
}
