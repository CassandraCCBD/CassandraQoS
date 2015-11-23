rm -rvf /var/lib/cassandra/*
cd /root/CassandraTeam/CassandraQoS/cassandra/
sh ../scripts/killCassandra.sh
sh ../scripts/startCassandra.sh
bin/cassandra-cli -h 10.10.1.69 -f ~/setup_ycs*.cql
