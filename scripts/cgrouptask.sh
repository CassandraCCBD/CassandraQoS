#cat /cgroup/cpu/group1/tasks
echo "Group 1"
wc -l /cgroup/cpu/group1/tasks
echo "Group 2"
wc -l /cgroup/cpu/group2/tasks
echo "Group 3"
wc -l /cgroup/cpu/group3/tasks
