1.bin目录下开启服务端监听vboxwebsrv -H 0.0.0.0  -A null
    -H将主机设置为bind，默认为localhost，因此，如果我们不指定它，则该服务仅接受本地连接
    -A指定要使用的身份验证方法，如果为null，则禁用它
    
2.applicationContext-vb.xml中配置服务端

3.下载sdk：https://www.virtualbox.org/wiki/Downloads