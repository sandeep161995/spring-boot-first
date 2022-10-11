# aws-parameter-store-spring
This project illustrates how to externalize the Spring Boot application properties to an AWS Systems Manger Parameter Store.

## Full walk-through
https://emsbach.medium.com/how-to-externalize-spring-boot-properties-to-an-aws-system-manager-parameter-store-2a945b1e856f

## Usage
Set environment variables:
- AWS_ACCESS_KEY_ID=AKIAY63UNZLOZ3ZNWQV4
- AWS_SECRET_ACCESS_KEY=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
- AWS_EC2_METADATA_DISABLED=true
before starting the application or unit test.

## References
[Parameter Format - Spring Cloud documentation](https://cloud.spring.io/spring-cloud-static/spring-cloud-aws/2.2.0.RELEASE/reference/html/#integrating-your-spring-cloud-application-with-the-aws-parameter-store)

[Credential Configuration - AWS Java SDK Documentation](https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/setup.html#setup-credentials)

https://github.com/awspring/spring-cloud-aws

https://awspring.io/

