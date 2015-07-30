bin/cqlsh -e 'use cass; tracing on; select * from users where id=3' > outfile
