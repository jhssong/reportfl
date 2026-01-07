{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/partitioning/BSPTreeVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BSPTreeVisitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 115,
      "comment": " This interface is used to visit {@link BSPTree BSP tree} nodes.\n\n * \u003cp\u003eNavigation through {@link BSPTree BSP trees} can be done using\n * two different point of views:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003e\n *     the first one is in a node-oriented way using the {@link\n *     BSPTree#getPlus}, {@link BSPTree#getMinus} and {@link\n *     BSPTree#getParent} methods. Terminal nodes without associated\n *     {@link SubHyperplane sub-hyperplanes} can be visited this way,\n *     there is no constraint in the visit order, and it is possible\n *     to visit either all nodes or only a subset of the nodes\n *   \u003c/li\u003e\n *   \u003cli\u003e\n *     the second one is in a sub-hyperplane-oriented way using\n *     classes implementing this interface which obeys the visitor\n *     design pattern. The visit order is provided by the visitor as\n *     each node is first encountered. Each node is visited exactly\n *     once.\n *   \u003c/li\u003e\n * \u003c/ul\u003e\n\n * @param \u003cS\u003e Type of the space.\n\n * @see BSPTree\n * @see SubHyperplane\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor.visitOrder(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 98,
      "end_line": 98,
      "comment": " Determine the visit order for this node.\n     * \u003cp\u003eBefore attempting to visit an internal node, this method is\n     * called to determine the desired ordering of the visit. It is\n     * guaranteed that this method will be called before {@link\n     * #visitInternalNode visitInternalNode} for a given node, it will be\n     * called exactly once for each internal node.\u003c/p\u003e\n     * @param node BSP node guaranteed to have a non null cut sub-hyperplane\n     * @return desired visit order, must be one of\n     * {@link Order#PLUS_MINUS_SUB}, {@link Order#PLUS_SUB_MINUS},\n     * {@link Order#MINUS_PLUS_SUB}, {@link Order#MINUS_SUB_PLUS},\n     * {@link Order#SUB_PLUS_MINUS}, {@link Order#SUB_MINUS_PLUS}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 107,
      "end_line": 107,
      "comment": " Visit a BSP tree node node having a non-null sub-hyperplane.\n     * \u003cp\u003eIt is guaranteed that this method will be called after {@link\n     * #visitOrder visitOrder} has been called for a given node,\n     * it wil be called exactly once for each internal node.\u003c/p\u003e\n     * @param node BSP node guaranteed to have a non null cut sub-hyperplane\n     * @see #visitLeafNode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor.visitLeafNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 113,
      "end_line": 113,
      "comment": " Visit a leaf BSP tree node node having a null sub-hyperplane.\n     * @param node leaf BSP node having a null sub-hyperplane\n     * @see #visitInternalNode\n     ",
      "child_ranges": []
    }
  ]
}