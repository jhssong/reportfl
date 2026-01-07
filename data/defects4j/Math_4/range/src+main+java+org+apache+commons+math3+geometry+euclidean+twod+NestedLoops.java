{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/twod/NestedLoops.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NestedLoops",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 188,
      "comment": " This class represent a tree of nested 2D boundary loops.\n\n * \u003cp\u003eThis class is used for piecewise polygons construction.\n * Polygons are built using the outline edges as\n * representative of boundaries, the orientation of these lines are\n * meaningful. However, we want to allow the user to specify its\n * outline loops without having to take care of this orientation. This\n * class is devoted to correct mis-oriented loops.\u003cp\u003e\n\n * \u003cp\u003eOrientation is computed assuming the piecewise polygon is finite,\n * i.e. the outermost loops have their exterior side facing points at\n * infinity, and hence are oriented counter-clockwise. The orientation of\n * internal loops is computed as the reverse of the orientation of\n * their immediate surrounding loop.\u003c/p\u003e\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "loop"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Boundary loop. "
    },
    {
      "type": "field",
      "varNames": [
        "surrounded"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Surrounded loops. "
    },
    {
      "type": "field",
      "varNames": [
        "polygon"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Polygon enclosing a finite region. "
    },
    {
      "type": "field",
      "varNames": [
        "originalIsClockwise"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Indicator for original loop orientation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.NestedLoops.NestedLoops()",
      "begin_line": 67,
      "end_line": 69,
      "comment": " Simple Constructor.\n     * \u003cp\u003eBuild an empty tree of nested loops. This instance will become\n     * the root node of a complete tree, it is not associated with any\n     * loop by itself, the outermost loops are in the root tree child\n     * nodes.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.NestedLoops.NestedLoops(org.apache.commons.math3.geometry.euclidean.twod.Vector2D[])",
      "begin_line": 76,
      "end_line": 106,
      "comment": " Constructor.\n     * \u003cp\u003eBuild a tree node with neither parent nor children\u003c/p\u003e\n     * @param loop boundary loop (will be reversed in place if needed)\n     * @exception MathIllegalArgumentException if an outline has an open boundary loop\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 82,col 25)",
        "(line 83,col 9)-(line 83,col 50)",
        "(line 86,col 9)-(line 86,col 104)",
        "(line 87,col 9)-(line 87,col 49)",
        "(line 88,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 41)",
        "(line 99,col 9)-(line 104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.NestedLoops.add(org.apache.commons.math3.geometry.euclidean.twod.Vector2D[])",
      "begin_line": 113,
      "end_line": 115,
      "comment": " Add a loop in a tree.\n     * @param bLoop boundary loop (will be reversed in place if needed)\n     * @exception MathIllegalArgumentException if an outline has crossing\n     * boundary loops or open boundary loops\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.NestedLoops.add(org.apache.commons.math3.geometry.euclidean.twod.NestedLoops)",
      "begin_line": 122,
      "end_line": 151,
      "comment": " Add a loop in a tree.\n     * @param node boundary loop (will be reversed in place if needed)\n     * @exception MathIllegalArgumentException if an outline has boundary\n     * loops that cross each other\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 130,col 9)",
        "(line 133,col 9)-(line 139,col 9)",
        "(line 142,col 9)-(line 142,col 78)",
        "(line 143,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.NestedLoops.correctOrientation()",
      "begin_line": 158,
      "end_line": 162,
      "comment": " Correct the orientation of the loops contained in the tree.\n     * \u003cp\u003eThis is this method that really inverts the loops that where\n     * provided through the {@link #add(Vector2D[]) add} method if\n     * they are mis-oriented\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.NestedLoops.setClockWise(boolean)",
      "begin_line": 168,
      "end_line": 186,
      "comment": " Set the loop orientation.\n     * @param clockwise if true, the loop should be set to clockwise\n     * orientation\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 179,col 9)",
        "(line 182,col 9)-(line 184,col 9)"
      ]
    }
  ]
}