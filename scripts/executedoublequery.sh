bin/cqlsh -e 'use cass; tracing on; select * from users where id=3; select * from users where id=4' > outfile
