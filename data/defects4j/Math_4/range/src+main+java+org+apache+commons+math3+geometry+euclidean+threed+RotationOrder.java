{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/RotationOrder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RotationOrder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 175,
      "comment": "\n * This class is a utility representing a rotation order specification\n * for Cardan or Euler angles specification.\n *\n * This class cannot be instanciated by the user. He can only use one\n * of the twelve predefined supported orders as an argument to either\n * the {@link Rotation#Rotation(RotationOrder,double,double,double)}\n * constructor or the {@link Rotation#getAngles} method.\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "XYZ"
      ],
      "begin_line": 38,
      "end_line": 39,
      "comment": " Set of Cardan angles.\n     * this ordered set of rotations is around X, then around Y, then\n     * around Z\n     "
    },
    {
      "type": "field",
      "varNames": [
        "XZY"
      ],
      "begin_line": 45,
      "end_line": 46,
      "comment": " Set of Cardan angles.\n     * this ordered set of rotations is around X, then around Z, then\n     * around Y\n     "
    },
    {
      "type": "field",
      "varNames": [
        "YXZ"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": " Set of Cardan angles.\n     * this ordered set of rotations is around Y, then around X, then\n     * around Z\n     "
    },
    {
      "type": "field",
      "varNames": [
        "YZX"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": " Set of Cardan angles.\n     * this ordered set of rotations is around Y, then around Z, then\n     * around X\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZXY"
      ],
      "begin_line": 66,
      "end_line": 67,
      "comment": " Set of Cardan angles.\n     * this ordered set of rotations is around Z, then around X, then\n     * around Y\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZYX"
      ],
      "begin_line": 73,
      "end_line": 74,
      "comment": " Set of Cardan angles.\n     * this ordered set of rotations is around Z, then around Y, then\n     * around X\n     "
    },
    {
      "type": "field",
      "varNames": [
        "XYX"
      ],
      "begin_line": 80,
      "end_line": 81,
      "comment": " Set of Euler angles.\n     * this ordered set of rotations is around X, then around Y, then\n     * around X\n     "
    },
    {
      "type": "field",
      "varNames": [
        "XZX"
      ],
      "begin_line": 87,
      "end_line": 88,
      "comment": " Set of Euler angles.\n     * this ordered set of rotations is around X, then around Z, then\n     * around X\n     "
    },
    {
      "type": "field",
      "varNames": [
        "YXY"
      ],
      "begin_line": 94,
      "end_line": 95,
      "comment": " Set of Euler angles.\n     * this ordered set of rotations is around Y, then around X, then\n     * around Y\n     "
    },
    {
      "type": "field",
      "varNames": [
        "YZY"
      ],
      "begin_line": 101,
      "end_line": 102,
      "comment": " Set of Euler angles.\n     * this ordered set of rotations is around Y, then around Z, then\n     * around Y\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZXZ"
      ],
      "begin_line": 108,
      "end_line": 109,
      "comment": " Set of Euler angles.\n     * this ordered set of rotations is around Z, then around X, then\n     * around Z\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZYZ"
      ],
      "begin_line": 115,
      "end_line": 116,
      "comment": " Set of Euler angles.\n     * this ordered set of rotations is around Z, then around Y, then\n     * around Z\n     "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Name of the rotations order. "
    },
    {
      "type": "field",
      "varNames": [
        "a1"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Axis of the first rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "a2"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " Axis of the second rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "a3"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Axis of the third rotation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.RotationOrder.RotationOrder(java.lang.String, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 138,
      "end_line": 144,
      "comment": " Private constructor.\n     * This is a utility class that cannot be instantiated by the user,\n     * so its only constructor is private.\n     * @param name name of the rotation order\n     * @param a1 axis of the first rotation\n     * @param a2 axis of the second rotation\n     * @param a3 axis of the third rotation\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 25)",
        "(line 141,col 9)-(line 141,col 23)",
        "(line 142,col 9)-(line 142,col 23)",
        "(line 143,col 9)-(line 143,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.RotationOrder.toString()",
      "begin_line": 149,
      "end_line": 152,
      "comment": " Get a string representation of the instance.\n     * @return a string representation of the instance (in fact, its name)\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.RotationOrder.getA1()",
      "begin_line": 157,
      "end_line": 159,
      "comment": " Get the axis of the first rotation.\n     * @return axis of the first rotation\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.RotationOrder.getA2()",
      "begin_line": 164,
      "end_line": 166,
      "comment": " Get the axis of the second rotation.\n     * @return axis of the second rotation\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.RotationOrder.getA3()",
      "begin_line": 171,
      "end_line": 173,
      "comment": " Get the axis of the second rotation.\n     * @return axis of the second rotation\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 18)"
      ]
    }
  ]
}