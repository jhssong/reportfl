{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/Plane.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Plane",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e",
        "org.apache.commons.math3.geometry.partitioning.Embedding\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 34,
      "end_line": 432,
      "comment": " The class represent planes in a three dimensional space.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "originOffset"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Offset of the origin with respect to the plane. "
    },
    {
      "type": "field",
      "varNames": [
        "origin"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Origin of the plane frame. "
    },
    {
      "type": "field",
      "varNames": [
        "u"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " First vector of the plane frame (in plane). "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Second vector of the plane frame (in plane). "
    },
    {
      "type": "field",
      "varNames": [
        "w"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Third vector of the plane frame (plane normal). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.Plane(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 55,
      "end_line": 59,
      "comment": " Build a plane normal to a given direction and containing the origin.\n     * @param normal normal direction to the plane\n     * @exception MathArithmeticException if the normal norm is too small\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 26)",
        "(line 57,col 9)-(line 57,col 25)",
        "(line 58,col 9)-(line 58,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.Plane(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 66,
      "end_line": 70,
      "comment": " Build a plane from a point and a normal.\n     * @param p point belonging to the plane\n     * @param normal normal direction to the plane\n     * @exception MathArithmeticException if the normal norm is too small\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 26)",
        "(line 68,col 9)-(line 68,col 40)",
        "(line 69,col 9)-(line 69,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.Plane(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 80,
      "end_line": 83,
      "comment": " Build a plane from three points.\n     * \u003cp\u003eThe plane is oriented in the direction of\n     * {@code (p2-p1) ^ (p3-p1)}\u003c/p\u003e\n     * @param p1 first point belonging to the plane\n     * @param p2 second point belonging to the plane\n     * @param p3 third point belonging to the plane\n     * @exception MathArithmeticException if the points do not constitute a plane\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.Plane(org.apache.commons.math3.geometry.euclidean.threed.Plane)",
      "begin_line": 91,
      "end_line": 97,
      "comment": " Copy constructor.\n     * \u003cp\u003eThe instance created is completely independant of the original\n     * one. A deep copy is used, none of the underlying object are\n     * shared.\u003c/p\u003e\n     * @param plane plane to copy\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 42)",
        "(line 93,col 9)-(line 93,col 30)",
        "(line 94,col 9)-(line 94,col 25)",
        "(line 95,col 9)-(line 95,col 25)",
        "(line 96,col 9)-(line 96,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.copySelf()",
      "begin_line": 105,
      "end_line": 107,
      "comment": " Copy the instance.\n     * \u003cp\u003eThe instance created is completely independant of the original\n     * one. A deep copy is used, none of the underlying objects are\n     * shared (except for immutable objects).\u003c/p\u003e\n     * @return a new hyperplane, copy of the instance\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.reset(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 114,
      "end_line": 118,
      "comment": " Reset the instance as if built from a point and a normal.\n     * @param p point belonging to the plane\n     * @param normal normal direction to the plane\n     * @exception MathArithmeticException if the normal norm is too small\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 26)",
        "(line 116,col 9)-(line 116,col 40)",
        "(line 117,col 9)-(line 117,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.reset(org.apache.commons.math3.geometry.euclidean.threed.Plane)",
      "begin_line": 126,
      "end_line": 132,
      "comment": " Reset the instance from another one.\n     * \u003cp\u003eThe updated instance is completely independant of the original\n     * one. A deep reset is used none of the underlying object is\n     * shared.\u003c/p\u003e\n     * @param original plane to reset from\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 45)",
        "(line 128,col 9)-(line 128,col 39)",
        "(line 129,col 9)-(line 129,col 34)",
        "(line 130,col 9)-(line 130,col 34)",
        "(line 131,col 9)-(line 131,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.setNormal(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 138,
      "end_line": 144,
      "comment": " Set the normal vactor.\n     * @param normal normal direction to the plane (will be copied)\n     * @exception MathArithmeticException if the normal norm is too small\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 45)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.setFrame()",
      "begin_line": 148,
      "end_line": 152,
      "comment": " Reset the plane frame.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 48)",
        "(line 150,col 9)-(line 150,col 27)",
        "(line 151,col 9)-(line 151,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.getOrigin()",
      "begin_line": 160,
      "end_line": 162,
      "comment": " Get the origin point of the plane frame.\n     * \u003cp\u003eThe point returned is the orthogonal projection of the\n     * 3D-space origin in the plane.\u003c/p\u003e\n     * @return the origin point of the plane frame (point closest to the\n     * 3D-space origin)\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.getNormal()",
      "begin_line": 172,
      "end_line": 174,
      "comment": " Get the normalized normal vector.\n     * \u003cp\u003eThe frame defined by ({@link #getU getU}, {@link #getV getV},\n     * {@link #getNormal getNormal}) is a rigth-handed orthonormalized\n     * frame).\u003c/p\u003e\n     * @return normalized normal vector\n     * @see #getU\n     * @see #getV\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.getU()",
      "begin_line": 184,
      "end_line": 186,
      "comment": " Get the plane first canonical vector.\n     * \u003cp\u003eThe frame defined by ({@link #getU getU}, {@link #getV getV},\n     * {@link #getNormal getNormal}) is a rigth-handed orthonormalized\n     * frame).\u003c/p\u003e\n     * @return normalized first canonical vector\n     * @see #getV\n     * @see #getNormal\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.getV()",
      "begin_line": 196,
      "end_line": 198,
      "comment": " Get the plane second canonical vector.\n     * \u003cp\u003eThe frame defined by ({@link #getU getU}, {@link #getV getV},\n     * {@link #getNormal getNormal}) is a rigth-handed orthonormalized\n     * frame).\u003c/p\u003e\n     * @return normalized second canonical vector\n     * @see #getU\n     * @see #getNormal\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.revertSelf()",
      "begin_line": 211,
      "end_line": 217,
      "comment": " Revert the plane.\n     * \u003cp\u003eReplace the instance by a similar plane with opposite orientation.\u003c/p\u003e\n     * \u003cp\u003eThe new plane frame is chosen in such a way that a 3D point that had\n     * {@code (x, y)} in-plane coordinates and {@code z} offset with\n     * respect to the plane and is unaffected by the change will have\n     * {@code (y, x)} in-plane coordinates and {@code -z} offset with\n     * respect to the new plane. This means that the {@code u} and {@code v}\n     * vectors returned by the {@link #getU} and {@link #getV} methods are exchanged,\n     * and the {@code w} vector returned by the {@link #getNormal} method is\n     * reversed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 31)",
        "(line 213,col 9)-(line 213,col 14)",
        "(line 214,col 9)-(line 214,col 16)",
        "(line 215,col 9)-(line 215,col 23)",
        "(line 216,col 9)-(line 216,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.toSubSpace(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 226,
      "end_line": 228,
      "comment": " Transform a 3D space point into an in-plane point.\n     * @param point point of the space (must be a {@link Vector3D\n     * Vector3D} instance)\n     * @return in-plane point (really a {@link\n     * org.apache.commons.math3.geometry.euclidean.twod.Vector2D Vector2D} instance)\n     * @see #toSpace\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.toSpace(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 236,
      "end_line": 239,
      "comment": " Transform an in-plane point into a 3D space point.\n     * @param point in-plane point (must be a {@link\n     * org.apache.commons.math3.geometry.euclidean.twod.Vector2D Vector2D} instance)\n     * @return 3D space point (really a {@link Vector3D Vector3D} instance)\n     * @see #toSubSpace\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 46)",
        "(line 238,col 9)-(line 238,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.getPointAt(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, double)",
      "begin_line": 248,
      "end_line": 250,
      "comment": " Get one point from the 3D-space.\n     * @param inPlane desired in-plane coordinates for the point in the\n     * plane\n     * @param offset desired offset for the point\n     * @return one point in the 3D-space, with given coordinates and offset\n     * relative to the plane\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.isSimilarTo(org.apache.commons.math3.geometry.euclidean.threed.Plane)",
      "begin_line": 259,
      "end_line": 263,
      "comment": " Check if the instance is similar to another plane.\n     * \u003cp\u003ePlanes are considered similar if they contain the same\n     * points. This does not mean they are equal since they can have\n     * opposite normals.\u003c/p\u003e\n     * @param plane plane to which the instance is compared\n     * @return true if the planes are similar\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 56)",
        "(line 261,col 9)-(line 262,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.rotate(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Rotation)",
      "begin_line": 271,
      "end_line": 283,
      "comment": " Rotate the plane around the specified point.\n     * \u003cp\u003eThe instance is not modified, a new instance is created.\u003c/p\u003e\n     * @param center rotation center\n     * @param rotation vectorial rotation operator\n     * @return a new plane\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 55)",
        "(line 274,col 9)-(line 275,col 59)",
        "(line 278,col 9)-(line 278,col 38)",
        "(line 279,col 9)-(line 279,col 38)",
        "(line 281,col 9)-(line 281,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.translate(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 290,
      "end_line": 300,
      "comment": " Translate the plane by the specified amount.\n     * \u003cp\u003eThe instance is not modified, a new instance is created.\u003c/p\u003e\n     * @param translation translation to apply\n     * @return a new plane\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 66)",
        "(line 295,col 9)-(line 295,col 20)",
        "(line 296,col 9)-(line 296,col 20)",
        "(line 298,col 9)-(line 298,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.intersection(org.apache.commons.math3.geometry.euclidean.threed.Line)",
      "begin_line": 307,
      "end_line": 316,
      "comment": " Get the intersection of a line with the instance.\n     * @param line line intersecting the instance\n     * @return intersection point between between the line and the\n     * instance (null if the line is parallel to the instance)\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 55)",
        "(line 309,col 9)-(line 309,col 59)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 59)",
        "(line 314,col 9)-(line 314,col 75)",
        "(line 315,col 9)-(line 315,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.intersection(org.apache.commons.math3.geometry.euclidean.threed.Plane)",
      "begin_line": 323,
      "end_line": 330,
      "comment": " Build the line shared by the instance and another plane.\n     * @param other other plane\n     * @return line at the intersection of the instance and the\n     * other plane (really a {@link Line Line} instance)\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 69)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 79)",
        "(line 329,col 9)-(line 329,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.intersection(org.apache.commons.math3.geometry.euclidean.threed.Plane, org.apache.commons.math3.geometry.euclidean.threed.Plane, org.apache.commons.math3.geometry.euclidean.threed.Plane)",
      "begin_line": 338,
      "end_line": 372,
      "comment": " Get the intersection point of three planes.\n     * @param plane1 first plane1\n     * @param plane2 second plane2\n     * @param plane3 third plane2\n     * @return intersection point of three planes, null if some planes are parallel\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 42)",
        "(line 342,col 9)-(line 342,col 42)",
        "(line 343,col 9)-(line 343,col 42)",
        "(line 344,col 9)-(line 344,col 46)",
        "(line 346,col 9)-(line 346,col 42)",
        "(line 347,col 9)-(line 347,col 42)",
        "(line 348,col 9)-(line 348,col 42)",
        "(line 349,col 9)-(line 349,col 46)",
        "(line 351,col 9)-(line 351,col 42)",
        "(line 352,col 9)-(line 352,col 42)",
        "(line 353,col 9)-(line 353,col 42)",
        "(line 354,col 9)-(line 354,col 46)",
        "(line 358,col 9)-(line 358,col 53)",
        "(line 359,col 9)-(line 359,col 53)",
        "(line 360,col 9)-(line 360,col 53)",
        "(line 361,col 9)-(line 361,col 66)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 43)",
        "(line 367,col 9)-(line 370,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.wholeHyperplane()",
      "begin_line": 377,
      "end_line": 379,
      "comment": " Build a region covering the whole hyperplane.\n     * @return a region covering the whole hyperplane\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.wholeSpace()",
      "begin_line": 385,
      "end_line": 387,
      "comment": " Build a region covering the whole space.\n     * @return a region containing the instance (really a {@link\n     * PolyhedronsSet PolyhedronsSet} instance)\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.contains(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 393,
      "end_line": 395,
      "comment": " Check if the instance contains a point.\n     * @param p point to check\n     * @return true if p belongs to the plane\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.getOffset(org.apache.commons.math3.geometry.euclidean.threed.Plane)",
      "begin_line": 407,
      "end_line": 409,
      "comment": " Get the offset (oriented distance) of a parallel plane.\n     * \u003cp\u003eThis method should be called only for parallel planes otherwise\n     * the result is not meaningful.\u003c/p\u003e\n     * \u003cp\u003eThe offset is 0 if both planes are the same, it is\n     * positive if the plane is on the plus side of the instance and\n     * negative if it is on the minus side, according to its natural\n     * orientation.\u003c/p\u003e\n     * @param plane plane to check\n     * @return offset of the plane\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.getOffset(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 419,
      "end_line": 421,
      "comment": " Get the offset (oriented distance) of a point.\n     * \u003cp\u003eThe offset is 0 if the point is on the underlying hyperplane,\n     * it is positive if the point is on one particular side of the\n     * hyperplane, and it is negative if the point is on the other side,\n     * according to the hyperplane natural orientation.\u003c/p\u003e\n     * @param point point to check\n     * @return offset of the point\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Plane.sameOrientationAs(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 428,
      "end_line": 430,
      "comment": " Check if the instance has the same orientation as another hyperplane.\n     * @param other other hyperplane to check against the instance\n     * @return true if the instance and the other hyperplane have\n     * the same orientation\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 55)"
      ]
    }
  ]
}