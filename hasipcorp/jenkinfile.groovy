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
			      sh 'cd /var/lib/jenkins/workspace/first-pipeline'
				  sh 'echo "Changing folder....!"'
			  }
			}
			stage('Remove folder'){
			  steps{
			      sh 'sudo rm -r *'
				  sh 'echo "Remove folder....!"'
			  }
			}
			stage('Git clone'){
			  steps{
			      sh 'sudo git clone https://github.com/selvakann/devops.git'
			  }
			}
			
		    stage('terraform init'){
			  steps{
			      sh 'terraform init'
			  }
			}
		    stage('terraform plan'){
			  steps{
			      sh 'terraform plan'
			  }
			}
		
	}
}	




