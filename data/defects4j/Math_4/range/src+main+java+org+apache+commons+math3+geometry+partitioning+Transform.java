{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/partitioning/Transform.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Transform",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 81,
      "comment": " This interface represents an inversible affine transform in a space.\n * \u003cp\u003eInversible affine transform include for example scalings,\n * translations, rotations.\u003c/p\u003e\n\n * \u003cp\u003eTransforms are dimension-specific. The consistency rules between\n * the three {@code apply} methods are the following ones for a\n * transformed defined for dimension D:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003e\n *     the transform can be applied to a point in the\n *     D-dimension space using its {@link #apply(Vector)}\n *     method\n *   \u003c/li\u003e\n *   \u003cli\u003e\n *     the transform can be applied to a (D-1)-dimension\n *     hyperplane in the D-dimension space using its\n *     {@link #apply(Hyperplane)} method\n *   \u003c/li\u003e\n *   \u003cli\u003e\n *     the transform can be applied to a (D-2)-dimension\n *     sub-hyperplane in a (D-1)-dimension hyperplane using\n *     its {@link #apply(SubHyperplane, Hyperplane, Hyperplane)}\n *     method\n *   \u003c/li\u003e\n * \u003c/ul\u003e\n\n * @param \u003cS\u003e Type of the embedding space.\n * @param \u003cT\u003e Type of the embedded sub-space.\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Transform.apply(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 61,
      "end_line": 61,
      "comment": " Transform a point of a space.\n     * @param point point to transform\n     * @return a new object representing the transformed point\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Transform.apply(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e)",
      "begin_line": 67,
      "end_line": 67,
      "comment": " Transform an hyperplane of a space.\n     * @param hyperplane hyperplane to transform\n     * @return a new object representing the transformed hyperplane\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Transform.apply(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cT\u003e, org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e)",
      "begin_line": 79,
      "end_line": 79,
      "comment": " Transform a sub-hyperplane embedded in an hyperplane.\n     * @param sub sub-hyperplane to transform\n     * @param original hyperplane in which the sub-hyperplane is\n     * defined (this is the original hyperplane, the transform has\n     * \u003cem\u003enot\u003c/em\u003e been applied to it)\n     * @param transformed hyperplane in which the sub-hyperplane is\n     * defined (this is the transformed hyperplane, the transform\n     * \u003cem\u003ehas\u003c/em\u003e been applied to it)\n     * @return a new object representing the transformed sub-hyperplane\n     ",
      "child_ranges": []
    }
  ]
}