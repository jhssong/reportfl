{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/geometry/euclidean/threed/PolyhedronsSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolyhedronsSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.AbstractRegion\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 42,
      "end_line": 428,
      "comment": " This class represents a 3D region: a set of polyhedrons.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet()",
      "begin_line": 46,
      "end_line": 48,
      "comment": " Build a polyhedrons set representing the whole real line.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 59,
      "end_line": 61,
      "comment": " Build a polyhedrons set from a BSP tree.\n     * \u003cp\u003eThe leaf nodes of the BSP tree \u003cem\u003emust\u003c/em\u003e have a\n     * {@code Boolean} attribute representing the inside status of\n     * the corresponding cell (true for inside cells, false for outside\n     * cells). In order to avoid building too many small objects, it is\n     * recommended to use the predefined constants\n     * {@code Boolean.TRUE} and {@code Boolean.FALSE}\u003c/p\u003e\n     * @param tree inside/outside BSP tree representing the region\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet(java.util.Collection\u003corg.apache.commons.math.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e\u003e)",
      "begin_line": 82,
      "end_line": 84,
      "comment": " Build a polyhedrons set from a Boundary REPresentation (B-rep).\n     * \u003cp\u003eThe boundary is provided as a collection of {@link\n     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the\n     * interior part of the region on its minus side and the exterior on\n     * its plus side.\u003c/p\u003e\n     * \u003cp\u003eThe boundary elements can be in any order, and can form\n     * several non-connected sets (like for example polyhedrons with holes\n     * or a set of disjoint polyhedrons considered as a whole). In\n     * fact, the elements do not even need to be connected together\n     * (their topological connections are not used here). However, if the\n     * boundary does not really separate an inside open from an outside\n     * open (open having here its topological meaning), then subsequent\n     * calls to the {@link Region#checkPoint(Vector) checkPoint} method will\n     * not be meaningful anymore.\u003c/p\u003e\n     * \u003cp\u003eIf the boundary is empty, the region will represent the whole\n     * space.\u003c/p\u003e\n     * @param boundary collection of boundary elements, as a\n     * collection of {@link SubHyperplane SubHyperplane} objects\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet(double, double, double, double, double, double)",
      "begin_line": 94,
      "end_line": 105,
      "comment": " Build a parallellepipedic box.\n     * @param xMin low bound along the x direction\n     * @param xMax high bound along the x direction\n     * @param yMin low bound along the y direction\n     * @param yMax high bound along the y direction\n     * @param zMin low bound along the z direction\n     * @param zMax high bound along the z direction\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 104,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.buildNew(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 108,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.computeGeometricalProperties()",
      "begin_line": 114,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 61)",
        "(line 120,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FacetsContributionVisitor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.BSPTreeVisitor\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e"
      ],
      "begin_line": 134,
      "end_line": 192,
      "comment": " Visitor computing geometrical properties. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.FacetsContributionVisitor()",
      "begin_line": 137,
      "end_line": 140,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 23)",
        "(line 139,col 13)-(line 139,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.visitOrder(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 143,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.visitInternalNode(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 148,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 149,col 13)-(line 151,col 69)",
        "(line 152,col 13)-(line 154,col 13)",
        "(line 155,col 13)-(line 157,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.visitLeafNode(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 161,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.addContribution(org.apache.commons.math.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e, boolean)",
      "begin_line": 168,
      "end_line": 190,
      "comment": " Add he contribution of a boundary facet.\n         * @param facet boundary facet\n         * @param reversed if true, the facet has the inside on its plus side\n         ",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 88)",
        "(line 171,col 13)-(line 171,col 53)",
        "(line 173,col 13)-(line 188,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.firstIntersection(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Line)",
      "begin_line": 201,
      "end_line": 203,
      "comment": " Get the first sub-hyperplane crossed by a semi-infinite line.\n     * @param point start point of the part of the line considered\n     * @param line line to consider (contains point)\n     * @return the first sub-hyperplaned crossed by the line after the\n     * given point, or null if the line does not intersect any\n     * sub-hyperplaned\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.recurseFirstIntersection(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Line)",
      "begin_line": 213,
      "end_line": 266,
      "comment": " Get the first sub-hyperplane crossed by a semi-infinite line.\n     * @param node current node\n     * @param point start point of the part of the line considered\n     * @param line line to consider (contains point)\n     * @return the first sub-hyperplaned crossed by the line after the\n     * given point, or null if the line does not intersect any\n     * sub-hyperplaned\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 61)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 59)",
        "(line 222,col 9)-(line 222,col 58)",
        "(line 223,col 9)-(line 223,col 70)",
        "(line 226,col 9)-(line 226,col 53)",
        "(line 227,col 9)-(line 227,col 61)",
        "(line 228,col 9)-(line 228,col 40)",
        "(line 229,col 9)-(line 229,col 39)",
        "(line 230,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 244,col 9)",
        "(line 247,col 9)-(line 247,col 95)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 261,col 9)",
        "(line 264,col 9)-(line 264,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.boundaryFacet(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 274,
      "end_line": 289,
      "comment": " Check if a point belongs to the boundary part of a node.\n     * @param point point to check\n     * @param node node containing the boundary facet to check\n     * @return the boundary facet this points belongs to (or null if it\n     * does not belong to any boundary facet)\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 91)",
        "(line 277,col 9)-(line 279,col 65)",
        "(line 280,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.rotate(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Rotation)",
      "begin_line": 297,
      "end_line": 299,
      "comment": " Rotate the region around the specified point.\n     * \u003cp\u003eThe instance is not modified, a new instance is created.\u003c/p\u003e\n     * @param center rotation center\n     * @param rotation vectorial rotation operator\n     * @return a new instance representing the rotated region\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 88)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RotationTransform",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.Transform\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 302,
      "end_line": 363,
      "comment": " 3D rotation as a Transform. "
    },
    {
      "type": "field",
      "varNames": [
        "center"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " Center point of the rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "rotation"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " Vectorial rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedOriginal"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " Cached original hyperplane. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedTransform"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " Cached 2D transform valid inside the cached original hyperplane. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.RotationTransform(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Rotation)",
      "begin_line": 320,
      "end_line": 323,
      "comment": " Build a rotation transform.\n         * @param center center point of the rotation\n         * @param rotation vectorial rotation\n         ",
      "child_ranges": [
        "(line 321,col 13)-(line 321,col 35)",
        "(line 322,col 13)-(line 322,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.apply(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 326,
      "end_line": 329,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 327,col 13)-(line 327,col 71)",
        "(line 328,col 13)-(line 328,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.apply(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 332,
      "end_line": 334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 333,col 13)-(line 333,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.apply(org.apache.commons.math.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e, org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 337,
      "end_line": 361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 13)-(line 359,col 13)",
        "(line 360,col 13)-(line 360,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.translate(org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 370,
      "end_line": 372,
      "comment": " Translate the region by the specified amount.\n     * \u003cp\u003eThe instance is not modified, a new instance is created.\u003c/p\u003e\n     * @param translation translation to apply\n     * @return a new instance representing the translated region\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 86)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TranslationTransform",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.Transform\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 375,
      "end_line": 426,
      "comment": " 3D translation as a transform. "
    },
    {
      "type": "field",
      "varNames": [
        "translation"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": " Translation vector. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedOriginal"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": " Cached original hyperplane. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedTransform"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": " Cached 2D transform valid inside the cached original hyperplane. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.TranslationTransform(org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 389,
      "end_line": 391,
      "comment": " Build a translation transform.\n         * @param translation translation vector\n         ",
      "child_ranges": [
        "(line 390,col 13)-(line 390,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.apply(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 394,
      "end_line": 396,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 395,col 13)-(line 395,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.apply(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 399,
      "end_line": 401,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 400,col 13)-(line 400,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.apply(org.apache.commons.math.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e, org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 404,
      "end_line": 424,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 407,col 13)-(line 420,col 13)",
        "(line 422,col 13)-(line 422,col 67)"
      ]
    }
  ]
}