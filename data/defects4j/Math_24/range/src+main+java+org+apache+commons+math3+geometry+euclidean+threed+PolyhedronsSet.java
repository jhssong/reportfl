{
  "filepath": "/tmp/Math-24b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/PolyhedronsSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolyhedronsSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.AbstractRegion\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 45,
      "end_line": 463,
      "comment": " This class represents a 3D region: a set of polyhedrons.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet()",
      "begin_line": 49,
      "end_line": 51,
      "comment": " Build a polyhedrons set representing the whole real line.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 62,
      "end_line": 64,
      "comment": " Build a polyhedrons set from a BSP tree.\n     * \u003cp\u003eThe leaf nodes of the BSP tree \u003cem\u003emust\u003c/em\u003e have a\n     * {@code Boolean} attribute representing the inside status of\n     * the corresponding cell (true for inside cells, false for outside\n     * cells). In order to avoid building too many small objects, it is\n     * recommended to use the predefined constants\n     * {@code Boolean.TRUE} and {@code Boolean.FALSE}\u003c/p\u003e\n     * @param tree inside/outside BSP tree representing the region\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet(java.util.Collection\u003corg.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e\u003e)",
      "begin_line": 85,
      "end_line": 87,
      "comment": " Build a polyhedrons set from a Boundary REPresentation (B-rep).\n     * \u003cp\u003eThe boundary is provided as a collection of {@link\n     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the\n     * interior part of the region on its minus side and the exterior on\n     * its plus side.\u003c/p\u003e\n     * \u003cp\u003eThe boundary elements can be in any order, and can form\n     * several non-connected sets (like for example polyhedrons with holes\n     * or a set of disjoint polyhedrons considered as a whole). In\n     * fact, the elements do not even need to be connected together\n     * (their topological connections are not used here). However, if the\n     * boundary does not really separate an inside open from an outside\n     * open (open having here its topological meaning), then subsequent\n     * calls to the {@link Region#checkPoint(Vector) checkPoint} method will\n     * not be meaningful anymore.\u003c/p\u003e\n     * \u003cp\u003eIf the boundary is empty, the region will represent the whole\n     * space.\u003c/p\u003e\n     * @param boundary collection of boundary elements, as a\n     * collection of {@link SubHyperplane SubHyperplane} objects\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet(double, double, double, double, double, double)",
      "begin_line": 97,
      "end_line": 101,
      "comment": " Build a parallellepipedic box.\n     * @param xMin low bound along the x direction\n     * @param xMax high bound along the x direction\n     * @param yMin low bound along the y direction\n     * @param yMax high bound along the y direction\n     * @param zMin low bound along the z direction\n     * @param zMax high bound along the z direction\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.buildBoundary(double, double, double, double, double, double)",
      "begin_line": 112,
      "end_line": 130,
      "comment": " Build a parallellepipedic box boundary.\n     * @param xMin low bound along the x direction\n     * @param xMax high bound along the x direction\n     * @param yMin low bound along the y direction\n     * @param yMax high bound along the y direction\n     * @param zMin low bound along the z direction\n     * @param zMax high bound along the z direction\n     * @return boundary tree\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.buildNew(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 133,
      "end_line": 136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.computeGeometricalProperties()",
      "begin_line": 139,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 61)",
        "(line 145,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FacetsContributionVisitor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e"
      ],
      "begin_line": 159,
      "end_line": 217,
      "comment": " Visitor computing geometrical properties. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.FacetsContributionVisitor()",
      "begin_line": 162,
      "end_line": 165,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 23)",
        "(line 164,col 13)-(line 164,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.visitOrder(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 168,
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 169,col 13)-(line 169,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 173,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 174,col 13)-(line 176,col 69)",
        "(line 177,col 13)-(line 179,col 13)",
        "(line 180,col 13)-(line 182,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.visitLeafNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 186,
      "end_line": 187,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.addContribution(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e, boolean)",
      "begin_line": 193,
      "end_line": 215,
      "comment": " Add he contribution of a boundary facet.\n         * @param facet boundary facet\n         * @param reversed if true, the facet has the inside on its plus side\n         ",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 88)",
        "(line 196,col 13)-(line 196,col 53)",
        "(line 198,col 13)-(line 213,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.firstIntersection(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Line)",
      "begin_line": 226,
      "end_line": 228,
      "comment": " Get the first sub-hyperplane crossed by a semi-infinite line.\n     * @param point start point of the part of the line considered\n     * @param line line to consider (contains point)\n     * @return the first sub-hyperplaned crossed by the line after the\n     * given point, or null if the line does not intersect any\n     * sub-hyperplaned\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.recurseFirstIntersection(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Line)",
      "begin_line": 238,
      "end_line": 291,
      "comment": " Get the first sub-hyperplane crossed by a semi-infinite line.\n     * @param node current node\n     * @param point start point of the part of the line considered\n     * @param line line to consider (contains point)\n     * @return the first sub-hyperplaned crossed by the line after the\n     * given point, or null if the line does not intersect any\n     * sub-hyperplaned\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 61)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 59)",
        "(line 247,col 9)-(line 247,col 58)",
        "(line 248,col 9)-(line 248,col 70)",
        "(line 251,col 9)-(line 251,col 53)",
        "(line 252,col 9)-(line 252,col 61)",
        "(line 253,col 9)-(line 253,col 40)",
        "(line 254,col 9)-(line 254,col 39)",
        "(line 255,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 269,col 9)",
        "(line 272,col 9)-(line 272,col 95)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 286,col 9)",
        "(line 289,col 9)-(line 289,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.boundaryFacet(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 299,
      "end_line": 314,
      "comment": " Check if a point belongs to the boundary part of a node.\n     * @param point point to check\n     * @param node node containing the boundary facet to check\n     * @return the boundary facet this points belongs to (or null if it\n     * does not belong to any boundary facet)\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 91)",
        "(line 302,col 9)-(line 304,col 65)",
        "(line 305,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.rotate(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Rotation)",
      "begin_line": 322,
      "end_line": 324,
      "comment": " Rotate the region around the specified point.\n     * \u003cp\u003eThe instance is not modified, a new instance is created.\u003c/p\u003e\n     * @param center rotation center\n     * @param rotation vectorial rotation operator\n     * @return a new instance representing the rotated region\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 88)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RotationTransform",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.Transform\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 327,
      "end_line": 393,
      "comment": " 3D rotation as a Transform. "
    },
    {
      "type": "field",
      "varNames": [
        "center"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " Center point of the rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "rotation"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " Vectorial rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedOriginal"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " Cached original hyperplane. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedTransform"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": " Cached 2D transform valid inside the cached original hyperplane. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.RotationTransform(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Rotation)",
      "begin_line": 345,
      "end_line": 348,
      "comment": " Build a rotation transform.\n         * @param center center point of the rotation\n         * @param rotation vectorial rotation\n         ",
      "child_ranges": [
        "(line 346,col 13)-(line 346,col 35)",
        "(line 347,col 13)-(line 347,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.apply(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 351,
      "end_line": 354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 352,col 13)-(line 352,col 71)",
        "(line 353,col 13)-(line 353,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.apply(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 357,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 358,col 13)-(line 358,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.apply(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e, org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 362,
      "end_line": 391,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 365,col 13)-(line 389,col 13)",
        "(line 390,col 13)-(line 390,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.translate(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 400,
      "end_line": 402,
      "comment": " Translate the region by the specified amount.\n     * \u003cp\u003eThe instance is not modified, a new instance is created.\u003c/p\u003e\n     * @param translation translation to apply\n     * @return a new instance representing the translated region\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 86)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TranslationTransform",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.Transform\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 405,
      "end_line": 461,
      "comment": " 3D translation as a transform. "
    },
    {
      "type": "field",
      "varNames": [
        "translation"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": " Translation vector. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedOriginal"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": " Cached original hyperplane. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedTransform"
      ],
      "begin_line": 414,
      "end_line": 414,
      "comment": " Cached 2D transform valid inside the cached original hyperplane. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.TranslationTransform(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 419,
      "end_line": 421,
      "comment": " Build a translation transform.\n         * @param translation translation vector\n         ",
      "child_ranges": [
        "(line 420,col 13)-(line 420,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.apply(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 424,
      "end_line": 426,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 425,col 13)-(line 425,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.apply(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 429,
      "end_line": 431,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 430,col 13)-(line 430,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.apply(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e, org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 434,
      "end_line": 459,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 437,col 13)-(line 455,col 13)",
        "(line 457,col 13)-(line 457,col 67)"
      ]
    }
  ]
}