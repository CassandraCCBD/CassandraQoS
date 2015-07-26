bin/cqlsh -e 'use test; tracing on; select * from users where id=3' > outfile
