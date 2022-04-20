FROM mysql:5.7

MAINTAINER crowontheplane(1099640098@qq.com)
# 设置初始化容器时区
ENV TZ=Asia/Shanghai
RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# 复制数据库初始化sql到mysql容器指定的目录
COPY init.sql /docker-entrypoint-initdb.d