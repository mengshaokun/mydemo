#######################################
# 服务生成image所需要的dockerfile
# 一般不需要RD修改，可能需要修改的带有[todo]
#######################################

#######################################
# 基础镜像，使用alpine最小镜像
#######################################
FROM java:8-jre

#######################################
# 标识负责的小组[todo]
#######################################
MAINTAINER mengshaokun <mengsk2911@163.com>

# Synchronize Container Timezone With a Host Machine
#RUN apk add --no-cache tzdata
ENV TZ Asia/Shanghai
RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ADD docertest-0.0.1.jar /app/
CMD ["java", "-Xmx600m", "-Dspring.profiles.active=dev", "-jar", "/app/docertest-0.0.1.jar"]
