{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/oned/Interval.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Interval",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 130,
      "comment": " This class represents a 1D interval.\n * @see IntervalsSet\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " The lower bound of the interval. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The upper bound of the interval. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Interval.Interval(double, double)",
      "begin_line": 39,
      "end_line": 42,
      "comment": " Simple constructor.\n     * @param lower lower bound of the interval\n     * @param upper upper bound of the interval\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 27)",
        "(line 41,col 9)-(line 41,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Interval.getInf()",
      "begin_line": 48,
      "end_line": 50,
      "comment": " Get the lower bound of the interval.\n     * @return lower bound of the interval\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Interval.getLower()",
      "begin_line": 56,
      "end_line": 59,
      "comment": " Get the lower bound of the interval.\n     * @return lower bound of the interval\n     * @deprecated as of 3.1, replaced by {@link #getInf()}\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Interval.getSup()",
      "begin_line": 65,
      "end_line": 67,
      "comment": " Get the upper bound of the interval.\n     * @return upper bound of the interval\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Interval.getUpper()",
      "begin_line": 73,
      "end_line": 76,
      "comment": " Get the upper bound of the interval.\n     * @return upper bound of the interval\n     * @deprecated as of 3.1, replaced by {@link #getSup()}\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Interval.getSize()",
      "begin_line": 82,
      "end_line": 84,
      "comment": " Get the size of the interval.\n     * @return size of the interval\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Interval.getLength()",
      "begin_line": 90,
      "end_line": 93,
      "comment": " Get the length of the interval.\n     * @return length of the interval\n     * @deprecated as of 3.1, replaced by {@link #getSize()}\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Interval.getBarycenter()",
      "begin_line": 99,
      "end_line": 101,
      "comment": " Get the barycenter of the interval.\n     * @return barycenter of the interval\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Interval.getMidPoint()",
      "begin_line": 107,
      "end_line": 110,
      "comment": " Get the midpoint of the interval.\n     * @return midpoint of the interval\n     * @deprecated as of 3.1, replaced by {@link #getBarycenter()}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.Interval.checkPoint(double, double)",
      "begin_line": 120,
      "end_line": 128,
      "comment": " Check a point with respect to the interval.\n     * @param point point to check\n     * @param tolerance tolerance below which points are considered to\n     * belong to the boundary\n     * @return a code representing the point status: either {@link\n     * Location#INSIDE}, {@link Location#OUTSIDE} or {@link Location#BOUNDARY}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 127,col 9)"
      ]
    }
  ]
}