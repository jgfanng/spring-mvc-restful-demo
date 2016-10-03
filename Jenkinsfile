node {
    stage ('Git Checkout') {
        echo 'before git'
        sh 'pwd'
        git 'https://github.com/jiaguofang/spring-mvc-restful-demo.git'
        echo 'after git'
        sh 'pwd'
    }
    stage ('Maven Build') {
        echo 'build'
        sh 'pwd'
    }
}
