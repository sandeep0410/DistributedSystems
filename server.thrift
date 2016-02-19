namespace java server

    struct NodeDetails {
    1:string id,
    2:i32 port,
    3:string ip
    }

    service SuperServerService {
    list<NodeDetails> join(1: NodeDetails node),
    void postJoin(1: NodeDetails node, 2: bool success),
    NodeDetails getNode(),    
    }
    
    service NodeServerService{
    void write(1: string filename, 2: string contents),
    string read(1: string filename),
    bool updateDHT(1: list<NodeDetails> nodes)
    }