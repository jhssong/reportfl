{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/SubPlane.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SubPlane",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 34,
      "end_line": 141,
      "comment": " This class represents a sub-hyperplane for {@link Plane}.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SubPlane.SubPlane(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math3.geometry.partitioning.Region\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 40,
      "end_line": 43,
      "comment": " Simple constructor.\n     * @param hyperplane underlying hyperplane\n     * @param remainingRegion remaining region of the hyperplane\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SubPlane.buildNew(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math3.geometry.partitioning.Region\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 46,
      "end_line": 50,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SubPlane.side(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 53,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 52)",
        "(line 57,col 9)-(line 57,col 57)",
        "(line 58,col 9)-(line 58,col 68)",
        "(line 60,col 9)-(line 65,col 9)",
        "(line 74,col 9)-(line 74,col 72)",
        "(line 75,col 9)-(line 75,col 71)",
        "(line 76,col 9)-(line 76,col 93)",
        "(line 77,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 83,col 76)",
        "(line 86,col 9)-(line 86,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.SubPlane.split(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 96,
      "end_line": 139,
      "comment": " Split the instance in two parts by an hyperplane.\n     * @param hyperplane splitting hyperplane\n     * @return an object containing both the part of the instance\n     * on the plus side of the instance and the part of the\n     * instance on the minus side of the instance\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 52)",
        "(line 100,col 9)-(line 100,col 57)",
        "(line 101,col 9)-(line 101,col 68)",
        "(line 103,col 9)-(line 109,col 9)",
        "(line 112,col 9)-(line 112,col 72)",
        "(line 113,col 9)-(line 113,col 71)",
        "(line 114,col 9)-(line 114,col 93)",
        "(line 115,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 121,col 94)",
        "(line 122,col 9)-(line 123,col 94)",
        "(line 125,col 9)-(line 125,col 99)",
        "(line 126,col 9)-(line 129,col 99)",
        "(line 131,col 9)-(line 134,col 104)",
        "(line 136,col 9)-(line 137,col 115)"
      ]
    }
  ]
}