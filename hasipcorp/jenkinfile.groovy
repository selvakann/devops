pipeline{
     agent {
	     node{
		  label 'master'
	 }
 }
	  stages {
		    stage('terraform started'){
			  steps{
			      sh 'echo "terraform start....!"'
			  }
			}
			stage('change folder'){
			  steps{
			      sh 'cd /var/lib/jenkins/workspace/first-pipeline && sudo rm -rf *'
				  sh 'echo "Changing folder....!"'
			  }
			}
			
			stage('Git clone'){
			  steps{
			      sh 'sudo git clone https://github.com/selvakann/devops.git'
			  }
			}
			
		    stage('terraform init'){
			  steps{
			      sh 'cd /var/lib/jenksin/workspace/devops/hasipcorp/ terraform init'
			  }
			}
		    stage('terraform plan'){
			  steps{
			      sh '/var/lib/jenksin/workspace/devops/hasipcorp/ terraform plan'
			  }
			}
		
	}
}	




