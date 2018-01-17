node {
	stage('Checkout') {
		scmVars = checkout scm
		echo scmVars
        	branch = scmVars.GIT_BRANCH
		echo branch
		branchName = sh(returnStdout: true, script: 'git rev-parse --abbrev-ref HEAD').trim()
		echo branchName
	}	
}
