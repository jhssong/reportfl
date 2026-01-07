{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/Segment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Segment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 67,
      "comment": " Simple container for a two-points segment.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": " Start point of the segment. "
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " End point of the segments. "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Line containing the segment. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Segment.Segment(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Line)",
      "begin_line": 40,
      "end_line": 44,
      "comment": " Build a segment.\n     * @param start start point of the segment\n     * @param end end point of the segment\n     * @param line line containing the segment\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 28)",
        "(line 42,col 9)-(line 42,col 26)",
        "(line 43,col 9)-(line 43,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Segment.getStart()",
      "begin_line": 49,
      "end_line": 51,
      "comment": " Get the start point of the segment.\n     * @return start point of the segment\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Segment.getEnd()",
      "begin_line": 56,
      "end_line": 58,
      "comment": " Get the end point of the segment.\n     * @return end point of the segment\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Segment.getLine()",
      "begin_line": 63,
      "end_line": 65,
      "comment": " Get the line containing the segment.\n     * @return line containing the segment\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 20)"
      ]
    }
  ]
}