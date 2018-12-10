
resource "aws_security_group" "web" {
  name        = "web-access"
  description = "Security group to allow access from mgmt vpc"
  vpc_id      = "vpc-e57e399d"
   tags {
    Name = "web-access"
  }
 }