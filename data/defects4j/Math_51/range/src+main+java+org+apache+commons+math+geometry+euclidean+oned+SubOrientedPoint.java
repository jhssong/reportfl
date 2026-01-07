{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/geometry/euclidean/oned/SubOrientedPoint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SubOrientedPoint",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D, org.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 31,
      "end_line": 67,
      "comment": " This class represents sub-hyperplane for {@link OrientedPoint}.\n * \u003cp\u003eAn hyperplane in 1D is a simple point, its orientation being a\n * boolean.\u003c/p\u003e\n * \u003cp\u003eInstances of this class are guaranteed to be immutable.\u003c/p\u003e\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.SubOrientedPoint.SubOrientedPoint(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e, org.apache.commons.math.geometry.partitioning.Region\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 37,
      "end_line": 40,
      "comment": " Simple constructor.\n     * @param hyperplane underlying hyperplane\n     * @param remainingRegion remaining region of the hyperplane\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.SubOrientedPoint.getSize()",
      "begin_line": 43,
      "end_line": 45,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.SubOrientedPoint.buildNew(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e, org.apache.commons.math.geometry.partitioning.Region\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 48,
      "end_line": 51,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.SubOrientedPoint.side(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 54,
      "end_line": 57,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 100)",
        "(line 56,col 9)-(line 56,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.oned.SubOrientedPoint.split(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 60,
      "end_line": 65,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 100)",
        "(line 62,col 9)-(line 64,col 88)"
      ]
    }
  ]
}