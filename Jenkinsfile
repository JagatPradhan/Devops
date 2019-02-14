pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                echo "Building the Job with MAVEN"
                sh 'mvn clean package'
            }
        }

        stage('SonarQube Testing'){
            steps{
                echo "===Static Code Analysis started=="
                sh 'mvn clean verify sonar:sonar -Dsonar.projectName=PRADHAN -Dsonar.projectKey=PRADHAN -Dsonar.projectVersion=$BUILD_NUMBER'
            }

        }

    }
    
    }

