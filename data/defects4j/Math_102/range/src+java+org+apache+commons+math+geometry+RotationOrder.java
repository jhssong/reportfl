{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/geometry/RotationOrder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RotationOrder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 174,
      "comment": "\n * This class is a utility representing a rotation order specification\n * for Cardan or Euler angles specification.\n\n * This class cannot be instanciated by the user. He can only use one\n * of the twelve predefined supported orders as an argument to either\n * the {@link Rotation#Rotation(RotationOrder,double,double,double)}\n * constructor or the {@link Rotation#getAngles} method.\n\n * @version $Id: RotationOrder.java 1705 2006-09-17 19:57:39Z luc $\n\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.RotationOrder.RotationOrder(java.lang.String, org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 42,
      "end_line": 48,
      "comment": " Private constructor.\n   * This is a utility class that cannot be instantiated by the user,\n   * so its only constructor is private.\n   * @param name name of the rotation order\n   * @param a1 axis of the first rotation\n   * @param a2 axis of the second rotation\n   * @param a3 axis of the third rotation\n   ",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 21)",
        "(line 45,col 5)-(line 45,col 19)",
        "(line 46,col 5)-(line 46,col 19)",
        "(line 47,col 5)-(line 47,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.RotationOrder.toString()",
      "begin_line": 53,
      "end_line": 55,
      "comment": " Get a string representation of the instance.\n   * @return a string representation of the instance (in fact, its name)\n   ",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.RotationOrder.getA1()",
      "begin_line": 60,
      "end_line": 62,
      "comment": " Get the axis of the first rotation.\n   * @return axis of the first rotation\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.RotationOrder.getA2()",
      "begin_line": 67,
      "end_line": 69,
      "comment": " Get the axis of the second rotation.\n   * @return axis of the second rotation\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.RotationOrder.getA3()",
      "begin_line": 74,
      "end_line": 76,
      "comment": " Get the axis of the second rotation.\n   * @return axis of the second rotation\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "XYZ"
      ],
      "begin_line": 82,
      "end_line": 83,
      "comment": " Set of Cardan angles.\n   * this ordered set of rotations is around X, then around Y, then\n   * around Z\n   "
    },
    {
      "type": "field",
      "varNames": [
        "XZY"
      ],
      "begin_line": 89,
      "end_line": 90,
      "comment": " Set of Cardan angles.\n   * this ordered set of rotations is around X, then around Z, then\n   * around Y\n   "
    },
    {
      "type": "field",
      "varNames": [
        "YXZ"
      ],
      "begin_line": 96,
      "end_line": 97,
      "comment": " Set of Cardan angles.\n   * this ordered set of rotations is around Y, then around X, then\n   * around Z\n   "
    },
    {
      "type": "field",
      "varNames": [
        "YZX"
      ],
      "begin_line": 103,
      "end_line": 104,
      "comment": " Set of Cardan angles.\n   * this ordered set of rotations is around Y, then around Z, then\n   * around X\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ZXY"
      ],
      "begin_line": 110,
      "end_line": 111,
      "comment": " Set of Cardan angles.\n   * this ordered set of rotations is around Z, then around X, then\n   * around Y\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ZYX"
      ],
      "begin_line": 117,
      "end_line": 118,
      "comment": " Set of Cardan angles.\n   * this ordered set of rotations is around Z, then around Y, then\n   * around X\n   "
    },
    {
      "type": "field",
      "varNames": [
        "XYX"
      ],
      "begin_line": 124,
      "end_line": 125,
      "comment": " Set of Euler angles.\n   * this ordered set of rotations is around X, then around Y, then\n   * around X\n   "
    },
    {
      "type": "field",
      "varNames": [
        "XZX"
      ],
      "begin_line": 131,
      "end_line": 132,
      "comment": " Set of Euler angles.\n   * this ordered set of rotations is around X, then around Z, then\n   * around X\n   "
    },
    {
      "type": "field",
      "varNames": [
        "YXY"
      ],
      "begin_line": 138,
      "end_line": 139,
      "comment": " Set of Euler angles.\n   * this ordered set of rotations is around Y, then around X, then\n   * around Y\n   "
    },
    {
      "type": "field",
      "varNames": [
        "YZY"
      ],
      "begin_line": 145,
      "end_line": 146,
      "comment": " Set of Euler angles.\n   * this ordered set of rotations is around Y, then around Z, then\n   * around Y\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ZXZ"
      ],
      "begin_line": 152,
      "end_line": 153,
      "comment": " Set of Euler angles.\n   * this ordered set of rotations is around Z, then around X, then\n   * around Z\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ZYZ"
      ],
      "begin_line": 159,
      "end_line": 160,
      "comment": " Set of Euler angles.\n   * this ordered set of rotations is around Z, then around Y, then\n   * around Z\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " Name of the rotations order. "
    },
    {
      "type": "field",
      "varNames": [
        "a1"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " Axis of the first rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "a2"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " Axis of the second rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "a3"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " Axis of the third rotation. "
    }
  ]
}