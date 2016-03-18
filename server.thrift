namespace java com.umn.disys.thrift

    struct NodeDetails {
    1:string id,
    2:i32 port,
    3:string ip
    }
    
    struct Job{
    1:i32 requestType,
    2:i32 subRequestType,
    3:string response,
    4:NodeDetails nodeDetails
    5:i32 sender,
    6:i32 receiver
    }

    service ServerService {
    Job nodeRead(1:Job readJob),
    Job nodeWrite(1:Job writeJob),
    bool updateDHT(1: list<NodeDetails> nodes) 
    }
    
    service SuperNodeServerService {
    list<NodeDetails> join(1: NodeDetails node),
    void postJoin(1: NodeDetails node, 2: bool success)
    void log(1:string logline),
    Job read(1:Job readJob),
    Job write(1:Job writeJob),
    }
