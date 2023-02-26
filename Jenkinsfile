pipeline {
    agent any
    parameters {
        string defaultValue: 'master', description: 'Wprowadź nazwę brancha', name: 'BRANCH', trim: true

        choice choices: ['TestSuites/JenkinsTest/dwaTestyJednPoDrugim.xml', 'TestSuites/JenkinsTest/jedenTest.xml', 'TestSuites/JenkinsTest/jedenTest_withParameters.xml', 'TestSuites/JenkinsTest/wszystkieTestyzKlasyxml'], description: 'Wybierz suit do uruchomienia', name: 'SUITE'

        choice choices: ['testowe', 'dev'], description: 'Wybierz środowisko', name: 'ENV'
    }

    stages {
        stage('Download code') {
            steps {
                git branch: '${BRANCH}', url: 'git@github.com:DobrowolskiPrzemyslaw/selenium_phptravel.git'
            }
        }
        stage('Compile App') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Deploy to test env') {
            steps {
                echo 'Deployubg to test env'
            }
        }
        stage('Run UI tests on test env') {
            steps {
                 sh 'mvn clean test -DsuiteXmlFile=${SUITE}'
            }
        }
        stage('Publish report') {
            steps {
                 publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'src/main/resources/raports', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: '', useWrapperFileDirectly: true])
            }
        }
    }
}
