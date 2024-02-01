pipeline {
    agent {
        node {
            label 'docker-agent-maven'
            }
      }
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Checkout') {
            steps {
                echo "FETCHING CODE.."
                git url:'https://github.com/jglick/simple-maven-project-with-tests.git'
                sh "ls -ltr"
            }
        }
        stage('Build') {
            steps {
                echo "BUILDING.."
                sh "java -version"
                sh "mvn -version"
                withMaven{
                    sh "mvn clean package"
                }

            }
        }
        stage('Test') {
            steps {
                echo "Testing.."

            }
        }
        stage('Deliver') {
            steps {
                echo 'Deliver....'
            }
        }
    }
}