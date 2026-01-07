{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/geometry/euclidean/threed/SubLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SubLine",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 137,
      "comment": " This class represents a subset of a {@link Line}.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Underlying line. "
    },
    {
      "type": "field",
      "varNames": [
        "remainingRegion"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Remaining region of the hyperplane. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.SubLine.SubLine(org.apache.commons.math.geometry.euclidean.threed.Line, org.apache.commons.math.geometry.euclidean.oned.IntervalsSet)",
      "begin_line": 44,
      "end_line": 47,
      "comment": " Simple constructor.\n     * @param line underlying line\n     * @param remainingRegion remaining region of the line\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 36)",
        "(line 46,col 9)-(line 46,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.SubLine.SubLine(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 53,
      "end_line": 55,
      "comment": " Create a sub-line from two endpoints.\n     * @param start start point\n     * @param end end point\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.SubLine.SubLine(org.apache.commons.math.geometry.euclidean.threed.Segment)",
      "begin_line": 60,
      "end_line": 62,
      "comment": " Create a sub-line from a segment.\n     * @param segment single segment forming the sub-line\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.SubLine.getSegments()",
      "begin_line": 78,
      "end_line": 91,
      "comment": " Get the endpoints of the sub-line.\n     * \u003cp\u003e\n     * A subline may be any arbitrary number of disjoints segments, so the endpoints\n     * are provided as a list of endpoint pairs. Each element of the list represents\n     * one segment, and each segment contains a start point at index 0 and an end point\n     * at index 1. If the sub-line is unbounded in the negative infinity direction,\n     * the start point of the first segment will have infinite coordinates. If the\n     * sub-line is unbounded in the positive infinity direction, the end point of the\n     * last segment will have infinite coordinates. So a sub-line covering the whole\n     * line will contain just one row and both elements of this row will have infinite\n     * coordinates. If the sub-line is empty, the returned list will contain 0 segments.\n     * \u003c/p\u003e\n     * @return list of segments endpoints\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 61)",
        "(line 81,col 9)-(line 81,col 64)",
        "(line 83,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.SubLine.intersection(org.apache.commons.math.geometry.euclidean.threed.SubLine, boolean)",
      "begin_line": 107,
      "end_line": 124,
      "comment": " Get the intersection of the instance and another sub-line.\n     * \u003cp\u003e\n     * This method is related to the {@link Line#intersection(Hyperplane)\n     * intersection} method in the {@link Line Line} class, but in addition\n     * to compute the point along infinite lines, it also checks the point\n     * lies on both sub-line ranges.\n     * \u003c/p\u003e\n     * @param subLine other sub-line which may intersect instance\n     * @param includeEndPoints if true, endpoints are considered to belong to\n     * instance (i.e. they are closed sets) and may be returned, otherwise endpoints\n     * are considered to not belong to instance (i.e. they are open sets) and intersection\n     * occurring on endpoints lead to null being returned\n     * @return the intersection point if there is one, null if the sub-lines don\u0027t intersect\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 55)",
        "(line 113,col 9)-(line 113,col 73)",
        "(line 116,col 9)-(line 116,col 89)",
        "(line 118,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.SubLine.buildIntervalSet(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 131,
      "end_line": 135,
      "comment": " Build an interval set from two points.\n     * @param start start point\n     * @param end end point\n     * @return an interval set\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 47)",
        "(line 133,col 9)-(line 134,col 61)"
      ]
    }
  ]
}