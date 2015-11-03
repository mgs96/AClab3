/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author mauri
 */
public class Graph {
    
    private ArrayList<Nodes> nodes;
    private ArrayList<Edges> edges;
    
    private int nNodes;
    private int nEdges;
    
    public void createNode(int x, int y){
        Nodes node = new Nodes(x, y, 7, Color.BLACK);
        nodes.add(node);
        nNodes++;
    }
    
    public void drawNode(Graphics g){
        for (Nodes node : nodes) {
            node.draw(g);
        }
    }
    
    public void createEdge(int x0, int x1, int y0, int y1, int v0, int v1, int weight){
        Edges edge = new Edges(x0, x1, y0, y1, v0, v1, weight, Color.BLACK);
        edges.add(edge);
        nEdges++;
    }
    
    public void drawEdge(Graphics g){
        for (Edges edge : edges) {
            edge.draw(g);
        }
    }

    public Graph() {
        
        this.nodes = new ArrayList<Nodes>();
        this.edges = new ArrayList<Edges>();
    }

    public ArrayList<Nodes> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Nodes> nodes) {
        this.nodes = nodes;
    }

    public ArrayList<Edges> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edges> edges) {
        this.edges = edges;
    }
    
}
