{
  "filepath": "/tmp/Math-83b/src/main/java/org/apache/commons/math/geometry/RotationOrder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RotationOrder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 175,
      "comment": "\n * This class is a utility representing a rotation order specification\n * for Cardan or Euler angles specification.\n *\n * This class cannot be instanciated by the user. He can only use one\n * of the twelve predefined supported orders as an argument to either\n * the {@link Rotation#Rotation(RotationOrder,double,double,double)}\n * constructor or the {@link Rotation#getAngles} method.\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
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
      "end_line": 56,
      "comment": " Get a string representation of the instance.\n   * @return a string representation of the instance (in fact, its name)\n   ",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.RotationOrder.getA1()",
      "begin_line": 61,
      "end_line": 63,
      "comment": " Get the axis of the first rotation.\n   * @return axis of the first rotation\n   ",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.RotationOrder.getA2()",
      "begin_line": 68,
      "end_line": 70,
      "comment": " Get the axis of the second rotation.\n   * @return axis of the second rotation\n   ",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.RotationOrder.getA3()",
      "begin_line": 75,
      "end_line": 77,
      "comment": " Get the axis of the second rotation.\n   * @return axis of the second rotation\n   ",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "XYZ"
      ],
      "begin_line": 83,
      "end_line": 84,
      "comment": " Set of Cardan angles.\n   * this ordered set of rotations is around X, then around Y, then\n   * around Z\n   "
    },
    {
      "type": "field",
      "varNames": [
        "XZY"
      ],
      "begin_line": 90,
      "end_line": 91,
      "comment": " Set of Cardan angles.\n   * this ordered set of rotations is around X, then around Z, then\n   * around Y\n   "
    },
    {
      "type": "field",
      "varNames": [
        "YXZ"
      ],
      "begin_line": 97,
      "end_line": 98,
      "comment": " Set of Cardan angles.\n   * this ordered set of rotations is around Y, then around X, then\n   * around Z\n   "
    },
    {
      "type": "field",
      "varNames": [
        "YZX"
      ],
      "begin_line": 104,
      "end_line": 105,
      "comment": " Set of Cardan angles.\n   * this ordered set of rotations is around Y, then around Z, then\n   * around X\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ZXY"
      ],
      "begin_line": 111,
      "end_line": 112,
      "comment": " Set of Cardan angles.\n   * this ordered set of rotations is around Z, then around X, then\n   * around Y\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ZYX"
      ],
      "begin_line": 118,
      "end_line": 119,
      "comment": " Set of Cardan angles.\n   * this ordered set of rotations is around Z, then around Y, then\n   * around X\n   "
    },
    {
      "type": "field",
      "varNames": [
        "XYX"
      ],
      "begin_line": 125,
      "end_line": 126,
      "comment": " Set of Euler angles.\n   * this ordered set of rotations is around X, then around Y, then\n   * around X\n   "
    },
    {
      "type": "field",
      "varNames": [
        "XZX"
      ],
      "begin_line": 132,
      "end_line": 133,
      "comment": " Set of Euler angles.\n   * this ordered set of rotations is around X, then around Z, then\n   * around X\n   "
    },
    {
      "type": "field",
      "varNames": [
        "YXY"
      ],
      "begin_line": 139,
      "end_line": 140,
      "comment": " Set of Euler angles.\n   * this ordered set of rotations is around Y, then around X, then\n   * around Y\n   "
    },
    {
      "type": "field",
      "varNames": [
        "YZY"
      ],
      "begin_line": 146,
      "end_line": 147,
      "comment": " Set of Euler angles.\n   * this ordered set of rotations is around Y, then around Z, then\n   * around Y\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ZXZ"
      ],
      "begin_line": 153,
      "end_line": 154,
      "comment": " Set of Euler angles.\n   * this ordered set of rotations is around Z, then around X, then\n   * around Z\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ZYZ"
      ],
      "begin_line": 160,
      "end_line": 161,
      "comment": " Set of Euler angles.\n   * this ordered set of rotations is around Z, then around Y, then\n   * around Z\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " Name of the rotations order. "
    },
    {
      "type": "field",
      "varNames": [
        "a1"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " Axis of the first rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "a2"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " Axis of the second rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "a3"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " Axis of the third rotation. "
    }
  ]
}