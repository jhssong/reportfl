{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/oned/OrientedPoint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OrientedPoint",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 29,
      "end_line": 111,
      "comment": " This class represents a 1D oriented hyperplane.\n * \u003cp\u003eAn hyperplane in 1D is a simple point, its orientation being a\n * boolean.\u003c/p\u003e\n * \u003cp\u003eInstances of this class are guaranteed to be immutable.\u003c/p\u003e\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "location"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Vector location. "
    },
    {
      "type": "field",
      "varNames": [
        "direct"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Orientation. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint.OrientedPoint(org.apache.commons.math3.geometry.euclidean.oned.Vector1D, boolean)",
      "begin_line": 42,
      "end_line": 45,
      "comment": " Simple constructor.\n     * @param location location of the hyperplane\n     * @param direct if true, the plus side of the hyperplane is towards\n     * abscissas greater than {@code location}\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 33)",
        "(line 44,col 9)-(line 44,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint.copySelf()",
      "begin_line": 52,
      "end_line": 54,
      "comment": " Copy the instance.\n     * \u003cp\u003eSince instances are immutable, this method directly returns\n     * the instance.\u003c/p\u003e\n     * @return the instance itself\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint.getOffset(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 57,
      "end_line": 60,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 73)",
        "(line 59,col 9)-(line 59,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint.wholeHyperplane()",
      "begin_line": 73,
      "end_line": 75,
      "comment": " Build a region covering the whole hyperplane.\n     * \u003cp\u003eSince this class represent zero dimension spaces which does\n     * not have lower dimension sub-spaces, this method returns a dummy\n     * implementation of a {@link\n     * org.apache.commons.math3.geometry.partitioning.SubHyperplane SubHyperplane}.\n     * This implementation is only used to allow the {@link\n     * org.apache.commons.math3.geometry.partitioning.SubHyperplane\n     * SubHyperplane} class implementation to work properly, it should\n     * \u003cem\u003enot\u003c/em\u003e be used otherwise.\u003c/p\u003e\n     * @return a dummy sub hyperplane\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint.wholeSpace()",
      "begin_line": 81,
      "end_line": 83,
      "comment": " Build a region covering the whole space.\n     * @return a region containing the instance (really an {@link\n     * IntervalsSet IntervalsSet} instance)\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint.sameOrientationAs(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 86,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint.getLocation()",
      "begin_line": 93,
      "end_line": 95,
      "comment": " Get the hyperplane location on the real line.\n     * @return the hyperplane location\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint.isDirect()",
      "begin_line": 101,
      "end_line": 103,
      "comment": " Check if the hyperplane orientation is direct.\n     * @return true if the plus side of the hyperplane is towards\n     * abscissae greater than hyperplane location\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint.revertSelf()",
      "begin_line": 107,
      "end_line": 109,
      "comment": " Revert the instance.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 25)"
      ]
    }
  ]
}