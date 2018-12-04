pipeline{
     agent {
	     node{
		  label 'master'
	 }
 }
	  stages {
		    stage('terraform started'){
			  steps{
			      sh 'echo "terraform start"'
			  }
			}
			stage('git clone'){
			  steps{
			      sh 'rm -rf *; git clone https://github.com/selvakann/devops.git'
			  }
			}
		    stage('copy the file'){
			  steps{
			      sh 'sudo cp /var/lib/jenkins/workspace/first-pipeline/devops/terraform/sg.tf /home/ec2-user/terrajenkins/'
			  }
			}
		    stage('terraform init'){
			  steps{
			      sh '/home/ec2-user/terrajenkins/ terraform init'
			      sh 'echo "terraform init successfull......"'
			  }
			}
		    stage('terraform end'){
			  steps{
			      sh 'echo "Ended......"'
			  }
			}
	}
}	
