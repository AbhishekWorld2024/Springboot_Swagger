pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1'  // Make sure this matches the Maven name in Jenkins global tools
        jdk 'JDK 17'         // Ensure JDK 17 is installed and configured in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/AbhishekWorld2024/Springboot_Swagger.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests' // skip tests if they cause issues
            }
        }

        stage('Run') {
            steps {
                sh 'java -jar target/*.jar'
            }
        }
    }
}
