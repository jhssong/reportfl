{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/partitioning/Embedding.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Embedding",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 62,
      "comment": " This interface defines mappers between a space and one of its sub-spaces.\n\n * \u003cp\u003eSub-spaces are the lower dimensions subsets of a n-dimensions\n * space. The (n-1)-dimension sub-spaces are specific sub-spaces known\n * as {@link Hyperplane hyperplanes}. This interface can be used regardless\n * of the dimensions differences. As an example, {@link\n * org.apache.commons.math3.geometry.euclidean.threed.Line Line} in 3D\n * implements Embedding\u003c{@link\n * org.apache.commons.math3.geometry.euclidean.threed.Vector3D Vector3D}, {link\n * org.apache.commons.math3.geometry.euclidean.oned.Vector1D Vector1D\u003e, i.e. it\n * maps directly dimensions 3 and 1.\u003c/p\u003e\n\n * \u003cp\u003eIn the 3D euclidean space, hyperplanes are 2D planes, and the 1D\n * sub-spaces are lines.\u003c/p\u003e\n\n * @param \u003cS\u003e Type of the embedding space.\n * @param \u003cT\u003e Type of the embedded sub-space.\n\n * @see Hyperplane\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Embedding.toSubSpace(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 52,
      "end_line": 52,
      "comment": " Transform a space point into a sub-space point.\n     * @param point n-dimension point of the space\n     * @return (n-1)-dimension point of the sub-space corresponding to\n     * the specified space point\n     * @see #toSpace\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Embedding.toSpace(org.apache.commons.math3.geometry.Vector\u003cT\u003e)",
      "begin_line": 60,
      "end_line": 60,
      "comment": " Transform a sub-space point into a space point.\n     * @param point (n-1)-dimension point of the sub-space\n     * @return n-dimension point of the space corresponding to the\n     * specified sub-space point\n     * @see #toSubSpace\n     ",
      "child_ranges": []
    }
  ]
}