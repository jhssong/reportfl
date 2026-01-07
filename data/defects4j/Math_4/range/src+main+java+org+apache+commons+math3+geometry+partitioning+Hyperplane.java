{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/partitioning/Hyperplane.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Hyperplane",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 79,
      "comment": " This interface represents an hyperplane of a space.\n\n * \u003cp\u003eThe most prominent place where hyperplane appears in space\n * partitioning is as cutters. Each partitioning node in a {@link\n * BSPTree BSP tree} has a cut {@link SubHyperplane sub-hyperplane}\n * which is either an hyperplane or a part of an hyperplane. In an\n * n-dimensions euclidean space, an hyperplane is an (n-1)-dimensions\n * hyperplane (for example a traditional plane in the 3D euclidean\n * space). They can be more exotic objects in specific fields, for\n * example a circle on the surface of the unit sphere.\u003c/p\u003e\n\n * @param \u003cS\u003e Type of the space.\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Hyperplane.copySelf()",
      "begin_line": 46,
      "end_line": 46,
      "comment": " Copy the instance.\n     * \u003cp\u003eThe instance created is completely independant of the original\n     * one. A deep copy is used, none of the underlying objects are\n     * shared (except for immutable objects).\u003c/p\u003e\n     * @return a new hyperplane, copy of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Hyperplane.getOffset(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 56,
      "end_line": 56,
      "comment": " Get the offset (oriented distance) of a point.\n     * \u003cp\u003eThe offset is 0 if the point is on the underlying hyperplane,\n     * it is positive if the point is on one particular side of the\n     * hyperplane, and it is negative if the point is on the other side,\n     * according to the hyperplane natural orientation.\u003c/p\u003e\n     * @param point point to check\n     * @return offset of the point\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Hyperplane.sameOrientationAs(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e)",
      "begin_line": 67,
      "end_line": 67,
      "comment": " Check if the instance has the same orientation as another hyperplane.\n     * \u003cp\u003eThis method is expected to be called on parallel hyperplanes. The\n     * method should \u003cem\u003enot\u003c/em\u003e re-check for parallelism, only for\n     * orientation, typically by testing something like the sign of the\n     * dot-products of normals.\u003c/p\u003e\n     * @param other other hyperplane to check against the instance\n     * @return true if the instance and the other hyperplane have\n     * the same orientation\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Hyperplane.wholeHyperplane()",
      "begin_line": 72,
      "end_line": 72,
      "comment": " Build a sub-hyperplane covering the whole hyperplane.\n     * @return a sub-hyperplane covering the whole hyperplane\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Hyperplane.wholeSpace()",
      "begin_line": 77,
      "end_line": 77,
      "comment": " Build a region covering the whole space.\n     * @return a region containing the instance\n     ",
      "child_ranges": []
    }
  ]
}