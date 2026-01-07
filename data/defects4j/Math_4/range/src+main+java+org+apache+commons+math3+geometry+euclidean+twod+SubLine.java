{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/twod/SubLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SubLine",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 40,
      "end_line": 209,
      "comment": " This class represents a sub-hyperplane for {@link Line}.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.SubLine.SubLine(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e, org.apache.commons.math3.geometry.partitioning.Region\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 46,
      "end_line": 49,
      "comment": " Simple constructor.\n     * @param hyperplane underlying hyperplane\n     * @param remainingRegion remaining region of the hyperplane\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.SubLine.SubLine(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 55,
      "end_line": 57,
      "comment": " Create a sub-line from two endpoints.\n     * @param start start point\n     * @param end end point\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.SubLine.SubLine(org.apache.commons.math3.geometry.euclidean.twod.Segment)",
      "begin_line": 62,
      "end_line": 64,
      "comment": " Create a sub-line from a segment.\n     * @param segment single segment forming the sub-line\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments()",
      "begin_line": 80,
      "end_line": 94,
      "comment": " Get the endpoints of the sub-line.\n     * \u003cp\u003e\n     * A subline may be any arbitrary number of disjoints segments, so the endpoints\n     * are provided as a list of endpoint pairs. Each element of the list represents\n     * one segment, and each segment contains a start point at index 0 and an end point\n     * at index 1. If the sub-line is unbounded in the negative infinity direction,\n     * the start point of the first segment will have infinite coordinates. If the\n     * sub-line is unbounded in the positive infinity direction, the end point of the\n     * last segment will have infinite coordinates. So a sub-line covering the whole\n     * line will contain just one row and both elements of this row will have infinite\n     * coordinates. If the sub-line is empty, the returned list will contain 0 segments.\n     * \u003c/p\u003e\n     * @return list of segments endpoints\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 49)",
        "(line 83,col 9)-(line 83,col 83)",
        "(line 84,col 9)-(line 84,col 64)",
        "(line 86,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.SubLine.intersection(org.apache.commons.math3.geometry.euclidean.twod.SubLine, boolean)",
      "begin_line": 110,
      "end_line": 131,
      "comment": " Get the intersection of the instance and another sub-line.\n     * \u003cp\u003e\n     * This method is related to the {@link Line#intersection(Line)\n     * intersection} method in the {@link Line Line} class, but in addition\n     * to compute the point along infinite lines, it also checks the point\n     * lies on both sub-line ranges.\n     * \u003c/p\u003e\n     * @param subLine other sub-line which may intersect instance\n     * @param includeEndPoints if true, endpoints are considered to belong to\n     * instance (i.e. they are closed sets) and may be returned, otherwise endpoints\n     * are considered to not belong to instance (i.e. they are open sets) and intersection\n     * occurring on endpoints lead to null being returned\n     * @return the intersection point if there is one, null if the sub-lines don\u0027t intersect\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 44)",
        "(line 114,col 9)-(line 114,col 52)",
        "(line 117,col 9)-(line 117,col 49)",
        "(line 120,col 9)-(line 120,col 79)",
        "(line 123,col 9)-(line 123,col 87)",
        "(line 125,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.SubLine.buildIntervalSet(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 138,
      "end_line": 142,
      "comment": " Build an interval set from two points.\n     * @param start start point\n     * @param end end point\n     * @return an interval set\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 47)",
        "(line 140,col 9)-(line 141,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.SubLine.buildNew(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e, org.apache.commons.math3.geometry.partitioning.Region\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 145,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.SubLine.side(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 152,
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 57)",
        "(line 156,col 9)-(line 156,col 52)",
        "(line 157,col 9)-(line 157,col 68)",
        "(line 159,col 9)-(line 163,col 9)",
        "(line 166,col 9)-(line 166,col 92)",
        "(line 167,col 9)-(line 167,col 57)",
        "(line 168,col 9)-(line 168,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.SubLine.split(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 173,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 57)",
        "(line 177,col 9)-(line 177,col 52)",
        "(line 178,col 9)-(line 178,col 68)",
        "(line 180,col 9)-(line 186,col 9)",
        "(line 189,col 9)-(line 189,col 92)",
        "(line 190,col 9)-(line 190,col 62)",
        "(line 191,col 9)-(line 191,col 100)",
        "(line 192,col 9)-(line 192,col 100)",
        "(line 194,col 9)-(line 194,col 99)",
        "(line 195,col 9)-(line 198,col 99)",
        "(line 199,col 9)-(line 202,col 100)",
        "(line 204,col 9)-(line 205,col 114)"
      ]
    }
  ]
}