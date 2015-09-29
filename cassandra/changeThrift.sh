export LIBTHRIFT=/root/ApacheThrift/thrift/lib/java
export LIBCassandra=/root/CassandraTeam/CassandraQoS/cassandra/lib/
echo $LIBTHRIFT
cd $LIBTHRIFT
ant
cp -av build/libthrift-1.0.0.jar $LIBCassandra
#cd $LIBCassandra 
#mv libthrift-1.0.0.jar libthrift-0.7.0.jar -v

