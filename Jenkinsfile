pipeline{
    agent any
    stages{
        stage('Build and Unit Test'){
            steps{
                echo "Building the Job with unit test"
                sh 'mvn clean verify -DskipIts=true';
                junit '**/target/surefire-reports/TEST-*.xml'
                archive 'target/*.jar'
            }
        }
        
        stage('SonarQube Testing'){
            steps{
                echo "===Static Code Analysis started=="
                sh 'mvn clean verify sonar:sonar -Dsonar.projectName=PRADHAN -Dsonar.projectKey=PRADHAN -Dsonar.projectVersion=$BUILD_NUMBER'
            }

        }
        stage('integration test'){
            steps{
            sh 'mvn clean verify -Dsurefire.skip=true';
            junit '**/target/failsafe-reports/TEST-*.xml'
            archive'target/*.jar'
            }
        }

        Stage('Publish'){
            steps{
            def server  = Artifactory.server 'Default Artifactory Server'
            def uploadSpec = """{

                "files": [
                    {

                        "pattern": "target/hello-0.0.1.war",
                        "taregt": "example-project/${BUILD_NUMBER}/"
                        "props": "Integration-Tested=Yes;Performance-Tested=No"
                    }
                ]
            }"""
            server.upload(uploadSpec)
            }
        }

    }
    
    }
