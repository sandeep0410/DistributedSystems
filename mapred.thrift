namespace java edu.umn.cs.disys.mr.thrift

    struct NodeDetails {
    1:string id,
    2:i32 port,
    3:string ip
    }
    
    struct Job{
    1:i32 id,
    2:string ipfilename,
    3:string opfilename,
    4:i64 startTime
    5:string message
    }

    struct Task{
    1:i32 taskId,
    2:i32 jobId, 
    3:string type,
    4:i32 sortOffset,
    5:i32 sortChunkSize,
    6:string sortfilename,
    7:list<string> mergefilenames
    }
    
    struct Stats{
    1:i32 sortTasksStarted
    2:i32 sortTasksCompleted
    3:i64 totalSortTime
    4:i32 mergeTasksStarted
    5:i32 mergeTasksCompleted
    6:i64 totalMergeTime
    }

    service ServerService {
    Job process(1:Job job),
    list<NodeDetails> join(1: NodeDetails node),
    void log(1:string logline)   
    }
    
    service ComputeNodeService {
    string execute(1: Task task),
    NodeDetails isalive(),
    Stats getNodeStats()
    }

    service ProactiveServerService {
    Job proactiveprocess(1:Job job),
    list<NodeDetails> join(1: NodeDetails node),
    void log(1:string logline)   
    }
    
    service ProactiveComputeNodeService {
    void cancelTask(1: Task task),
    string execute(1: Task task),
    NodeDetails isalive(),
    Stats getNodeStats()
    }    
    