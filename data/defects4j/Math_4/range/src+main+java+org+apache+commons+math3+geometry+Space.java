{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/Space.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Space",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 43,
      "comment": " This interface represents a generic space, with affine and vectorial counterparts.\n * @version $Id$\n * @see Vector\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Space.getDimension()",
      "begin_line": 33,
      "end_line": 33,
      "comment": " Get the dimension of the space.\n     * @return dimension of the space\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Space.getSubSpace()",
      "begin_line": 41,
      "end_line": 41,
      "comment": " Get the n-1 dimension subspace of this space.\n     * @return n-1 dimension sub-space of this space\n     * @see #getDimension()\n     * @exception MathUnsupportedOperationException for dimension-1 spaces\n     * which do not have sub-spaces\n     ",
      "child_ranges": []
    }
  ]
}