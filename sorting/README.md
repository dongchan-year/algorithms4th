# Sorting 



## Applications



#### Stability

Some of the sorting methods that we have considered in this chapter are **stable (insertion sort and mergesort); many are not (selection sort, shellsort, quicksort, and heapsort)**. For example, consider an internet com- merce application where we have to process a large number of events that have loca- tions and timestamps. To begin, suppose that we store events in an array as they arrive, so they are in order of the timestamp in the array. Now suppose that the application requires that the transactions be separated out by location for further processing. One easy way to do so is to sort the array by location. If the sort is unstable, the transac- tions for each city may *not* necessarily be in order by timestamp after the sort. 



| sorted by time                                               | sorted by location (not stable)                              | sorted by location (stable)                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Chicago  09:00:00<br/>Phoenix  09:00:03<br/>Houston  09:00:13<br/>Chicago  09:00:59<br/>Houston  09:01:10<br/>Chicago  09:03:13<br/>Seattle  09:10:11<br/>Seattle  09:10:25<br/>Phoenix  09:14:25<br/>Chicago  09:19:32<br/>Chicago  09:19:46<br/>Chicago  09:21:05<br/>Seattle  09:22:43<br/>Seattle  09:22:54<br/>Chicago  09:25:52<br/>Chicago  09:35:21<br/>Seattle  09:36:14<br/>Phoenix  09:37:44 | Chicago 09:25:52<br/> Chicago 09:03:13<br/> Chicago 09:21:05<br/> Chicago 09:19:46<br/> Chicago 09:19:32<br/> Chicago 09:00:00<br/> Chicago 09:35:21<br/> Chicago 09:00:59<br/> Houston 09:01:10<br/> Houston 09:00:13<br/> Phoenix 09:37:44<br/> Phoenix 09:00:03<br/> Phoenix 09:14:25<br/> Seattle 09:10:25<br/> Seattle 09:36:14<br/> Seattle 09:22:43<br/> Seattle 09:10:11<br/> Seattle 09:22:54 | Chicago 09:00:00<br/>Chicago 09:00:59<br/>Chicago 09:03:13<br/>Chicago 09:19:32<br/>Chicago 09:19:46<br/>Chicago 09:21:05<br/>Chicago 09:25:52<br/>Chicago 09:35:21<br/>Houston 09:00:13<br/>Houston 09:01:10<br/>Phoenix 09:00:03<br/>Phoenix 09:14:25<br/>Phoenix 09:37:44<br/>Seattle 09:10:11<br/>Seattle 09:10:25<br/>Seattle 09:22:43<br/>Seattle 09:22:54<br/>Seattle 09:36:14 |