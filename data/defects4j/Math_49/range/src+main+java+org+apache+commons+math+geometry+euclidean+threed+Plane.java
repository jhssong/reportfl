{
  "filepath": "/tmp/Math-49b/src/main/java/org/apache/commons/math/geometry/euclidean/threed/Plane.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Plane",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e",
        "org.apache.commons.math.geometry.partitioning.Embedding\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 32,
      "end_line": 430,
      "comment": " The class represent planes in a three dimensional space.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "originOffset"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Offset of the origin with respect to the plane. "
    },
    {
      "type": "field",
      "varNames": [
        "origin"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Origin of the plane frame. "
    },
    {
      "type": "field",
      "varNames": [
        "u"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " First vector of the plane frame (in plane). "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Second vector of the plane frame (in plane). "
    },
    {
      "type": "field",
      "varNames": [
        "w"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Third vector of the plane frame (plane normal). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.Plane(org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 53,
      "end_line": 57,
      "comment": " Build a plane normal to a given direction and containing the origin.\n     * @param normal normal direction to the plane\n     * @exception IllegalArgumentException if the normal norm is too small\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 26)",
        "(line 55,col 9)-(line 55,col 25)",
        "(line 56,col 9)-(line 56,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.Plane(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 64,
      "end_line": 68,
      "comment": " Build a plane from a point and a normal.\n     * @param p point belonging to the plane\n     * @param normal normal direction to the plane\n     * @exception IllegalArgumentException if the normal norm is too small\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 26)",
        "(line 66,col 9)-(line 66,col 50)",
        "(line 67,col 9)-(line 67,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.Plane(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 78,
      "end_line": 80,
      "comment": " Build a plane from three points.\n     * \u003cp\u003eThe plane is oriented in the direction of\n     * {@code (p2-p1) ^ (p3-p1)}\u003c/p\u003e\n     * @param p1 first point belonging to the plane\n     * @param p2 second point belonging to the plane\n     * @param p3 third point belonging to the plane\n     * @exception IllegalArgumentException if the points do not constitute a plane\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.Plane(org.apache.commons.math.geometry.euclidean.threed.Plane)",
      "begin_line": 88,
      "end_line": 94,
      "comment": " Copy constructor.\n     * \u003cp\u003eThe instance created is completely independant of the original\n     * one. A deep copy is used, none of the underlying object are\n     * shared.\u003c/p\u003e\n     * @param plane plane to copy\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 42)",
        "(line 90,col 9)-(line 90,col 30)",
        "(line 91,col 9)-(line 91,col 25)",
        "(line 92,col 9)-(line 92,col 25)",
        "(line 93,col 9)-(line 93,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.copySelf()",
      "begin_line": 102,
      "end_line": 104,
      "comment": " Copy the instance.\n     * \u003cp\u003eThe instance created is completely independant of the original\n     * one. A deep copy is used, none of the underlying objects are\n     * shared (except for immutable objects).\u003c/p\u003e\n     * @return a new hyperplane, copy of the instance\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.reset(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 110,
      "end_line": 114,
      "comment": " Reset the instance as if built from a point and a normal.\n     * @param p point belonging to the plane\n     * @param normal normal direction to the plane\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 26)",
        "(line 112,col 9)-(line 112,col 50)",
        "(line 113,col 9)-(line 113,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.reset(org.apache.commons.math.geometry.euclidean.threed.Plane)",
      "begin_line": 122,
      "end_line": 128,
      "comment": " Reset the instance from another one.\n     * \u003cp\u003eThe updated instance is completely independant of the original\n     * one. A deep reset is used none of the underlying object is\n     * shared.\u003c/p\u003e\n     * @param original plane to reset from\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 45)",
        "(line 124,col 9)-(line 124,col 39)",
        "(line 125,col 9)-(line 125,col 34)",
        "(line 126,col 9)-(line 126,col 34)",
        "(line 127,col 9)-(line 127,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.setNormal(org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 134,
      "end_line": 140,
      "comment": " Set the normal vactor.\n     * @param normal normal direction to the plane (will be copied)\n     * @exception IllegalArgumentException if the normal norm is too small\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 45)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.setFrame()",
      "begin_line": 144,
      "end_line": 148,
      "comment": " Reset the plane frame.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 48)",
        "(line 146,col 9)-(line 146,col 27)",
        "(line 147,col 9)-(line 147,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.getOrigin()",
      "begin_line": 156,
      "end_line": 158,
      "comment": " Get the origin point of the plane frame.\n     * \u003cp\u003eThe point returned is the orthogonal projection of the\n     * 3D-space origin in the plane.\u003c/p\u003e\n     * @return the origin point of the plane frame (point closest to the\n     * 3D-space origin)\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.getNormal()",
      "begin_line": 168,
      "end_line": 170,
      "comment": " Get the normalized normal vector.\n     * \u003cp\u003eThe frame defined by ({@link #getU getU}, {@link #getV getV},\n     * {@link #getNormal getNormal}) is a rigth-handed orthonormalized\n     * frame).\u003c/p\u003e\n     * @return normalized normal vector\n     * @see #getU\n     * @see #getV\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.getU()",
      "begin_line": 180,
      "end_line": 182,
      "comment": " Get the plane first canonical vector.\n     * \u003cp\u003eThe frame defined by ({@link #getU getU}, {@link #getV getV},\n     * {@link #getNormal getNormal}) is a rigth-handed orthonormalized\n     * frame).\u003c/p\u003e\n     * @return normalized first canonical vector\n     * @see #getV\n     * @see #getNormal\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.getV()",
      "begin_line": 192,
      "end_line": 194,
      "comment": " Get the plane second canonical vector.\n     * \u003cp\u003eThe frame defined by ({@link #getU getU}, {@link #getV getV},\n     * {@link #getNormal getNormal}) is a rigth-handed orthonormalized\n     * frame).\u003c/p\u003e\n     * @return normalized second canonical vector\n     * @see #getU\n     * @see #getNormal\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.revertSelf()",
      "begin_line": 207,
      "end_line": 213,
      "comment": " Revert the plane.\n     * \u003cp\u003eReplace the instance by a similar plane with opposite orientation.\u003c/p\u003e\n     * \u003cp\u003eThe new plane frame is chosen in such a way that a 3D point that had\n     * {@code (x, y)} in-plane coordinates and {@code z} offset with\n     * respect to the plane and is unaffected by the change will have\n     * {@code (y, x)} in-plane coordinates and {@code -z} offset with\n     * respect to the new plane. This means that the {@code u} and {@code v}\n     * vectors returned by the {@link #getU} and {@link #getV} methods are exchanged,\n     * and the {@code w} vector returned by the {@link #getNormal} method is\n     * reversed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 31)",
        "(line 209,col 9)-(line 209,col 14)",
        "(line 210,col 9)-(line 210,col 16)",
        "(line 211,col 9)-(line 211,col 23)",
        "(line 212,col 9)-(line 212,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.toSubSpace(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 222,
      "end_line": 226,
      "comment": " Transform a 3D space point into an in-plane point.\n     * @param point point of the space (must be a {@link Vector3D\n     * Vector3D} instance)\n     * @return in-plane point (really a {@link\n     * org.apache.commons.math.geometry.euclidean.twod.Vector2D Vector2D} instance)\n     * @see #toSpace\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 46)",
        "(line 224,col 9)-(line 225,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.toSpace(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 234,
      "end_line": 237,
      "comment": " Transform an in-plane point into a 3D space point.\n     * @param point in-plane point (must be a {@link\n     * org.apache.commons.math.geometry.euclidean.twod.Vector2D Vector2D} instance)\n     * @return 3D space point (really a {@link Vector3D Vector3D} instance)\n     * @see #toSubSpace\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 46)",
        "(line 236,col 9)-(line 236,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.getPointAt(org.apache.commons.math.geometry.euclidean.twod.Vector2D, double)",
      "begin_line": 246,
      "end_line": 248,
      "comment": " Get one point from the 3D-space.\n     * @param inPlane desired in-plane coordinates for the point in the\n     * plane\n     * @param offset desired offset for the point\n     * @return one point in the 3D-space, with given coordinates and offset\n     * relative to the plane\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.isSimilarTo(org.apache.commons.math.geometry.euclidean.threed.Plane)",
      "begin_line": 257,
      "end_line": 261,
      "comment": " Check if the instance is similar to another plane.\n     * \u003cp\u003ePlanes are considered similar if they contain the same\n     * points. This does not mean they are equal since they can have\n     * opposite normals.\u003c/p\u003e\n     * @param plane plane to which the instance is compared\n     * @return true if the planes are similar\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 56)",
        "(line 259,col 9)-(line 260,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.rotate(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Rotation)",
      "begin_line": 269,
      "end_line": 281,
      "comment": " Rotate the plane around the specified point.\n     * \u003cp\u003eThe instance is not modified, a new instance is created.\u003c/p\u003e\n     * @param center rotation center\n     * @param rotation vectorial rotation operator\n     * @return a new plane\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 55)",
        "(line 272,col 9)-(line 273,col 53)",
        "(line 276,col 9)-(line 276,col 38)",
        "(line 277,col 9)-(line 277,col 38)",
        "(line 279,col 9)-(line 279,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.translate(org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 288,
      "end_line": 298,
      "comment": " Translate the plane by the specified amount.\n     * \u003cp\u003eThe instance is not modified, a new instance is created.\u003c/p\u003e\n     * @param translation translation to apply\n     * @return a new plane\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 66)",
        "(line 293,col 9)-(line 293,col 20)",
        "(line 294,col 9)-(line 294,col 20)",
        "(line 296,col 9)-(line 296,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.intersection(org.apache.commons.math.geometry.euclidean.threed.Line)",
      "begin_line": 305,
      "end_line": 314,
      "comment": " Get the intersection of a line with the instance.\n     * @param line line intersecting the instance\n     * @return intersection point between between the line and the\n     * instance (null if the line is parallel to the instance)\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 55)",
        "(line 307,col 9)-(line 307,col 69)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 70)",
        "(line 312,col 9)-(line 312,col 85)",
        "(line 313,col 9)-(line 313,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.intersection(org.apache.commons.math.geometry.euclidean.threed.Plane)",
      "begin_line": 321,
      "end_line": 328,
      "comment": " Build the line shared by the instance and another plane.\n     * @param other other plane\n     * @return line at the intersection of the instance and the\n     * other plane (really a {@link Line Line} instance)\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 69)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 327,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.intersection(org.apache.commons.math.geometry.euclidean.threed.Plane, org.apache.commons.math.geometry.euclidean.threed.Plane, org.apache.commons.math.geometry.euclidean.threed.Plane)",
      "begin_line": 336,
      "end_line": 370,
      "comment": " Get the intersection point of three planes.\n     * @param plane1 first plane1\n     * @param plane2 second plane2\n     * @param plane3 third plane2\n     * @return intersection point of three planes, null if some planes are parallel\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 42)",
        "(line 340,col 9)-(line 340,col 42)",
        "(line 341,col 9)-(line 341,col 42)",
        "(line 342,col 9)-(line 342,col 46)",
        "(line 344,col 9)-(line 344,col 42)",
        "(line 345,col 9)-(line 345,col 42)",
        "(line 346,col 9)-(line 346,col 42)",
        "(line 347,col 9)-(line 347,col 46)",
        "(line 349,col 9)-(line 349,col 42)",
        "(line 350,col 9)-(line 350,col 42)",
        "(line 351,col 9)-(line 351,col 42)",
        "(line 352,col 9)-(line 352,col 46)",
        "(line 356,col 9)-(line 356,col 53)",
        "(line 357,col 9)-(line 357,col 53)",
        "(line 358,col 9)-(line 358,col 53)",
        "(line 359,col 9)-(line 359,col 66)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 364,col 43)",
        "(line 365,col 9)-(line 368,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.wholeHyperplane()",
      "begin_line": 375,
      "end_line": 377,
      "comment": " Build a region covering the whole hyperplane.\n     * @return a region covering the whole hyperplane\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.wholeSpace()",
      "begin_line": 383,
      "end_line": 385,
      "comment": " Build a region covering the whole space.\n     * @return a region containing the instance (really a {@link\n     * PolyhedronsSet PolyhedronsSet} instance)\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.contains(org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 391,
      "end_line": 393,
      "comment": " Check if the instance contains a point.\n     * @param p point to check\n     * @return true if p belongs to the plane\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.getOffset(org.apache.commons.math.geometry.euclidean.threed.Plane)",
      "begin_line": 405,
      "end_line": 407,
      "comment": " Get the offset (oriented distance) of a parallel plane.\n     * \u003cp\u003eThis method should be called only for parallel planes otherwise\n     * the result is not meaningful.\u003c/p\u003e\n     * \u003cp\u003eThe offset is 0 if both planes are the same, it is\n     * positive if the plane is on the plus side of the instance and\n     * negative if it is on the minus side, according to its natural\n     * orientation.\u003c/p\u003e\n     * @param plane plane to check\n     * @return offset of the plane\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.getOffset(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 417,
      "end_line": 419,
      "comment": " Get the offset (oriented distance) of a point.\n     * \u003cp\u003eThe offset is 0 if the point is on the underlying hyperplane,\n     * it is positive if the point is on one particular side of the\n     * hyperplane, and it is negative if the point is on the other side,\n     * according to the hyperplane natural orientation.\u003c/p\u003e\n     * @param point point to check\n     * @return offset of the point\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Plane.sameOrientationAs(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 426,
      "end_line": 428,
      "comment": " Check if the instance has the same orientation as another hyperplane.\n     * @param other other hyperplane to check against the instance\n     * @return true if the instance and the other hyperplane have\n     * the same orientation\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 63)"
      ]
    }
  ]
}