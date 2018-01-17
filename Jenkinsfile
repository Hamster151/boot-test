#!/usr/bin/env groovy

node {
	stage('Checkout') {
		scmVars = checkout scm
		sh 'env'
		echo scmVars.keySet().toString()
		echo scmVars.values().toString()
		sh '/bin/bash echo NEW_VAR=${scmVars.GIT_BRANCH#*/}'
        	branch = scmVars.GIT_BRANCH
		echo branch
		branchName = sh(returnStdout: true, script: 'git rev-parse --abbrev-ref HEAD').trim()
		echo branchName
	}	
}
