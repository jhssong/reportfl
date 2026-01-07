{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/partitioning/BoundarySizeVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoundarySizeVisitor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor\u003cS\u003e"
      ],
      "begin_line": 26,
      "end_line": 66,
      "comment": " Visitor computing the boundary size.\n * @param \u003cS\u003e Type of the space.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "boundarySize"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Size of the boundary. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.BoundarySizeVisitor.BoundarySizeVisitor()",
      "begin_line": 33,
      "end_line": 35,
      "comment": " Simple constructor.\n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BoundarySizeVisitor.visitOrder(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 38,
      "end_line": 40,
      "comment": " {@inheritDoc}",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BoundarySizeVisitor.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 43,
      "end_line": 53,
      "comment": " {@inheritDoc}",
      "child_ranges": [
        "(line 44,col 9)-(line 46,col 55)",
        "(line 47,col 9)-(line 49,col 9)",
        "(line 50,col 9)-(line 52,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BoundarySizeVisitor.visitLeafNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 56,
      "end_line": 57,
      "comment": " {@inheritDoc}",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BoundarySizeVisitor.getSize()",
      "begin_line": 62,
      "end_line": 64,
      "comment": " Get the size of the boundary.\n     * @return size of the boundary\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 28)"
      ]
    }
  ]
}