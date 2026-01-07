{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/twod/Segment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Segment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 112,
      "comment": " Simple container for a two-points segment.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " Start point of the segment. "
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " End point of the segments. "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Line containing the segment. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Segment.Segment(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Line)",
      "begin_line": 41,
      "end_line": 45,
      "comment": " Build a segment.\n     * @param start start point of the segment\n     * @param end end point of the segment\n     * @param line line containing the segment\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 28)",
        "(line 43,col 9)-(line 43,col 26)",
        "(line 44,col 9)-(line 44,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Segment.getStart()",
      "begin_line": 50,
      "end_line": 52,
      "comment": " Get the start point of the segment.\n     * @return start point of the segment\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Segment.getEnd()",
      "begin_line": 57,
      "end_line": 59,
      "comment": " Get the end point of the segment.\n     * @return end point of the segment\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Segment.getLine()",
      "begin_line": 64,
      "end_line": 66,
      "comment": " Get the line containing the segment.\n     * @return line containing the segment\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Segment.distance(org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 83,
      "end_line": 111,
      "comment": " Calculates the shortest distance from a point to this line segment.\n     * \u003cp\u003e\n     * If the perpendicular extension from the point to the line does not\n     * cross in the bounds of the line segment, the shortest distance to\n     * the two end points will be returned.\n     * \u003c/p\u003e\n     *\n     * Algorithm adapted from:\n     * \u003ca href\u003d\"http://www.codeguru.com/forum/printthread.php?s\u003dcc8cf0596231f9a7dba4da6e77c29db3\u0026t\u003d194400\u0026pp\u003d15\u0026page\u003d1\"\u003e\n     * Thread @ Codeguru\u003c/a\u003e\n     *\n     * @param p to check\n     * @return distance between the instance and the point\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 56)",
        "(line 85,col 9)-(line 85,col 56)",
        "(line 87,col 9)-(line 88,col 61)",
        "(line 97,col 9)-(line 110,col 9)"
      ]
    }
  ]
}