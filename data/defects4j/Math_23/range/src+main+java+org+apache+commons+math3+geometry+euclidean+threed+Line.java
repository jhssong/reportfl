{
  "filepath": "/tmp/Math-23b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/Line.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Line",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.Embedding\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 43,
      "end_line": 237,
      "comment": " The class represent lines in a three dimensional space.\n\n * \u003cp\u003eEach oriented line is intrinsically associated with an abscissa\n * which is a coordinate on the line. The point at abscissa 0 is the\n * orthogonal projection of the origin on the line, another equivalent\n * way to express this is to say that it is the point of the line\n * which is closest to the origin. Abscissa increases in the line\n * direction.\u003c/p\u003e\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Line direction. "
    },
    {
      "type": "field",
      "varNames": [
        "zero"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Line point closest to the origin. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.Line(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 56,
      "end_line": 58,
      "comment": " Build a line from two points.\n     * @param p1 first point belonging to the line (this can be any point)\n     * @param p2 second point belonging to the line (this can be any point, different from p1)\n     * @exception MathIllegalArgumentException if the points are equal\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.Line(org.apache.commons.math3.geometry.euclidean.threed.Line)",
      "begin_line": 65,
      "end_line": 68,
      "comment": " Copy constructor.\n     * \u003cp\u003eThe created instance is completely independent from the\n     * original instance, it is a deep copy.\u003c/p\u003e\n     * @param line line to copy\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 40)",
        "(line 67,col 9)-(line 67,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.reset(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 75,
      "end_line": 83,
      "comment": " Reset the instance as if built from two points.\n     * @param p1 first point belonging to the line (this can be any point)\n     * @param p2 second point belonging to the line (this can be any point, different from p1)\n     * @exception MathIllegalArgumentException if the points are equal\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 47)",
        "(line 77,col 9)-(line 77,col 47)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 73)",
        "(line 82,col 9)-(line 82,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.revert()",
      "begin_line": 88,
      "end_line": 95,
      "comment": " Get a line with reversed direction.\n     * @return a new instance, with reversed direction\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.getDirection()",
      "begin_line": 100,
      "end_line": 102,
      "comment": " Get the normalized direction vector.\n     * @return normalized direction vector\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.getOrigin()",
      "begin_line": 107,
      "end_line": 109,
      "comment": " Get the line point closest to the origin.\n     * @return line point closest to the origin\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.getAbscissa(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 118,
      "end_line": 120,
      "comment": " Get the abscissa of a point with respect to the line.\n     * \u003cp\u003eThe abscissa is 0 if the projection of the point and the\n     * projection of the frame origin on the line are the same\n     * point.\u003c/p\u003e\n     * @param point point to check\n     * @return abscissa of the point\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.pointAt(double)",
      "begin_line": 126,
      "end_line": 128,
      "comment": " Get one point from the line.\n     * @param abscissa desired abscissa for the point\n     * @return one point belonging to the line, at specified abscissa\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.toSubSpace(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 133,
      "end_line": 135,
      "comment": " {@inheritDoc}\n     * @see #getAbscissa(Vector3D)\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.toSpace(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 140,
      "end_line": 142,
      "comment": " {@inheritDoc}\n     * @see #pointAt(double)\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.isSimilarTo(org.apache.commons.math3.geometry.euclidean.threed.Line)",
      "begin_line": 151,
      "end_line": 159,
      "comment": " Check if the instance is similar to another line.\n     * \u003cp\u003eLines are considered similar if they contain the same\n     * points. This does not mean they are equal since they can have\n     * opposite directions.\u003c/p\u003e\n     * @param line line to which instance should be compared\n     * @return true if the lines are similar\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.contains(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 165,
      "end_line": 167,
      "comment": " Check if the instance contains a point.\n     * @param p point to check\n     * @return true if p belongs to the line\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 173,
      "end_line": 177,
      "comment": " Compute the distance between the instance and a point.\n     * @param p to check\n     * @return distance between the instance and the point\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 44)",
        "(line 175,col 9)-(line 175,col 85)",
        "(line 176,col 9)-(line 176,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.distance(org.apache.commons.math3.geometry.euclidean.threed.Line)",
      "begin_line": 183,
      "end_line": 197,
      "comment": " Compute the shortest distance between the instance and another line.\n     * @param line line to check against the instance\n     * @return shortest distance between the instance and the line\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 81)",
        "(line 186,col 9)-(line 186,col 42)",
        "(line 187,col 9)-(line 190,col 9)",
        "(line 193,col 9)-(line 193,col 78)",
        "(line 195,col 9)-(line 195,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.closestPoint(org.apache.commons.math3.geometry.euclidean.threed.Line)",
      "begin_line": 203,
      "end_line": 218,
      "comment": " Compute the point of the instance closest to another line.\n     * @param line line to check against the instance\n     * @return point of the instance closest to another line\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 64)",
        "(line 206,col 9)-(line 206,col 39)",
        "(line 207,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 212,col 57)",
        "(line 213,col 9)-(line 213,col 61)",
        "(line 214,col 9)-(line 214,col 66)",
        "(line 216,col 9)-(line 216,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.intersection(org.apache.commons.math3.geometry.euclidean.threed.Line)",
      "begin_line": 225,
      "end_line": 228,
      "comment": " Get the intersection point of the instance and another line.\n     * @param line other line\n     * @return intersection point of the instance and the other line\n     * or null if there are no intersection points\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 52)",
        "(line 227,col 9)-(line 227,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Line.wholeLine()",
      "begin_line": 233,
      "end_line": 235,
      "comment": " Build a sub-line covering the whole line.\n     * @return a sub-line covering the whole line\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 53)"
      ]
    }
  ]
}