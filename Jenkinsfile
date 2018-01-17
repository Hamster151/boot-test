#!/usr/bin/env groovy

node {
	stage('Checkout') {
		scmVars = checkout scm
		echo scmVars.keySet().toString()
		echo scmVars.values().toString()
		echo "${scmVars.GIT_BRANCH#*/}"
        	branch = scmVars.GIT_BRANCH
		echo branch
		branchName = sh(returnStdout: true, script: 'git rev-parse --abbrev-ref HEAD').trim()
		echo branchName
	}	
}
