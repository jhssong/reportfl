{
  "filepath": "/tmp/Math-23b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/Plane.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Plane",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e",
        "org.apache.commons.math3.geometry.partitioning.Embedding\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 36,
      "end_line": 462,
      "comment": " The class represent planes in a three dimensional space.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "originOffset"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Offset of the origin with respect to the plane. "
    },
    {
      "type": "field",
      "varNames": [
        "origin"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Origin of the plane frame. "
    },
    {
      "type": "field",
      "varNames": [
        "u"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " First vector of the plane frame (in plane). "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Second vector of the plane frame (in plane). "
    },
    {
      "type": "field",
      "varNames": [
        "w"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Third vector of the plane frame (plane normal). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.Plane(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 57,
      "end_line": 61,
      "comment": " Build a plane normal to a given direction and containing the origin.\n     * @param normal normal direction to the plane\n     * @exception MathArithmeticException if the normal norm is too small\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 26)",
        "(line 59,col 9)-(line 59,col 25)",
        "(line 60,col 9)-(line 60,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.Plane(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 68,
      "end_line": 72,
      "comment": " Build a plane from a point and a normal.\n     * @param p point belonging to the plane\n     * @param normal normal direction to the plane\n     * @exception MathArithmeticException if the normal norm is too small\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 26)",
        "(line 70,col 9)-(line 70,col 40)",
        "(line 71,col 9)-(line 71,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.Plane(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 82,
      "end_line": 85,
      "comment": " Build a plane from three points.\n     * \u003cp\u003eThe plane is oriented in the direction of\n     * {@code (p2-p1) ^ (p3-p1)}\u003c/p\u003e\n     * @param p1 first point belonging to the plane\n     * @param p2 second point belonging to the plane\n     * @param p3 third point belonging to the plane\n     * @exception MathArithmeticException if the points do not constitute a plane\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.Plane(org.apache.commons.math3.geometry.euclidean.threed.Plane)",
      "begin_line": 93,
      "end_line": 99,
      "comment": " Copy constructor.\n     * \u003cp\u003eThe instance created is completely independant of the original\n     * one. A deep copy is used, none of the underlying object are\n     * shared.\u003c/p\u003e\n     * @param plane plane to copy\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 42)",
        "(line 95,col 9)-(line 95,col 30)",
        "(line 96,col 9)-(line 96,col 25)",
        "(line 97,col 9)-(line 97,col 25)",
        "(line 98,col 9)-(line 98,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.copySelf()",
      "begin_line": 107,
      "end_line": 109,
      "comment": " Copy the instance.\n     * \u003cp\u003eThe instance created is completely independant of the original\n     * one. A deep copy is used, none of the underlying objects are\n     * shared (except for immutable objects).\u003c/p\u003e\n     * @return a new hyperplane, copy of the instance\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.reset(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 116,
      "end_line": 120,
      "comment": " Reset the instance as if built from a point and a normal.\n     * @param p point belonging to the plane\n     * @param normal normal direction to the plane\n     * @exception MathArithmeticException if the normal norm is too small\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 26)",
        "(line 118,col 9)-(line 118,col 40)",
        "(line 119,col 9)-(line 119,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.reset(org.apache.commons.math3.geometry.euclidean.threed.Plane)",
      "begin_line": 128,
      "end_line": 134,
      "comment": " Reset the instance from another one.\n     * \u003cp\u003eThe updated instance is completely independant of the original\n     * one. A deep reset is used none of the underlying object is\n     * shared.\u003c/p\u003e\n     * @param original plane to reset from\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 45)",
        "(line 130,col 9)-(line 130,col 39)",
        "(line 131,col 9)-(line 131,col 34)",
        "(line 132,col 9)-(line 132,col 34)",
        "(line 133,col 9)-(line 133,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.setNormal(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 140,
      "end_line": 146,
      "comment": " Set the normal vactor.\n     * @param normal normal direction to the plane (will be copied)\n     * @exception MathArithmeticException if the normal norm is too small\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 45)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.setFrame()",
      "begin_line": 150,
      "end_line": 159,
      "comment": " Reset the plane frame.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.getOrigin()",
      "begin_line": 167,
      "end_line": 169,
      "comment": " Get the origin point of the plane frame.\n     * \u003cp\u003eThe point returned is the orthogonal projection of the\n     * 3D-space origin in the plane.\u003c/p\u003e\n     * @return the origin point of the plane frame (point closest to the\n     * 3D-space origin)\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.getNormal()",
      "begin_line": 179,
      "end_line": 181,
      "comment": " Get the normalized normal vector.\n     * \u003cp\u003eThe frame defined by ({@link #getU getU}, {@link #getV getV},\n     * {@link #getNormal getNormal}) is a rigth-handed orthonormalized\n     * frame).\u003c/p\u003e\n     * @return normalized normal vector\n     * @see #getU\n     * @see #getV\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.getU()",
      "begin_line": 191,
      "end_line": 193,
      "comment": " Get the plane first canonical vector.\n     * \u003cp\u003eThe frame defined by ({@link #getU getU}, {@link #getV getV},\n     * {@link #getNormal getNormal}) is a rigth-handed orthonormalized\n     * frame).\u003c/p\u003e\n     * @return normalized first canonical vector\n     * @see #getV\n     * @see #getNormal\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.getV()",
      "begin_line": 203,
      "end_line": 205,
      "comment": " Get the plane second canonical vector.\n     * \u003cp\u003eThe frame defined by ({@link #getU getU}, {@link #getV getV},\n     * {@link #getNormal getNormal}) is a rigth-handed orthonormalized\n     * frame).\u003c/p\u003e\n     * @return normalized second canonical vector\n     * @see #getU\n     * @see #getNormal\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.revertSelf()",
      "begin_line": 218,
      "end_line": 224,
      "comment": " Revert the plane.\n     * \u003cp\u003eReplace the instance by a similar plane with opposite orientation.\u003c/p\u003e\n     * \u003cp\u003eThe new plane frame is chosen in such a way that a 3D point that had\n     * {@code (x, y)} in-plane coordinates and {@code z} offset with\n     * respect to the plane and is unaffected by the change will have\n     * {@code (y, x)} in-plane coordinates and {@code -z} offset with\n     * respect to the new plane. This means that the {@code u} and {@code v}\n     * vectors returned by the {@link #getU} and {@link #getV} methods are exchanged,\n     * and the {@code w} vector returned by the {@link #getNormal} method is\n     * reversed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 31)",
        "(line 220,col 9)-(line 220,col 14)",
        "(line 221,col 9)-(line 221,col 16)",
        "(line 222,col 9)-(line 222,col 23)",
        "(line 223,col 9)-(line 223,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.toSubSpace(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 233,
      "end_line": 235,
      "comment": " Transform a 3D space point into an in-plane point.\n     * @param point point of the space (must be a {@link Vector3D\n     * Vector3D} instance)\n     * @return in-plane point (really a {@link\n     * org.apache.commons.math3.geometry.euclidean.twod.Vector2D Vector2D} instance)\n     * @see #toSpace\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.toSpace(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 243,
      "end_line": 246,
      "comment": " Transform an in-plane point into a 3D space point.\n     * @param point in-plane point (must be a {@link\n     * org.apache.commons.math3.geometry.euclidean.twod.Vector2D Vector2D} instance)\n     * @return 3D space point (really a {@link Vector3D Vector3D} instance)\n     * @see #toSubSpace\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 46)",
        "(line 245,col 9)-(line 245,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.getPointAt(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, double)",
      "begin_line": 255,
      "end_line": 257,
      "comment": " Get one point from the 3D-space.\n     * @param inPlane desired in-plane coordinates for the point in the\n     * plane\n     * @param offset desired offset for the point\n     * @return one point in the 3D-space, with given coordinates and offset\n     * relative to the plane\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.isSimilarTo(org.apache.commons.math3.geometry.euclidean.threed.Plane)",
      "begin_line": 266,
      "end_line": 275,
      "comment": " Check if the instance is similar to another plane.\n     * \u003cp\u003ePlanes are considered similar if they contain the same\n     * points. This does not mean they are equal since they can have\n     * opposite normals.\u003c/p\u003e\n     * @param plane plane to which the instance is compared\n     * @return true if the planes are similar\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.rotate(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Rotation)",
      "begin_line": 283,
      "end_line": 300,
      "comment": " Rotate the plane around the specified point.\n     * \u003cp\u003eThe instance is not modified, a new instance is created.\u003c/p\u003e\n     * @param center rotation center\n     * @param rotation vectorial rotation operator\n     * @return a new plane\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.translate(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 307,
      "end_line": 322,
      "comment": " Translate the plane by the specified amount.\n     * \u003cp\u003eThe instance is not modified, a new instance is created.\u003c/p\u003e\n     * @param translation translation to apply\n     * @return a new plane\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.intersection(org.apache.commons.math3.geometry.euclidean.threed.Line)",
      "begin_line": 329,
      "end_line": 338,
      "comment": " Get the intersection of a line with the instance.\n     * @param line line intersecting the instance\n     * @return intersection point between between the line and the\n     * instance (null if the line is parallel to the instance)\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 55)",
        "(line 331,col 9)-(line 331,col 59)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 59)",
        "(line 336,col 9)-(line 336,col 75)",
        "(line 337,col 9)-(line 337,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.intersection(org.apache.commons.math3.geometry.euclidean.threed.Plane)",
      "begin_line": 345,
      "end_line": 360,
      "comment": " Build the line shared by the instance and another plane.\n     * @param other other plane\n     * @return line at the intersection of the instance and the\n     * other plane (really a {@link Line Line} instance)\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.intersection(org.apache.commons.math3.geometry.euclidean.threed.Plane, org.apache.commons.math3.geometry.euclidean.threed.Plane, org.apache.commons.math3.geometry.euclidean.threed.Plane)",
      "begin_line": 368,
      "end_line": 402,
      "comment": " Get the intersection point of three planes.\n     * @param plane1 first plane1\n     * @param plane2 second plane2\n     * @param plane3 third plane2\n     * @return intersection point of three planes, null if some planes are parallel\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 42)",
        "(line 372,col 9)-(line 372,col 42)",
        "(line 373,col 9)-(line 373,col 42)",
        "(line 374,col 9)-(line 374,col 46)",
        "(line 376,col 9)-(line 376,col 42)",
        "(line 377,col 9)-(line 377,col 42)",
        "(line 378,col 9)-(line 378,col 42)",
        "(line 379,col 9)-(line 379,col 46)",
        "(line 381,col 9)-(line 381,col 42)",
        "(line 382,col 9)-(line 382,col 42)",
        "(line 383,col 9)-(line 383,col 42)",
        "(line 384,col 9)-(line 384,col 46)",
        "(line 388,col 9)-(line 388,col 53)",
        "(line 389,col 9)-(line 389,col 53)",
        "(line 390,col 9)-(line 390,col 53)",
        "(line 391,col 9)-(line 391,col 66)",
        "(line 392,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 396,col 43)",
        "(line 397,col 9)-(line 400,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.wholeHyperplane()",
      "begin_line": 407,
      "end_line": 409,
      "comment": " Build a region covering the whole hyperplane.\n     * @return a region covering the whole hyperplane\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.wholeSpace()",
      "begin_line": 415,
      "end_line": 417,
      "comment": " Build a region covering the whole space.\n     * @return a region containing the instance (really a {@link\n     * PolyhedronsSet PolyhedronsSet} instance)\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.contains(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 423,
      "end_line": 425,
      "comment": " Check if the instance contains a point.\n     * @param p point to check\n     * @return true if p belongs to the plane\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.getOffset(org.apache.commons.math3.geometry.euclidean.threed.Plane)",
      "begin_line": 437,
      "end_line": 439,
      "comment": " Get the offset (oriented distance) of a parallel plane.\n     * \u003cp\u003eThis method should be called only for parallel planes otherwise\n     * the result is not meaningful.\u003c/p\u003e\n     * \u003cp\u003eThe offset is 0 if both planes are the same, it is\n     * positive if the plane is on the plus side of the instance and\n     * negative if it is on the minus side, according to its natural\n     * orientation.\u003c/p\u003e\n     * @param plane plane to check\n     * @return offset of the plane\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.getOffset(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 449,
      "end_line": 451,
      "comment": " Get the offset (oriented distance) of a point.\n     * \u003cp\u003eThe offset is 0 if the point is on the underlying hyperplane,\n     * it is positive if the point is on one particular side of the\n     * hyperplane, and it is negative if the point is on the other side,\n     * according to the hyperplane natural orientation.\u003c/p\u003e\n     * @param point point to check\n     * @return offset of the point\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.sameOrientationAs(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 458,
      "end_line": 460,
      "comment": " Check if the instance has the same orientation as another hyperplane.\n     * @param other other hyperplane to check against the instance\n     * @return true if the instance and the other hyperplane have\n     * the same orientation\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 55)"
      ]
    }
  ]
}