{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/geometry/euclidean/threed/SubPlane.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SubPlane",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 34,
      "end_line": 138,
      "comment": " This class represents a sub-hyperplane for {@link Plane}.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.SubPlane.SubPlane(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math.geometry.partitioning.Region\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 40,
      "end_line": 43,
      "comment": " Simple constructor.\n     * @param hyperplane underlying hyperplane\n     * @param remainingRegion remaining region of the hyperplane\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.SubPlane.buildNew(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math.geometry.partitioning.Region\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 46,
      "end_line": 49,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.SubPlane.side(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 52,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 52)",
        "(line 55,col 9)-(line 55,col 57)",
        "(line 56,col 9)-(line 56,col 75)",
        "(line 58,col 9)-(line 63,col 9)",
        "(line 72,col 9)-(line 72,col 72)",
        "(line 73,col 9)-(line 73,col 71)",
        "(line 74,col 9)-(line 74,col 93)",
        "(line 75,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 81,col 75)",
        "(line 84,col 9)-(line 84,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.SubPlane.split(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 94,
      "end_line": 136,
      "comment": " Split the instance in two parts by an hyperplane.\n     * @param hyperplane splitting hyperplane\n     * @return an object containing both the part of the instance\n     * on the plus side of the instance and the part of the\n     * instance on the minus side of the instance\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 52)",
        "(line 97,col 9)-(line 97,col 57)",
        "(line 98,col 9)-(line 98,col 75)",
        "(line 100,col 9)-(line 106,col 9)",
        "(line 109,col 9)-(line 109,col 72)",
        "(line 110,col 9)-(line 110,col 71)",
        "(line 111,col 9)-(line 111,col 93)",
        "(line 112,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 118,col 93)",
        "(line 119,col 9)-(line 120,col 93)",
        "(line 122,col 9)-(line 122,col 99)",
        "(line 123,col 9)-(line 126,col 99)",
        "(line 128,col 9)-(line 131,col 104)",
        "(line 133,col 9)-(line 134,col 115)"
      ]
    }
  ]
}