# Copy tasks by Wuttipat Nilsiri (5910545850)

I ran the tasks on a Microsoft Surface Pro (of course), and got
these results:
Task
---------------------------------------------------------------------
ku.util.FileCopyTask 1 Byte@7852e922 Elapsed time 	6.802496 sec

ku.util.FileCopyTask 1 KByte@4e25154f Elapsed time 	0.061210 sec

ku.util.FileCopyTask 4 KByte@70dea4e Elapsed time 	0.057368 sec

ku.util.FileCopyTask 64 KByte@5c647e05 Elapsed time 0.053063 sec

ku.util.FileCopyTaskLine@33909752 Elapsed time 		0.106584 sec


## Explanation
copy file 1 byte take time longest because it has to read file 1 byte per time and copy that byte to outputfile,
also you can see when it copy more than 1 byte per time like task 1 - 3 it read number of bytes and copy that bytes to outputfile.
for Copy line task it take around one time longer than more than 1 byte tasks i think it because 1 line it less than 1Kb that will take time longer. 

