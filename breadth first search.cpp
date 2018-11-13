void bfs(int s,vector<int> adj[],bool vis[])
{
    queue<int> q;
    q.push(s);
    vis[s]=true;
    while(!q.empty()){
        int node = q.front();
        cout<<node<<" ";
        q.pop();
        for(auto i:adj[node]){
            if(!vis[i]){
                vis[i]=true;
                q.push(i);
            }
        }
    }
}
