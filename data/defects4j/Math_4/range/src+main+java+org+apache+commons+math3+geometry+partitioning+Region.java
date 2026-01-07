{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/partitioning/Region.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Region",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 191,
      "comment": " This interface represents a region of a space as a partition.\n\n * \u003cp\u003eRegion are subsets of a space, they can be infinite (whole\n * space, half space, infinite stripe ...) or finite (polygons in 2D,\n * polyhedrons in 3D ...). Their main characteristic is to separate\n * points that are considered to be \u003cem\u003einside\u003c/em\u003e the region from\n * points considered to be \u003cem\u003eoutside\u003c/em\u003e of it. In between, there\n * may be points on the \u003cem\u003eboundary\u003c/em\u003e of the region.\u003c/p\u003e\n\n * \u003cp\u003eThis implementation is limited to regions for which the boundary\n * is composed of several {@link SubHyperplane sub-hyperplanes},\n * including regions with no boundary at all: the whole space and the\n * empty region. They are not necessarily finite and not necessarily\n * path-connected. They can contain holes.\u003c/p\u003e\n\n * \u003cp\u003eRegions can be combined using the traditional sets operations :\n * union, intersection, difference and symetric difference (exclusive\n * or) for the binary operations, complement for the unary\n * operation.\u003c/p\u003e\n\n * @param \u003cS\u003e Type of the space.\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Region.buildNew(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 77,
      "end_line": 77,
      "comment": " Build a region using the instance as a prototype.\n     * \u003cp\u003eThis method allow to create new instances without knowing\n     * exactly the type of the region. It is an application of the\n     * prototype design pattern.\u003c/p\u003e\n     * \u003cp\u003eThe leaf nodes of the BSP tree \u003cem\u003emust\u003c/em\u003e have a\n     * {@code Boolean} attribute representing the inside status of\n     * the corresponding cell (true for inside cells, false for outside\n     * cells). In order to avoid building too many small objects, it is\n     * recommended to use the predefined constants\n     * {@code Boolean.TRUE} and {@code Boolean.FALSE}. The\n     * tree also \u003cem\u003emust\u003c/em\u003e have either null internal nodes or\n     * internal nodes representing the boundary as specified in the\n     * {@link #getTree getTree} method).\u003c/p\u003e\n     * @param newTree inside/outside BSP tree representing the new region\n     * @return the built region\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Region.copySelf()",
      "begin_line": 86,
      "end_line": 86,
      "comment": " Copy the instance.\n     * \u003cp\u003eThe instance created is completely independant of the original\n     * one. A deep copy is used, none of the underlying objects are\n     * shared (except for the underlying tree {@code Boolean}\n     * attributes and immutable objects).\u003c/p\u003e\n     * @return a new region, copy of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Region.isEmpty()",
      "begin_line": 91,
      "end_line": 91,
      "comment": " Check if the instance is empty.\n     * @return true if the instance is empty\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Region.isEmpty(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 100,
      "end_line": 100,
      "comment": " Check if the sub-tree starting at a given node is empty.\n     * @param node root node of the sub-tree (\u003cem\u003emust\u003c/em\u003e have {@link\n     * Region Region} tree semantics, i.e. the leaf nodes must have\n     * {@code Boolean} attributes representing an inside/outside\n     * property)\n     * @return true if the sub-tree starting at the given node is empty\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Region.contains(org.apache.commons.math3.geometry.partitioning.Region\u003cS\u003e)",
      "begin_line": 106,
      "end_line": 106,
      "comment": " Check if the instance entirely contains another region.\n     * @param region region to check against the instance\n     * @return true if the instance contains the specified tree\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Region.checkPoint(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 113,
      "end_line": 113,
      "comment": " Check a point with respect to the region.\n     * @param point point to check\n     * @return a code representing the point status: either {@link\n     * Location#INSIDE}, {@link Location#OUTSIDE} or {@link Location#BOUNDARY}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Region.getTree(boolean)",
      "begin_line": 154,
      "end_line": 154,
      "comment": " Get the underlying BSP tree.\n\n     * \u003cp\u003eRegions are represented by an underlying inside/outside BSP\n     * tree whose leaf attributes are {@code Boolean} instances\n     * representing inside leaf cells if the attribute value is\n     * {@code true} and outside leaf cells if the attribute is\n     * {@code false}. These leaf attributes are always present and\n     * guaranteed to be non null.\u003c/p\u003e\n\n     * \u003cp\u003eIn addition to the leaf attributes, the internal nodes which\n     * correspond to cells split by cut sub-hyperplanes may contain\n     * {@link BoundaryAttribute BoundaryAttribute} objects representing\n     * the parts of the corresponding cut sub-hyperplane that belong to\n     * the boundary. When the boundary attributes have been computed,\n     * all internal nodes are guaranteed to have non-null\n     * attributes, however some {@link BoundaryAttribute\n     * BoundaryAttribute} instances may have their {@link\n     * BoundaryAttribute#plusInside plusInside} and {@link\n     * BoundaryAttribute#plusOutside plusOutside} fields both null if\n     * the corresponding cut sub-hyperplane does not have any parts\n     * belonging to the boundary.\u003c/p\u003e\n\n     * \u003cp\u003eSince computing the boundary is not always required and can be\n     * time-consuming for large trees, these internal nodes attributes\n     * are computed using lazy evaluation only when required by setting\n     * the {@code includeBoundaryAttributes} argument to\n     * {@code true}. Once computed, these attributes remain in the\n     * tree, which implies that in this case, further calls to the\n     * method for the same region will always include these attributes\n     * regardless of the value of the\n     * {@code includeBoundaryAttributes} argument.\u003c/p\u003e\n\n     * @param includeBoundaryAttributes if true, the boundary attributes\n     * at internal nodes are guaranteed to be included (they may be\n     * included even if the argument is false, if they have already been\n     * computed due to a previous call)\n     * @return underlying BSP tree\n     * @see BoundaryAttribute\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Region.getBoundarySize()",
      "begin_line": 160,
      "end_line": 160,
      "comment": " Get the size of the boundary.\n     * @return the size of the boundary (this is 0 in 1D, a length in\n     * 2D, an area in 3D ...)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Region.getSize()",
      "begin_line": 166,
      "end_line": 166,
      "comment": " Get the size of the instance.\n     * @return the size of the instance (this is a length in 1D, an area\n     * in 2D, a volume in 3D ...)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Region.getBarycenter()",
      "begin_line": 171,
      "end_line": 171,
      "comment": " Get the barycenter of the instance.\n     * @return an object representing the barycenter\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Region.side(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e)",
      "begin_line": 181,
      "end_line": 181,
      "comment": " Compute the relative position of the instance with respect to an\n     * hyperplane.\n     * @param hyperplane reference hyperplane\n     * @return one of {@link Side#PLUS Side.PLUS}, {@link Side#MINUS\n     * Side.MINUS}, {@link Side#BOTH Side.BOTH} or {@link Side#HYPER\n     * Side.HYPER} (the latter result can occur only if the tree\n     * contains only one cut hyperplane)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.Region.intersection(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 189,
      "end_line": 189,
      "comment": " Get the parts of a sub-hyperplane that are contained in the region.\n     * \u003cp\u003eThe parts of the sub-hyperplane that belong to the boundary are\n     * \u003cem\u003enot\u003c/em\u003e included in the resulting parts.\u003c/p\u003e\n     * @param sub sub-hyperplane traversing the region\n     * @return filtered sub-hyperplane\n     ",
      "child_ranges": []
    }
  ]
}