# microEdge
Edge orchestration for microservices

## Getting Started

Here we have three microservices as follows:

1. crmService: representation of a downstream business service; 
2. edgeServer: registers all the microservices instances and might also provides a reverse proxy
3. edgeServices: API gateway that works as client-proxy & a load balances. This is in tandem to the service registry to discover & idenity the service instance(S) and load balance them

**Architecture paradigm**