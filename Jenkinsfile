#!/usr/bin/env groovy

node {
	stage('Checkout') {
		scmVars = checkout scm
		echo scmVars.keySet()
		echo scmVars.values()
        	branch = scmVars.GIT_BRANCH
		echo branch
		branchName = sh(returnStdout: true, script: 'git rev-parse --abbrev-ref HEAD').trim()
		echo branchName
	}	
}
