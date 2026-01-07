{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/geometry/euclidean/threed/Line.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Line",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.Embedding\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 37,
      "end_line": 164,
      "comment": " The class represent lines in a three dimensional space.\n\n * \u003cp\u003eEach oriented line is intrinsically associated with an abscissa\n * wich is a coordinate on the line. The point at abscissa 0 is the\n * orthogonal projection of the origin on the line, another equivalent\n * way to express this is to say that it is the point of the line\n * which is closest to the origin. Abscissa increases in the line\n * direction.\u003c/p\u003e\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Line direction. "
    },
    {
      "type": "field",
      "varNames": [
        "zero"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Line point closest to the origin. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Line.Line(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 50,
      "end_line": 52,
      "comment": " Build a line from a point and a direction.\n     * @param p point belonging to the line (this can be any point)\n     * @param direction direction of the line\n     * @exception IllegalArgumentException if the direction norm is too small\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Line.reset(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 59,
      "end_line": 66,
      "comment": " Reset the instance as if built from a point and a normal.\n     * @param p point belonging to the line (this can be any point)\n     * @param dir direction of the line\n     * @exception IllegalArgumentException if the direction norm is too small\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 42)",
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 55)",
        "(line 65,col 9)-(line 65,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Line.revert()",
      "begin_line": 71,
      "end_line": 73,
      "comment": " Get a line with reversed direction.\n     * @return a new instance, with reversed direction\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Line.getDirection()",
      "begin_line": 78,
      "end_line": 80,
      "comment": " Get the normalized direction vector.\n     * @return normalized direction vector\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Line.getOrigin()",
      "begin_line": 85,
      "end_line": 87,
      "comment": " Get the line point closest to the origin.\n     * @return line point closest to the origin\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Line.toSubSpace(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 98,
      "end_line": 101,
      "comment": " Get the abscissa of a point with respect to the line.\n     * \u003cp\u003eThe abscissa is 0 if the projection of the point and the\n     * projection of the frame origin on the line are the same\n     * point.\u003c/p\u003e\n     * @param point point to check (must be a {@link Vector3D Vector3D}\n     * instance)\n     * @return abscissa of the point (really a\n     * {org.apache.commons.math.geometry.euclidean.oned.Vector1D Vector1D} instance)\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 39)",
        "(line 100,col 9)-(line 100,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Line.toSpace(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 109,
      "end_line": 112,
      "comment": " Get one point from the line.\n     * @param point desired abscissa for the point (must be a\n     * {org.apache.commons.math.geometry.euclidean.oned.Vector1D Vector1D} instance)\n     * @return one point belonging to the line, at specified abscissa\n     * (really a {@link Vector3D Vector3D} instance)\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 39)",
        "(line 111,col 9)-(line 111,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Line.isSimilarTo(org.apache.commons.math.geometry.euclidean.threed.Line)",
      "begin_line": 121,
      "end_line": 124,
      "comment": " Check if the instance is similar to another line.\n     * \u003cp\u003eLines are considered similar if they contain the same\n     * points. This does not mean they are equal since they can have\n     * opposite directions.\u003c/p\u003e\n     * @param line line to which instance should be compared\n     * @return true if the lines are similar\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 71)",
        "(line 123,col 9)-(line 123,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Line.contains(org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 130,
      "end_line": 132,
      "comment": " Check if the instance contains a point.\n     * @param p point to check\n     * @return true if p belongs to the line\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Line.distance(org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 138,
      "end_line": 142,
      "comment": " Compute the distance between the instance and a point.\n     * @param p to check\n     * @return distance between the instance and the point\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 44)",
        "(line 140,col 9)-(line 140,col 95)",
        "(line 141,col 9)-(line 141,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Line.distance(org.apache.commons.math.geometry.euclidean.threed.Line)",
      "begin_line": 148,
      "end_line": 162,
      "comment": " Compute the shortest distance between the instance and another line.\n     * @param line line to check agains the instance\n     * @return shortest distance between the instance and the line\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 81)",
        "(line 151,col 9)-(line 154,col 9)",
        "(line 157,col 9)-(line 157,col 88)",
        "(line 160,col 9)-(line 160,col 56)"
      ]
    }
  ]
}